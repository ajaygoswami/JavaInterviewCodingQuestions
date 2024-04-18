package coding.streamlearning;

import java.util.List;
import java.util.stream.Collectors;

public class DepartmentNames {
    public static void main(String[] args) {
        //Get the name of all the department
        final List<Employee> employeeList = Employee.getEmployeeList();
        List<String> dptNames = employeeList.stream()
                .map(Employee::getDepartment)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(dptNames);
    }
}
