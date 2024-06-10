package in.ashokit;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Address;
import in.ashokit.entity.Employee;
import in.ashokit.repository.AddRepository;
import in.ashokit.repository.EmpRepository;

@SpringBootApplication
public class Application 
{

	public static void main(String[] args) 
	{
	ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	EmpRepository employeeRepo =context.getBean(EmpRepository.class);
	    Employee e = new Employee();
	    e.setEmpName("Raja");
	    e.setEmpSalary(4000.00); 
	    
	    Address a1 = new Address();
	    a1.setCityName("Pune");
	    a1.setState("MH");
	    a1.setCountry("India");
	    a1.setEmp(e);
	    
	    Address a2 = new Address();
	    a2.setCityName("Hy");
	    a2.setState("TG");
	    a2.setCountry("India");
	    a2.setEmp(e);
	    
	    List<Address> addrList = Arrays.asList(a1,a2);
	    e.setAddr(addrList);
	    
//	    employeeRepo.save(e);
	    AddRepository addressRepo = context.getBean(AddRepository.class);
	    addressRepo.findById(3);
	    
//	    employeeRepo.deleteById(1);
//	    employeeRepo.findById(2);
	    System.out.println("Records inserted...");
	    
	}

}
