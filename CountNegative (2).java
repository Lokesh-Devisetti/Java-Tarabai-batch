//Write a JAVA program to count total number of even and odd elements in an array.
public class CountNegative{
	
	public static void main(String[] args) {
		int i,count = 0;
		int[] count_NegArr = {-20,56,87,-85,63,32,95,-102};
		
for(i=0;i<count_NegArr.length;i++)//0<8,1<8,2<8,3<8,4<8,5<8,6<8,7<8,8<8
		{
			if(count_NegArr[i] < 0) {//-20<0,56<0,87<0,-85<0,63<0,32<0,95<0,-102<0
				count++;//-20,-85,-102 count=3
			}
			
		}
		System.out.println("The Total Number of Negative Array Items = " + count);
	}
}