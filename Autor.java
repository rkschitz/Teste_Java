import java.util.ArrayList;

public class Autor extends Pessoa {
    private String nacionalidade;
    private static ArrayList<Autor> autores = new ArrayList<Autor>();

    public Autor(String nome, String nacionalidade) {
        super(nome);
        this.nacionalidade = nacionalidade;
        autores.add(this);
    }

    public Autor(String nome){
        this(nome, "Brasil");
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public String setNacionalidade(){
        return this.nacionalidade;
    }

    public String getNacionalidade(){
        return this.nacionalidade;
    }
    public static ArrayList<Autor> getAutores(){
        return autores;
    }

    public String toString() {
        return "Nome: " + this.nome;
    }

    public static void listarAutores() {
        for (int i = 0; i < autores.size(); i++) {
            System.out.println(i + " - " + autores.get(i).toString());
        }
    }
}