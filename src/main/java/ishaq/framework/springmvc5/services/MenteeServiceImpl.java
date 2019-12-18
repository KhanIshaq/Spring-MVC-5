/**
 * 
 */
package ishaq.framework.springmvc5.services;

import java.util.List;

import org.springframework.stereotype.Service;

import ishaq.framework.springmvc5.domain.Mentee;
import ishaq.framework.springmvc5.repositories.MenteeRepository;

/**
 * @author nsa
 *
 */
@Service
//Business Logic is implemented
//This will be a wrapper around Spring Data Repository Layer
public class MenteeServiceImpl implements MenteeService {
	
	private final MenteeRepository menteeRepository;

	public MenteeServiceImpl(MenteeRepository menteeRepository) {
		super();
		this.menteeRepository = menteeRepository;
	}

	@Override
	public Mentee findMenteeById(Long id) {
		
		return menteeRepository.findById(id).get();
	}

	@Override
	public List<Mentee> findAllMentees() {
		
		return menteeRepository.findAll();
	}

	@Override
	public Mentee saveMentee(Mentee mentee) {
		return menteeRepository.save(mentee);
	}
}
