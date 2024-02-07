package com.tnsif.dayforteen.exception;

public class StudentInfo {
	private int rollNo;
	private String name;
	private float per;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	
	public void show()
	{
		try
		{
			PercentageValidator.isValidPercentage(per);
			System.out.println("Student details : ");
			System.out.println("RollNo : "+rollNo+"\tName : "+name+"\tPer : "+per);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid Percentage");
		}
	}
	
}