# **Animal Intake Program**

**Overview**
The Animal Intake Program is a Java-based application designed to assist organizations in tracking animals through intake, training, job assignment, and service readiness. The system was developed using object-oriented principles and guided by UML diagrams to align with client requirements and ensure maintainable, extensible code.

**Features**
- Record intake details of rescue animals
- Track training status and job assignment
- Update animal availability and reservation status
- Modular code structure for future enhancements

**At the core of the application is the RescueAnimal class, which includes:**
- Private instance variables for attributes such as name, type, gender, age, weight, acquisition details, training status, reservation, and service location.
- Public accessor and mutator methods for each variable.
- A no argument constructor as a starting point for object initialization.

# **Example Code from the RescueAnimal class::**
<pre> 
import java.lang.String;

public class RescueAnimal {

    // Instance Variables
    private String name;
    private String animalType; 
    private String gender;
    private String age; 	 		
    private String weight; 		 
    private String acquisitionDate; 
    private String acquisitionCountry;
	  private String trainingStatus;
    private boolean reserved;
	  private String inServiceCountry;

    // Constructor
    public RescueAnimal() {
    }

    // Accessor Methods & Mutator Methods
  	public String getName() {
		  return name;
	  }

	  public void setName(String name) {
		  this.name = name;
	  }
</pre>

# **Design Approach**
Before development, UML class diagrams were created to map out the structure and relationships of the system. This helped ensure that the final implementation would reflect client expectations and allow for clean code organization.

The initial codebase was partially completed and then refactored and expanded to support full program functionality.
![Class](https://github.com/user-attachments/assets/4e9e8bf7-0d0b-4b70-9e8d-9494e50dc65c)

# **Reflection**
This project strengthened my understanding of object-oriented design and reinforced the value of planning with UML diagrams. It also showed the importance of clean, modular code that can evolve over time to meet new needs.
