/**
 * Implementation of a Car object for a game or simulation.
 * Includes acceleration and deceleration.
 * @author Brian Hogan
 * @author yourname
 */
public class Car {

	private String color;
	private int speed;
	private int maxSpeed;
	private int minSpeed;
	
	/**
	 * Creates a new car instance
	 * @param color
	 * @param maxSpeed
	 * @param minSpeed 
	 */
	public Car(String color, int maxSpeed, int minSpeed){
		// using this. prefix to avoid shadowing local params.
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.minSpeed = minSpeed;
		this.speed = 0;
	}
	
	/**
	 * Return the current speed of the car.
	 * @return the current speed of the car.
	 */
	public int getSpeed(){
		return(speed);
	};
	
	/**
	 * Accelerates the car up to the maximum amount
	 * set in the object constructor.
	 * @param amount	The amount the car will accelerate
	 */
	public void accelerate(int amount){
		int limit = maxSpeed - speed;
		if(amount >= limit){
			speed = limit;
		}else{
			speed+= amount;
		}
	}
	
	
	/**
	 * Deaccelerates the car to the minimum amount
	 * @param amount The amount the car will deaccelerate
	 * 
	 */
	public void deaccelerate(int amount){
		int limit = maxSpeed - minSpeed;
		if(amount <= limit){
			speed = limit;
		}else{
			speed -= amount;
		}
	}
	
	
	/**
	 * Displays the object as a string in the format
	 * "Color: red, Speed: 100"
	 * @return string representation of object. 
	 */
	public String toString(){
		return("Color: " + this.color + "," + " Speed: " + this.speed);
	}
}