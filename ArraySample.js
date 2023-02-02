function array(){
    // var arr=[1,2,3,4,5];
    var arr=new Array(1,2,3,4,6);
    for(var i=0;i<5;i++){
        arr[i]=prompt("enter array elements");
    }
    for(var i=0;i<arr.length;i++){
        document.write(arr[i]);
    }
    
}
