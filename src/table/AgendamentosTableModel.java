
package table;


import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Agendamentos;


public class AgendamentosTableModel extends AbstractTableModel {
    
    public static final int COL_CODIGO_AGENDAMENTO = 0;
    public static final int COL_NOME_CLIENTE = 1;
    public static final int COL_EMAIL_CLIENTE = 2;
    public static final int COL_DESCRICAO_SERVICO = 3;
    public static final int COL_VALOR = 4;
    public static final int COL_DATA_IDA = 5;
    public static final int COL_DATA_RETORNO = 6;
    public static final int COL_OBSERVACAO = 7;
    public ArrayList<Agendamentos> lista;
    
    public AgendamentosTableModel(ArrayList<Agendamentos>l){
        lista = new ArrayList<Agendamentos>(l);
    }
    
    @Override
    public int getRowCount() {
        return lista.size();        
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Agendamentos agendamentos =  lista.get(linhas);        
        if (colunas == COL_CODIGO_AGENDAMENTO) return agendamentos.getCodigo_agendamento();
         if (colunas == COL_NOME_CLIENTE) return agendamentos.getNome_cliente();
          if (colunas == COL_EMAIL_CLIENTE) return agendamentos.getEmail_cliente();
           if (colunas == COL_DESCRICAO_SERVICO) return agendamentos.getDescricao_servico();
            if (colunas == COL_VALOR) return agendamentos.getValor();
             if (colunas == COL_DATA_IDA) return agendamentos.getData_ida();
              if (colunas == COL_DATA_RETORNO) return agendamentos.getData_retorno();
               if (colunas == COL_OBSERVACAO) return agendamentos.getObservacao();
       
        return "";
    }
    
    @Override
    public String getColumnName(int colunas) {
        if (colunas == COL_CODIGO_AGENDAMENTO) return "Código";
         if (colunas == COL_NOME_CLIENTE) return "Nome";
          if (colunas == COL_EMAIL_CLIENTE) return "Email";
           if (colunas == COL_DESCRICAO_SERVICO) return "Serviço";
            if (colunas == COL_VALOR) return "Valor";
             if (colunas == COL_DATA_IDA) return "Data de ída";
              if (colunas == COL_DATA_RETORNO) return "Data de retorno";
               if (colunas == COL_OBSERVACAO) return "Observação";
               
        return "";   
    }
    
}
