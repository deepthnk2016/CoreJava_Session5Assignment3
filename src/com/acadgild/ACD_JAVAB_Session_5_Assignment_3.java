package com.acadgild;

import java.util.Scanner;
/**
 * 
 * Main class implementing the PermanentEmp & TemporaryEmp
 *
 */
public class ACD_JAVAB_Session_5_Assignment_3 {

	public static void main(String[] args) {
		char leaveType;
		int no_of_leaves;
		Scanner s1 = new Scanner(System.in);
		PermanentEmp permEmp = new PermanentEmp(1, "Deepak", 5000.00);
		System.out.println("*************** PERMANENT EMPLOYEE DETAILS *****************");
		System.out.println();
		permEmp.calculate_salary();
		permEmp.print_salary_details();

		System.out.println();
		System.out.println("Intial Leaves");
		permEmp.print_leave_details();

		System.out.println("Enter Leave Type");
		System.out.println("\tC - Casual Leave");
		System.out.println("\tS - Sick Leave");
		System.out.println("\tP - Paid Leave");
		leaveType = s1.nextLine().charAt(0);

		System.out.println("Enter no. of leaves");
		no_of_leaves = s1.nextInt();

		if (permEmp.avail_leave(no_of_leaves, leaveType)) {
			System.out.println("Successfully availed leave");
			System.out.println();
			permEmp.calculate_balance_leaves(no_of_leaves, leaveType);
		} else {
			System.out.println("Insufficient Leave Balance, cannot avail leaves");
			System.out.println();
		}
		System.out.println("Leave Balance After applying for leaves");
		permEmp.print_leave_details();

		System.out.println("*************** TEMPORARY EMPLOYEE DETAILS *****************");
		System.out.println();
		TemporaryEmp tempEmp = new TemporaryEmp(2, "Dinesh", 10, 10000.00);

		tempEmp.calculate_salary();
		// tempEmp.print_salary_details();

		System.out.println();
		System.out.println("Intial Leaves");
		tempEmp.print_leave_details();

		System.out.println("Enter no. of leaves");
		no_of_leaves = s1.nextInt();

		if (tempEmp.avail_leave(no_of_leaves, 'P')) {
			System.out.println("Successfully availed leave");
			System.out.println();
			tempEmp.calculate_balance_leaves(no_of_leaves, leaveType);
		} else {
			System.out.println("Insufficient Leave Balance, cannot avail leaves");
			System.out.println();
		}
		System.out.println("Leave Balance After applying for leaves");
		tempEmp.print_leave_details();

		s1.close();
	}

}
