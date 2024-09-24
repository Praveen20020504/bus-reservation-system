package projects;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner; //nested package/ hierarchical package
import java.util.ArrayList;

public class DemoBus {

	public static void main(String[] args) {
		
	
		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		
		buses.add(new Bus(1,true,5));
		buses.add(new Bus(2,true,5));
		buses.add(new Bus(3,true,10));
		
		int userOpt = 1;
		Scanner s1 = new Scanner(System.in);
		
		for(Bus b:buses) {
			b.displayBusInfo();
		}
		
		while(userOpt==1) {
			System.out.println("Enter 1 to Book and 2 to exit");
			userOpt = s1.nextInt();
			if(userOpt == 1) {
				Booking booking = new Booking();
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("Your booking is confirmed");
				}
				else
					System.out.println("Sorry. Bus is full. Try another bus or date.");
			}
		}
	}

}