package package1;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
	String PassengerName;
	int BusNo;
	Date date;

Booking(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Passenger Name: ");
	PassengerName = sc.next();
	System.out.println("Enter Bus Number: ");
	BusNo = sc.nextInt();
	System.out.println("Enter Date in 'dd-mm-yyyy format'");
	String dateInput = sc.next();
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	try {
		date =dateFormat.parse(dateInput);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
	
	int capacity = 0;
	for(Bus bus:buses) {
		if(bus.getBusNo() == BusNo)
			capacity = bus.getCapacity();
	}
	int booked =0;
	for(Booking b:bookings) {
		if(b.BusNo == BusNo && b.date.equals(date)) {
			booked++;
		}
	}
	return booked<capacity?true:false;
}

}
