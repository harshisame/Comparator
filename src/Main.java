import java.util.ArrayList;
import java.util.Collections;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final ArrayList<Car> car = new ArrayList<Car>();
		car.add(new Car(2007, 5000, 600));
		car.add(new Car(2010, 10000, 5000));
		car.add(new Car(2000, 1000, 300));
		car.add(new Car(2015, 30000, 8000));
		car.add(new Car(2016, 100000, 10000));
			
		Collections.sort(car, (Car c1, Car c2) -> {return (int)(c2.getYear() - c1.getYear());});
		System.out.println("Sorted by Year: ");
		for(Car c1: car)
		{
			System.out.println(c1.getYear());
			
		}
		
		System.out.println("\n***********************\n");
		Collections.sort(car, (Car car1, Car car2) -> {return (int)(car2.getPrice() - car1.getPrice());});
		System.out.println("Sorted by Price: ");
		for(Car c1: car)
		{
			System.out.println(c1.getPrice());
		}
		
		System.out.println("\n***********************\n");
		Collections.sort(car, (Car car1, Car car2)-> {return (int)(car2.getMileage() - car1.getMileage());});
		System.out.println("Sorted by Mileage: ");
		for(Car c1: car)
		{
			System.out.println(c1.getMileage());
		}
		
		

	}

}
