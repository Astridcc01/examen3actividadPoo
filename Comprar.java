package com.segundo;

import com.primero.Coche;

public class Comprar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche coche1=new Coche(1,"Ford",5000f);
		Coche coche2=new Coche(2,"Audi",6000f);
		Coche coche3=new Coche(3,"Honda",7000f);
		Coche coche4=new Coche(4,"BMW",8000f);
		
		float precioCoche3=coche3.getPrecio();
		System.out.println("el precio del coche 3 es "+precioCoche3);
	}

}
