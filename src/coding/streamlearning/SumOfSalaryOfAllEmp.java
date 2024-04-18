package coding.streamlearning;

import java.util.List;

public class SumOfSalaryOfAllEmp {
    public static void main(String[] args) {
        //sum of salary of all the employees
        final List<Employee> employeeList = Employee.getEmployeeList();
        Double totalSalary = employeeList.stream()
                .map(Employee::getSalary)
                .reduce(0.0, Double::sum);
        System.out.println(totalSalary);
    }
}
