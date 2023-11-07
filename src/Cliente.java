public class Cliente {
    private String nome;
    private float CPF;

    public Cliente(String nome, float CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public float getCPF() {
        return CPF;
    }
}
