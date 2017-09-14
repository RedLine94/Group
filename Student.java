package ru.mail.redlin94;

public class Student extends Human {
	private double averageMark;
	private boolean captain;
	private boolean grants;
	private int course;
	private String specialty;
	
	
	public Student(String name, String surname, String patronymic, double age, boolean sex, double weight,
			double height, double averageMark, boolean captain, boolean grants, int course, String specialty)
			throws IllegalAccessError {
		super(name, surname, patronymic, age, sex, weight, height);
		if (age < 16)
			throw new IllegalAccessError("Come when you finish school.");
		if (averageMark < 2 || averageMark > 5)
			throw new IllegalAccessError("Wrong average mark.");
		if (course < 1 || course > 5)
			throw new IllegalAccessError("Wrong course number.");
		this.averageMark = averageMark;
		this.captain = captain;
		this.grants = grants;
		this.course = course;
		this.specialty = specialty;
	}

	public Student() {
		super();
	}

	public double getAverageMark() {
		return averageMark;
	}

	public void setAverageMark(double averageMark) {
		this.averageMark = averageMark;
	}

	public boolean isCaptain() {
		return captain;
	}

	public void setCaptain(boolean captain) {
		this.captain = captain;
	}

	public boolean isGrants() {
		return grants;
	}

	public void setGrants(boolean grants) {
		this.grants = grants;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	@Override
	public String toString() {
		return "Student [averageMark=" + averageMark + ", captain=" + captain + ", grants=" + grants + ", course="
				+ course + ", specialty=" + specialty + ", name=" + super.getName() + ", surname=" + super.getSurname()
				+ ", patronymic=" + super.getPatronymic() + ", age=" + super.getAge() + ", weight=" + super.getWeight()
				+ "" + ", height=" + super.getHeight() + ", sex=" + super.isSex() + "]";
	}

	@Override
	public String getInformation() {
		return "Information about Student [averageMark=" + averageMark + ", captain=" + captain + ", grants=" + grants
				+ ", course=" + course + ", specialty=" + specialty + ", name=" + super.getName() + ", surname="
				+ super.getSurname() + ", patronymic=" + super.getPatronymic() + ", age=" + super.getAge() + ", weight="
				+ super.getWeight() + "" + ", height=" + super.getHeight() + ", sex=" + super.isSex() + "]";
	}

}
