package OneToMany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OneToManyAppln {
	public static void main(String args[]) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("nexturn26_PU");
		EntityManager manager = emf.createEntityManager();
		EntityTransaction trans = manager.getTransaction();
//		 // Citizen 2
//        Citizen citizenTwo = new Citizen();
//
//        citizenTwo.setCitizenName("James Gosling");
//        citizenTwo.setAddress("Bangalore");
//        Vehicle vehicleFour = new Vehicle();
//        vehicleFour.setRegno("KA01AB1234");
//        vehicleFour.setType("LMV");
//        vehicleFour.setBrand("BMW");
//        vehicleFour.setCitizen(citizenTwo);
//
//        Vehicle vehicleFive = new Vehicle();
//        vehicleFive.setRegno("KA05CD5678");
//        vehicleFive.setType("MCWG");
//        vehicleFive.setBrand("ROYAL ENFIELD");
//        vehicleFive.setCitizen(citizenTwo);
//        List<Vehicle> vehicleListTwo = new ArrayList<Vehicle>();
//        vehicleListTwo.add(vehicleFour);
//        vehicleListTwo.add(vehicleFive);
//        citizenTwo.setVehicles(vehicleListTwo);
//        trans.begin();
//        manager.persist(citizenTwo);
//        trans.commit();
//        manager.close();

		// add a new vehicle to existing user

        Citizen citizen = manager.find(Citizen.class, 1);
            Vehicle vehicle = new Vehicle();
            vehicle.setRegno("TS1512345");
            vehicle.setType("LMV");
            vehicle.setBrand("TATA NEXON");
            vehicle.setCitizen(citizen);
            citizen.getVehicles().add(vehicle);
            trans.begin();
            manager.persist(citizen);
            trans.commit();
            manager.close();

		/// remove a vehicle from existing user
//		   Vehicle vehicle = manager.find(Vehicle.class, "AP29BN0310");
//		   trans.begin();
//           manager.remove(vehicle);
//           trans.commit();
//           manager.close();

		/*
		 * List<Citizen> citizens = manager.createQuery("SELECT c FROM Citizen c",
		 * Citizen.class).getResultList(); for (Citizen citizen : citizens) {
		 * System.out.print(citizen.getCitizenId()+" "+ citizen.getCitizenName() + "  "
		 * + citizen.getAddress()+" "); List<Vehicle> vehicles = citizen.getVehicles();
		 * if (vehicles == null || vehicles.isEmpty()) { System.out.print("No Vehicle");
		 * } else { for (Vehicle vehicle : vehicles) {
		 * System.out.print(vehicle.getRegno() + " " + vehicle.getType() + "  " +
		 * vehicle.getBrand()); } System.out.println(); } }
		 */		manager.close();

//      
	}
}
