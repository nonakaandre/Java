package motocicletas;

public class Motos {

    private String fabricante;
    private String modelo;
    private int ano;
    private String cor;
    private int cilindrada;
    private boolean ligada;

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    @Override
    public String toString() {
        return "Fabricante: " + fabricante
                + "\nModelo: " + modelo
                + "\nAno: " + ano
                + "\nCor: " + cor
                + "\nAro: " + cilindrada
                + "\nLigada: " + ligada;
        
    }

    public void dirigir() {
        if (ligada) {
            System.out.println("Estou dirigindo!");
        } else {
            System.out.println("É preciso ligar o moto!");
        }
    }

    public void ligada() {
        this.ligada = true;
    }

    public void desligada() {
        this.ligada = false;
    }
}
