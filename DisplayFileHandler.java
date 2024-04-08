/**
 * 
 */
package acsse.csc2a.fmb.file;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import acsse.csc2a.fmb.model.E_COLOUR;
import acsse.csc2a.fmb.model.FireWork;
import acsse.csc2a.fmb.model.FireworkDisplay;
import acsse.csc2a.fmb.model.PyroTechnicians;

/**
 * 
 */
public class DisplayFileHandler {
	final static Pattern DisplayPattern = Pattern.compile("(FD)\\d{4}\\[\\s[A-Z][a-z]*\\]\\s[A-Z][a-z]*");
	final static Pattern FireworkPattern = Pattern.compile("(FW)\\d{4}\\s[A-Z][a-z]*\\d{1}\\.\\d*\\s[A-Z][a-z]*");
	final static Pattern PyroPattern = Pattern.compile("s[A-Z][a-z]*\\-\\s[A-Z][a-z]*\\d{3}\\-\\d{3}\\-\\d{4}");
	
	public static boolean validate(String line)
	{
		Matcher DisplayMatcher = DisplayPattern.matcher(line);
		Matcher FireworkMatcher = FireworkPattern.matcher(line);
		Matcher PyroMatcher = PyroPattern.matcher(line);
		if(FireworkMatcher.matches())
		{
			return true ;
		}else if(DisplayMatcher.matches())
		{
			return true;
		}else if(PyroMatcher.matches())
		{
			return true;
		}
		else
		{ 
			System.err.print("Invalid data format");
			return false;
		}
		
	}
	
	/*private static FireWork parseFirework(String tokens) 
	{
		StringTokenizer fireworkTokens = new StringTokenizer(tokens ," ");
		String ID = fireworkTokens.nextToken();
		String name = fireworkTokens.nextToken();
		int fuseLength =Integer.parseInt(fireworkTokens.nextToken());
		E_COLOUR colour = E_COLOUR.valueOf(fireworkTokens.nextToken());
		return new FireWork(ID,name,fuseLength,colour);
		
	}*/
	private static FireworkDisplay parseDisplay(String tokens)
	{
		StringTokenizer DisplayTokens = new StringTokenizer(tokens," ");
		String ID = DisplayTokens.nextToken();
		String name = DisplayTokens.nextToken();
		String Theme = DisplayTokens.nextToken();
		return new FireworkDisplay(ID,name , Theme ,null,null);
		
	}
	private static PyroTechnicians parseTech(String tokens)
	{
		StringTokenizer pyroTokens = new StringTokenizer(tokens," ");
		String fullname = pyroTokens.nextToken();
		
		String phoneNumber = pyroTokens.nextToken();
		return new PyroTechnicians(fullname,phoneNumber);
	}	

	public FireworkDisplay readDisplay(String clean1) {
		File file = new File(clean1);
		Scanner fileScanner = null;
		try {
			fileScanner = new Scanner(file);
		    FireworkDisplay currentDisplay = null;
		    FireWork  currentFire = null;
		    PyroTechnicians currentTech = null;
		    while(fileScanner.hasNextLine())
		    {
		    	String CurrentLine = fileScanner.nextLine();
		        System.out.print(CurrentLine);
		        currentDisplay.validate(CurrentLine);
		    	currentDisplay = parseDisplay(CurrentLine);
		    	currentTech = parseTech(CurrentLine);
		    }
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return null;
	}

	public FireworkDisplay readDisplay(File clean1) {
		// TODO Auto-generated method stub
		return null;
	}

}
