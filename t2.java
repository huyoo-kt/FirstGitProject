
import java.util.*;

public class t2 {
static Random r = new Random();
static Scanner sc = new Scanner(System.in);


static void  ranNum(){
System.out.println("=======Guessing Game========");
char ulit = 'Y';
while(ulit == 'Y' || ulit == 'y'){
int bilang = 5;
System.out.println("you only have "  + bilang + " number of guesses");
System.out.println("you can choose number between 1 and 100");
int number = r.nextInt(100) + 1;
while(bilang>0){
System.out.println("=====================================");
System.out.print("guess the number(1-100): ");
int n1 = sc.nextInt();
if(n1 > number){
System.out.println("number is higher than the actual number");
System.out.println("Try Again");
} 
else if(n1 < number){
System.out.println("the guessed number is lower than the actual number.");
System.out.println("Try Again");
}
else if(n1 == number){
System.out.println("congratulations! you guessed the correct number.");
sc.close();
return;
}

bilang--;

}
System.out.println("Sorry you have used all your guesses");
System.out.print("Do you want to play again? (Y/N): ");
ulit = sc.next().charAt(0);}
if (ulit != 'y' || ulit != 'Y') {
    System.out.println("=====================");
    System.out.println("Game Terminated");
}
}







public static void main(String[] args) {

ranNum();

}

}