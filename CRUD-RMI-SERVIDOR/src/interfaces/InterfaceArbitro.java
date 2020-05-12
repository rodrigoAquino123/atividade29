/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceArbitro extends Remote{
    
    public String getNome() throws RemoteException;
    public void setNome(String Nome) throws RemoteException;
    public String getFederacao()  throws RemoteException;
    public void setFederacao(String Federacao) throws RemoteException;
    public double getTipoDeCargo() throws RemoteException;
    public void setTipoDeCargo(double PrecoPrato) throws RemoteException;
    public int getIdade() throws RemoteException;
    public void setIdade(int Idade) throws RemoteException;

}

