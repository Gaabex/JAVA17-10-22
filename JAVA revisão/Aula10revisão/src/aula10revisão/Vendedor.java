
package aula10revisão;

import javax.swing.JOptionPane;


public class Vendedor {
    private float vendas;
    private float salario;
    private String nome;
    private int falta;

    public Vendedor(float v,float s,String n,int f ){
        vendas = v;
        salario = s;
        nome = n;
        falta = f;
}

    //Metodo de Acesso
    public void setVendas(float v){
        vendas = v;
}
    public float getVendas(){
        return vendas;
}   

/////////////////////////////
    public void setSalario(float s){
        salario = s; 
}

    public float getSalario(){
        return salario;
}   

/////////////////////////////

    public void setNome(String n){
        nome = n;
}

    public String getNome(){
        return nome;
}   

/////////////////////////////
    public void setFalta(int f){
        falta = f;
}

    public int getFalta(){
        return falta;
}   

    public void imprimirDados(){
       JOptionPane.showMessageDialog(null, "Nome: "+nome+
                                           "\nVendas: "+vendas+
                                           "\nSalario: "+salario+
                                           "\nFalta: "+falta);
}

    public float calcularComissao(){
       if(vendas >= 1000 && vendas < 2000){
          return vendas*0.1f;
      }else if (vendas >= 2000){
          return vendas*0.15f;
      }
      return 0.0f;
}
    public float descontoFalta(){
       float desconto = (salario/30)*falta;
       return desconto;
    }
 
    public float calcularPagamento(){
       float pagamento = salario + calcularComissao() - descontoFalta();
       return pagamento;
    }
}
