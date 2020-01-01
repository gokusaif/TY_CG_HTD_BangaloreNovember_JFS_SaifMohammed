navigator.geolocation.getCurrentPosition((position)=>{
    console.log(position.coords.latitude);
    console.log(position.coords.longitude);
}); 

let heading = document.getElementById('heading');
heading.style.background ='green';
heading.style.color='white';


function yes(){
    document.getElementById('image').src=
    'https://cdn.pixabay.com/photo/2018/12/13/14/24/the-kremlin-3872941__340.jpg';
}

function no(){
    document.getElementById('image').src=
    'https://cdn.pixabay.com/photo/2019/12/29/17/45/winter-4727668__340.jpg';
}
