package coding.streamlearning;

import coding.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestPaidEmpInEachDepartment {

    public static void main(String[] args) {
        //Get the highest-paid employee in each department
        final List<Employee> employeeList = Employee.getEmployeeList();
        Map<String, Optional<Employee>> maxSalariedEmpInEachDepartment =  employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        System.out.println("Highest paid employee in each department ");
        for (Map.Entry<String, Optional<Employee>> e : maxSalariedEmpInEachDepartment.entrySet()) {
            System.out.println("-----------------------");
            System.out.println(e.getKey());
            System.out.println(e.getValue().get());
        }

    }

}
