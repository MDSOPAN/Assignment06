import java.util.Scanner;

public class Task7{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    String word ="";
    for(int i = 0;i<str1.length();i++){
      boolean iscom=false;
      for(int j=0;j<str2.length();j++){
        if(str1.charAt(i)==str2.charAt(j)){
          iscom=true;
        }
      }
      if(iscom==true) continue;
      
      word+=str1.charAt(i);
      
    }
    
    for(int i = 0;i<str2.length();i++){
      boolean iscom=false;
      for(int j=0;j<str1.length();j++){
        if(str2.charAt(i)==str1.charAt(j)){
          iscom=true;
        }
      }
      if(iscom==true) continue;
      
      word+=str2.charAt(i);
      
    }
    System.out.println(word.toUpperCase());
  }

}