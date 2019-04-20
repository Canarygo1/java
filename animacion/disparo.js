/*
var coche = document.getElementById('coche');
var condicion =false;
var disparo=document.getElementById("disparo");
coche.addEventListener("click", ( ) =>{
    if(condicion==false){
    disparo.style.animation = "disparo 2s";
    condicion=true;
}

*/
var coche = document.getElementById('coche');
element = document.getElementById("pistola");
var salud = document.getElementById("salud");
var inicial = 0;
var contador = 0;
var i = 0;
var txt = 'GANASTE!';
var speed = 400;

function typeWriter() {
  if (i < txt.length) {
    document.getElementById("texto").innerHTML += txt.charAt(i);
    i++;
    setTimeout(typeWriter, speed);
  }
}

coche.addEventListener("click", function(e) {
  contador++;
  if(contador==8){
  typeWriter();

  }
  else{
    element.classList.remove("disparo");
    inicial = inicial+30;
    
    document.getElementById('salud').style.backgroundPosition = inicial+'px'+' 0px';
    //document.getElementById('salud').style.backgroundPosition = '-390px'+' 0px';
    void element.offsetWidth;
    var audio = new Audio('laser.mp3');
    audio.play();
    element.classList.add("disparo");
  }
});