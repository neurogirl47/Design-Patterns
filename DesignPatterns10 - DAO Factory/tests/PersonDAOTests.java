import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.caveofprogramming.designpatterns.demo1.model.MySQLDAOFactory;
import com.caveofprogramming.designpatterns.demo1.model.Database;
import com.caveofprogramming.designpatterns.demo1.model.Person;
import com.caveofprogramming.designpatterns.demo1.model.PersonDAO;

import junit.framework.Assert;

public class PersonDAOTests {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("set up before class");
		
		Database.getInstance().connect();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tear down after class");
		
		Database.getInstance().disconnect();
	}

//	@Before
//	public void setUp() throws Exception {
//		System.out.println("set up");
//		
//		PersonDAO dao = MySQLDAOFactory.getPersonDAO();
//		
//		dao.deleteAll();
//	}
//
//	@After
//	public void tearDown() throws Exception {
//		System.out.println("tear down");
//	}
//
//	@Test
//	public void testDemo() {
//
//		int value = 7;
//		value +=2;
//		
//		System.out.println("Running demo test");
//		
//		assertEquals("Check that arithmetic works in Java!", 9, value);
//	}
//	
//	@Test
//	public void testCreate() throws SQLException{
//		
//		PersonDAO dao = MySQLDAOFactory.getPersonDAO();
//		
//		Person person1 = new Person("Bob", "letmein");
//		Person person2 = new Person("Sue", "hello");
//		
//		dao.addPerson(person1);
//		dao.addPerson(person2);
//		
//		List<Person> people = dao.getPeople();
//		
//		assertEquals("Should be two people in database.", 2, people.size());
//		
//		assertEquals("These two people should be the same.", person1, people.get(0));
//		assertEquals("Second person should be the same", person2, people.get(1));
//	}

}
