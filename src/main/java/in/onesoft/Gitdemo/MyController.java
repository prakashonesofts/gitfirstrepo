package in.onesoft.Gitdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {
    @GetMapping("/employeedetails")
    public List<Employee> getAll() {
        Employee e1 = new Employee();
        e1.name="Prakash";
        e1.age=27;
        e1.mailId="prakashrkps@gmail.com";

        Employee e2 = new Employee();
        e2.name="Nishanthi";
        e2.age=23;
        e2.mailId="nisha@gmail.com";

        List<Employee> employee = new ArrayList<>();
        employee.add(e1);
        employee.add(e2);

        return employee;
    }

}
