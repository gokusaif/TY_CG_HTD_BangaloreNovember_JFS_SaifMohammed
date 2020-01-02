console.log("Typescript code started");

let a=100;

a=null;

// a='sasfds'; cannot reassign a string to number

let b; // implicitly as any types

b='asfdg';

b=100;

console.log(b);


// let arrays:string[]=['sf','sf',100]; error while storing number as it is string array

let student1:{name: string, age:number , pass:boolean};

student1 = {
    name:'suraj',
    age:40,
    pass:true
}

console.log(student1);

// class Student {
//  constructor(public name:string,
//     public age:number,
//     public marks:number ){ }

// printDetails(): void{
//     console.log(`Name is ${this.name} age is ${this.age} marks are ${this.marks}`);
// }
// }

// let student = new Student('saif',22,100);

// console.log(student.name);
// console.log(student.marks);
// student.printDetails();

console.log("Typescript code ended");