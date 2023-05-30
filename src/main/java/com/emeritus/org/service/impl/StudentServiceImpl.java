package com.emeritus.org.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emeritus.org.entity.Student;
import com.emeritus.org.repository.StudentRepository;
import com.emeritus.org.service.StudentService;

import javax.persistence.EntityManager;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository;
	@Autowired
	private EntityManager entityManager;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id)  {
		return studentRepository.findById(id).orElse(null);

	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);	
	}

}
