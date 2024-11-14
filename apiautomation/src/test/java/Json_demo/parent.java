package Json_demo;

import java.util.List;

public class parent {

	private int id;
	private String type;
	private String name;
	private Double ppu;
	private batters batters;
	private List<topping> toppings;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPpu() {
		return ppu;
	}
	public void setPpu(double d) {
		this.ppu = d;
	}
	
	public List<topping> getToppings() {
		return toppings;
	}
	public void setToppings(List<topping> toppings) {
		this.toppings = toppings;
	}
	public batters getbatters() {
		return batters;
	}
	public void setbatters(batters batters) {
		this.batters = batters;
	}
	
}
