package models;

import java.util.Date;

public class Employee extends Person {
	private int employeeld;
	private static int employeeCounter = 1;
	private Date contractDate;
	private String contractNumber;
	
	public int getEmployeeld() {
		return employeeld;
	}
	
	public void setEmployeeld(int employeeld) {
		this.employeeld = employeeld;
	}
	
	public Date getContractDate() {
		return contractDate;
	}
	
	public void setContractDate(Date contractDate) {
        if (contractDate.getYear()+1900 >= 2022) {
            if (contractDate.getMonth() >= 2) {
                if (contractDate.getDate() >= 24) {
                    this.contractDate = contractDate;
                    return;
                }
            }
        }

        this.contractDate = new Date(2022-1900, 2, 24);
    }
	
	public String getContractNumber() {
		return contractNumber;
	}
	
	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	public Employee() {
		super();
		
		setEmployeeld(employeeCounter);
		setContractDate(new Date());
		setContractNumber(getContractDate().getYear()+1900 + "_" + employeeCounter + "_" + getName().charAt(0) + "_" + getSurname().charAt(0));
		
		employeeCounter++;
	}

	public Employee(String name, String surname, String personalCode, Date date) {
		super(name, surname, personalCode);
		
		setEmployeeld(employeeCounter);
		setContractDate(date);
		setContractNumber(date.getYear()+1900 + "_" + employeeCounter + "_" + getName().charAt(0) + "_" + getSurname().charAt(0));
		
		employeeCounter++;
	}
	
	//toString

	@Override
	public String toString() {
		return "Employee [name=" + getName() + ", surname=" + getSurname() + ", personalCode=" + getPersonalCode() + 
			   ", employeeld=" + employeeld + ", contractDate=" + contractDate.toString() + ", contractNumber=" + contractNumber + "]";
	}
}