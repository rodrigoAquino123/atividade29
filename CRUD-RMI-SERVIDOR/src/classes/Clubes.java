
package classes;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import interfaces.InterfaceClubes;


public class Clubes extends UnicastRemoteObject implements InterfaceClubes{
    
    public String Nome;
    public String Presidente;
    public String DataFundacao;
    
    
   public Clubes() throws RemoteException {
        System.out.print("A classe Clubes está disponível remotamente.");
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getPresidente() {
        return Presidente;
    }

    public void setPresidente(String Presidente) {
        this.Presidente = Presidente;
    }

    public String getDataFundacao() {
        return DataFundacao;
    }

    public void setDataFundacao(String DataFundacao) {
        this.DataFundacao = DataFundacao;
    }

    @Override
    public int getDataFundação() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

