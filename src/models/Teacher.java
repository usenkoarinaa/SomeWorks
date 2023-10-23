package models;

import java.util.Date;

public class Teacher extends Employee {
	private TeachingLevel teachinglevel;
	
	
	

	public Teacher() {
		super();
		setTeachinglevel(TeachingLevel.TODDLER);
		
	}
	
	public Teacher (String name, String surname, String personalCode, Date date, TeachingLevel teachinglevel) {
		super(name, surname, personalCode, date);
		
		setTeachinglevel(teachinglevel);
	}




	public TeachingLevel getTeachinglevel() {
		return teachinglevel;
	}




	public void setTeachinglevel(TeachingLevel teachinglevel) {
		this.teachinglevel = teachinglevel;
	}
	
	@Override
	public String toString() {
		return "Teacher [name=" + getName() + ", surname=" + getSurname() + ", personalCode=" + getPersonalCode() + 
			   ", employeeld=" + getEmployeeld() + ", contractDate=" + getContractDate().toString() + ", contractNumber=" + getContractNumber() + 
			   ", teachinglevel=" + teachinglevel + "]";
	}

}
