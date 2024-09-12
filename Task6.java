import java.util.Scanner;

public class Task6{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String rev = "";
    String word ="";
    for(int i = 0;i<str.length();i++){
      if(str.charAt(i)==' '){
        
        rev = word+" "+rev;
        word="";
        continue;
      }
      word+=str.charAt(i);
    }
    rev = word+" "+rev;
    System.out.println(rev);
  }

}