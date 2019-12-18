package ishaq.framework.springmvc5.services;

import java.util.List;

import ishaq.framework.springmvc5.domain.Mentee;

public interface MenteeService {

	Mentee findMenteeById(Long id);

	List<Mentee> findAllMentees();

	Mentee saveMentee(Mentee mentee);

}