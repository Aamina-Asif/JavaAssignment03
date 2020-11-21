import java.util.Scanner; 
public class Demo {
	public static void mainMenu()
	{
		System.out.print("\t\tMAIN MENU\n"
				+ "1. Circle\n"
				+ "2. Rectangle\n"
				+ "3. Square\n"
				+ "4. Exit\n");
	}
	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		int choice;
		String s1;
		double d1,d2,a,p;
		boolean b1;
		mainMenu();
		System.out.print("Enter Your Choice: ");
		choice=input.nextInt();
		do
		{
			switch(choice)
			{
			case 1:
				System.out.println("Enter Radius: ");
				d1=input.nextDouble();
				System.out.println("Enter Color: ");
				input.nextLine();
				s1=input.nextLine();
				System.out.println("Is Shape Filled: ");
				b1=input.nextBoolean();
				Shape myCircle=new Circle(d1,s1,b1);
				System.out.println(myCircle.toString());
				a= myCircle.getArea();
				System.out.println("Area of the circle = "+a);
				p=myCircle.getPerimeter();
				System.out.println("Perimeter of the circle = "+p);
				break;
			case 2:
				System.out.println("Enter width: ");
				d1=input.nextDouble();
				System.out.println("Enter Length: ");
				d2=input.nextDouble();
				System.out.println("Enter Color: ");
				input.nextLine();
				s1=input.nextLine();
				System.out.println("Is Shape Filled: ");
				b1=input.nextBoolean();
				Shape myRectangle=new Rectangle(d1,d2,s1,b1);
				System.out.println(myRectangle.toString());
				a= myRectangle.getArea();
				System.out.println("Area of the rectangle = "+a);
				p=myRectangle.getPerimeter();
				System.out.println("Perimeter of the rectangle = "+p);
				break;
			case 3:
				System.out.println("Enter side: ");
				d1=input.nextDouble();
				System.out.println("Enter Color: ");
				input.nextLine();
				s1=input.nextLine();
				System.out.println("Is Shape Filled: ");
				b1=input.nextBoolean();
				Shape mySquare=new Square(d1,s1,b1);
				System.out.println(mySquare.toString());
				a= mySquare.getArea();
				System.out.println("Area of the Square = "+a);
				p=mySquare.getPerimeter();
				System.out.println("Perimeter of the Square = "+p);
				break;
			case 4:
				break;
			default:
					System.out.println("Invalid Option");
			}
			mainMenu();
			System.out.print("Enter Your Choice: ");
			choice=input.nextInt();
		}while(choice!=4);
	}

}
