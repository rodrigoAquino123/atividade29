
package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface InterfaceCampeonato extends Remote{
    
    public String getNome() throws RemoteException;
    public void setNome(String Nome) throws RemoteException;
    public int getNumClubes() throws RemoteException;
    public void setNumClubes(int NumClubes) throws RemoteException;
    public String getDuracao() throws RemoteException;
    public void setDuracao(String Duracao) throws RemoteException;
    
    
}
