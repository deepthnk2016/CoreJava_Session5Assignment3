package com.acadgild;

/**
 * 
 * Abstract Class - Employee
 *
 */
public abstract class Employee {
	int emplId;
	String empName;
	int totalLeaves;
	double totalSalary;

	abstract void calculate_balance_leaves(int no_of_leaves,char type_of_leave);

	abstract boolean avail_leave(int no_of_leaves, char type_of_leave);

	abstract void calculate_salary();

}
