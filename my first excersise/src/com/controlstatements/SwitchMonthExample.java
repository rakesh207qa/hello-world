package com.controlstatements;

public class SwitchMonthExample {

	public static void main(String[] args) {
		int month = 7;
		
		String monthstring = "";
		
		switch(month) {
		case 1:{
			monthstring = "1 - january";
		}
		break;
		case 2:monthstring = "2 - february";
		break;
		case 3:monthstring = "3 - march";
		break;
		case 4:monthstring = "4 - april";
		break;
		case 5:monthstring = "5 - may";
		break;
		case 6:monthstring = "6 - june";
		break;
		case 7:monthstring = "7 - july";
		break;
		case 8:monthstring = "8 - august";
		break;
		case 9:monthstring = "9 - september";
		break;
		case 10:monthstring = "10 - october";
		break;
		case 11:monthstring = "11 - november";
		break;
		case 12:monthstring = "12 - december";
		break;
		default:
			System.out.println("its default");
			
		}
System.out.println(monthstring);
	}

}
