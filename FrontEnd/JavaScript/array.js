var tech=['java','spring','hibernate','javascript',1234,true,null];

// console.log(tech[1]);

// for (let x of tech) {
//     console.log(x);
// }

// for(let x in tech) {
//     console.log('index is '+x+' values '+tech[x]);
// }

// tech.forEach ((values,index) => {
//     console.log(index);
//     console.log(values);
// });

//array methods

// console.log(tech.indexOf('spring'));

// console.log('before pop '+tech);

// console.log(tech.pop()); //returns value in the  last index

// console.log('after pop '+tech);

// console.log('before push '+tech);

// console.log(tech.push('angular','spring boot'));

// console.log('after push '+tech);

// console.log('before shifting '+tech);

// console.log(tech.shift());

// console.log('after shifting '+tech);

// console.log('before unshifting '+tech);

// console.log(tech.unshift('CSS'));

// console.log('after unshifting '+tech);


// console.log('before splice '+tech);

// console.log(tech.splice(1,0,'java','javascript','webtech'));

// console.log('after splice '+tech);

// tech.splice(tech.indexOf(1234),2);

// console.log('after deleting '+tech);

// console.log(tech.length);

// tech.reverse();
 
// console.log('reversed array',tech);

// let marks=[100,200,10,20,30,80];

// console.log(marks);

// let filtered= marks.filter((value,index,array)=>{
//     return value>40;
// });

// console.log(filtered.length);

// let marks1=[35,35,12,12,60,60,20,20,25,40,50,50,75];

// let filtered1= marks1.filter((value,induex,array)=>{
//     return array.indexOf(value)===index;
// });


// console.log(filtered1);

// let marks2=[10,20,40,50,60];

// let mapArray = marks2.map((value,index,array) => {
//     return { index1:index,value1:value };
// } );
 
// console.log(mapArray);

let marks=[24,10,45,01,15,76];

let acending=marks.sort((a,b)=>{
    return a-b;
})

console.log(acending);

let decending=marks.sort((a,b)=>{
    return b-a;
})

console.log(decending);         