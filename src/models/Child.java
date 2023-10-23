package models;

import java.util.Random;

public class Child extends Person {
	private String alergies;
	private int priorityForSpeachLessons;
	private Nationality nationality;

	public Child() {
		super();
		
		setNationality(Nationality.Estonian);
		setAlergies("alergies");
		Random random = new Random();
		setPriorityForSpeachLessons(random.nextInt(6-1)+1);
	
		
	}

	private void setNationality(Nationality nationality) {
		this.nationality = nationality;
		
		
	}

	public String getAlergies() {
		return alergies;
	}

	public void setAlergies(String alergies) {
		this.alergies = alergies;
	}

	public int getPriorityForSpeachLessons() {
		return priorityForSpeachLessons;
	}

	public void setPriorityForSpeachLessons(int priorityForSpeachLessons) {
		this.priorityForSpeachLessons = priorityForSpeachLessons;
	}

	public Nationality getNationality() {
		return nationality;
	}

	
	public Child(String name, String surname, String personalCode, String alergies, int priority, Nationality nationality) {
		super(name, surname, personalCode);
		
		setNationality(nationality);
		setAlergies(alergies);
		setPriorityForSpeachLessons(priority);
	
		
	}
	
	@Override
	public String toString() {
		return "Child [name=" + getName() + ", surname=" + getSurname() + ", personalCode=" + getPersonalCode() + ", alergies=" + alergies + ", priorityForSpeachLessons=" + priorityForSpeachLessons
				+ ", nationality=" + nationality + "]";
		
	}
	
	
	
	
	
	

	

}
