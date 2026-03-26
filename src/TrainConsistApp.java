public class ExceptionHandlingApp {

    public static void main(String[] args) {

        try {
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println("Bogie created: " + b1.getType() + " Capacity: " + b1.getCapacity());

            PassengerBogie b2 = new PassengerBogie("AC Chair", -10); // Invalid
            System.out.println("Bogie created: " + b2.getType());

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues safely...");
    }
}