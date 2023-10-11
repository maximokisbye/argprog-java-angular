window.addEventListener("load", () => {
    const form = document.getElementById("formulario");
    const nombre = document.getElementById("nombre");
    const descripcion = document.getElementById("descripcion");
    const precio = document.getElementById("precio");

    form.addEventListener("submit", (e) =>{
        e.preventDefault();
        let valor = validaCampos();
        if(valor){
            form.submit();
        }
    })

    const validaCampos = () => {
        const nombreValor = nombre.value.trim();
        const descripcionValor = descripcion.value.trim();
        const precioValor = precio.value.trim();
        let resultado = false;
        if(nombreValor === ''){
            falla(nombre, "campo nombre vacio");

        }else if (!/^[A-Z]+$/i.test(nombreValor)){
            falla(nombre, "nombre contiene numeros");

        }else if (nombreValor.length > 30){
            falla(nombre, "nombre demasiado largo");

        }else{
            resultado = true;
            validado(nombre);
        }
        if(descripcionValor === ''){
            falla(descripcion, "campo descripcion vacio");
        }else{
            resultado = true;
            validado(descripcion);
        }
        if(precioValor === ''){
            falla(precio, "campo precio vacio");
        }else{
            resultado = true;
            validado(precio);
        }

        return resultado;
    }

    const falla = (entrada, mensaje) => {
        const control = entrada.parentElement;
        const aviso = control.querySelector('span')
        aviso.innerText = mensaje;
        control.className = "falla";
    }

    const validado = (entrada) =>{
        const control = entrada.parentElement;
        control.className = 'ok';
    }
})