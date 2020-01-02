class Student1 {
    constructor(public name:string,
       public age:number,
       public marks:number,
       public aadharNo ?:number,
       public panNumber ?:string ){ }
   }

   let student:Student1 = {
    name:'Saif',
    age:45,
    marks:100
   }

   let student2= new Student1('Saif',30,100,undefined,'asfdsgfd');

   let clearedStudents = [
       new Student1('Saif',23,100),
       new Student1('Suraj',22,100)
   ]

   console.log(clearedStudents);

   //interface
   interface Trainee extends Student1 {
       name:string;
       age:number;
       printData(): void
   }
//class impelementing
class Training implements Trainee {
    name:'abcd';
    age:100;
    marks:100;
    printData(){

    }
}

let trainee1:Trainee = {
    name:'name',
    age:45,
    marks:100,
    printData(){

    }
}

   
