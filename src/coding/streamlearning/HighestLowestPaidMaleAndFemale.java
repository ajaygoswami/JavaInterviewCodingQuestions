package coding.streamlearning;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestLowestPaidMaleAndFemale {
    public static void main(String[] args) {
        //Fetch the highest-paid male and female employee
        final List<Employee> employeeList = Employee.getEmployeeList();
        {
            Map<String, Optional<Employee>> maxSalaryMaleAndFemaleEmployee = employeeList.stream().
                    collect(Collectors.groupingBy(Employee::getGender, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
            System.out.println("Highest paid male and female employee : " + maxSalaryMaleAndFemaleEmployee);
        }
        {
            Map<String, Optional<Employee>> minSalaryMaleAndFemaleEmployee = employeeList.stream().
                    collect(Collectors.groupingBy(Employee::getGender, Collectors.minBy(Comparator.comparing(Employee::getSalary))));
            System.out.println("Lowest paid male and female employee : " + minSalaryMaleAndFemaleEmployee);
        }
    }
}
