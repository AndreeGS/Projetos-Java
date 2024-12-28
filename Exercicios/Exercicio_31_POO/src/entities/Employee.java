package entities;

public class Employee {

	private String Name;
	private Integer Hours;
	private Double ValuePerHour;
	
	public Employee() {}

	public Employee(String name, Integer hours, Double valuePerHour) {
		Name = name;
		Hours = hours;
		ValuePerHour = valuePerHour;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Integer getHours() {
		return Hours;
	}

	public void setHours(Integer hours) {
		Hours = hours;
	}

	public Double getValuePerHour() {
		return ValuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		ValuePerHour = valuePerHour;
	}	
	
	public double payment() {
		return Hours * ValuePerHour;
	}
}
