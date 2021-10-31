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
public class faculty extends employee{
    
	
	private String officeHours;
	private String rank;

	
	public faculty(String name, String address, String phone, String email, 
		int office, double salary, String officeHours, String rank) {
		super(name, address, phone, email, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}

    faculty(String jun, String saftelkamer, String string, String hossam222salamagmailcom, int i, int i0, String pmto7pm, String student) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

	
	public String getOfficeHours() {
		return officeHours;
	}

	
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	
	public String getRank() {
		return rank;
	}

	
	public void setRank(String rank) {
		this.rank = rank;
	}

	
	public String toString() {
		return super.toString() + "\nOffice hours: " + officeHours +
		"\nRank: " + rank;
	}
} 
    

