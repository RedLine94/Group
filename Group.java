package ru.mail.redlin94;

import java.util.Arrays;

public class Group {
	private Student[] group = new Student[10];

	public Group(Student[] group) {
		super();
		if (group.length > 10 || group.length < 0)
			throw new IllegalAccessError("The group should contain between one and ten students.");
		this.group = Arrays.copyOf(group, 10);
	}

	public Group() {
		super();
	}

	public Student[] getGroup() {
		return group;
	}

	public void setGroup(Student[] group) {
		if (group.length > 10 || group.length < 0)
			throw new IllegalAccessError("The group should contain between one and ten students.");
		this.group = group;
	}

	public void addStudent(Student student) throws ExceptionFullGroup, ExceptionParametrIsNull {
		for (int i = 0; i < group.length; i++) {
			if (student == null)
				throw new ExceptionParametrIsNull();
			if (group[i] == null) {
				group[i] = student;
				return;
			}
		}
		throw new ExceptionFullGroup();
	}

	public void deleteStudent(Student student) throws ExceptionNoStudent, ExceptionParametrIsNull {
		if (student == null)
			throw new ExceptionParametrIsNull();
		for (int i = 0; i < group.length; i++) {

			if (group[i] != null && (group[i].getName() == student.getName()
					&& group[i].getSurname() == student.getSurname()
					&& group[i].getPatronymic() == student.getPatronymic() && group[i].getAge() == student.getAge())) {
				group[i] = null;
				return;
			}
		}
		throw new ExceptionNoStudent();
	}

	public Student findStudent(Student student) throws ExceptionParametrIsNull, ExceptionNoStudent {

		if (student == null)
			throw new ExceptionParametrIsNull();
		for (int i = 0; i < group.length; i++) {
			if (group[i] != null && (group[i].getSurname() == student.getSurname())) {
				return group[i];
			}
		}
		throw new ExceptionNoStudent();

	}

	@Override
	public String toString() {

		Student temp;

		for (int i = 0; i < group.length; i++) {
			for (int j = i+1; j < group.length; j++) {
				if ((group[i] != null && group[j] != null)
						&& (group[i].getSurname().compareTo(group[j].getSurname()) > 0)) {
					temp = group[i];
					group[i] = group[j];
					group[j] = temp;
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for (Student student : group) {
			if (student != null) {
				sb.append(student);
				sb.append(System.lineSeparator());
			}
		}

		return sb.toString();
	}

}
