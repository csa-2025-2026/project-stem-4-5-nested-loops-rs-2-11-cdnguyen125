import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    // Make sure to test your methods here
    printNTimes("code", 3);
    System.out.println();
   
    printNums();
    System.out.println();

    System.out.print("input a number: ");
    int UNT = scan.nextInt();
    uprightNumberTriangle(UNT);
    System.out.println();

    //starTree();
    System.out.print("enter height of tree: ");
    int height = scan.nextInt();
    starTreeBetter(height);
    System.out.println();

    multTable();
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
      for (int b = 0; b < a; b++)
      {
        System.out.print(a + " ");
      } 
      System.out.println();
    }
  }

  public static void uprightNumberTriangle(int N)
  {
    // code solution here
    for (int x = 1; x <= N; x++)
    {
      for (int y = 1; y <= x; y++)
      {
        System.out.print(y + " ");
      }
      System.out.println();
    }
  }

  public static void starTree()
  {
    // code solution here
    int index = 1;
    for (int m = 9; m >= 1; m--)
    {
      for (int n = 1; n <= m; n++)
      {
        System.out.print("* ");
      }
      System.out.println();
      while(index < (11-m))
      {
        System.out.print(" ");
        index++;
      }
      index = 1;
    }
  }

  public static void starTreeBetter(int height)
  {
    // code solution here
    int index = 1;
    for (int m = height; m >= 1; m--)
    {
      for (int n = 1; n <= m; n++)
      {
        System.out.print("* ");
      }
      System.out.println();
      while(index < ((height + 2)-m))
      {
        System.out.print(" ");
        index++;
      }
      index = 1;
    }
  }

  public static void multTable()
  {
    // code solution here
    for (int mult = 1; mult <= 10; mult++)
    {
      for (int multiplier = 1; multiplier <= 10; multiplier++)
      {
        int result = mult*multiplier;
        System.out.print(result + " ");
      }
      System.out.println();
    }

  }
}
