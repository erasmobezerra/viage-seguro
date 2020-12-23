
package model;

public class Agendamentos {
    
    private int codigo_agendamento;
    private String nome_cliente;
    private String email_cliente;
    private String descricao_servico;
    private double valor;
    private String data_ida;
    private String data_retorno;
    private String observacao;

    public int getCodigo_agendamento() {
        return codigo_agendamento;
    }

    public void setCodigo_agendamento(int codigo_agendamento) {
        this.codigo_agendamento = codigo_agendamento;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getEmail_cliente() {
        return email_cliente;
    }

    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }

    public String getDescricao_servico() {
        return descricao_servico;
    }

    public void setDescricao_servico(String descricao_servico) {
        this.descricao_servico = descricao_servico;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData_ida() {
        return data_ida;
    }

    public void setData_ida(String data_ida) {
        this.data_ida = data_ida;
    }

    public String getData_retorno() {
        return data_retorno;
    }

    public void setData_retorno(String data_retorno) {
        this.data_retorno = data_retorno;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
   
   
    
}
