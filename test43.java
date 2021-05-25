import java.util.Random;
import java.util.Scanner;


public class test43 {
 public static final String[] words = new String[] {
       "write","that","public","private","program"
    };
static void myMethod(){
Scanner input = new Scanner(System.in);


char c;
do{
    play(words);
    System.out.println("Do you want to guess anther word? Enter y or n:");

}while((c=input.next().charAt(0))=='y');
}
//public static void main(String[] args) {

//Scanner input = new Scanner(System.in);

//String[] words = {"write","that","public","private","program"};
//char c;
//do{
  //  play(words);
    //System.out.println("Do you want to guess anther word? Enter y or n:");

//}while((c=input.next().charAt(0))=='y');

//}


public static void play(String[] words){
Scanner input = new Scanner(System.in);
int miss = 0; 
char c; 
Random random = new Random(); 
int i = random.nextInt(words.length);
//Use a char array, the length is the length of the word, and all the values ​​inside are assigned to *
char[] ch = new char[words[i].length()];
for (int j = 0; j < words[i].length(); j++) {
if(j==0)
ch[j]=words[i].charAt(0);
else

ch[j]='*';
}
//System.out.println(words[i]);
do{
System.out.print("(Guess) Enter a letter in word ");
System.out.print(ch);System.out.println(" >");
c = input.next().charAt(0);//Save letters
//Judge whether the letter appears in the word, if not, miss+1;
if(words[i].indexOf(c)==-1){
System.out.println(c+" is not in the word");
miss++;
}
//Determine if the letter has been guessed.
for (int j = 0; j < ch.length; j++) {
if(ch[j]==c)System.out.println(c+" is alerady in the word ");;
break;
}


}while(guessWord(words[i],ch,c));//Display the letter you guessed right, and judge
// If none of the * means that you have guessed all of them, end this game

System.out.println("The word is "+words[i]+" You miss "+miss+" time");

}


public static boolean guessWord(String str,char[] ch,char c){

for (int i = 0; i <str.length(); i++) {//Display the correct letter in the corresponding position
if(str.charAt(i)==c)ch[i]=c;
}
for (int i = 0; i < str.length(); i++) {
if(ch[i]=='*') return true;
}
return false;
}


}
