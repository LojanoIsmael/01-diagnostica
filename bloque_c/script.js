
const inputNombre = document.querySelector('#input-nombre')
const btnSaludar = document.querySelector('#btn-saludar')
const btnLimpiar = document.querySelector('#btn-limpiar')
const mensajeResultado = document.querySelector('#mensaje-resultado')

// TODO: C3. Declara una función nombrada para procesar el saludo
function generarSaludo() {

    const nombre = inputNombre.value;
    if (nombre === ""){
        mensajeResultado.textContent = "Ingrese su nombre";    
    }else{
        mensajeResultado.textContent = "Hola, " + nombre + " Bienvenido a la UETS";
    }

}

btnSaludar.addEventListener("click", generarSaludo);
btnLimpiar.addEventListener("click", function(){
    inputNombre.value = "";
    mensajeResultado.textContent= "Esperando";
}
);
