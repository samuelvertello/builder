public class VeiculoBuilderImpl implements VeiculoBuilder{

    private Veiculo veiculo;

    @Override
    public void init() {
        
        this.veiculo = new Veiculo();
    }

    @Override
    public void comPortas(Integer portas) {

        veiculo.setPortas(portas);
        
    }

    @Override
    public void comJanelas(Integer janelas) {

        veiculo.setJanelas(janelas);
        
    }

    @Override
    public void comRodas(Integer rodas) {
        
        veiculo.setRodas(rodas);
        
    }

    @Override
    public void informarMarca(String marca) {
       
        veiculo.setMarca(marca);
        
    }

    @Override
    public void informarModelo(String modelo) {
        
        veiculo.setModelo(modelo);
        
    }

    @Override
    public void informarAno(Integer ano) {
        
        veiculo.setAno(ano);
        
    }

    @Override
    public void informarKm(Integer km) {
        
        veiculo.setKm(km);
        
    }

    @Override
    public void informarPotencia(Integer potenciaEmHp) {
        
        veiculo.setPotenciaEmHp(potenciaEmHp);
        
    }

    @Override
    public void informarCor(String cor) {
        
        veiculo.setCor(cor);
        
    }

    @Override
    public Veiculo build() {
        
        return veiculo;
    }

    
}
