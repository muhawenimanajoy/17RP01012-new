import java.util.*;
interface FluffyDice
{
	String color;
	String FluffyDice(String color)
	{
		this.color=color;
	}
	String display()
	{

		System.out.println("Color: "+color);
	}
}
interface class Wheel
{
	int count;
	int position;
	Wheel()
	{

	}
	String display()
	{

	}
}
interface class Engine
{

}
public class Car implements FluffyDice,Wheel,Engine
{
	int count;
	String name;
	String engine;
	String Wheel[];

}
class Controller
{
	public static void main(String[] args) {
		
	}
}