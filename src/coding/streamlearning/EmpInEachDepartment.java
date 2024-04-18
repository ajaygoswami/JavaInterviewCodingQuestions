package coding.streamlearning;

import coding.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpInEachDepartment {

    public static void main(String[] args) {
        //How many employees are there in each department?
        final List<Employee> employeeList = Employee.getEmployeeList();
        Map<String, Long> employeeCountByDepartment=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println("Employee Count Department Wise:"+employeeCountByDepartment);
    }
}
