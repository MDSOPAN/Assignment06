import java.util.Scanner;

public class Task5{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int vowels = 0;
    int conos = 0;
    for(int i = str.length()-1;0<=i;i--){
      if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
        vowels++;
      }else{
          conos++;
        };
    }
    if(vowels%3==0 && conos%5==0){
      System.out.println("Aaarr! Me Plunder!!");
    }else{
      System.out.println("Blimey! No Plunder!!");
    };
  }

}