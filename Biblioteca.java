import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private ArrayList<Livro> livros;

    private static ArrayList<Biblioteca> bibliotecas = new ArrayList<>();

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();

        bibliotecas.add(this);
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public static ArrayList<Biblioteca> getBibliotecas() {
        return bibliotecas;
    }

    public ArrayList<Livro> getLivros() {
        return this.livros;
    }

    public String toString() {
        return "Nome: " + this.nome;
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public void listarLivros() {
        for(int i = 0; i < this.livros.size(); i++) {
            System.out.println(i + " - " + this.livros.get(i).toString());
        }
    }

    public static void listarBibliotecas() {
        for(int i = 0; i < bibliotecas.size(); i++) {
            Biblioteca biblioteca = bibliotecas.get(i);
            System.out.println(i + " - " + biblioteca.toString());
            biblioteca.listarLivros();
        }
    }
}