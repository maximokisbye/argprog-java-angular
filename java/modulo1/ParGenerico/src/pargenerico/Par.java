package pargenerico;

public class Par<T, U> {

    // definir variables miembro
   private T primerElemento;
   private U segundoElemento;

    public Par(T primerElemento, U segundoElemento) {
        // inicializar variables miembro
        this.primerElemento = primerElemento;
        this.segundoElemento = segundoElemento;
    }

    // completar el codigo de los metodos set y get de cada variable miembro
    public T getPrimerElemento() {
        return primerElemento;
    }

    public void setPrimerElemento(T primerElemento) {
        this.primerElemento = primerElemento;
    }

    public U getSegundoElemento() {
        return segundoElemento;
    }

    public void setSegundoElemento(U segundoElemento) {
        this.segundoElemento = segundoElemento;
    }

    @Override
    public String toString() {
        return "Primer elemento = " + primerElemento + ", Segundo elemento = " + segundoElemento;
    }   
}