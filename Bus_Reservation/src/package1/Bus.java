package package1;
import java.util.*;
public class Bus {
	private int BusNo;
	private boolean Ac;
	private int Capacity;

Bus(int BusNo, boolean Ac, int Capacity){
	this.BusNo = BusNo;
	this.Ac = Ac;
	this.Capacity = Capacity;
}

public int getCapacity() {
	return Capacity;
}

public int getBusNo() {
	return BusNo;
}

public boolean isAc() {
	return Ac;
}


public void setAc(boolean val) {
	Ac= val;
}

public void setCapacity(int cap){
	Capacity = cap;
}

public void displayBus() {
	System.out.println("Bus Number: "+ BusNo + "  AC: " + Ac + "  Total Capacity "+ Capacity);
	
}


}





