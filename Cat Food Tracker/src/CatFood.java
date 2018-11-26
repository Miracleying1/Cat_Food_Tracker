public class CatFood {
	String catFoodID;
	String brand;
	String flavor;
	String type;
	double calories;//per oz
	
	
	public CatFood(String catFoodID,String brand, String type, double calories) {
		this.catFoodID=catFoodID;
		this.brand=brand;
		this.type=type;
		this.calories=calories;
	}
	public String getCatFoodID() {
		return catFoodID;
	}
	public void setCatFoodID(String catFoodID) {
		this.catFoodID=catFoodID;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getFlavor() {
		return flavor;
	}
	
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type=type;
	}
	public double getCalories() {
		return calories;
	}
	public void setCalories(double calories) {
		this.calories=calories;
	}
	public String toString() {
		return  "[Brand=" + brand + ", Type=" + type + ", calories=" + calories + "]\n";
	}
	public void PrintReports() {
		System.out.println(toString());
	}
}