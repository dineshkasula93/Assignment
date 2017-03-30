package com.Assignment5;

import java.util.Scanner;

public class EmployeeDuplicateElimination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDuplicateElimination ede = new EmployeeDuplicateElimination();
		Employee[] e2 = ede.methodToTakeInputsFromConsole();
		ede.displayResults(e2);
	}

	Employee methodcallingprgm(int eID, String eName, double eSal, int dID, String dName, String dLocation) {
		Department d = new Department();
		d.setDeptId(dID);
		d.setDeptName(dName);
		d.setLocation(dLocation);

		Employee e = new Employee();
		e.setId(eID);
		e.setName(eName);
		e.setSalary(eSal);
		e.setDept(d);

		return e;
	}

	Employee[] methodToTakeInputsFromConsole() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the lenght of the Employee Details");
		int lenghtOfArray = scan.nextInt();
		Employee[] uniqueValues = new Employee[lenghtOfArray];
		Employee[] allValues = new Employee[lenghtOfArray];

		for (int i = 0; i < allValues.length; i++) {
			System.out.println("Enter the Employee Id:");
			int eID = scan.nextInt();
			System.out.println("Enter the Employee Name:");
			String eName = scan.next();
			System.out.println("Enter the Employee Salary:");
			double eSal = scan.nextDouble();
			System.out.println("Enter the Department dID:");
			int dID = scan.nextInt();
			System.out.println("Enter the Department dName:");
			String dName = scan.next();
			System.out.println("Enter the Department dLocation:");
			String dLocation = scan.next();

			Employee e1 = methodcallingprgm(eID, eName, eSal, dID, dName, dLocation);
			allValues[i] = e1;
			// System.out.println("Method Calling values insertion with Value of
			// i" + i + "\t" + eID + "\t" + eName + "\t"
			// + eSal + "\t" + dID + "\t" + dName + "\t" + dLocation+"\t");
		}
		uniqueValues = duplicateEliminationMethod(allValues);
		return uniqueValues;
	}

	Employee[] duplicateEliminationMethod(Employee[] allValues) {
		Employee[] finalSorted = new Employee[allValues.length];
		finalSorted = allValues.clone();
		for (int i1 = 0; i1 < allValues.length; i1++) {
			Employee e2 = allValues[i1];
			for (int j = i1 + 1; j < allValues.length; j++) {
				Employee e3 = allValues[j];
				if (e2.equals(e3)) {
					finalSorted[j] = null;
				}
			}
		}
		System.out.println("final sorted values" + finalSorted);
		return finalSorted;
	}

	public void displayResults(Employee[] allValues) {
		for (int i = 0; i <= allValues.length - 1; i++) {
			if (allValues[i] != null) {
				Employee s = allValues[i];
//				System.out.println("Tosting method"+s);
				System.out.println("i Value" + i + "\t" + s.getId() + "\t" + s.getName() + "\t" + s.getSalary() + "\t"
						+ s.getDept().getDeptId() + "\t" + s.getDept().getDeptName() + "\t"
						+ s.getDept().getLocation());
			}
		}
	}
}

class Department {
	int deptId;
	String deptName;
	String location;

	// setter/getter methods
	// override equals method
	// override equals method
	// override toString
	/**
	 * @return the deptId
	 */
	public int getDeptId() {
		return deptId;
	}

	/**
	 * @param deptId
	 *            the deptId to set
	 */
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	/**
	 * @return the deptName
	 */
	public String getDeptName() {
		return deptName;
	}

	/**
	 * @param deptName
	 *            the deptName to set
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + deptId;
		result = prime * result + ((deptName == null) ? 0 : deptName.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Department)) {
			return false;
		}
		Department other = (Department) obj;
		if (deptId != other.deptId) {
			return false;
		}
		if (deptName == null) {
			if (other.deptName != null) {
				return false;
			}
		} else if (!deptName.equals(other.deptName)) {
			return false;
		}
		if (location == null) {
			if (other.location != null) {
				return false;
			}
		} else if (!location.equals(other.location)) {
			return false;
		}
		return true;
	}
}

class Employee {
	private int id;
	private String name;
	private Department dept;
	private double salary;

	// setter/getter methods
	// override equals method
	// override toString
	// override hasCode
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee other = (Employee) obj;
		if (dept == null) {
			if (other.dept != null) {
				return false;
			}
		} else if (!dept.equals(other.dept)) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary)) {
			return false;
		}
		return true;
	}

}