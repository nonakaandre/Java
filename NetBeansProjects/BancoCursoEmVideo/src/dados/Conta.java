
package dados;

public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public Conta(int numConta, String tipo, String dono, float saldo, boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo = 0;
        this.status = status = false;
    }
    
    public String estadoAtual(){
        String retorno = "";
        retorno += "Número da conta: " + this.getNumConta() + "\n";
        retorno += "Tipo da conta é: " + this.getTipo() + "\n";
        retorno += "Titular da conta: " + this.getDono() + "\n";
        retorno += "Saldo disponível: " + this.getSaldo() + "\n";
        retorno += "Sua conta está: " + this.getStatus();
        
        return retorno;
    }
    
    public void abrirConta(String tipo){ 
        this.setTipo(tipo);
        this.setStatus(true);
        if ("CC".equals(tipo)) {
            this.setSaldo(50);
        }else if("CP".equals(tipo)) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso.");
    } 
    
    public void fecharConta() { 
        if (this.getSaldo() > 0) {
            System.out.println("Conta com diheiro.");
        } else if  (this.getSaldo() < 0) {
            System.out.println("Conta em debito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float v) {
        if (this.getStatus() == (true)) {
            //this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado com sucesso!");
        } else {
            System.out.println("É preciso abrir uma conta.");
        }
    }
    
    public void sacar(float v) { 
        /*if (status != false) {;
            if (saldo > v) {
                setSaldo(getSaldo() - v);
                System.out.println("Seu saldo atualizado é de: " + this.getSaldo());
        } else   
            System.out.println("Conta sem saldo!");
        } else 
            System.out.println("Impossivel sacar!");*/
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado conta de " + this.getDono());
            }else {
                System.out.println("Saldo insuficiente");
            }
        }else {
            System.out.println("A conta está fechada");
        }
    }
    
    public void pagarMesal() {
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v =20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso!");
        } else {
                System.out.println("Saldo insuficiente");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
    
}
