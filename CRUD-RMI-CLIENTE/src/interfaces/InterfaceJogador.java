package Interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceJogador extends Remote{
    
    public String getNome()  throws RemoteException;
    public void setNome(String Nome)  throws RemoteException;
    public String getPosicaoJogo() throws RemoteException;
    public void setPosicaoJogo(String posicaoJogo) throws RemoteException;
    public String getTime() throws RemoteException;
    public void setTime(String Time)  throws RemoteException;
    public int getNcamisa() throws RemoteException;
    public void setNcamisa(int Ncamisa) throws RemoteException;
    
}
