/**
 * 
 */
package acsse.csc2a.fmb.model;

/**
 * @author MC Nkosi 220033089
 * Class that extends the firework class
 * @see FireWork
 */
public class FountainFirework extends FireWork {
   private double fountainDuration;
   private E_COLOUR FountainTransitionColours ;
   public FountainFirework(String fireworkID,String fireworkName,int intFuseLength,E_COLOUR fireColour ,double fountainDuration,E_COLOUR FountainTransitionColours)
   { 
	   super(fireworkID, fireworkName, intFuseLength, fireColour);
	   this.setFountainDuration(fountainDuration);
	   this.setFountainTransitionColours(FountainTransitionColours);
   }
	public String display()
	{
		return String.format(super.getFireworkID(),super.getFireworkName(),super.getIntFuseLength(),super.getFireworkColour(),fountainDuration,FountainTransitionColours);
		
	}
/**
 * @return the fountainDuration
 */
public double getFountainDuration() {
	return fountainDuration;
}
/**
 * @param fountainDuration the fountainDuration to set
 */
public void setFountainDuration(double fountainDuration) {
	this.fountainDuration = fountainDuration;
}
/**
 * @return the fountainTransitionColours
 */
public E_COLOUR getFountainTransitionColours() {
	return FountainTransitionColours;
}
/**
 * @param fountainTransitionColours the fountainTransitionColours to set
 */
public void setFountainTransitionColours(E_COLOUR fountainTransitionColours) {
	FountainTransitionColours = fountainTransitionColours;
}
   
   

}
