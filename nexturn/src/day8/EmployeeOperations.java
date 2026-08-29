package day8;
import java.util.ArrayList;
import java.util.List;
import Day3.Employee;

public class EmployeeOperations {
	List<Employee> emplist = new ArrayList<Employee>();

  
    public String addEmployee( int empcode,String empname, double salary) {
    	   
        emplist.add(new Employee(empcode, empname, salary));

        return "Employee is added";
    }

    public String updateEmployee(int empcode,String empname, double salary) {

        boolean found = false;
        for (Employee emp : emplist) {

            if (emp.getEmpno() == empcode) {

                emp.setEmpname(empname);
                emp.setSalary(salary);

                found = true;
                break;
            }
        }

        if (!found) {
            return "Employee not found";
        } else {
            return "Employee is updated";
        }
    }

    public String deleteEmployee(int empcode) {

        for (Employee emp : emplist) {

            if (emp.getEmpno() == empcode) {
                emplist.remove(emp);
                return "Employee is removed";
            }
        }

        return "Employee not found";
    }

    public List<Employee> showEmployeeDetails() {
        return emplist;
    }

    public String searchForEmployee(int empcode) {
        for (Employee emp : emplist) {
            if (emp.getEmpno() == empcode) {
                return emp.toString();
            }
        }

        return "Employee not found";
    }
}