package ishaq.framework.springmvc5.bootstrap;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ishaq.framework.springmvc5.domain.Mentee;
import ishaq.framework.springmvc5.repositories.MenteeRepository;

// By Declaring Component Spring Context will pick it up
@Component
// Implements the Interface Command Line - Run on startup
// Injects in menteeRepository against JPA. JPA provides the implements
// It will give Persistence Object from H2.
// H2 is providing auto configuration. 
public class BootStrapData implements CommandLineRunner{

	private final MenteeRepository menteeRepository;
	
	//Initialize SpringData Repository using a constructor
	public BootStrapData(MenteeRepository menteeRepository) {
		super();
		this.menteeRepository = menteeRepository;
	}



	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Loading Mentee Data");
		Mentee m1 = new Mentee();
		//As Lombok generates code only during compilation, the IDE highlights errors in raw source code.
		m1.setName("Ishaq Khan");
		m1.setAge(25);
		m1.setDob(new Date());
		m1.setEmail("ishaq@gmail.com");
		m1.setGender("Male");
		menteeRepository.save(m1);
		
		Mentee m2 = new Mentee();
		//As Lombok generates code only during compilation, the IDE highlights errors in raw source code
		m2.setName("Siva Cherukuri");
		m2.setAge(25);
		m2.setDob(new Date());
		m2.setEmail("siva@gmail.com");
		m2.setGender("Male");
		menteeRepository.save(m2);
		
		Mentee m3 = new Mentee();
		//As Lombok generates code only during compilation, the IDE highlights errors in raw source code
		m3.setName("John Doe");
		m3.setAge(55);
		m3.setDob(new Date());
		m3.setEmail("john@gmail.com");
		m3.setGender("Male");
		menteeRepository.save(m3);
		
		System.out.println("Mentee Data Saved :: "+ menteeRepository.count());
	}

}
