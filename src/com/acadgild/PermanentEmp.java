/**
 * 
 */
package com.acadgild;

/**
 * PermanentEmp Class - implementing Abstract class Employee and overriding its methods.
 *
 */
public class PermanentEmp extends Employee {
	int paid_leave, sick_leave, casual_leave;
	char leaveType;
	double basic, hra, pf;

	PermanentEmp(int emplid, String name, Double basic) {
		this.emplId = emplid;
		this.empName = name;
		this.basic = basic;

		this.paid_leave = 24;
		this.sick_leave = 12;
		this.casual_leave = 12;
		
		this.pf = (12 * this.basic) / 100;
		this.hra = (50 * this.basic) / 100;
		this.totalSalary = this.basic + this.hra - this.pf;
	}

	void print_leave_details() {
		System.out.println("=============================================");
		System.out.println("Emplid #" + this.emplId + " - Leave Details");
		System.out.println("=============================================");
		System.out.println("Paid Leaves = " + this.paid_leave);
		System.out.println("Sick Leaves = " + this.sick_leave);
		System.out.println("Casual Leaves = " + this.casual_leave);
	};

	void calculate_balance_leaves(int no_of_leaves, char type_of_leave) {
		if (type_of_leave == 'C') {
			this.casual_leave = this.casual_leave - no_of_leaves;
		}

		if (type_of_leave == 'P') {
			this.paid_leave = this.paid_leave - no_of_leaves;
		}

		if (type_of_leave == 'S') {
			this.sick_leave = this.sick_leave - no_of_leaves;
		}

	};

	boolean avail_leave(int no_of_leaves, char type_of_leave) {
		boolean availLeave = false;
		if (type_of_leave == 'C') {
			if (this.casual_leave - no_of_leaves > 0) {
				availLeave = true;
			}
		}

		if (type_of_leave == 'S') {
			if (this.sick_leave - no_of_leaves > 0) {
				availLeave = true;
			}
		}
		if (type_of_leave == 'P') {
			if (this.paid_leave - no_of_leaves > 0) {
				availLeave = true;
			}
		}

		return availLeave;

	}

	void calculate_salary() {
		this.pf = (12 * this.basic) / 100;
		this.hra = (50 * this.basic) / 100;
		this.totalSalary = this.basic + this.hra - this.pf;
	};

	void print_salary_details() {
		System.out.println("=============================================");
		System.out.println("Emplid #" + this.emplId + " - Salary Details");
		System.out.println("=============================================");
		System.out.println("Basic = " + this.basic);
		System.out.println("PF = " + this.pf);
		System.out.println("HRA = " + this.hra);
		System.out.println("Total Salary = " + this.totalSalary);
	}

}
