package models;

public class Person {

//mainīgie
	
	private String name;
	private String surname;
	private String personalCode;

// get funkcijas
	
	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getPersonalCode() {
		return personalCode;
	}
//set funkcijas

	public void setName(String name) {
		if(name!=null && name.matches("[A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+\\s?([A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+)?"))
		{
			this.name = name;
		}
		else
		{
			this.name = "notknown";
		}
		
	}

	public void setSurname(String surname) {
		if(surname!=null && surname.matches("[A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+\\s?([A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+)?"))
		{
			this.surname = surname;
		}
		else
		{
			this.surname = "notknown";
		}
		
		
	}

	public void setPersonalCode(String personalCode) {
		if(personalCode !=null && personalCode.matches("[0-9]{6}[-]{1}[0-9]{5}"))
		{
			this.personalCode = personalCode;
		}
		else
		{
			this.personalCode = "notknown";
		}
	}
	
	//konstruktori
	
	public Person() {
		setName("Random");
		setSurname("Character");
		setPersonalCode("123456-12378");
		
	}
	
	public Person(String name, String surname, String personalCode) {
		setName(name);
		setSurname(surname);
		setPersonalCode(personalCode);
		
	}
	
	//toString

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", personalCode=" + personalCode + "]";
	}
	
	
	
	
	
	
	

	
}
