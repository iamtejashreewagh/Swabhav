package com.techlabs.model.test;

import java.text.ParseException;
import java.util.UUID;

import com.techlabs.model.Organisation;
import com.techlabs.model.Partner;
import com.techlabs.model.Talent;

public class Program {

	public static void main(String[] args) throws ParseException {
		Organisation swabhav = new Organisation(UUID.randomUUID(), "SwabhavTechlabs",
				"09/03/1990");
		Partner aurionPro = new Partner(UUID.randomUUID(), "Aurion Pro",
				100000, 1000);
		Partner microsoft = new Partner(UUID.randomUUID(), "Microsoft",
				200000, 2000);
		Partner google = new Partner(UUID.randomUUID(), "Google", 300000,
				3000);

		swabhav.addPartner(aurionPro);
		swabhav.addPartner(google);
		swabhav.addPartner(microsoft);

		Talent talent1 = new Talent(UUID.randomUUID(), "abc", 9, microsoft.getName(), "python");
		Talent talent2 = new Talent(UUID.randomUUID(), "def", 8.5,
				google.getName(), "C++");
		Talent talent3 = new Talent(UUID.randomUUID(), "pqr", 8.0,
				null, "Java");

		swabhav.addTalent(talent1, null);
		swabhav.addTalent(talent2, google);
		swabhav.addTalent(talent3, aurionPro);

		printInfo(swabhav);
		printInfo(google);
		printInfo(microsoft);
	}

	private static void printInfo(Organisation organisation) {
		System.out.println(" Organisation Details :");
		System.out.println("Id : " + organisation.getId() + " Name : "
				+ organisation.getName() + " Registration Date : "
				+ organisation.getRegistrationDate() + " Number of Partners : "
				+ organisation.partnerCount());
		System.out.println(" Partner Details :");
		for (Partner partner : organisation.getPartners()) {
			System.out.println("Id : " + partner.getId() + " Name : "
					+ partner.getName() + " Company Turnover : "
					+ partner.getCompanyTurnOver() + " Employee Strength : "
					+ partner.getEmpStrength());
		}

		System.out.println(" Talent Details :");
		for (Talent talent : organisation.getTalents()) {
			System.out.println("Talent id : " + talent.getId()
					+ " Name : " + talent.getName() + " Cgpa : "
					+ talent.getCgpa() + " Partner associated : "
					+ talent.getPartner() + " Techstack : "
					+ talent.getTechStack());
		}

	}

	public static void printInfo(Partner partner) {
		System.out.println(" Talent Details :");
		for (Talent talent : partner.getTalents()) {
			System.out.println("Talent id : " + talent.getId()
			+ " Name : " + talent.getName() + " Cgpa : "
			+ talent.getCgpa() + " Partner associated : "
			+ talent.getPartner() + " Techstack : "
			+ talent.getTechStack());

		}
	}
}