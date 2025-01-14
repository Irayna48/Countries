//Lee Zoe Randriatahina
// 01/14/2025
// This code create a geography quiz game that aske questions about certain countries in the world

public class Country
{
  // add private instance variables for the name, capital, language, and image file.
  private String name ="";
  private String language ="";
  private String capital ="";
  private String image ="";
  // add constructors
  public Country()
  {
    name="China";
    language="Chinese";
    capital="Beinjing";
    image="China.jpg";
  }
  
  public Country ( String tName,  String tCapital ,String tLanguage, String  tImage )
  {
    name = tName;
    language = tLanguage;
    capital = tCapital;
    image = tImage;
  }
  // Write accessor/get methods for each instance variable that returns it.
  public String getName()
  {
    return name;
  }
  public String getCapital()
  {
    return capital;
  }
  public String getLanguage()
  {
    return language;
  }
  public String getImage()
  {
    return image;
  }
  // Write a toString() method that returns a concatenated String of 3 of the instance variables in a sentence like "..'s capital is .. and its primary language is ..."
 public String toString()
 {
  return name+ "'s capital is " + capital + " and its primary language is  " + language;
 }


  
}