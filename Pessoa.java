import java.util.ArrayList;

public class Pessoa {
    protected String nome;
    private static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    public Pessoa(String nome) {
        this.nome = nome;
        pessoas.add(this);
    }
    
    public void setNome(String nome){
        this.nome = nome;
        pessoas.add(this);
    }

    public String getNome(){
        return this.nome;
    }

    public String toString() {
        return "Nome: " + this.nome;
    }

}
