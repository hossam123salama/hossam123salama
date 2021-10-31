/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author DELL
 */
public class Test {

    
     //Hossam salama mohamed
    public static void main(String[] args) {
    
		person person = new person("hussien", "12 saftelkamer", 
			"01098242769", "hussien.nser@gmail.com");

		student student = new student("hossam", "saftelkamer", "01098242769", 
			"hossam.222salama@gmail.com",student.FRESHMAN);

		employee employee = new employee("Mike", " saftelkamer","6189999999",
			"mike80@aol.com", 910, 60000);

		faculty faculty = new faculty("fci", "mini", "4133333333",
			"fci28@aol.com", 101, 50000, "4pm to 6pm", "Professor");

		staff staff = new staff("hatem", "malawe", "01098242769",
			"hatem@aol.com", 12, 65000, "Executive engeer");

		
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
	}
} 
    
    

