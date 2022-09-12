import java.util.Scanner;

//WAP in java using switch case for following: Area of a circle Area of a square Area of a right angled triangle Area of a rectangle Circumference of a circle , Perimeter of a square Accept inputs like radius,side,etc through keyboard
public class Assignment9 {

	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
         
         System.out.println("MENU: ");
         System.out.println("1.Area of a Circle ");
         System.out.println("2.Area of a Square ");
         System.out.println("3.Area of a Right Angled Triangle ");
         System.out.println("4.Area of a Rectangle ");
         System.out.println("5.Circumference of a Circle ");
         System.out.println("6.Perimeter of a Square ");

         System.out.println("Enter your Choice: ");
         int ch=sc.nextInt();

         switch(ch)
         {
               case 1: System.out.println("Enter radius: ");
                       float r=sc.nextFloat();
                       float ac=3.14f*r*r;
                       System.out.println("Area: "+ac);
                       break;

               case 2: System.out.println("Enter side: ");
                       int x=sc.nextInt();
                       int as=x*x;
                       System.out.println("Area: "+as);
                       break;

               case 3: System.out.println("Enter height and base: ");
                       float h=sc.nextFloat();
                       float bs=sc.nextFloat();
                       float art=0.5f*h*bs;
                       System.out.println("Area: "+art);
                       break;

               case 4: System.out.println("Enter length and breadth: ");
                       int l=sc.nextInt();
                       int b=sc.nextInt();
                       int ar=l*b;
                       System.out.println("Area: "+ar);
                       break;

               case 5: System.out.println("Enter radius: ");
                       float ra=sc.nextFloat();
                       float c=3.14f*2f*ra;
                       System.out.println(" Circumference: "+c);
                       break;


               case 6: System.out.println(" Enter side: ");
                       int d=sc.nextInt();
                       int p=4*d;
                       System.out.println(" Perimeter: "+p);
                       break;

               default:System.out.println(" Invalid choice ");
             }
         sc.close();
         

	}

}
