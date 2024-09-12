import java.util.Scanner;

public class Task8{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
   
    for(int i = 1;i<=str.length();i++){
      if(i%2==0){
        System.out.print((str.charAt(i-1)+"").toUpperCase());
      }else{
        System.out.print((str.charAt(i-1)+"").toLowerCase());
      }
    }
    System.out.println();
  }

}