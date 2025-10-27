import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Make sure to test your methods here
    printNTimes("code", 3);
    System.out.println();
  }

  public static void printNTimes(String word, int N)
  {
    // code solution here
    for (int i = 0; i < word.length(); i++)
    {
      String currentLetter = word.substring(i, i+1);
      for (int j = 0; j < N; j++)
      {
        System.out.print(currentLetter);
      }
    }
  }

  public static void printNums()
  {
    // code solution here
    for (int a = 10; a > 0 ; a--)
    {
       
    }
  }

  public static void uprightNumberTriangle(int N)
  {
    // code solution here
  }

  public static void starTree()
  {
    // code solution here
  }

  public static void multTable()
  {
    // code solution here
  }
}
