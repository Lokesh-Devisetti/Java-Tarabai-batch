function employe(){
    //  emp = {
    //     id:101,
    //     name:"Lokesh",
    //     salary:25000,
    //     dept:"developer",
    //     phoneNumber:[7013840036,8523697410]
    // }
    // document.write(emp.id+" "+emp.name+" "+emp.salary,emp.dept,emp.phoneNumber);

    // 2nd way
    //  var emp = new Object();
    //  emp.id=101;
    //  emp.name="Lokesh";
    //  emp.salary=30000;
    //  emp.phoneNumber=[7013840036,9502022817];
    //  document.write(emp.id,emp.name,emp.salary, emp.phoneNumber);

    // 3rd way
    function emp(id,name,salary,phoneNumber){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.phoneNumber=phoneNumber;
    }
    var emp1=new emp(101,"Lokesh",8000,[789654130,9502022817]);
    document.write(emp1.id,emp1.name,emp1.salary,emp1.phoneNumber);
}
