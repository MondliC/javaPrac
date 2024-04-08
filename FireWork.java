package acsse.csc2a.fmb.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author MC Nkosi 220033089
 * @see FireworkDisplay 
 * class for fireworks 
 */
public abstract class FireWork implements IDisplayable {
    private  final String FireworkID ;
    private String FireworkName ;
    private int intFuseLength;
    private E_COLOUR FireworkColour;
    final static Pattern FireworkPattern = Pattern.compile("(FW)\\d{4}\\s[A-Z][a-z]*\\d{1}\\.\\d*\\s[A-Z][a-z]*");
    /**
     * Constructor for fireworks 
     * @param FireworkID id number for firework
     * @param FireworkName name of the firework
     * @param intFuseLength explosion time of the firework 
     * @param FireworkColour colour of the firework 
     */
    public FireWork (String FireworkID ,String FireworkName,int intFuseLength,E_COLOUR FireworkColour)
    {
    	this.FireworkID = FireworkID;
    	this.FireworkName = FireworkName ;
    	this.intFuseLength = intFuseLength;
    	this.FireworkColour = FireworkColour; 
    }
	/**
	 * @return a formated string 
	 */
     @Override
    public String toString()
    {
    	return String.format(this.FireworkID,this.FireworkName, this.intFuseLength,this.FireworkColour);
    }
     /**
      * 
      * @param line
      * @return
      */
 	public static boolean validate(String line)
 	{

 		Matcher FireworkMatcher = FireworkPattern.matcher(line);
 		
 		if(FireworkMatcher.matches())
 		{
 			return true ;
 		}
 		else
 		{ 
 			System.err.print("Invalid data format");
 			return false;
 		}
 		
 	}
	/**
	 * @return ID number of firework  
	 */
	public String getFireworkID() {
		return FireworkID;
	}
	/**
	 * @return name of the firework
	 */
	public String getFireworkName() {
		return FireworkName;
	}
	/** 
	 * @param fireworkName sets name of the fire work 
	*/
	public void setFireworkName(String fireworkName) {
		FireworkName = fireworkName;
	}
	/**
	 * @return gets the explosion time for the firework 
	 */
	public int getIntFuseLength() {
		return intFuseLength;
	}
	/**
	 * @param intFuseLength sets the explosion time for the firework 
	 */
	public void setIntFuseLength(int intFuseLength) {
		this.intFuseLength = intFuseLength;
	}
	/**
	 * @return gets the firework colour 
	 */
	public E_COLOUR getFireworkColour() {
		return FireworkColour;
	}
	/**
	 * @param fireworkColour sets the colour of the firework 
	 */
	public void setFireworkColour(E_COLOUR fireworkColour) {
		FireworkColour = fireworkColour;
	}
	@Override
	public String display() {
		// TODO Auto-generated method stub
		return null;
	}
    
    
}
