var date = new Date();
console.log(date.getDate());
console.log(date.getMonth()+1);
console.log(date.getFullYear());
console.log(date.getHours());
console.log(date.getMinutes());
console.log(date.getMilliseconds());

setInterval(()=>{
    var date = new Date();
 document.getElementById('todaysDate').innerHTML = `Date :: ${date.getDate()}::${date.getMonth()+1}::
 ${date.getFullYear()} time is ${date.getMinutes()}:${date.getSeconds()} `
},1);