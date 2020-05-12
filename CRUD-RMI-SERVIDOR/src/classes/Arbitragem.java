
package classes;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import interfaces.InterfaceArbitro;

public class Arbitragem extends UnicastRemoteObject  implements InterfaceArbitro{
    
    public String Nome;
    public String Federacao;
    public double TipoDeCargo;
    public int Idade;
    
    public Arbitragem() throws RemoteException{
        System.out.println("A classe arbitragem está disponível remotamente.");
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getFederacao() {
        return Federacao;
    }

    public void setFederacao(String Federacao) {
        this.Federacao = Federacao;
    }

    public double getTipoDeCargo() {
        return TipoDeCargo;
    }

    public void setTipoDeCargo(double TipoDeCargo) {
        this.TipoDeCargo = TipoDeCargo;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }
    
}

