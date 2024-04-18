package coding.streamlearning;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MostExperiencedEmp {
    public static void main(String[] args) {
        //Who has the most working experience in the organization?
        final List<Employee> employeeList = Employee.getEmployeeList();
        {
            Optional<Employee> seniorMostEmployeeWrapper = employeeList.stream()
                    .min(Comparator.comparing(Employee::getYearOfJoining));
            System.out.println(seniorMostEmployeeWrapper);
        }
        {
            Optional<Employee> seniorMostEmployeeWrapper=
                    employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining))
                            .findFirst();
            System.out.println(seniorMostEmployeeWrapper);
        }
    }
}
