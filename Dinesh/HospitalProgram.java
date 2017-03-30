package com.Assignment8.Dinesh;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class HospitalProgram {
	public static void main(String[] args) {
		// TODO code application logic here
		String HospitalName = "HospitalDetails:";
		System.out.println("Enter the number of Hospitals you wish to add:");
		int size;
		Hospital[] Final1;
		HashMap<Integer, Hospital> zipcodeSort;
		HashSet<Hospital> specIssue;
		HashSet<Hospital> specRequestIssue;
		HashSet<Hospital> docListGet;
		HashSet<Hospital> hs;
		String SpeciIssue;
		String docList;
		String speciReq;
		try (Scanner scan = new Scanner(System.in)) {
			size = scan.nextInt();
			int[] difference = new int[size];
			Final1 = new Hospital[size];
			HashMap<String, Hospital> DuplicateSet = new HashMap();
			zipcodeSort = new HashMap();
			specIssue = new HashSet<>();
			specRequestIssue = new HashSet<>();
			docListGet = new HashSet();
			hs = new HashSet<>();
			int[] zipcodeArray = new int[10];
			System.out.println("Please enter your zipcode:");
			int zipCodeCheck = scan.nextInt();
			System.out.println("Please enter your illness:");
			SpeciIssue = scan.next();
			System.out.println("Enter the Name of the Hospital whose doctors you want to list out: ");
			docList = scan.next();
			System.out.println("Please request specialization availability whose doctors you want to list out: ");
			speciReq = scan.next();
			for (int i = 0; i < size; i++) {
				Hospital H = new Hospital();
				Address add = new Address();
				Doctor doc = new Doctor();
				System.out.println("Enter the Name of the hospital: ");
				String hosName = scan.next();
				System.out.println("Enter the ID of the Doctor: ");
				int Id = scan.nextInt();
				System.out.println("Enter the name of the Doctor in the hospital: ");
				String name = scan.next();
				System.out.println("Enter the Specilization of this Doctor in the hospital: ");
				String Speci = scan.next();
				doc.setDocId(Id);
				doc.setName(name);
				doc.setSpecialization(Speci);
				System.out.println("**************Address**********************");
				System.out.println("Enter the Address Line 1: ");
				String Add1 = scan.next();
				System.out.println("Enter the Address Line 2: ");
				String Add2 = scan.next();
				System.out.println("Enter the City: ");
				String city = scan.next();
				System.out.println("Enter the State: ");
				String state = scan.next();
				System.out.println("Enter the zipcode: ");
				int zipcode = scan.nextInt();
				add.setAddress1(Add1);
				add.setAddress2(Add2);
				add.setCity(city);
				add.setState(state);
				add.setZipCode(zipcode);
				H.setHospitalName(hosName);
				H.setDoc(doc);
				H.setHospitalAddress(add);
				DuplicateSet.put(HospitalName + hosName, H);
				Final1[i] = H;
				zipcodeArray[i] = zipcode;
				hs.add(Final1[i]);
				if (docList.equals(hosName)) {
					docListGet.add(Final1[i]);
				}
				if (SpeciIssue.equals(Speci)) {
					specIssue.add(Final1[i]);
				}
				if (speciReq.equals(Speci)) {
					specRequestIssue.add(Final1[i]);
				}

				for (int j = 0; j < size; j++) {
					if (zipcodeArray[j] >= zipCodeCheck) {
						difference[j] = (zipcodeArray[j] - zipCodeCheck);
					} else {
						difference[j] = (zipCodeCheck - zipcodeArray[j]);
					}
				}
				Arrays.sort(difference);
				zipcodeSort.put(difference[0], H);
			}
		}
		System.out.println("------------------ Result--------------------");
		for (int i = 0; i < size; i++) {
			System.out.println(Final1[i]);
		}
		System.out.println("------------------After Removing Duplicates hospitals available -------------");
		System.out.println(hs);
		System.out.println("The closest Hospital to you is:");
		System.out.println(zipcodeSort);
		System.out.println("The Hospital to your problem specialization is:" + SpeciIssue);
		System.out.println(specIssue);
		System.out.println("The doctors list is shown below for hospital:" + docList);
		System.out.println(docListGet);
		System.out.println("The doctors with you required specilization are listed below for the request:" + speciReq);
		System.out.println(specRequestIssue);

	}

}