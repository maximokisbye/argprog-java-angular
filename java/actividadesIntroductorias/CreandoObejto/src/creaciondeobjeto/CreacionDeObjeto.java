package creaciondeobjeto;

public class CreacionDeObjeto {

    public static void main(String[] args) {
        // Crear un objeto de tipo Objeto
        ObjetoJava objeto = new ObjetoJava(40,"Carlos");
        // convocar a sus comportamientos
        objeto.getAtributo1();
        objeto.getAtributo2();
        objeto.setAtributo1(32);
        objeto.setAtributo2("Marcos");
        objeto.mostrarValores();
    }
}   