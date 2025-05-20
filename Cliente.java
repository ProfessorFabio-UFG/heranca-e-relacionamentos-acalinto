package L08;

package model;

public class Cliente extends PessoaFisica {
    private double renda;
    private String interesses;
    private String profissao;

    public Cliente(String nome, String endereco, String telefone, String cpf, char sexo, int estadoCivil,
                   double renda, String interesses, String profissao) {
        super(nome, endereco, telefone, cpf, sexo, estadoCivil);
        this.renda = renda;
        this.interesses = interesses;
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }
}

