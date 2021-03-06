package dao;

import classes.Produto;
import com.sun.jndi.ldap.Connection;
import java.sql.PreparedStatement;

public class ProdutoDAO {

    
    public static void insert(Produto produto){
     String sql = "INSERT INTO produto (descricao, preco, quantidade) VALUES (?, ?, ?)";
     
        try {
            java.sql.Connection conexao = ConexaoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, produto.getDescricao());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getQuantidade());
            stmt.execute();
                      
        } catch (Exception e) {
            System.out.println("Erro na função insert"+e.toString());
        }
    }
    public void update(){}
    public void delete(){}
    public void select(){}

}