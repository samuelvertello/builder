public interface VeiculoBuilder {

    void init();

    void comPortas(Integer portas);
    void comJanelas(Integer janelas);
    void comRodas(Integer rodas);
    void informarMarca(String marca);
    void informarModelo(String modelo);
    void informarAno(Integer ano);
    void informarKm(Integer km);
    void informarPotencia(Integer potenciaEmHp);
    void informarCor(String cor);

    Veiculo build();

}
