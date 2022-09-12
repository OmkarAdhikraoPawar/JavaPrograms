
class Electronic
{
    public void Electronics()
    {
         System.out.println("Class Electronics");
    }
    public void deviceType()
    {
         System.out.println("Device Type: Electronics");
    }
}
class Television extends Electronic
{
    public Television()
    {
         System.out.println("Class Television");
    }
    public void category()
    {
         System.out.println("Category - Television");
    }
}
class LED extends Television
{
    public LED()
    {
         System.out.println("Class LED");
    }
    public void display_tech() 
    {
         System.out.println("Display Technology- LED");
    }
}
public class Tester
{
    public static void main(String[] arguments) {
    	
        LED l = new LED();
        l.deviceType();
        l.category();
        l.display_tech();
    }
}
