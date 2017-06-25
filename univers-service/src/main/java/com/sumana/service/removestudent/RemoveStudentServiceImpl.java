package com.sumana.service.removestudent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balazsholczer.repository.removestudent.RemoveStudentRepository;
import com.sumana.model.entity.Student;

@Service
public class RemoveStudentServiceImpl implements RemoveStudentService {

	@Autowired
	private RemoveStudentRepository removeStudentRepository;
	
	public void removeStudent(Student student) {
		removeStudentRepository.delete(student);
	}
}
