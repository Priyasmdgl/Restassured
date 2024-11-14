package BDD;
//method chaining example
public class tour {
String place;
String modeoftravel;

	public String getPlace() {
	return place;
}

public tour setPlace(String place) {
	this.place = place;
	return this;
}

public String getModeoftravel() {
	return modeoftravel;
}

public tour setModeoftravel(String modeoftravel) {
	this.modeoftravel = modeoftravel;
	return this;
}

public void person() {
	System.out.println(getPlace());
	System.out.println("Enjoy going to" + getPlace() + "by" + getModeoftravel());
}
	public static void main(String[] args) {
		
		tour Tour = new tour();
		Tour.setPlace("Bangalore");
		Tour.setModeoftravel("Train");
		Tour.person();
		//method chaining by changing void to the class and return the object in set method
		Tour.setPlace("Kerala").setModeoftravel("Car").person();
	}
}
