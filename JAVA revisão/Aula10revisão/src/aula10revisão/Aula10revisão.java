package aula10revisão;


public class Aula10revisão {


    public static void main(String[] args) {
        Vendedor v1 = new Vendedor(2500,1500,"Fulano",0);

    v1.imprimirDados();
        System.out.println("O seu pagameno será de: "+v1.calcularPagamento());
        System.out.println("O sua comissão será de: "+v1.calcularComissao());
    

    v1.setNome("Ciclano");
    v1.setSalario(1800);
    v1.setVendas(1800);
    v1.setFalta(3);

    v1.imprimirDados();
        System.out.println("O seu pagameno será de: "+v1.calcularPagamento());
        System.out.println("O sua comissão será de: "+v1.calcularComissao());

        System.out.println(v1.getNome());
      
    }
    
}
