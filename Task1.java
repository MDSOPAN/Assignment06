import java.util.Scanner;

public class Task1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    for(int i = 0;i<str.length();i++){
      if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122){ 
//      if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
        System.out.print((char)((int)str.charAt(i)-32));
//        System.out.print((char)(str.charAt(i) - ' '));
      }else{
        System.out.print(str.charAt(i));
      }
      
    }
    System.out.println();
  }

}