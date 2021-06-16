/**
 * Veiculo
 */
public class Veiculo {

    private int portas;
    private int janelas;
    private int rodas;
    private String marca;
    private String modelo;
    private int ano;
    private int km;
    private int potenciaEmHp;
    private String cor;
   
    /**
     * 
     */
    public Veiculo() {

    }
    /**
     * @return the portas
     */
    public int getPortas() {
        return portas;
    }
    /**
     * @param portas the portas to set
     */
    public void setPortas(int portas) {
        this.portas = portas;
    }
    /**
     * @return the janelas
     */
    public int getJanelas() {
        return janelas;
    }
    /**
     * @param janelas the janelas to set
     */
    public void setJanelas(int janelas) {
        this.janelas = janelas;
    }
    /**
     * @return the rodas
     */
    public int getRodas() {
        return rodas;
    }
    /**
     * @param rodas the rodas to set
     */
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }
    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }
    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }
    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }
    /**
     * @return the km
     */
    public int getKm() {
        return km;
    }
    /**
     * @param km the km to set
     */
    public void setKm(int km) {
        this.km = km;
    }
    /**
     * @return the potenciaEmHp
     */
    public int getPotenciaEmHp() {
        return potenciaEmHp;
    }
    /**
     * @param potenciaEmHp the potenciaEmHp to set
     */
    public void setPotenciaEmHp(int potenciaEmHp) {
        this.potenciaEmHp = potenciaEmHp;
    }
    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }
    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "Veiculo [ano=" + ano + ", cor=" + cor + ", janelas=" + janelas + ", km=" + km + ", marca=" + marca
                + ", modelo=" + modelo + ", portas=" + portas + ", potenciaEmHp=" + potenciaEmHp + ", rodas=" + rodas
                + "]";
    }

    

    

    

    
}