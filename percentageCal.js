function per(){
    var grade=prompt("Enter marks");
    // if(marks>90){
    //     document.write("A grade");
    // }
    // else if(marks>80&marks<90){
    //     document.write("B Grade");
    // }
    // else{
    //     document.write("C Grade");
    // }
    switch(grade){
        case 'A':{
            document.write("A Grade");
            break;
        }
        case 'B':{
            document.write("B Grade");
            break;
        }
        case 'C':{
            document.write("C Grade");
            break;
        }
        default :{
            document.write("Fail");
        } 
    }
}