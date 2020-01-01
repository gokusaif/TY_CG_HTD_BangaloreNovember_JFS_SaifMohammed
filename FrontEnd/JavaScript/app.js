// var a;

// a = 100;

// console.log('value of a is '+a);

// console.log(typeof a);

// console.log(name);

// console.log(typeof name);

// var age = 45;

// //using template literal ${}
// var details = `The name is ${name} and age is ${age}`;

// console.log(details);

// console.log(`the sum of 10 and 20 is ${10+20}`);

// var text= ' qewregrdhtfjygkuhliukgyfdrhyetrtryhtjryktuf,ylgiukfyjtdhrgterytyjukuygftjdretgyhjtugkiyuho  ';
// console.log(text);

// var bool=true;

// console.log(typeof bool);

// var a1;
// console.log(typeof a1);

// var b = null;
// console.log(typeof b);

// if(undefined === null ) {
//    console.log('true');
// } else {
//     console.log('false');
// }


//alert method
// alert('hello');


//confirm method
// var user=confirm("what");

// console.log(user);

// if(user){
// console.log("ok");
// } else {
// console.log("cancel");
// }

// prompt method

// var input=prompt("Enter username");

// console.log(input);

//document.write

document.write("javascript!!!");

var a = 'abcd'; // global variable

function demo(){
    console.log(a);
    var b = 100;  // local variable
    console.log("function demo");
}

// console.log(b); throws error b is not defined

demo();
// named function
function add(a, b) {
    return a+b;
}

console.log(add(1,3));
//anonymous function 
var test = function(){ //function expression 
    console.log("anonymous");
}

test();

// immediate invoke function
(function (a,b) {
    var ma='saif';
    console.log(a+b)
    console.log('inside the function'+name);
    console.log("IIFE running");
}) (10,20);

// console.log(ma);

//anonymous function
function sample(x){
    console.log('sample started');
    x();
    console.log('sampled ended');
}

sample(function(){
    console.log("callback");
});

console.log('after');


