import java.util.Scanner;

public class Task2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String rev = "";
    for(int i = str.length()-1;0<=i;i--){
      rev+=str.charAt(i);
    }
    System.out.println(rev.equals(str));
  }

}