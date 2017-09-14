package ru.mail.redlin94;

public class Human {
	private String name;
	private String surname;
	private String patronymic;
	private double age;
	private boolean sex;
	private double weight;
	private double height;

	public Human(String name, String surname, String patronymic, double age, boolean sex, double weight, double height)
			throws IllegalAccessError {
		super();
		if (name == null || name == "")
			throw new IllegalAccessError("The field 'name' is empty.");
		if (surname == null || surname == "")
			throw new IllegalAccessError("The field 'surname' is empty.");
		if (patronymic == null || patronymic == "")
			throw new IllegalAccessError("The field 'patronymic' is empty.");
		if (age < 0)
			throw new IllegalAccessError("The field 'age' has a negative value.");
		if (weight < 0)
			throw new IllegalAccessError("The field 'weight' has a negative value.");
		if (height < 0)
			throw new IllegalAccessError("The field 'height' has a negative value.");
		char[] checkName = name.toLowerCase().toCharArray();
		char[] checkSurname = surname.toLowerCase().toCharArray();
		char[] checkPatronymic = patronymic.toLowerCase().toCharArray();

		for (int i = 0; i < checkPatronymic.length; i++) {
			if (checkPatronymic[i] < 'a' || checkPatronymic[i] > 'z')
				throw new IllegalAccessError("The field 'patronymic' contain illegal characters.");
		}

		for (int i = 0; i < checkSurname.length; i++) {
			if (checkSurname[i] < 'a' || checkSurname[i] > 'z')
				throw new IllegalAccessError("The field 'surname' contain illegal characters.");
		}

		for (int i = 0; i < checkName.length; i++) {
			if (checkName[i] < 'a' || checkName[i] > 'z')
				throw new IllegalAccessError("The field 'name' contain illegal characters.");
		}

		this.name = name;
		this.surname = surname;
		this.patronymic = patronymic;
		this.age = age;
		this.sex = sex;
		this.weight = weight;
		this.height = height;
	}

	public Human() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getInformation() {
		return "Information about human [name=" + name + ", surname=" + surname + ", patronymic=" + patronymic
				+ ", age=" + age + ", sex=" + sex + ", weight=" + weight + ", height=" + height + "]";
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", surname=" + surname + ", patronymic=" + patronymic + ", age=" + age + ", sex="
				+ sex + ", weight=" + weight + ", height=" + height + "]";
	}

}
