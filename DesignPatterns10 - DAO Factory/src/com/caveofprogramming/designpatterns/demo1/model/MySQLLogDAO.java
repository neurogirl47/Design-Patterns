package com.caveofprogramming.designpatterns.demo1.model;

import java.util.List;

public class MySQLLogDAO implements LogDAO {

	/* (non-Javadoc)
	 * @see com.caveofprogramming.designpatterns.demo1.model.LogDAO#addEntry(java.lang.String)
	 */
	@Override
	public void addEntry(String message){
		//Not implemented
		
		//get current time and add log message to database
	}
	
	/* (non-Javadoc)
	 * @see com.caveofprogramming.designpatterns.demo1.model.LogDAO#getEntries(int)
	 */
	@Override
	public List<Log> getEntries(int number){
		
		//Not implemented. GEt latest "number" log messages
		
		return null;
	}
	
	//Maybe no real need for update or delete in this case
}
