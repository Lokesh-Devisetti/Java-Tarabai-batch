class Palindrome1{
public static void main(String args[])
{
int a[]={324,121,454,456,678};
int temp,rem,rev=0;
System.out.println("plaindrome numbers");
for(int i=0;i<a.length;i++){
temp=a[i];
rev=0;
while(temp>0){
rem=temp%10;
rev=rev*10+rem;
temp=temp/10;
}
if(a[i]==rev){
System.out.println(a[i]);
}
}
}
}