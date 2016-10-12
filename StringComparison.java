/**
 *
 * author	: Se Hyun Sophie Park
 * matric no: A0144805H
 * 
 */

import java.util.*;

public class StringComparison {
	
	public static void main(String[] args) {

		// declare the necessary variables
		String _first;
		String _second;
		int sumFirst = 0, sumSecond = 0;

		// declare a Scanner object to read input
		Scanner sc = new Scanner(System.in);

		// read input and process them accordingly
		_first = sc.next();
		_second = sc.next();

		if (_first.toLowerCase().compareTo(_second.toLowerCase())<0)
			System.out.println("1");
		else if (_first.toLowerCase().compareTo(_second.toLowerCase())>0)
			System.out.println("2");
		else
			System.out.println("0");
	}
}

