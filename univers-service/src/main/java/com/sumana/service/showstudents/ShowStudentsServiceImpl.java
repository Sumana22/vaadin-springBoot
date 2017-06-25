package com.sumana.service.showstudents;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balazsholczer.repository.addstudent.ShowAllStudentsRepository;
import com.sumana.model.entity.Student;

@Service
public class ShowStudentsServiceImpl implements ShowStudentsService {

	@Autowired
	private ShowAllStudentsRepository showAllStudentsRepository;
	
	public List<Student> getAllStudents() {
		return showAllStudentsRepository.getAllStudents();
	}

}
