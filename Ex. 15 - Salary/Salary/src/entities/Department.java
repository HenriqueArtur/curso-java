package entities;

/**
 * Department
 */
public class Department {

    private String name;

    public Department() {}

    public Department(String name) {this.name =  name;}

    /**
     * @return the name
     */
    public String getName() {return name;}

    /**
     * @param name the name to set
     */
    public void setName(String name) {this.name = name;}
}