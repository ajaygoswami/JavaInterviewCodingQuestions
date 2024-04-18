package coding.streamlearning;

import coding.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpMaleFemaleAvgSalary {
    public static void main(String[] args) {
        //Find the average salary of the male and female employee
        final List<Employee> employeeList = Employee.getEmployeeList();
        Map<String, Double> employeeGenderViseAvgSal=  employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
       System.out.println(employeeGenderViseAvgSal);
    }
}
