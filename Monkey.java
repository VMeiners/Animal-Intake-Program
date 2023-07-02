public class Monkey extends RescueAnimal {
	// Instance Variables
	private String species;
	private String tailLength; 
	private String height;
	private String bodyLength;
	
	// Constructor
    public Monkey(String name, String gender, String age,
    String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry,
	String species, String tailLength, String height, String bodyLength) {
        setName(name);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        setSpecies(species); // FIXME add acceptable species
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
    }
	
	// Mutator Methods
    public void setSpecies(String species) {
        this.species = species;
    }
    
	public void setTailLength(String tailLength) {
		this.tailLength = tailLength;
	}
	
	public void setHeight(String height) {
		this.height = height;
	}
	
	public void setBodyLength(String bodyLength) {
		this.bodyLength = bodyLength; 
	}
    
	// Accessor Methods
    public String getSpecies() {
        return species;
    }

	public String getTailLength() {
		return tailLength;
	}
	
	public String getHeight() {
		return height;
	}
	
	public String getBodyLength() {
		return bodyLength;
	}

}