package coding.streamlearning;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class OldestEmployeeInOrg {

    public static void main(String[] args) {
        //Who is the oldest employee in the organization?
        final List<Employee> employeeList = Employee.getEmployeeList();
       Optional<Employee> oldestEmp = employeeList.stream()
                .max(Comparator.comparing(Employee::getAge));
        oldestEmp.ifPresent(System.out::println);
    }
}
