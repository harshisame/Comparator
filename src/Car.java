public class Car {
	private int year;
	private int price;
	private int mileage;
	
	Car(int year, int price, int mileage){
		this.setYear(year);
		this.setPrice(price);
		this.setMileage(mileage);
		
	}
	
	public int[] getCarDetails()
    {
        int ar[] = new int[3];
        ar[0]= year;
        ar[1] =  price;
        ar[2] = mileage;
        return ar; //returning two values at once
    }
	
	
	private void setYear(int year) {
		this.year = year;
		
	}
	
	int getYear() {
		return year;
		
	}
	
	private void setPrice(int price) {
		this.price = price;
		
	}
	
	int getPrice() {
		return price;
		
	}
	
	private void setMileage(int mileage) {
		this.mileage = mileage;
		
	}
	
	int getMileage() {
		return mileage;
		
	}

}
