let msg='hello javascript';

console.log(msg.charCodeAt(3));

console.log(msg.charAt(0));

let split=msg.split('').reverse().join('');

console.log(split)

console.log(msg.includes('hello'));

console.log(msg.toUpperCase());

console.log(msg.substr(0,8));

console.log(msg.length);


function add(...nums){
    let sum=0;
    for (let num of nums) {
        sum=sum+num;
    }
    console.log(`sum of numbers is ${sum}`);
}

add(15,14,56,78,100);
add(1,2);