import java.util.Scanner;

public class Game {
	
		Scanner sc=new Scanner(System.in);
               public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        

               
int ch=0;
do{
System.out.println("1.JumbleGame");

System.out.println("2. Missing ");

System.out.println("3. Exist");

ch=sc.nextInt();

switch(ch){
case 1:   JumbleGame jg = new JumbleGame();
jg.startGame();
break;

case 2: test43 tst=new test43();
 tst.myMethod();
break; 

case 3: System.out.println("\nExisting------");
break;
	
default:System.out.println("\n Invalid Choice");
			}
		}while(ch!=3);


}
}



