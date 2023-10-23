package models;

import java.util.ArrayList;

public class Group {
	
	private ArrayList<Child> allChildrenInGroup;
	private short groupStartYear;
	private String title ;
	private Teacher teacher;

	public Group() {
		
		allChildrenInGroup = new ArrayList<Child>();
		setGroupStartYear((short) 2022);
		setTitle("c");
		setTeacher(new Teacher());
		
	}
	
	public Group(short year, String title, Teacher teacher ) {
		
		allChildrenInGroup = new ArrayList<Child>();
		setGroupStartYear(year);
		setTitle(title);
		setTeacher(teacher);
		
	}

	public short getGroupStartYear() {
		return groupStartYear;
	}

	public void setGroupStartYear(short groupStartYear) {
		this.groupStartYear = groupStartYear;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public boolean addChildInGroup(Child child) {
		for (Child c : allChildrenInGroup) {
			if (c.getPersonalCode().equals(child.getPersonalCode())) {
				return false;
			}
		}
		allChildrenInGroup.add(child);
		return true;
	}
	
	public boolean removeChildFromGroup(Child child) {
		for (Child c : allChildrenInGroup) {
			if (c.getPersonalCode().equals(child.getPersonalCode())) {
				allChildrenInGroup.remove(c);
				return true;
			}
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "Group [allChildrenInGroup=" + allChildrenInGroup + ", groupStartYear=" + groupStartYear + ", title="
				+ title + ", teacher=" + teacher + "]";
	}

	
}
