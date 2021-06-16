public class Concessionaria {

    private VeiculoBuilder builder;

    /**
     * @param builder
     */
    public Concessionaria(VeiculoBuilder builder) {
        this.builder = builder;
    }

    
    public Veiculo comprar(TipoVeiculo tipo){

        builder.init();

        if(tipo.equals(TipoVeiculo.HATCH)){
            builder.comPortas(4);
            builder.comJanelas(2);
            builder.comRodas(4);
            builder.informarMarca("FIAT");
            builder.informarModelo("Argo");
            builder.informarAno(2017);
            builder.informarCor("Prata");
            builder.informarKm(65000);
            builder.informarPotencia(109);
            
        }else if(tipo.equals(TipoVeiculo.SUV)){

            builder.comPortas(4);
            builder.comJanelas(4);
            builder.comRodas(5);
            builder.informarMarca("Land Rover");
            builder.informarModelo("Range Rover Evoque");
            builder.informarAno(2021);
            builder.informarCor("Vermelho");
            builder.informarKm(1000);
            builder.informarPotencia(249);
        }else if(tipo.equals(TipoVeiculo.ESPORTIVO)){

            System.out.println("INFO::: concessionaria nao possui veiculo " + tipo + " no momento");
            return null;
        }

        return builder.build();

    }
}
