package com.sring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.sring.jdbc.entities.Student;
public class StudentDaoImp implements SutdentDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		  //sql
        String query="insert into sutdent(id,name,city) values(?,?,?)";
        //fire query
        int result = jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
        System.out.println(result);
		return result;
	}
	public int change(Student student) {
		 String query1="update sutdent set name=?,city=? where id =?";
		 int upadate = jdbcTemplate.update(query1,student.getName(),student.getCity(),student.getId());
		return upadate;
	}
	public Student getStudent(int studentID) {
		String quary ="select * from sutdent where id =? ";
		RowMapperImp rowMapperImp = new RowMapperImp();
		Student student = this.jdbcTemplate.queryForObject(quary,rowMapperImp,studentID);
	return student;
	}


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public List<Student> getAllStudent() {
		String query="select * from sutdent";
		List<Student> student = this.jdbcTemplate.query(query, new RowMapperImp());
		return student;
	}
	
	

}
