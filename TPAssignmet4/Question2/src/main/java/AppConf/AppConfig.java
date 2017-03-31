package AppConf;

import Inheritance.Actions;
import Inheritance.Employee;
import Inheritance.StudentInheritance;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Riyaad on 3/29/2017.
 */
@Configuration
public class AppConfig
{
@Bean(name="stud")
public Actions getStudentInfo()
{
    return new StudentInheritance("Riyaad","Cader");
}
    @Bean(name="emp")
    public Actions getEmployeeInfo()
    {
        return new Employee("John","Cena");
    }
}
