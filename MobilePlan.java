/*Best Mobile Plan
 
St. Patrick Convent organizes a project exhibition "Innovative Minds" every year with an objective to 
provide the platform and unleash the potential of the students by showcasing their innovative projects.
Albert is a science expert and is a topper at his high school. He became interested about the project 
exhibition and enrolled his name for the same.
 
Albert’s Dad has a cell phone but often seemed to worry about the price plans for his phone that best fits
 for his usage pattern and monthly expenses. There are two options, each plan has different costs for 
daytime minutes, evening minutes and weekend minutes.
 

Plan
Costs

daytime
evening
weekend

A
100 free minutes then
25 paise per minute
15 paise per minute
20 paise per minute

B
250 free minutes then
45 paise per minute
35 paise per minute
25 paise per minute

 
Having this as a spark for his project, Albert decided to design a handy application that will input the 
number of each type of minutes and output the cheapest plan for this usage pattern,using the format shown
 below. In the case that the two plans are the same price, output both plans.
 
He needs your help to evaluate his project and suggest corrections.
 
Hence create a class named BestMobilePlan with the following method.

 
 

Method Name
Description

void printPlanDetails(int,int,int)
This method should display the cheapest plan for this usage pattern.

 
Create a driver class called Main. In the Main method, obtain input from the user in the console and call the printPlanDetails method present in BestMobilePlan class. 
[Note: Strictly adhere to the Object Oriented Specifications given in the problem statement. Convert paise to rupees.
All class names, attribute names and method names should be the same as specified in the problem statement. Create separate classes in separate files.]
 
 Input Format:
First line of the input is an integer that gives the usage during the daytime in minutes.
Second line of the input is an integer that gives usage during the evening in minutes.
Third line of the input is an integer that gives usage during the night in minutes.
 
Output Format:
Output should print the cheapest plan for this usage pattern. In the case that the two plans are the same 
price, output both plans.
Refer sample input and output for formatting specifications.
 
Sample Input 1:
251
10
60
 
Sample Output 1:
Plan A costs 51.25
Plan B costs 18.95
Plan B is cheapest
 
Sample Input 2:
162
61
66
 
Sample Output 2:
Plan A costs 37.85
Plan B costs 37.85
Plan A and B are the same price*/
 import java.util.*;
class BestMobile{
  public void PlanDetail(int day,int eve,int week){
    double cost1,cost2;
    if(day>100){
      cost1=(day-100)*0.25+(eve*0.15)+(week*0.20);
      
    }
    else{
      cost1=(eve*0.15)+(week*0.20);
    }
    if(day>250){
      cost2=(day-250)*0.45+(eve*0.35)+(week*0.25);
    }
    else{
      cost2=(eve*0.35)+(week*0.25);
    }
    System.out.println("Plan A price is "+cost1);
     System.out.println("Plan B price is "+cost2);
    if((int)cost1>(int)cost2){
      System.out.println("Plan 2 is cheapest");
    }
    else if((int)cost1<(int)cost2) {
      System.out.println("Plan 1 is cheapest");
    }
    else{
      System.out.println("same");
    }
  }
}

class MobilePlan{
  public static void main(String args[]){
    BestMobile b=new BestMobile();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the daytime min");
    int a=sc.nextInt();
     System.out.println("Enter the Evening min");
    int b1=sc.nextInt();
     System.out.println("Enter the Weekend min");
    int c=sc.nextInt();
    
      b.PlanDetail(a,b1,c);
  }
}