
// import java.io.ObjectInputStream.GetField;

public class Car {
    int maxSpeed = 100;
    int minSpeed = 0;

    double weight = 4079;

    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";

    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;

    int numberOfPeopleInCar = 1;
    

    //constructor
    public Car( int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
        
    }

    // getters and setters

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int newMaxSpeed) {
        this.maxSpeed = newMaxSpeed;
    }

    public int getMinSpeed() {
        return this.minSpeed;
    }

    public double getWeight() {
        return this.weight;
    }

    public boolean getIsTheCarOn() {
        return isTheCarOn;
    }

    public void printVariables() {
        System.out.println(maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(numberOfPeopleInCar);
    }

    public void wreckCar() {
        condition = 'C';
    }

    public void upgradeMinSpeed() {
        setMaxSpeed(getMaxSpeed() + 10);
    }

    public void getIn() {
        numberOfPeopleInCar++;
    }

    public void getOut() {
        numberOfPeopleInCar--;
    }

    public double howManyMilesTillOutOfGas() {
        return currentFuel*mpg;
    }

    public double maxMileForFillUp() {
        return maxFuel*mpg;
    }

    
    public static void main(String[] args) {
        Car birthdayPresent = new Car(500, 5000, true);
        System.out.println("birthday Present v1: ");
        birthdayPresent.printVariables();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        System.out.println("Miles left: " + birthdayPresent.howManyMilesTillOutOfGas());
        System.out.println("Max miles: " + birthdayPresent.maxMileForFillUp());
        System.out.println("birthday Present v2: ");
        birthdayPresent.printVariables();
        System.out.println("birthday Present v3: ");
        birthdayPresent.getOut();
        birthdayPresent.printVariables();




        // System.out.println("Christmas Present: ");
        // Car christmasPresent = new Car(550, 2000, false);
        // christmasPresent.printVariables();


        // Car familyCar = new Car();
        // System.out.println("Family's Car:")
        // familyCar.printVariables();
        // familyCar.upgradeMinSpeed();
        // familyCar.printVariables();




        // Car aliceCar = familyCar;
        // familyCar.wreckCar();
        // System.out.println("Alice's Car: ");
        // aliceCar.printVariables();

    }
}
