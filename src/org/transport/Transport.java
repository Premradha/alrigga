package org.transport;

import org.road.Road;
import org.air.Air;
import org.water.Water;

public class Transport {

	private void TransportForm() {
		
		System.out.println("bike,cycle,bus,car,areoplane,elicopter,boat,ship");

	}
	
	public static void main(String[] args) {
		
		Transport T = new Transport();
		T.TransportForm();
		
		Road R = new Road(); 
		R.bike();
		R.cycle();
		R.bus();
		R.car();
		System.out.println("hai");
		 
		Air A = new Air();
		A.aeroplane();
		A.helicopter();
		
		Water W = new Water();
		W.boat();
		W.ship();
	}
	
	
}
