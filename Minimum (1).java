class Minimum{
  public static void main(String args[]){
    String str="hi mam you are wow";
    String s[]=new String[5];
     s=str.split(" ");
    int arr[]=new int[5];
    for(int i=0;i<s.length;i++){
      arr[i]=s[i].length();
      System.out.println(arr[i]);
    }
    int min=arr[0];
    for(int j=0;j<arr.length;j++){
      if(min>arr[j]){
        min=arr[j];
      }

    }
    for(int k=0;k<s.length;k++){
      if(min==s[k].length()){
        System.out.println("minimum word is:"+s[k]);
      }
    }
    
  }
}