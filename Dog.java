public class Dog extends RescueAnimal {

    // Instance variable
    private String breed;

    // Constructor
    public Dog(String name, String gender, String age,
    String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry, String breed) {
        setName(name);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        setBreed(breed);

    }

    // Accessor Method
    public String getBreed() {
        return breed;
    }

    // Mutator Method
    public void setBreed(String dogBreed) {
        breed = dogBreed;
    }

}