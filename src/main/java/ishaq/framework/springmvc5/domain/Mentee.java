/**
 * 
 */
package ishaq.framework.springmvc5.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

/**
 * @author nsa
 *
 */
@Data
@Entity
public class Mentee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Date dob;
	private int age;
	private String gender;
	private String email;
	
}
