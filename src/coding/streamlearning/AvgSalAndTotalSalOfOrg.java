package coding.streamlearning;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class AvgSalAndTotalSalOfOrg {
    public static void main(String[] args) {
        //What is the average salary and total salary of the whole organization?
        final List<Employee> employeeList = Employee.getEmployeeList();

       DoubleSummaryStatistics employeeSalaryStatistics= employeeList.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Average Salary = "+employeeSalaryStatistics.getAverage());
        System.out.println("Total Salary = "+employeeSalaryStatistics.getSum());
    }
}
