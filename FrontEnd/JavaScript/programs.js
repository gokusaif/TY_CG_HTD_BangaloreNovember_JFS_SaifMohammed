var n=5;
var factorial=1;
for(let i=1;i<=n;i++) {
    factorial=factorial*i;
}

console.log('factorial is '+factorial);


var num=131;
var temp=num;
var rev=0;
var rem;
while(num>0){
    rem=num%10;
    rev=(rev*10)+rem;
    num=num/10;
}

if(temp===rev){
    console.log("palindrome");
} else {
    console.log('not palindrome');
}
