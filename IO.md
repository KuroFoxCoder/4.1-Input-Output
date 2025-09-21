# Main
```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = null; //New Scanner object, to be used in a try/catch block
        ArrayList<String> replaceLines = new ArrayList<>(); //A pair of ArrayLists to contain the lines of the file and the replaced text
        ArrayList<String> replacedLines = new ArrayList<>();
        try
        {
            input = new Scanner(new FileReader("ParkPhotos.txt")); //Find the file ParkPhotos.txt
            while (input.hasNextLine())
            {
                replaceLines.add(input.next()); //Put every single line of ParkPhotos.txt into an ArrayList, until there is no input
            }
            PhotoReplacer obj = new PhotoReplacer(replaceLines); //New PhotoReplacer object that gets ready to replace the files
            replacedLines = obj.replaceName("_photo.jpg", "_info.txt"); //Call the replaceName method to replace all the necessary substring text
            for (int i = 0; i < replacedLines.size(); i++) {
                System.out.println(replacedLines.get(i)); //Print the lines when it's done
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("ERROR: File Not Found"); //Return error message in console if file isn't found
        }
        finally
        {
            if(input != null)
            {
                input.close(); //If program executes correctly, close Scanner
            }
        }
    }
}
```
# PhotoReplacer
```
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

```
