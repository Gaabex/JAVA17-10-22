
package aula10revisão.exer02;

public abstract class Empregado {
    //Atributos
    protected String nome;
    protected String matricula;

    public Empregado(){}

    public Empregado (String n, String m){
        nome = n;
        matricula = m; 

}

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    
     
    public abstract float calcularSalario();


}
