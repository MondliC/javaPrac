package acsse.csc2a.fmb.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author MC Nkosi 220033089
 * Class for firework display 
 * @see FireWork
 */

public class FireworkDisplay implements IDisplayable{
  public final static int DEFAULT_FIREWORK_COUNT = 3;
  private final String DisplayId ;
  private String DisName;
  private String DisTheme;
  private PyroTechnicians LeadTech;
  private FireWork[] firework ;
  private int fireworkIndex;
  final static Pattern DisplayPattern = Pattern.compile("(FD)\\d{4}\\[\\s[A-Z][a-z]*\\]\\s[A-Z][a-z]*");
  /**
   * Constructor for firework display 
   * @param DisplayId Firework display id 
   * @param DisName name of the firework display 
   * @param firework invoking the firework class
   * @param Lead invoking the PyroTech class
   */
  public FireworkDisplay (String DisplayID , String DisName,String DisTheme, FireWork firework,PyroTechnicians LeadTech)
  {
	  this.DisName = DisName ;
	  this.DisplayId = DisplayID;
	  this.fireworkIndex = 0;
	  this.LeadTech = LeadTech ;
	  this.firework = new FireWork[DEFAULT_FIREWORK_COUNT];
  }

/**
  * @param newFirework adds fireworks to the display class
  */
  public void addFirework(FireWork newFirework)
  {
	  if(this.fireworkIndex >= this.firework.length ) 
	  { 
		  // need to resize the array 
		  FireWork[] resizedFireworkArr = new FireWork[firework.length*3];
		  System.arraycopy(firework, 0, resizedFireworkArr, 0, firework.length);
		  this.firework = resizedFireworkArr ;
		  
	  }
	  this.firework[this.fireworkIndex++] = newFirework; 
  }
  /**
   * @return a formated string 
   */
 @Override
  public String toString()
  {
  	return String.format(this.DisplayId,this.DisName,this.firework,this.LeadTech);
  }
  /**
   * @return gets the display id number 
   */
  public String getDisplayId() {
	  return DisplayId;
   } 
  /**
   * 
   * @param line
   * @return
   */
	public boolean validate(String line)
	{
		Matcher DisplayMatcher = DisplayPattern.matcher(line);

	    if(DisplayMatcher.matches())
		{
			return true;
		}
		else
		{ 
			System.err.print("Invalid data format");
			return false;
		}
		
	} 
   /**
	* @return get the display name 
    */

public String getDisName() {
	return DisName;
}
/**
 * @param disName sets the name of the display 
 */

public void setDisName(String disName) {
	DisName = disName;
}
/**
 * @return gets the theme of the display firework 
 */
public String getDisTheme() {
	return DisTheme;
}
/**
 * @param disTheme sets the theme of the display fireworks
 */
public void setDisTheme(String disTheme) {
	DisTheme = disTheme;
}
/**
 * @return gets the lead teach 
 */

public PyroTechnicians getLeadTech() {
	return LeadTech;
}
/**
 *@param leadTech sets the lead tech 
 */
public void setLeadTech(PyroTechnicians leadTech) {
	LeadTech = leadTech;
}

@Override
public String display() {
	
	return null;
}
  
}
