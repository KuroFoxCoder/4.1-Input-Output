import java.util.*;

public class PhotoReplacer {
    ArrayList<String> linesOne = new ArrayList<>();
    ArrayList<String> linesTwo = new ArrayList<>();
    public PhotoReplacer(ArrayList<String> lineList)
    {
        linesOne = lineList; //Make ArrayList of lines from a call to create object
    }
    public ArrayList<String> replaceName(String stringOne, String stringTwo)
    {
        for(int i=0; i < linesOne.size(); i++)
        {
            if(linesOne.get(i).contains(stringOne))
            {
                linesTwo.add(linesOne.get(i).replace(stringOne, stringTwo)); //If substring is detected, replace the substring with a new one defined in stringTwo
            }
        }
        return linesTwo; //Return revised ArrayList
    }
}
