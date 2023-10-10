package creaciondeobjeto;

public class ObjetoJava {
    private int atributo1;
    private String atributo2;
    
    // Definir comportamiento      
    // (métodos que emitan mensajes)

    public ObjetoJava(int atributo1, String atributo2) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
    }

    public int getAtributo1() {
        return atributo1;
    }

    public void setAtributo1(int atributo1) {
        this.atributo1 = atributo1;
    }

    public String getAtributo2() {
        return atributo2;
    }

    public void setAtributo2(String atributo2) {
        this.atributo2 = atributo2;
    }
    
    public void mostrarValores() {
        System.out.println("Estos son  los valores de las variables miembro. Atributo1: " + getAtributo1() + " y Atributo2: " + getAtributo2());
    }   
}