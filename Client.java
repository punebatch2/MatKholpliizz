package com.capgemini.ars.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import com.capgemini.ars.bean.AirportBean;
import com.capgemini.ars.bean.BookingInformationBean;
import com.capgemini.ars.bean.FlightInformationBean;
import com.capgemini.ars.bean.UserBean;
import com.capgemini.ars.dao.AirlineDAOImplement;
import com.capgemini.ars.dao.IAirlineDao;
import com.capgemini.ars.exception.AirlineException;
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
	
	public static void main(String[] args) throws AirlineException 
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
			
			switch (choice) {
			case 1:
				
				System.out.println("Hello there, customer!");
				System.out.println("You can choose what to do");
				System.out.println();
				System.out.println();
				System.out.println("1. Fetch Available Flights ");
				System.out.println("2. Book Flight");
				System.out.println("3. Retrieve Booking  Details");
				System.out.println("4. Retrieve FLight Details");
				System.out.println("5. Reschedule Booking");
				System.out.println("6. Cancel Booking");
				System.out.println("________________________________");
				System.out.println("Select an option:");
				
				int choice2 = sc.nextInt();
				
				switch (choice2) {
				case 1: 
					System.out.println();
					System.out.println();
					
					System.out.println("Enter source city");
					String srcCity = sc.nextLine();
					flightInfoBean.setDeptCity(srcCity);
					
					System.out.println("Enter destination city");
					String arrCity = sc.nextLine();
					flightInfoBean.setArrCity(arrCity);
					
					
					System.out.println("Enter departure date");
//					Date deptDate = sc.nextDate();
					//flightInfoBean.setDeptDate(deptDate);
		
					System.out.println("Enter Class type");
					System.out.println("Enter first for First Class Seats or business for Business Class Seats");
					String classType = sc.next();
										
					System.out.println("Enter the number of passengers");
					int noOfPassengers = sc.nextInt();
					
					ArrayList<FlightInformationBean> flights = userService.fetchAvailableFlights(flightInfoBean, classType, noOfPassengers);
					
					System.out.println("Your Details are:");
					
					Iterator<FlightInformationBean> i = flights.iterator();
					while(i.hasNext())
					{
						FlightInformationBean f = i.next();
						System.out.println("Flight number = " + f.getFlightNo());
						System.out.println("Airline = " + f.getAirline());
						System.out.println("Source City = " + f.getDeptCity());
						System.out.println("Destination City = " + f.getArrCity());
						System.out.println("Departure Date = " + f.get);
						System.out.println("Arrival Date  = " + f.getFlightNo());
						System.out.println("Departure Time = " + f.getFlightNo());
						System.out.println("Arrival Time = " + f.getFlightNo());
						System.out.println("Number of First Class Seats Available = " + f.getFlightNo());
						System.out.println("First Class Fare = " + f.getFlightNo());
						System.out.println("Number of Business Class Seats Available = " + f.getFlightNo());
						System.out.println("Business Class Fare = " + f.getFlightNo());
						
						


					}
					
					
					while(true)
					{
						System.out.println("FlightNo is: "  );
					}
					
//					break;
					
					
					

				default:
					break;
				}
				
				
				
				
				
				
				
				
				
				
				break;

			default:
				break;
			}
		
		
		
		
		}
		
		
		
		
		
	}

}