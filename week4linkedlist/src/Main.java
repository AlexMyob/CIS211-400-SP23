public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Model 3");
        Car car2 = new Car("Civic");
        new Car("Model Y"); //new object with no ref variable will store null by default

        //car1 and car2 are reference variables which point to objects in memory

        car1 = car2; //Pointer for car1 now points to car2

        car2.setModel("Ioniq 5");

        //This will output Ioniq 5 twice since car1 points to car2
        System.out.println("Car1:" + car1);
        System.out.println("Car2:" + car2);
    }
}

