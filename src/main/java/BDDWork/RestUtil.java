package BDDWork;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtil 

{

public static String getFname()
{
  String generatedString=RandomStringUtils.randomAlphabetic(1);	
  
  return("Jack"+generatedString);
}

public static String geLastname()
{
  String generatedString=RandomStringUtils.randomAlphabetic(1);	
  
  return("morris"+generatedString);
}

public static String getEmail()
{
  String generatedString=RandomStringUtils.randomAlphabetic(1);	
  
  return("sam"+generatedString+"@gmail.com");
}


public static String getrollno()
{
  String generatedString=RandomStringUtils.randomNumeric(2);
  
  return(generatedString);
}
}
