import java.util.*;
class Salary
{
public static void main(String []st)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter Basic Salary:");
float bs= sc.nextFloat();
System.out.print("Enter TA:");
float ta= sc.nextFloat();
System.out.print("Enter DA:");
float da= sc.nextFloat();
System.out.print("Enter HRA:");
float hra= sc.nextFloat();
System.out.print("Enter EPF:");
float epf= sc.nextFloat();
float ts= bs+(bs*(ta+da+hra-epf)/100);
System.out.println("Total Salary:"+ts);
}
}