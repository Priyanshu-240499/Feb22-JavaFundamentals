package mrch17Assignment;

public class Dog {
	
   public void speakdog()
	    {
	        System.out.println("woof!");
	    }
   public static void main(String[] args) { 
		Beagle b = new Beagle();
	    b.speakdog();   
	    b.speakbeagle();
	}

}
class Beagle extends Dog
{
    public void speakbeagle()
    {
        System.out.println("arf arf");
    }
}

