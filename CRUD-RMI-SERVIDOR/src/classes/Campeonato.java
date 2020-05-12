
package classes;

import interfaces.InterfaceCampeonato;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class Campeonato extends UnicastRemoteObject implements InterfaceCampeonato{
    
    public String Nome;
    public int NumClubes;
    public String Duracao;
    
    public Campeonato() throws RemoteException {
        System.out.print("A classe campeonato está disponível remotamente.");
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getNumClubes() {
        return NumClubes;
    }

    public void setNumClubes(int NumClubes) {
        this.NumClubes = NumClubes;
    }

    public String getDuracao() {
        return Duracao;
    }

    public void setDuracao(String Duracao) {
        this.Duracao = Duracao;
    }

   
    

}
