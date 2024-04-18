package coding.streamlearning;

import coding.Employee;
import java.util.List;
import java.util.stream.Collectors;

public class EmpCount {
    public static void main(String[] args) {
        //How many employees are there in the organization?
        List<Employee> employeeList = Employee.getEmployeeList();
        System.out.println(employeeList.stream().count());

        System.out.println(employeeList.stream().collect(Collectors.counting()));


    }
}
