package com.sring.jdbc.dao;

import java.util.List;

import com.sring.jdbc.entities.Student;

public interface SutdentDao {
public int insert(Student student);
public int change(Student student);
public Student getStudent( int studentID);
public List<Student> getAllStudent();
}
