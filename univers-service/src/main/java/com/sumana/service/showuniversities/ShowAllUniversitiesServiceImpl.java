package com.sumana.service.showuniversities;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balazsholczer.repository.university.ShowAllUniversitiesRepository;
import com.sumana.model.entity.University;

@Service
public class ShowAllUniversitiesServiceImpl implements ShowAllUniversitiesService {

	@Autowired
	private ShowAllUniversitiesRepository showAllUniversitiesRepository;
	
	public List<University> getAllUniversities() {
		return showAllUniversitiesRepository.getAllUniversities();
	}
}
