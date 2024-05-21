package coding.configure.twodatabases;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.context.properties.*;
import org.springframework.boot.jdbc.*;
import org.springframework.context.annotation.*;
import org.springframework.core.env.*;
import org.springframework.jdbc.datasource.*;
import org.springframework.orm.jpa.*;
import org.springframework.orm.jpa.vendor.*;
import org.springframework.transaction.*;

import javax.sql.*;
import java.util.*;

@Configuration
public class JdbcConfiguration {

    @Autowired
    private PrimaryDatabaseConfiguration primaryDatabaseConfiguration;

    @Autowired
    private SecondaryDatabaseConfiguration secondaryDatabaseConfiguration;

    @Autowired
    private Environment env;

    @Primary
    @Bean
    public DataSource getDataSource(){
        DriverManagerDataSource dataSource
                = new DriverManagerDataSource();
        dataSource.setDriverClassName(
                primaryDatabaseConfiguration.getDriverclassname());
        dataSource.setUrl(primaryDatabaseConfiguration.getUrl() );
        dataSource.setUsername(primaryDatabaseConfiguration.getUsername() );
        dataSource.setPassword( primaryDatabaseConfiguration.getPassword());
        return dataSource;
    }

    @Bean
    @Primary
    public LocalContainerEntityManagerFactoryBean userEntityManager() {
        LocalContainerEntityManagerFactoryBean em
                = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(getDataSource());
        em.setPackagesToScan(
                new String[] { "com.example.demo.entity" });

        HibernateJpaVendorAdapter vendorAdapter
                = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        HashMap<String, Object> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto",
                env.getProperty("hibernate.hbm2ddl.auto"));
        properties.put("hibernate.dialect",
                env.getProperty("hibernate.dialect"));
        em.setJpaPropertyMap(properties);

        return em;
    }



    @Primary
    @Bean
    public PlatformTransactionManager userTransactionManager() {
        JpaTransactionManager transactionManager
                = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(
                userEntityManager().getObject());
        return transactionManager;
    }

}
