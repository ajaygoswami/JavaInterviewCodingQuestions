package coding.streamlearning;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaleAndFemaleEmpCount {
    public static void main(String[] args) {
        //How many male and female employees are there in the organization?
        final List<Employee> employeeList = Employee.getEmployeeList();
        Map<String, Long> noOfMaleAndFemaleEmployees=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));

        System.out.println("No of male & female Employees : "+noOfMaleAndFemaleEmployees);
    }
}
