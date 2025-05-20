package L08;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Funcionario> funcionarios;
    private List<Cliente> clientes;
    private List<Fornecedor> fornecedores;

    public Loja() {
        funcionarios = new ArrayList<>();
        clientes = new ArrayList<>();
        fornecedores = new ArrayList<>();
    }

    public void empregar(Funcionario f) {
        funcionarios.add(f);
        System.out.println("FUNCIONÁRIO EMPREGADO: " + f.getNome().toUpperCase());
    }

    public void demitir(Funcionario f) {
        funcionarios.remove(f);
        System.out.println("FUNCIONÁRIO DEMITIDO: " + f.getNome().toUpperCase());
    }

    public void cadastrarCliente(Cliente c) {
        clientes.add(c);
        System.out.println("CLIENTE CADASTRADO: " + c.getNome().toUpperCase());
    }

    public void cadastrarFornecedor(Fornecedor f) {
        fornecedores.add(f);
        System.out.println("FORNECEDOR CADASTRADO: " + f.getNome().toUpperCase());
    }
}
