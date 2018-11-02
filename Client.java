package com.capgemini.ars.main;

import java.util.Scanner;

import com.capgemini.ars.bean.AirportBean;
import com.capgemini.ars.bean.BookingInformationBean;
import com.capgemini.ars.bean.FlightInformationBean;
import com.capgemini.ars.bean.UserBean;
import com.capgemini.ars.dao.AirlineDAOImplement;
import com.capgemini.ars.dao.IAirlineDao;
import com.capgemini.ars.service.IAdminService;
import com.capgemini.ars.service.IAirlineExecutiveService;
import com.capgemini.ars.service.ILoginService;
import com.capgemini.ars.service.IUserService;


public class Client {
	
	
	static Scanner sc = new Scanner(System.in);
	static IAdminService adminService = null;
	static ILoginService loginService = null;
	static IAirlineExecutiveService execService = null;
	static IUserService userService = null;
	//static Logger logger = Logger.getRootLogger();
	
	public static void main(String[] args) 
	{
		
		AirportBean airportBean = null;
		BookingInformationBean bookingInfoBean = null;
		FlightInformationBean flightInfoBean = null;
		UserBean userBean = null;
		
		while (true) 
		{

			// show menu
			System.out.println();
			System.out.println();
			System.out.println("   AIRLINE RESERVATION SYSTEM ");
			System.out.println("_______________________________\n");
			System.out.println("Select your User category");
			System.out.println("1.Customer ");
			System.out.println("2.Executive");
			System.out.println("3.Administrator");
			System.out.println("4.Exit");
			System.out.println("________________________________");
			System.out.println("Select an option:");
			// accept option
		
			int choice = sc.nextInt();
			
		
		
		
		
		}
		
		
		
		
		
	}

}
