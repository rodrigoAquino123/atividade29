
package classes;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import interfaces.InterfaceJogador;

public class Jogador extends UnicastRemoteObject implements InterfaceJogador{
    
    public String Nome;
    public String PosicaoJogo;
    public String Time;
    public int Ncamisa;
    
    public Jogador() throws RemoteException {
        System.out.print("A classe Jogador está disponível remotamente.");
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getPosicaoJogo() {
        return PosicaoJogo;
    }

    public void setPosicaoJogo(String PosicaoJogo) {
        this.PosicaoJogo = PosicaoJogo;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    public int getNcamisa() {
        return Ncamisa;
    }

    public void setNcamisa(int Ncamisa) {
        this.Ncamisa = Ncamisa;
    }

    
}

