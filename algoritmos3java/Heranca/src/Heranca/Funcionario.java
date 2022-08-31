package Heranca;

import java.util.Date;

public class Funcionario {

    // Atributos (Estao privados para garantir o encapsulamento das informaçoes de casa objeto)
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private float salario;

    public String getNome() {
        return nome;
    }

    // construtor
    // getters e setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
