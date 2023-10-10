document.addEventListener('DOMContentLoaded', function() {
    const numerosImparesDiv = document.getElementById('impares');
    
    // Función para mostrar los números impares del 1000 al 300 en forma descendente
    function mostrarNumerosImpares() {
        for (let i = 1000; i >= 300; i--) {
            if (i % 2 !== 0) {
                const numeroImpar = document.createElement('p');
                numeroImpar.textContent = i;
                numerosImparesDiv.appendChild(numeroImpar);
            }
        }
    }
    mostrarNumerosImpares();
});