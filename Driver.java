import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    
    public static void main(String[] args) {

        initializeDogList();
        initializeMonkeyList();
        
        Scanner input = new Scanner(System.in);
        char entry;
        
        do { // create do loop to access menu options
        	displayMenu();
        	entry = input.nextLine().charAt(0);
        	if(entry == '1') {
        		intakeNewDog(input); // execute dog intakes
        	
        	}
        	else if(entry == '2') {
        		intakeNewMonkey(input); // execute monkey intakes
        	}
        	
        	else if(entry == '3') {
        		reserveAnimal(input); // execute reserve animal
        	}
        	
        	else if(entry == '4') {
        		printAnimals("dog"); // print list of dogs
        	}
        	
        	else if(entry == '5') {
        		printAnimals("monkey"); // print list of monkeys
        	}
        	
        	else if(entry == '6') {
        		printAnimals("available"); // print all available animals
        	}	
        	
        	else if(entry == '7') {
        		printAnimals("reserved"); // print list of all reserved animals
        	}
        	
        	else if(entry == '8') {
        		printAnimals("all"); // print list of all animals
        	}
        }
        while (entry != 'q' && entry != 'Q'); // exit program
        System.out.println("Goodbye."); 
    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all available animals");
        System.out.println("[7] Print a list of all reserved animals");
        System.out.println("[8] Print a list of all animals");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }

    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States", "German Shepherd");
        Dog dog2 = new Dog("Rex", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States", "Great Dane");
        Dog dog3 = new Dog("Bella", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada", "Chihuahua");
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }

    // Adds monkeys to a list for testing
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("Hambone", "male", "3", "17", "06-12-2022", "Thailand", "intake", false, "United States", "Macaque", "1", "2", "3");
    	Monkey monkey2 = new Monkey("Fangs", "male", "2", "15", "06-15-2022", "Thailand", "Phase I", false, "Canada", "Macaque", "1", "2", "3");
    	Monkey monkey3 = new Monkey("Princess", "female", "3", "11", "05-12-2022", "Thailand", "in service", true, "Mexico", "Macaque", "1", "2", "3");
    	
    	monkeyList.add(monkey1);
    	monkeyList.add(monkey2);
    	monkeyList.add(monkey3);

    }

    // Intake Dog Method
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

        // Instantiate new dog, add to list
        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();
        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();
        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();
        System.out.println("What is the dog's acquisition date?");
        String acquisitionDate = scanner.nextLine();
        System.out.println("What is the dog's acquisition country?");
        String acquisitionCountry = scanner.nextLine();
        System.out.println("What is the dog's training status?");
        String trainingStatus = scanner.nextLine();
        System.out.println("Is the dog reserved?");
        boolean reserved = scanner.nextBoolean();
        scanner.nextLine(); // reset on account of boolean
        System.out.println("What is the dog's in service country?");
        String inServiceCountry = scanner.nextLine();
        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();
        
        Dog dog4 = new Dog(name, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry, breed);
        dogList.add(dog4);
        }
    
    // Instantiate new monkey, add to list
        public static void intakeNewMonkey(Scanner scanner) {
            System.out.println("What is the monkey's name?");
            String name = scanner.nextLine();
            for(Monkey monkey: monkeyList) {
                if(monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis monkey is already in our system\n\n");
                    return; //returns to menu
                }
            }
            
          	System.out.println("What is the monkey's species?");
            String species = scanner.nextLine().trim();
          
          	// Instance Variables
    		String[] monkeySpecies = {"capuchin ", "guenon ", "macaque ", "marmoset ", "squirrel monkey ", "tamarin "};	
          	
          	// set boolean
          	boolean validSpecies = false;
          	// iterating over each species stored in monkeySpecies
          	for(int i = 0; i < monkeySpecies.length; i++) {
              // check if the species is present in monkeySpecies
              if(species.equalsIgnoreCase(monkeySpecies[i].trim())) {
                // since valid, prompt for more input
                System.out.println("What is the monkeys's gender?");
                String gender = scanner.nextLine();
                System.out.println("What is the monkey's age?");
                String age = scanner.nextLine();
                System.out.println("What is the monkey's weight?");
                String weight = scanner.nextLine();
                System.out.println("What is the monkey's acquisition date?");
                String acquisitionDate = scanner.nextLine();
                System.out.println("What is the monkey's acquisition country?");
                String acquisitionCountry = scanner.nextLine();
                System.out.println("What is the monkey's training status?");
                String trainingStatus = scanner.nextLine();
                System.out.println("Is the monkey reserved?");
                boolean reserved = scanner.nextBoolean();
                scanner.nextLine();
                System.out.println("What is the monkey's in service country?");
                String inServiceCountry = scanner.nextLine();

                System.out.println("What is the monkey's tail length?");
                String tailLength = scanner.nextLine();
                System.out.println("What is the monkey's height?");
                String height = scanner.nextLine();
                System.out.println("What is the monkey's body length?");
                String bodyLength = scanner.nextLine();

                Monkey monkey4 = new Monkey(name, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry, species, tailLength, height, bodyLength);
                monkeyList.add(monkey4);
                // set boolean to show species found
                validSpecies= true;
                break;
              } 
            } 
          if(!validSpecies) {
            System.out.println("Species not in the list");
        }
        }

        // Completed reserve Animal
        public static void reserveAnimal(Scanner scanner) { 

        	System.out.println("What is the animal type?"); 
        	String type = scanner.nextLine(); 

        	if (type.equalsIgnoreCase("monkey")) {
    			System.out.println("What is the service country?"); 
    			String inServiceCountry = scanner.nextLine();
        		for(Monkey monkey: monkeyList) { 
                    if(inServiceCountry.equalsIgnoreCase(monkey.getInServiceCountry()) && (monkey.getReserved()==false)) {
                      	System.out.println("Reserved");
                    	monkey.setReserved(true);
                        return;
        			}
                }
            }

        	if(type.equalsIgnoreCase("dog")) {
    			System.out.println("What is the service country?"); 
    			String inServiceCountry = scanner.nextLine(); 
        		for(Dog dog: dogList) {
                   	if(inServiceCountry.equalsIgnoreCase(dog.getInServiceCountry()) && (dog.getReserved()==false)) {
                      	System.out.println("Reserved");//
                    	dog.setReserved(true);
                        return;
        			}
        		}
        	}
        	System.out.println("No animals available");
        }
        

        // Completed printAnimals
        public static void printAnimals(String listType) {
            Scanner scanner = new Scanner(System.in);
        	if(listType.equalsIgnoreCase("dog")) {
              for(Dog dog: dogList){
        		System.out.println(dog.getName() + ", " + dog.getTrainingStatus() + ", " + dog.getAcquisitionLocation() + ", " + dog.getReserved());
              }
        	}
        	else if(listType.equalsIgnoreCase("monkey")) {
              for(Monkey monkey: monkeyList) {
        		System.out.println(monkey.getName() + ", " +  monkey.getTrainingStatus() + ", " + monkey.getAcquisitionLocation() + ", " + monkey.getReserved());
        	}
        	}
        	else if(listType.equalsIgnoreCase("available")) {
        		for(Dog dog: dogList) {
        			if(!dog.getReserved()) {
        				System.out.println(dog.getName() + ", " + dog.getTrainingStatus() + ", " + dog.getAcquisitionLocation() + ", " + dog.getReserved());
        			}
        		}
        		for(Monkey monkey: monkeyList) {
        			if(!monkey.getReserved()) {
        				System.out.println(monkey.getName() + ", " + monkey.getTrainingStatus() + ", " + monkey.getAcquisitionLocation() + ", " + monkey.getReserved());
        			}
        		}
        	}
        	else if(listType.equalsIgnoreCase("reserved")) {
        		for(Dog dog: dogList) {
        			if(dog.getReserved()) {
        				System.out.println(dog.getName() + ", " + dog.getTrainingStatus() + ", " + dog.getAcquisitionLocation() + ", " + dog.getReserved());
        			}
        		}
        		for(Monkey monkey: monkeyList) {
        			if(monkey.getReserved()) {
        				System.out.println(monkey.getName() + ", " + monkey.getTrainingStatus() + ", " + monkey.getAcquisitionLocation() + ", " + monkey.getReserved());
        			}
        		}
        	}
        	
        	else if(listType.equalsIgnoreCase("all")) {
        		for(Dog dog: dogList) {
        			System.out.println(dog.getName() + ", " + dog.getTrainingStatus() + ", " + dog.getAcquisitionLocation() + ", " + dog.getReserved()); 
        		}
        		for(Monkey monkey: monkeyList) {
        			System.out.println(monkey.getName() + ", " + monkey.getTrainingStatus() + ", " + monkey.getAcquisitionLocation() + ", " + monkey.getReserved());
        		}
        	}
        	System.out.println();
			System.out.println("Press Enter key to continue...");
    		scanner.nextLine();
        }
}