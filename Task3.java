import java.util.Scanner;

public class Task3{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    char br = sc.next().charAt(0);
    
    for(int i = 0;i<str.length();i++){
      if(str.charAt(i)==br){
        System.out.println();
      }else{
        System.out.print(str.charAt(i));
      }
       
      
    }
    System.out.println();
  }

}