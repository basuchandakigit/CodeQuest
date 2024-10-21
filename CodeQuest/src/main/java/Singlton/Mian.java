package Singlton;

public class Mian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Car car = Car.getCarInstance();

	        // Set the properties of the Car instance
	        car.setMake("Hyundai");
	        car.setModel("i20");
	        car.setYear(2022);
	        car.setColor("Blue");
	        car.setMileage(30);

	        // Print the Car instance details
	        System.out.println(car);

	        // Verify that it's a singleton by trying to get the instance again
	        Car anotherCar = Car.getCarInstance();
	        anotherCar.setMake("Tata ");
	        anotherCar.setModel("Altroz");
	        anotherCar.setYear(2020);
	        anotherCar.setColor("geay");
	        anotherCar.setMileage(25);
	        // Print the anotherCar instance details (should be the same as 'car')
	        System.out.println(anotherCar);

	        // Check if both references point to the same object
	  
	
	
	}

}
