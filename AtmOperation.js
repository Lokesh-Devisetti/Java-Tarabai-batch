
 var amount=1000;
 function deposit(){
    var num=parseInt(prompt("Enter the deposit amount"));
    amount=amount+num;
    document.write(amount);
 }
 function withdraw(){
    var num2=prompt("Enter the withdraw amount");
    amount=amount-num2;
    document.write(amount);
    document.write("withdraw successfully");
 }
 function displayAmount(){

    document.write("your balance is: "+amount);
 }


