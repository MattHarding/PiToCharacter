
package PiToCharacter;
import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class PiToCharacter
{
    static int rangeSize = 3846;
    
    
    public static void main(String[] args)
    {
        //range is the 5 numbers from pi
        int range;
        //holder is the char that comes back from the getChar method
        char holder;
    
        try
        {
        Scanner scanner = new Scanner(new File("/src/PiToCharcter/pi.txt"));
        
        while (scanner.hasNext())
           {
             scanner.useDelimiter("");
             
             range = scanner.nextInt() * 10000 +
                      scanner.nextInt() * 1000 + 
                      scanner.nextInt() * 100 + 
                      scanner.nextInt() * 10 + 
                      scanner.nextInt();
             
             
             
           holder = getChar(range);
             
             
             
           System.out.print(holder);
           }
        
        }
        catch(NoSuchElementException ne)
        {
            System.out.print("Unable to make a character. Not enough numbers.");
        }
        
        catch(FileNotFoundException fnfe)
        {
            System.out.println("File not found.");
        }
           
    }
    
    public static char getChar(int result)
    {
        
        if(result >= 0 && result < rangeSize)
        {
            return 'a';
        }
        
        else if (result >= rangeSize && result < rangeSize * 2)
        {
            return 'b';
        }
        
        else if (result >= rangeSize * 2 && result < rangeSize * 3)
        {
            return 'c';
        }
        
        else if (result >= rangeSize * 3 && result < rangeSize * 4)
        {
            return 'd';
        }
        
        else if (result >= rangeSize * 4 && result < rangeSize * 5)
        {
            return 'e';
        }
        
        else if (result >= rangeSize * 5 && result < rangeSize * 6)
        {
            return 'f';
        }
        
        else if (result >= rangeSize * 6 && result < rangeSize * 7)
        {
            return 'g';
        }
        
        else if (result >= rangeSize * 7 && result < rangeSize * 8)
        {
            return 'h';
        }
        
        else if (result >= rangeSize * 8 && result < rangeSize * 9)
        {
            return 'i';
        }
        
        else if (result >= rangeSize * 9 && result < rangeSize * 10)
        {
            return 'j';
        }
        
        else if (result >= rangeSize * 10 && result < rangeSize * 11)
        {
            return 'k';
        }
        
        else if (result >= rangeSize * 11 && result < rangeSize * 12)
        {
            return 'l';
        }
        
        else if (result >= rangeSize * 12 && result < rangeSize * 13)
        {
            return 'm';
        }
        
        else if (result >= rangeSize * 13 && result < rangeSize * 14)
        {
            return 'n';
        }
        
        else if (result >= rangeSize * 14 && result < rangeSize * 15)
        {
            return 'o';
        }
        
        else if (result >= rangeSize * 15 && result < rangeSize * 16)
        {
            return 'p';
        }
        
        else if (result >= rangeSize * 16 && result < rangeSize * 17)
        {
            return 'q';
        }
        
        else if (result >= rangeSize * 17 && result < rangeSize * 18)
        {
            return 'r';
        }
        
        else if (result >= rangeSize * 18 && result < rangeSize * 19)
        {
            return 's';
        }
        
        else if (result >= rangeSize * 19 && result < rangeSize * 20)
        {
            return 't';
        }
        
        else if (result >= rangeSize * 20 && result < rangeSize * 21)
        {
            return 'u';
        }
        
        else if (result >= rangeSize * 21 && result < rangeSize * 22)
        {
            return 'v';
        }
        
        else if (result >= rangeSize * 22 && result < rangeSize * 23)
        {
            return 'w';
        }
        
        else if (result >= rangeSize * 23 && result < rangeSize * 24)
        {
            return 'x';
        }
        
        else if (result >= rangeSize * 24 && result < rangeSize * 25)
        {
            return 'y';
        }
        
        
        //I have to use 99999 here instead of groupsize because 26 * groupsize doesn't
        //equal 99999. It is 3 numbers short, therefor z has a higher(of course to a very 
        //small degree) chance of being picked than any other number(.00003% to be exact).
        else if (result >= rangeSize * 25 && result <= 99999)
        {
            return 'z';
        }
        

        //As long as the source file remains unchanged this shouldn't be called.
        else
        {
            System.out.println("Something went wrong.");
            return 0;
        }
    
    }
}
