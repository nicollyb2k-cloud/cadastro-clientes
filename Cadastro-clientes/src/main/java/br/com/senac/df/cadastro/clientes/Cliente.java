/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.df.cadastro.clientes;

/**
 *
 * @author nicolly61484976
 */
public class Cliente {
private String codigo;
private String nome;
private String contato;
private boolean ativo;
private String cpf;
private String identidade;
private String dataNasc;
private String cnpj;
private String inscricaoEstadual;
private String endereco;
private String numero;
private String complemento;
private String cep;
private String bairro;
private String codigoCidade;
private String cidade;
private String sexo;
private String fone;
private String fax;
private String celular;
private String email;
private String codigoAtv;
private String atividade;
private String observacao;
private String emailLogin;
private String usuario;
private String senha;
private String confirmarSenha;

public Cliente ( String codigo, String nome, String contato, boolean ativo, String cpf, String identidade, String dataNasc, String cnpj, String inscricaoEstadual, String endereco, String numero, String complemento, String cep, String bairro, String codigoCidade, String cidade, 
String sexo, String fone, String fax, String celular, String email, String codigoAtv, String atividade,String observacao, String emailLogin, String usuario, String senha,String confirmarSenha) {       

        this.codigo = codigo;
        this.nome = nome;
        this.contato = contato;
        this.ativo = ativo;
        this.cpf = cpf;
        this.identidade = identidade;
        this.dataNasc = dataNasc;
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.bairro = bairro;
        this.codigoCidade = codigoCidade;
        this.cidade = cidade;
        this.sexo = sexo;
        this.fone = fone;
        this.fax = fax;
        this.celular = celular;
        this.email = email;
        this.codigoAtv = codigoAtv;
        this.atividade = atividade;
        this.observacao = observacao;
        this.emailLogin = emailLogin;
        this.usuario = usuario;
        this.senha = senha;
        this.confirmarSenha = confirmarSenha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCodigoCidade() {
        return codigoCidade;
    }

    public void setCodigoCidade(String codigoCidade) {
        this.codigoCidade = codigoCidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodigoAtv() {
        return codigoAtv;
    }

    public void setCodigoAtv(String codigoAtv) {
        this.codigoAtv = codigoAtv;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getEmailLogin() {
        return emailLogin;
    }

    public void setEmailLogin(String emailLogin) {
        this.emailLogin = emailLogin;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfirmarSenha() {
        return confirmarSenha;
    }

    public void setConfirmarSenha(String confirmarSenha) {
        this.confirmarSenha = confirmarSenha;
    }

 
}
