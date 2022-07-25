var unidades_seg = document.getElementById("unidades_seg");
var decenas_seg = document.getElementById("decenas_seg");
var unidades_minutos=document.getElementById("unidades_minutos");
var decennas_minutos = document.getElementById("decenas_minutos");
var milisegundos = document.getElementById("milisegundos");
var decenas_milisegundos = document.getElementById("decenas_milisegundos");
var unidades_horas = document.getElementById("unidades_horas");
var decenas_horas = document.getElementById("decenas_horas");
let sonido = new Audio("audio/audio.wav");




let iniciar= document.getElementById("iniciar");
let pausar = document.getElementById("pausar");
let reiniciar = document.getElementById("reiniciar");
var auxiliar = true;
var auxiliar02 = 0;
var auxiliar03 = true;
var auxiliar04 =0;
var hora_inicio;
var contador_milisegundos=0;
var contador_decenas_miilisegundos=0;
var contador_segundos=0;
var contador_decenas_segundos =0;
var contador_minutos =0;
var contador_decenas_minutos=0;
var contador_horas =0;
var contador_decenas_horas=0;
var contador =0;
var contador01=0;
var handler;
var handler01;

pausar.disabled= true;
reiniciar.disabled=true;

iniciar.onclick= function start(){

    iniciar.disabled = true;

    pausar.disabled= false;
    reiniciar.disabled=false;
    auxiliar=true;
    iniciar.innerText="Iniciar";

        handler01 =setInterval(() => {

            contador01++;
            if(auxiliar==true){
                contador_milisegundos++;
                // MILISEGUNDOS
                if(contador01%10==0){
                    contador_milisegundos=0;
                    contador_decenas_miilisegundos++;
                }
                    milisegundos.innerText=contador_milisegundos;
                // DECENAS DE MILISEGUNDOS
                if(contador_decenas_miilisegundos==10){
                    contador_decenas_miilisegundos=0;
                }
                if(contador01%10==0){
                    decenas_milisegundos.innerText=contador_decenas_miilisegundos;
                }
                // SEGUNDOS
                if(contador01%100==0){
                    sonido.play();
                    contador_segundos++;
                }
                if(contador01%1000==0){
                    contador_segundos=0;
                    contador_decenas_segundos++;
                    contador_minutos++;
                    contador_decenas_minutos++;
                }
                unidades_seg.innerText=Math.floor(contador_segundos);
                // DECENAS DE SEGUNDOS
                if(contador_decenas_segundos==6){
                    contador_decenas_segundos=0;
                }
                if(contador01%1000==0){
                    decenas_seg.innerText=Math.floor(contador_decenas_segundos);
                }
                // MINUTOS
                if(contador_minutos==60){
                    contador_minutos=0;
                }
                if(contador01%60==0){
                    unidades_minutos.innerText=Math.floor(contador_minutos/6);
                }
                // DECENAS DE MINUTOS
                if(contador_decenas_minutos==360){
                    contador_decenas_minutos=0;
                }
                if(contador01%360==0){
                    decennas_minutos.innerText=Math.floor(contador_decenas_minutos/60);
                    
                }
                // HORAS
                if(contador_horas == 60){
                    contador_horas =0;
                }
                if(contador01%360000==0){
                    contador_horas++;
                    if((contador_horas/6)==4 && decenas_horas.innerText=="2"){
                        contador_horas=0;
                        contador_decenas_horas=0;
                    }
                    unidades_horas.innerText=contador_horas;
                }
                // DECENAS DE HORAS
                if(contador_decenas_horas==10){
                    contador_decenas_horas=0;
                }
                if(contador01%3600000==0){
                    contador_decenas_horas++;
                    decenas_horas.innerText=contador_decenas_horas;
                }
                // HORAS
                // aqui empecé a editar
                // aqui empecé a editar
                // aqui empecé a editar
                // aqui empecé a editar
                
            }
        }, 10);

}


pausar.onclick = function pausar(){
    iniciar.disabled = false;
    clearInterval(handler01);
    iniciar.innerText="Reanudar";

}
reiniciar.onclick= function reiniciar(){
    clearInterval(handler01);
    iniciar.disabled = false;
    pausar.disabled= true;
    iniciar.innerText="Iniciar";
    auxiliar=false;
    contador01=0;
    contador_segundos=0;
    contador_decenas_segundos =0;
    contador_minutos =0;
    contador_decenas_minutos=0;
    contador_decenas_horas=0;
    contador_horas=0;
    contador_milisegundos=0;
    contador_decenas_miilisegundos=0;
    milisegundos.innerText=0;
    decenas_milisegundos.innerText=0;
    unidades_minutos.innerText=0;
    decennas_minutos.innerText=0;
    unidades_seg.innerText=0;
    decenas_seg.innerText=0;

} 