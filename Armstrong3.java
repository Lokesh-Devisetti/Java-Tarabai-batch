class Armstrong3{
public static void main(String args[])
{
int a[]={324,121,454,456,678,153,371};
int temp,rem,sum=0;
System.out.println("amstrong numbers");
for(int i=0;i<a.length;i++){
temp=a[i];
sum=0;
while(temp>0){
rem=temp%10;
sum=sum+(rem*rem*rem);
temp=temp/10;
}
if(a[i]==sum){
System.out.println(a[i]);
}
}
}
}