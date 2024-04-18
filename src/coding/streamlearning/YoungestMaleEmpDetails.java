package coding.streamlearning;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class YoungestMaleEmpDetails {
    public static void main(String[] args) {
      //  Get the details of the youngest male employee in the product development department?
        final List<Employee> employeeList = Employee.getEmployeeList();
        {  Employee youngestMaleEmplInDevDpt=   employeeList.stream()
                .filter(employee -> employee.getGender().equalsIgnoreCase("MALE") &&
                        employee.getDepartment().equalsIgnoreCase("Product Development"))
                .sorted(Comparator.comparing(Employee::getAge)).findFirst().get();

           System.out.println(youngestMaleEmplInDevDpt);
         }
        {
            Optional<Employee> youngestMaleEmployeeInProductDevelopmentWrapper=
                    employeeList.stream()
                            .filter(e -> e.getGender()=="Male" && e.getDepartment()=="Product Development")
                            .min(Comparator.comparingInt(Employee::getAge));
            Employee youngestMaleEmployeeInProductDevelopment = youngestMaleEmployeeInProductDevelopmentWrapper.get();
            System.out.println("Details Of Youngest Male Employee In Product Development");
            System.out.println("----------------------------------------------");
            System.out.println("Employee : "+youngestMaleEmployeeInProductDevelopment);
        }


    }
}
