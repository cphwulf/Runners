/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package runners;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thor
 */
public class MemberTest {
	String name;
	int year;
	int id;
	boolean active;
	boolean motionist;
	LocalDate memberSince;
	
	
	@Before
	public void setUp() {
		id = 123456;
		name = "Jakob Andkjær";
		year = 1985;
		active = true;
		motionist = false;
		String passedDate = "28-02-2016";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		memberSince = LocalDate.parse(passedDate, formatter);
	}
	
	@Test
	public void testgetAge() {
		fail("The test case is a prototype.");
	}
	
}
