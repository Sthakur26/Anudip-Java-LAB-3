// Abstract class Vaccine
abstract class Vaccine {
    // Variables
    protected int age;
    protected String nationality;

    // Constructor
    public Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    // Concrete method for the first dose
    public void firstDose() {
        if (nationality.equalsIgnoreCase("Indian") && age >= 18) {
            System.out.println("First dose administered successfully.");
            System.out.println("Payment of 250 Rs is required.");
        } else {
            System.out.println("Sorry, you are not eligible for the first dose.");
        }
    }

    // Concrete method for the second dose
    public void secondDose() {
        System.out.println("Second dose administered successfully.");
    }

    // Abstract method for the booster dose
    public abstract void boosterDose();
}

// Implementation class VaccinationSuccessful
class VaccinationSuccessful extends Vaccine {
    // Constructor
    public VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    // Override the boosterDose method
    @Override
    public void boosterDose() {
        System.out.println("Booster dose administered successfully.");
    }
}

public class Vaccination {
    public static void main(String[] args) {
        // Sample input
        String nationality = "Indian";
        int age = 18;

        // Create an object of VaccinationSuccessful
        VaccinationSuccessful user = new VaccinationSuccessful(age, nationality);

        // Scenario 1: First dose
        System.out.println("Scenario 1 - First Dose:");
        user.firstDose();

        // Scenario 2: Second dose
        System.out.println("\nScenario 2 - Second Dose:");
        user.secondDose();

        // Scenario 3: Booster dose
        System.out.println("\nScenario 3 - Booster Dose:");
        user.boosterDose();
    }
}
