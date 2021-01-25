class Item
{
	String name;
	String property;
	double price;
	Item(String name,String property,double price)
	{
		this.name=name;
		this.property=property;
		this.price=price;
	}

}
class Property extends Item
{
	int bedroom;
	int area;
	int age;
	Property(String a,String b,double c,int d,int e,int f)
	{
		super(a,b,c);
		this.bedroom=d;
		this.area=e;
		this.age=f;
		

	}
	String display()
	{
		System.out.println("Property");
		System.out.println("Name: "+name);
		System.out.println("Category: "+property);
		System.out.println("Price: "+price);
		System.out.println("Bedroom: "+bedroom);
		System.out.println("Area: "+area);
		System.out.println("Age: "+age);
		return "a";
	}
}
class HouseHold extends Item
{
	String condition;
	String picture;
	HouseHold(String a,String b,double c,String d,String e)
	{
		super(a,b,c);
		this.condition=d;
		this.picture=e;
	}
	String display()
	{
		System.out.println("HouseHold");
		System.out.println("Name: "+name);
		System.out.println("Category: "+property);
		System.out.println("Price: "+price);
		System.out.println("Condition: "+condition);
		System.out.println("Picture: "+picture);
		return "a";
	}
}
class Car extends Item
{
	String platenumber;
	String manufactured;
	Car(String a,String b,double c,String d,String e)
	{
		super(a,b,c);
		this.platenumber=d;
		this.manufactured=e;
	}
	String display()
	{
		System.out.println("Car");
		System.out.println("Name: "+name);
		System.out.println("Category: "+property);
		System.out.println("Price: "+price);
		System.out.println("Platenumber: "+platenumber);
		System.out.println("manufactured: "+manufactured);
		return "a";
	}
}
class Controller
{
	public static void main(String[] args) 
	{
		Property pro = new Property("House","Property",1000000.0,4,500,5);
		pro.display();

		System.out.println("-----------------------------------");

		HouseHold hh = new HouseHold("Flask","Utility",5000.0,"Used","http//www.pictures.com/flask");
		hh.display();

		System.out.println("-----------------------------------");
		
		Car c = new Car("BMW","Utility",5000000.0,"RAB123B","Thu jan 01 02:00:02 CAT 1970");
		c.display();
	}
}