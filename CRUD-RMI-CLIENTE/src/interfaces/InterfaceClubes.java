/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author rober
 */
public interface InterfaceClubes extends Remote{
    
    public String getNome() throws RemoteException;
    public void setNome(String nome) throws RemoteException;
    public String getPresidente() throws RemoteException;
    public void setPresidente(String Presidente)throws RemoteException;
    public int getDataFundação()throws RemoteException;
    public void setDataFundacao(String DataFundacao)throws RemoteException;
    
    
}
