package coding.streamlearning;

import coding.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestPaidEmpInOrg {
    public static void main(String[] args) {
        //Get the details of the highest paid employee in the organization?

        final List<Employee> employeeList = Employee.getEmployeeList();
        {
            Employee highestPaidEmpInOrg = employeeList.stream()
                    .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))).get();
            System.out.println("Details Of Highest Paid Employee : ");
            System.out.println("---------------------------------------");
            System.out.println("Employee : " + highestPaidEmpInOrg);
        }
        {
            Employee highestPaidEmpInOrg = employeeList.stream().max(Comparator.comparing(Employee::getSalary)).get();
            System.out.println("Details Of Highest Paid Employee : ");
            System.out.println("---------------------------------------");
            System.out.println("Employee : " + highestPaidEmpInOrg);
        }
    }
}
