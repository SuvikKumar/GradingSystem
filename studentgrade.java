package studentgrade;
import java.util.*;
public class studentgrade {
public static void main(String args[]) {
int marks;
Scanner sc=new Scanner(System.in);
System.out.println("enter the marks of the student");
marks=sc.nextInt();
if(marks>=91) {
System.out.println("A+grade");
}
else if(marks<91 && marks>=81) {
System.out.println("A grade");
}
else if(marks<81 && marks>=71) {
System.out.println("B grade");
}
else if(marks<71 && marks>=61) {
System.out.println("C grade");
}
else if(marks<61 && marks>=51) {
System.out.println("D grade");
}
else if(marks<51 && marks>=33) {
System.out.println("E grade");
}
else{
System.out.println("FAIL");
}
}
}
