function loop(){
    var start=prompt("Enter the number");
    var end = prompt("Enter the Ending number") ;
    // for(var i=1;i<=num;i++){
    //     document.write(i);
    // }
    // var i=1;
    // while(i<=num){
    //     document.write(i);
    //     i++;
    // }
    // var i=1;
    // do{
    //     document.write(i);
    //     i++;
    // }while(i<=num);
    var i=start;
    do{
        document.write(i +"<br>");
        i++;
    }while(i<=end);
}