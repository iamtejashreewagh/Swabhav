package com.techlabs.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public abstract class Account {
	private int accountNumber;
	protected double balance;
	private int age;
	private String name;
	private Date creationDate;
	private Date dateOfBirth;

	public Account(int accountNumber, String name, double balance, String creatioDate, String dateOfBirth) throws ParseException {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
		SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy");
		this.creationDate = sdf.parse(creatioDate);
		this.dateOfBirth = sdf.parse(dateOfBirth);
		this.age = calculateAge();
	}

	private int calculateAge() {
		SimpleDateFormat sdf = new SimpleDateFormat("MM/DD/YYYY");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(this.dateOfBirth);
		int year = calendar.get(Calendar.YEAR) ;
		int month = calendar.get(Calendar.MONTH) + 1;
		int date = calendar.get(Calendar.DATE);
		LocalDate birthDate = LocalDate.of(year, month, date);
		LocalDate todaysDate = LocalDate.now();
		Period age = Period.between(birthDate, todaysDate);
		this.age= age.getYears();
		return age.getYears();
	}
	
	public int getAge() {
		return age;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	abstract void withdraw(double amount);

	public double getBalance() {
		return balance;
	}

	public int getAccNo() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}
	
	public Date getCreationDate() {
		return creationDate;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

}