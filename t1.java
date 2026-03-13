package gfg;

public class t1 {
  


public static void main(String[] args) {

    for(int i = 0; i < 10; i++) {
    una:  {
    two:  { 
    tree: {
        if(i == 2) {break una;} // break method is used to break the loop and continue with the next statement after the loop
        if(i==3){break two;}
        if(i==4){break tree;}
    }
    System.out.println("third");
    }
  System.out.println("second");
    }
    System.out.println("first");
} 



    }
}