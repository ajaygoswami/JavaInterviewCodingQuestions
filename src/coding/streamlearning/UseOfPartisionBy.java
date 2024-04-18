package coding.streamlearning;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UseOfPartisionBy {
    public static void main(String[] args) {
        //Separate the employees who are younger or equal to 30 years from those older than 30 years.
        final List<Employee> employeeList = Employee.getEmployeeList();
       Map<Boolean,List<Employee>> partitionEmployeesByAge= employeeList.stream()
                .collect(Collectors.partitioningBy(employee -> employee.getAge()>30));

        Set<Map.Entry<Boolean, List<Employee>>> entrySet = partitionEmployeesByAge.entrySet();

        for (Map.Entry<Boolean, List<Employee>> entry : entrySet) {
            System.out.println("----------------------------");

            if (entry.getKey()) {
                System.out.println("Employees older than 30 years :");
            }
            else {
                System.out.println("Employees younger than or equal to 30 years :");
            }

            System.out.println("----------------------------");

            List<Employee> list = entry.getValue();

            for (Employee e : list) {
                System.out.println(e.getName());
            }
        }

    }
}
