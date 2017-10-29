package ua.nure.kn156.slepanska;

import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @author �������
 *
 */
public class User {
	private Long id;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;

	public User(User user) {
		id = user.getId();
		firstName = user.getFirstName();
		lastName = user.getLastName();
		dateOfBirth = user.getDateOfBirth();
	}

	public User() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getFullName() {
		if (getLastName() == null || getFirstName() == null) {
			throw new IllegalArgumentException("Please,fill all the fields of the form");
		} else {
			return getLastName() + ", " + getFirstName();
		}
	}

	public int getAge() {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		int currentYear = calendar.get(Calendar.YEAR);
		int currentMonth = calendar.get(Calendar.MONTH);
		calendar.setTime(getDateOfBirth());
		int yearOfBirth = calendar.get(Calendar.YEAR);
		int monthOfBirth = calendar.get(Calendar.MONTH);
		if (monthOfBirth > currentMonth) {
			return currentYear - yearOfBirth - 1;
		} else {
			return currentYear - yearOfBirth;

		}
	}
}