package acsse.csc2a.fmb.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 2200089 MC Nkosi
 */
public class PyroTechnicians implements IDisplayable{
  private String FullName ;
  private   String PhoneNumber;
  final static Pattern PyroPattern = Pattern.compile("s[A-Z][a-z]*\\-\\s[A-Z][a-z]*\\d{3}\\-\\d{3}\\-\\d{4}");
  /**
   * Constructor  for pyroTechnicians 
   * @param FullName
   * @param PhoneNumber
   */
  public PyroTechnicians(String FullName,String PhoneNumber)
  {
	  this.setFullName(FullName) ;
	  this.setPhoneNumber(PhoneNumber) ;
  }
  /**
   * 
   * @param line
   * @return
   */
	public static boolean validate(String line)
	{

		Matcher PyroMatcher = PyroPattern.matcher(line);
         if(PyroMatcher.matches())
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
   * get name for technicians
   * @return FullName
   */
  public String getFullName() {
	  return FullName;
  }
  /**
   * set name for technician
   * @param fullName
   */

  public void setFullName(String fullName) {
	  FullName = fullName;
  }
  /**
   * get Technician phone number
   * @return PhoneNumber
   */

  public String getPhoneNumber() {
	  return PhoneNumber;
  }
  /**
   * set Technician phone number 
   * @param phoneNumber
   */

  public void setPhoneNumber(String phoneNumber) {
	  PhoneNumber = phoneNumber;
  }
@Override
public String display() {
	// TODO Auto-generated method stub
	return null;
}
}
