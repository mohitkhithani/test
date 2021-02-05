package example;

import java.util.ArrayList;
import java.util.List;

public class example {

	private static final String String = null;
	private long id;
	private String fname;
	private String lname;
	private String address;
	private String mobileNo;

	public example(int i, String fname, String lname, String address, String mobileNo) {

		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.mobileNo = mobileNo;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "example [id=" + this.id + ", fname=" + this.fname + ", lname=" + this.lname + ", address="
				+ this.address + ", mobileNo=" + this.mobileNo + "]";
	}

	/**
	 * Returns the id @{link long}
	 *
	 * @return the id
	 */
	public long getId() {
		return this.id;
	}

	/**
	 * Sets the id type @link long
	 *
	 * @param id Sets new value for @link long
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Returns the fname @{link String}
	 *
	 * @return the fname
	 */
	public String getFname() {
		return this.fname;
	}

	/**
	 * Sets the fname type @link String
	 *
	 * @param fname Sets new value for @link String
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}

	/**
	 * Returns the lname @{link String}
	 *
	 * @return the lname
	 */
	public String getLname() {
		return this.lname;
	}

	/**
	 * Sets the lname type @link String
	 *
	 * @param lname Sets new value for @link String
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}

	/**
	 * Returns the address @{link String}
	 *
	 * @return the address
	 */
	public String getAddress() {
		return this.address;
	}

	/**
	 * Sets the address type @link String
	 *
	 * @param address Sets new value for @link String
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Returns the mobileNo @{link String}
	 *
	 * @return the mobileNo
	 */
	public String getMobileNo() {
		return this.mobileNo;
	}

	/**
	 * Sets the mobileNo type @link String
	 *
	 * @param mobileNo Sets new value for @link String
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public static void main(String[] args) {

		example employee = new example(1, "Ram", "Kumar", "Sector 5 bhilai", "345345345");

		example employee1 = new example(2, String, String, String, String);
		employee1.setId(2);
		employee1.setFname("Mohan");
		employee1.setLname("Singh");
		employee1.setAddress("Bhopal");
		employee1.setMobileNo("6523985623");

		System.out.println("id " + employee.getId() + " fname " + employee.getFname() + " lname " + employee.getLname()
				+ " address " + employee.getAddress() + " mobileNo " + employee.getMobileNo());
		System.out.println("id " + employee1.getId() + " fname " + employee1.getFname() + " lname "
				+ employee1.getLname() + " address " + employee1.getAddress() + " mobileNo ");
		List a1 = new ArrayList();

		a1.add("ram");
		a1.add("sam");
		a1.add("Arun");
		System.out.println(" ArrayList Elements");
		System.out.print("\t" + a1);
	}
}