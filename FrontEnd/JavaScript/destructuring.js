var student = {
    id: 1234,
    name: 'saif',
    age: 22
}

var {id,name,...rest} = student;

console.log(id);
console.log(rest);

var marks=[10,40,70,90];

var[math,science,...rest] = marks;

console.log('math marks',math);
console.log('science marks',science);
console.log('rest',rest);

