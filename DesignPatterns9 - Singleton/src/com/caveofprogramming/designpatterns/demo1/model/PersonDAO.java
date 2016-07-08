package com.caveofprogramming.designpatterns.demo1.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

//one DAO class per person table or view
//CRUD methods

public class PersonDAO {
	
	public void addPerson(Person person)throws SQLException{
		
		Connection conn = Database.getInstance().getConnection();
		
		PreparedStatement p = conn.prepareStatement("insert into person_table (name, password) values (?, ?)");
		
		p.setString(1, person.getName());
		p.setString(2, person.getPassword());
		
		p.executeUpdate();
		
		p.close();
	}
	
	public Person getPerson(int id){
		return null;
	}
	
	public List<Person> getPeople(){
		return null;
	}
	
	public void updatePerson(Person person){
		
	}
	
	public void deletePerson(int id){
		
	}

}
