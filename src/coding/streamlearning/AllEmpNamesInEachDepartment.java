package coding.streamlearning;

import coding.Employee;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class AllEmpNamesInEachDepartment {

    public static void main(String[] args) {
        // List down the names of all employees in each department?
        final List<Employee> employeeList = Employee.getEmployeeList();

        Map<String,List<Employee>> employeeListByDepartment = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        Set<Map.Entry<String, List<Employee>>> entrySet = employeeListByDepartment.entrySet();
        for (Map.Entry<String, List<Employee>> entry : entrySet){
            System.out.println("--------------------------------------");
            System.out.println("Employees In "+entry.getKey() + " : ");
            System.out.println("--------------------------------------");
            List<Employee> list = entry.getValue();
            for (Employee e : list){
                System.out.println(e.getName());
            }
        }

    }
}
