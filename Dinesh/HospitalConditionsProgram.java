package com.Assignment8.Dinesh;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HospitalConditionsProgram {
	Scanner scan;
	static HashMap<Integer, Hospital> hm = new HashMap<>();
	static Set<Integer> se = hm.keySet();

	public Hospital inputmtd(String hName, int dId, String dName, String Specialization, String address1,
			String address2, String city, String state, int zipcode) {

		Address a = new Address();
		a.setAddress1(address1);
		a.setAddress2(address2);
		a.setState(state);
		a.setCity(city);
		a.setZipCode(zipcode);

		Doctor d = new Doctor();
		d.setDocId(dId);
		d.setName(dName);
		d.setSpecialization(Specialization);

		Hospital h = new Hospital();
		h.setHospitalName(hName);
		h.setDoc(d);
		h.setHospitalAddress(a);

		return h;
	}

	Hospital[] eliminateDuplicates(Hospital[] hAll) {
		Hospital[] delDup = new Hospital[hAll.length];
		delDup = hAll.clone();
		for (int i = 0; i < hAll.length; i++) {
			Hospital h2 = hAll[i];
			for (int j = i + 1; j < hAll.length; j++) {
				Hospital h3 = hAll[j];
				if ((h2.getHospitalName().equals(h3.getHospitalName()))
						&& (h2.getHospitalAddress().getZipCode() == h3.getHospitalAddress().getZipCode())) {
					delDup[j] = null;
				}
//				boolean b = h2.getHospitalAddress().getZipCode() == h3.getHospitalAddress().getZipCode();
//				System.out.println(b);
//				System.out.println("h2 get zipcode \t " + h2.getHospitalAddress().getZipCode() + "\t h3 get zipcode \t"
//						+ h3.getHospitalAddress().getZipCode());
			}

		}
		return delDup;
	}

	Hospital[] takeInputs() {
		scan = new Scanner(System.in);
		System.out.println("Enter the no of Hospital List:");
		int hlength = scan.nextInt();
		Hospital[] hAll = new Hospital[hlength];
		Hospital[] hUniq = new Hospital[hlength];
		Hospital h1 = new Hospital();
		Hospital H;
		String hName;
		int dId;
		String dName;
		String Specialization;
		String address1;
		String address2;
		String city;
		String state;
		int zipcode;
		int[] allZips = new int[hlength];
		HashMap<Integer, Hospital> ZipSort;
		Set<Integer> se1;
		ArrayList<Integer> zipsort = new ArrayList<>();
		for (int i = 0; i < hlength; i++) {
			System.out.println("Enter the Name of the Hospital");
			hName = (scan.next());
			System.out.println("Enter the Doc Id:");
			dId = scan.nextInt();
			System.out.println("Enter the Doc dName:");
			dName = scan.next();
			System.out.println("Enter the Doc specilaization:");
			Specialization = scan.next();
			System.out.println("Enter the Hospital Address1:");
			address1 = scan.next();
			System.out.println("Enter the Hospital Address2:");
			address2 = scan.next();
			System.out.println("Enter the Hospital City:");
			city = scan.next();
			System.out.println("Enter the Hospital State:");
			state = scan.next();
			System.out.println("Enter the Hospital zipcode:");
			zipcode = scan.nextInt();
			allZips[i] = zipcode;

			H = inputmtd(hName, dId, dName, Specialization, address1, address2, city, state, zipcode);
			hAll[i] = H;
			hm.put(zipcode, H);
		}
		hUniq = eliminateDuplicates(hAll);
		System.out.println("Length of the hUniq is"+hUniq.length);
//		System.out.println("H Uniq values" + hUniq);
		
		for (int k = 0; k < hAll.length; k++) {
			if (hUniq[k] != null) {
				Hospital h4 = hUniq[k];
				System.out.println("Value of i:" + k);
				System.out.println(h4.getHospitalName() + "\t" + h4.getDoc().getDocId() + "\t" + h4.getDoc().getName()
						+ "\t" + h4.getDoc().getSpecialization() + "\t" + h4.getHospitalAddress().getAddress1() + "\t"
						+ h4.getHospitalAddress().getAddress2() + "\t" + h4.getHospitalAddress().getState() + "\t"
						+ h4.getHospitalAddress().getCity() + "\t" + h4.getHospitalAddress().getZipCode());
			}
		}

		System.out.println("Enter your area zipcode");
		int urzip1 = scan.nextInt();
		int[] difInZip = new int[hlength];
		ZipSort = new HashMap<>();
		for (int j = 0; j < hlength; j++) {
			if (allZips[j] > urzip1) {
				difInZip[j] = allZips[j] - urzip1;
				System.out.println(" From the zipsort in DifInZip in if Class\t"+allZips[j]+"\t"+urzip1+"\t"+difInZip[j]);
			} else {
				difInZip[j] = urzip1 - allZips[j];
				System.out.println(" From the zipsort in DifInZip in else Class\t"+allZips[j]+"\t"+urzip1+"\t"+difInZip[j]);
			}
		}
		Arrays.sort(difInZip);
		System.out.println(difInZip);
		ZipSort.put(difInZip[0], h1);
		se1 = ZipSort.keySet();
		System.out.println("Hospital Near to Your Location is"+ZipSort.get(se1));
		return hUniq;
	}

	// int[] zipCodemtd(Hospital[] hAll) {
	// scan = new Scanner(System.in);
	// System.out.println("Enter the zipcode of your area");
	// int zipOfArea = scan.nextInt();
	// int[] zipSort = new int[hAll.length];
	// int[] allZip = new int[hAll.length];
	// HashMap<Integer, Integer> hm1 = new HashMap<>();
	// Set<Integer> se1 = hm1.keySet();
	// System.out.println("Debug in zipmtd:1");
	// for (Integer f : se) {
	// for (int i = 0; i < hAll.length; i++) {
	// allZip[i] = hm.get(f).getHospitalAddress().getZipCode();
	// if (allZip[i] > zipOfArea) {
	// zipSort[i] = allZip[i] - zipOfArea;
	// hm1.put(zipSort[i], allZip[i]);
	// } else {
	// zipSort[i] = zipOfArea - allZip[i];
	// hm1.put(zipSort[i], allZip[i]);
	// }
	// System.out.println("From Zip Code Method Value of i\t" + i + "\t value of
	// f\t" + f
	// + "\t zipcodes sorted\t" + zipSort[i] + "\t" + allZip[i]);
	// break;
	// }
	// }
	//
	// Arrays.sort(zipSort);
	// for (Integer l : se1) {
	// System.out.println("Value of l\t" + l + "\t value of Hashmap at l\t" +
	// hm1.get(l));
	// }
	// // for (Integer j : hcp.se) {
	// // System.out.println("Debug in zipmtd:2 of 2");
	// // System.out.println("Value of j\t" + j + "\t value of hashmap \t"
	// // + hcp.hm.get(j));
	// // }
	// return zipSort;
	// }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HospitalConditionsProgram hcp = new HospitalConditionsProgram();
		Hospital[] harr = hcp.takeInputs();

		// for (Integer i : hcp.se) {
		// System.out.println("Value of Key \t" + i + "\t value of Hashmap value
		// at key\t"
		// + hcp.hm.get(i).getHospitalName() + "\t" +
		// hcp.hm.get(i).getDoc().getDocId() + "\t"
		// + hcp.hm.get(i).getDoc().getName() + "\t" +
		// hcp.hm.get(i).getDoc().getSpecialization() + "\t"
		// + hcp.hm.get(i).getHospitalAddress().getAddress1() + "\t"
		// + hcp.hm.get(i).getHospitalAddress().getAddress2() + "\t"
		// + hcp.hm.get(i).getHospitalAddress().getCity() + "\t"
		// + hcp.hm.get(i).getHospitalAddress().getState() + "\t"
		// + hcp.hm.get(i).getHospitalAddress().getZipCode());
		//
		// }
	}

}
