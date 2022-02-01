public class Car {
    int speed;
    int odometer;
    int time;
    int fuel;
	String color;
	int passengers;

    public Car(String color, int speed, int fuel) {
        this.color = color;
		if(speed<0)
            this.speed = 0;
        else
            this.speed = speed;
        odometer = 0;
        time = 0;
        this.fuel = fuel;
    }
    public void sayState() {
        if(speed > 0)
            System.out.println("Еду");
        else
            System.out.println("Стою");
    }
    public int getSpeed() {
        return speed;
    }
    public void gaz() {
        speed += 5;
    }
    public void tormoz() {
        speed -= 5;
        if(speed < 0)
            speed = 0;
    }
    public void step() {
        odometer += speed;
        time++;
    }
    public double average() {
        return (double)odometer/time;
    }
    public int km() {
        return odometer;
    }
    public void sayKm() {
        System.out.println(odometer);
    }
    public void sayAv() {
        System.out.println(average());
    }
}