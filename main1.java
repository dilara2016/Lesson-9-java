interface Vehicle{ 
void changeGear(int a);
void speedUp(int a);
void applyBrakes(int a);
}

class bicycle implements Vehicle{
    int speed;
    int gear;
    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }
    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }
    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    public void printStates(){
        System.out.println("speed: " + speed + "gear: " + gear);
    }

}

class Car implements Vehicle{
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }
    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }
    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    public void printStates(){
        System.out.println("Speed: " + speed + " Gear: " + gear);
    }
}

class main1{
    public static void main(String[] args) {
        bicycle bicycle = new bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);
        System.out.println("Bicycle present state: ");
        bicycle.printStates();

        Car car = new Car();
        car.changeGear(1);
        car.speedUp(4);
        car.applyBrakes(3);
        System.out.println("Car present state: ");
        car.printStates();

    }   
}