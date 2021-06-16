public class Cliente {

    public static void main(String[] args) {

        var builder = new VeiculoBuilderImpl();

        var concessionaria = new Concessionaria(builder);

        var Hatch = concessionaria.comprar(TipoVeiculo.HATCH);
        System.out.println("\n\n");
        System.out.println(Hatch);
        System.out.println();

        var suv = concessionaria.comprar(TipoVeiculo.SUV);
        System.out.println(suv);
        System.out.println();

        var esportivo = concessionaria.comprar(TipoVeiculo.ESPORTIVO);
        


        
    }
    
}
