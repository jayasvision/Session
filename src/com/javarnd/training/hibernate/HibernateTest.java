package com.javarnd.training.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.javarnd.training.hibernate.dto.FourWheeler;
import com.javarnd.training.hibernate.dto.TwoWheeler;
import com.javarnd.training.hibernate.dto.UserDetails;
import com.javarnd.training.hibernate.dto.Vehicle;

public class HibernateTest {
	
	static {
		System.out.println("\t UserDetails static block");
	}
	
	public HibernateTest() {
		System.out.println("\t UserDetails default constructor");
	}
	
	public static void main(String... strings) {
		System.out.println("\t main method");
		
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Car");
		
		TwoWheeler twoWheeler = new TwoWheeler();
		twoWheeler.setSteeringHandle("Bike");
		
		FourWheeler fourWheeler = new FourWheeler();
		fourWheeler.setSteeringWheel("Porsche");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(vehicle);
		session.save(twoWheeler);
		session.save(fourWheeler);
		session.getTransaction().commit();
		session.close();
		
		System.out.println("\t main end");
	}
	
}
