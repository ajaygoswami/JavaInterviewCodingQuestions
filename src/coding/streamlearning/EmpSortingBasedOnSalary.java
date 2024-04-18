package coding.streamlearning;

import coding.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmpSortingBasedOnSalary {

    public static void main(String[] args) {
        // Sort the List of Employee objects based on salary in Ascending order
        final List<Employee> employeeList = Employee.getEmployeeList();
        {
            List<Employee> employeesSortedList1 = employeeList.stream()
                    .sorted(Comparator.comparing(Employee::getSalary))
                    .collect(Collectors.toList());
            System.out.println(employeesSortedList1);

            List<Employee> employeesSortedList2 = employeeList.stream()
                    .sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()))
                    .collect(Collectors.toList());
            System.out.println(employeesSortedList2);
        }
        //Sort the List of Employee objects based on salary in Descending order
        {
            List<Employee> employeesSortedList1 = employeeList.stream()
                    .sorted(Comparator.comparing(Employee::getSalary).reversed())
                    .collect(Collectors.toList());
            System.out.println(employeesSortedList1);

            List<Employee> employeesSortedList2 = employeeList.stream()
                    .sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
                    .collect(Collectors.toList());
            System.out.println(employeesSortedList2);
        }
    }
}
