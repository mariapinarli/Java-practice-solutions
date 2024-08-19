package day26_custom_class_part2_tasks.restaurant_task;

public class Chef {


    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;


    // constructor
    public Chef(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }


    // method that display action
    public void makeOrder(){
        System.out.println( name + " is making an order");
    }

    public void washDishes(){
        System.out.println(name + " is washing the dishes");
    }

    @Override
    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + fullTime +
                '}';
    }

    //toString(): returns a string representation of a Chef, including full-time or part-time status

}

/*
Create a custom class named Chef with the following specifications:

	Attributes:
			name (String)
			employeeID (int)
			hourlyRate (double)
			fullTime (boolean)

	Add A constructor that can set all the fields.

	Actions:
		makeOrder(): prints chef's name + " is making an order"
		washDishes(): prints chef's name + " is washing the dishes"
		toString(): returns a string representation of a Chef, including full-time or part-time status

 */