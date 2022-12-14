import java.util.Scanner;

public class java_stats_main{

  public static Scanner scan = new Scanner(System.in);

  public static void main(String[] args){
    int ans = 0;
    while(ans != 3){
      System.out.println("Test which class?\n1 - NumStatsArray\n2 - StringStatsArray \n3 - quit");
      ans = scan.nextInt();
      if(ans == 1)
        testNums();
      else if(ans == 2)
        testStrings();
      else if(ans != 3)
        System.out.println("Not a valid choice");
      System.out.println();
    }
  }

  public static void testNums(){
    System.out.println("Enter array length:");
    int len = scan.nextInt();
    double[] vals = new double[len];
    System.out.println("Enter values:");
    for(int i = 0; i < len; i++){
      vals[i] = scan.nextDouble();
    }
    num_stats nSA = new num_stats(vals);
    System.out.println("\nMethod returns:");
    System.out.println("toString: " + nSA);
    System.out.println("average: " + nSA.average());
    System.out.println("range: " + nSA.range());
    System.out.println("sortStatus: " + nSA.sortStatus());
  }

  public static void testStrings(){
    System.out.println("Enter array length:");
    int len = scan.nextInt();
    String[] vals = new String[len];
    scan.nextLine();
    System.out.println("Enter values:");
    for(int i = 0; i < len; i++){
      vals[i] = scan.nextLine();
    }
    System.out.println("Enter String to search for:");
    String searchVal = scan.nextLine();
    string_stats sSA = new string_stats(vals);
    System.out.println("\nMethod returns:");
    System.out.println("toString: " + sSA);
    System.out.println("averageLength: " + sSA.averageLength());
    System.out.println("search: " + sSA.search(searchVal));
    System.out.println("sortStatus: " + sSA.sortStatus());
  }
}
//test