
package aula10revisão.exer02;


public abstract class Programador extends Empregado{
    //Atributos
    private float qtdHoras;
    private float valorHora;

    public Programador(String n, String m, float qH, float vH){
        nome = n;
        matricula = m;
        qtdHoras = qH;
        valorHora = vH;
}
    //Metodos de Acesso 
    public float getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(float qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }


    
    public float calculaSalario(){
        return qtdHoras*valorHora;
}

}
