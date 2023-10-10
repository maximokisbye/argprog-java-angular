function agregarMaterial() {
    var materialInput = document.getElementById("material");
    var material = materialInput.value;

    if (material === "") {
        alert("Ingresar material no vacío");
        return;
    }

    var listaMateriales = document.getElementById("listaMateriales");
    var nuevoMaterial = document.createElement("li");
    nuevoMaterial.appendChild(document.createTextNode(material));
    listaMateriales.appendChild(nuevoMaterial);

    materialInput.value = "";       // limpiar cuadro de texto
}