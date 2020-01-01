
var person = {
    aadharNo:12345678
}

var personPan = {
    pan:1234567
}
var student = {
    ...person,
    ...personPan,
    id:123,
    name:'Saif',
    degree:'BE',
    phone:'9700143501',
    address: {
        city:'bangalore',
        state:'karnataka'
    }
}
for (let key in student){
    console.log('key is '+key+' values are '+student[key]);
}

// console.log(student);
// console.log(student['degree']);
// console.log(student.name);
// console.log(student.address.city);