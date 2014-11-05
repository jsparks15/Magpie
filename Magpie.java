/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *       Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie
{
 /**
  * Get a default greeting  
  * @return a greeting
  */
 public String getGreeting()
 {
  return "Hello, let's talk.";
 }
 
 /**
  * Gives a response to a user statement
  * 
  * @param statement
  *            the user statement
  * @return a response based on the rules given
  */
 public String getResponse(String statement)
 {
  String response = "";
  if (statement.indexOf("no") >= 0)
  {
    final int sad = 2;
    double r = Math.random();
      int sadreply = (int)(r * sad);
      
      if (sadreply == 1) {response = "Why are you so negative?";}
      if (sadreply == 0) {response = "Turn that frown upside down!";}
      return response;
  }
  if (statement.trim().length() == 0)
  {
    response = "Please talk to me! :'(";
    return response;
  }
   if (statement.indexOf("dog") >= 0
     || statement.indexOf("cat") >= 0)
   {
     response = "Tell me more about your pets.";
   }
   if (statement.indexOf("Mr. Kiang") >= 0
         || statement.indexOf("Mr. Landgraf") >=0)
   {
     response = "Tell me more about this cool guy!";
   }
  else if (statement.indexOf("mother") >= 0
    || statement.indexOf("father") >= 0
    || statement.indexOf("sister") >= 0
    || statement.indexOf("brother") >= 0)
  {
   response = "Tell me more about your family.";
  }
  if (statement.indexOf("game") >= 0)//if they play games
  {
    response = "Did you win or lose?";
  }
  if (statement.indexOf("human") >= 0)
  {
    response = "I AM TOTALLY A HUMAN I SWEAR!";
  }
  else
  {
   response = getRandomResponse();
  }
  return response;
 }

 /**
  * Pick a default response to use if nothing else fits.
  * @return a non-committal string
  */
 private String getRandomResponse()
 {
  final int NUMBER_OF_RESPONSES = 6;
  double r = Math.random();
  int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
  String response = "";
  
  if (whichResponse == 0)
  {
   response = "Interesting, tell me more.";
  }
  else if (whichResponse == 1)
  {
   response = "Hmmm.";
  }
  else if (whichResponse == 2)
  {
   response = "Do you really think so?";
  }
  else if (whichResponse == 3)
  {
   response = "You don't say.";
  }
  else if (whichResponse == 4)
  {
    response = "Wow! That's really interesting!";
  }
  
  else if (whichResponse == 5)
  {
    response = "That's awesome!";
  }

  return response;
 }
}
