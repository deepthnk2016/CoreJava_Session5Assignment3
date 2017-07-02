package com.acadgild;

/**
 * TemporaryEmp Class - implementing Abstract class Employee and overriding its methods.
 *
 */

public class TemporaryEmp extends Employee {

	TemporaryEmp(int emplid, String name, int totLeaves, Double salary) {
		this.emplId = emplid;
		this.empName = name;
		this.totalLeaves = totLeaves;
		this.totalSalary = salary;
	}

	void calculate_balance_leaves(int no_of_leaves, char type_of_leave) {
		this.totalLeaves = this.totalLeaves - no_of_leaves;
	}

	boolean avail_leave(int no_of_leaves, char type_of_leave) {
		boolean availLeave = false;

		if (no_of_leaves < this.totalLeaves) {
			availLeave = true;
		}
		return availLeave;
	}

	void print_leave_details() {
		System.out.println("=============================================");
		System.out.println("Emplid #" + this.emplId + " - Leave Details");
		System.out.println("=============================================");
		System.out.println("Total Leaves = " + this.totalLeaves);
	};

	void calculate_salary() {
		System.out.println("=============================================");
		System.out.println("Emplid #" + this.emplId + " - Salary Details");
		System.out.println("=============================================");
		System.out.println("Total Salary = " + this.totalSalary);
	}

}
