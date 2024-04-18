package coding.streamlearning;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DepartmentAvgSalary {

    public static void main(String[] args) {
        // Find the average salary of each department?
        final List<Employee> employeeList = Employee.getEmployeeList();
        Map<String,Double> avgSalPerDpt= employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalPerDpt);
    }
}
