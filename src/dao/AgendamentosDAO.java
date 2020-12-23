
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import model.Agendamentos;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AgendamentosDAO {
    
    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private ArrayList<Agendamentos> lista = new ArrayList<Agendamentos>();
    
    public AgendamentosDAO(){
        conn = new ConnectionFactory().getConexao();
    }
    
    public void inserir(Agendamentos agendamentos){
        String sql = "INSERT INTO agendamentos (nome_cliente, email_cliente, descricao_servico, valor, data_ida, data_retorno, observacao) VALUES(?,?,?,?,?,?,?)";
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, agendamentos.getNome_cliente());
            stmt.setString(2, agendamentos.getEmail_cliente());
            stmt.setString(3, agendamentos.getDescricao_servico());
            stmt.setDouble(4, agendamentos.getValor());
            stmt.setString(5, agendamentos.getData_ida());
            stmt.setString(6, agendamentos.getData_retorno());
            stmt.setString(7, agendamentos.getObservacao());
            stmt.execute();
            stmt.close();
            
     }catch(SQLException erro) {
        throw new RuntimeException("Erro 2" + erro);
        }
    }
    
     public void alterar(Agendamentos agendamentos){
        String sql = "UPDATE agendamentos SET nome_cliente = ?, email_cliente = ?, descricao_servico = ?, valor = ?, data_ida = ?, data_retorno = ?, observacao = ? WHERE codigo_agendamento = ?";
        try{
            stmt = conn.prepareStatement(sql);            
           
            stmt.setString(1, agendamentos.getNome_cliente());
            stmt.setString(2, agendamentos.getEmail_cliente());
            stmt.setString(3, agendamentos.getDescricao_servico());
            stmt.setDouble(4, agendamentos.getValor());
            stmt.setString(5, agendamentos.getData_ida());
            stmt.setString(6, agendamentos.getData_retorno());
            stmt.setString(7, agendamentos.getObservacao());
            stmt.setInt(8, agendamentos.getCodigo_agendamento());
            stmt.execute();
            stmt.close();
            
     }catch(SQLException erro) {
        throw new RuntimeException("Erro 3" + erro);
        }
    }
     
      public void excluir(int valor){
        String sql = "DELETE FROM agendamentos WHERE codigo_agendamento = " + valor;
        try{
            st = conn.createStatement();
            st.execute(sql);
            st.close();
     }catch(SQLException erro) {
        throw new RuntimeException("Erro 4" + erro);
        }
    }
      
      public ArrayList<Agendamentos> listarTodos(){
          String sql = "SELECT * FROM agendamentos";
          try {  
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Agendamentos agendamentos = new Agendamentos();                
                agendamentos.setCodigo_agendamento(rs.getInt("codigo_agendamento"));
                agendamentos.setNome_cliente(rs.getString("nome_cliente"));
                agendamentos.setEmail_cliente(rs.getString("email_cliente"));
                agendamentos.setDescricao_servico(rs.getString("descricao_servico"));
                agendamentos.setValor(rs.getDouble("valor"));
                agendamentos.setData_ida(rs.getString("data_ida"));
                agendamentos.setData_retorno(rs.getString("data_retorno"));
                agendamentos.setObservacao(rs.getString("observacao"));
                lista.add(agendamentos);                
            }        
            
     }catch(SQLException erro) {
        throw new RuntimeException("Erro 5" + erro);
      }
          return lista;
     }
      
        public ArrayList<Agendamentos> listarTodosDescricao(String valor){
          String sql = "SELECT * FROM agendamentos WHERE nome_cliente LIKE '%"+valor+"%' ";
          try {  
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){                
                Agendamentos agendamentos = new Agendamentos();                      
                agendamentos.setCodigo_agendamento(rs.getInt("codigo_agendamento"));
                agendamentos.setNome_cliente(rs.getString("nome_cliente"));
                agendamentos.setEmail_cliente(rs.getString("email_cliente"));
                agendamentos.setDescricao_servico(rs.getString("descricao_servico"));
                agendamentos.setValor(rs.getDouble("valor"));
                agendamentos.setData_ida(rs.getString("data_ida"));
                agendamentos.setData_retorno(rs.getString("data_retorno"));
                agendamentos.setObservacao(rs.getString("observacao"));
                lista.add(agendamentos);                     
            }        
            
     }catch(SQLException erro) {
        throw new RuntimeException("Erro 6" + erro);
      }
          return lista;
     }
        
}
    

    
    

