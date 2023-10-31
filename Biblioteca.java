import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private ArrayList<Livro> livros;
    private ArrayList<Midia> midias = new ArrayList<>();

    private static ArrayList<Biblioteca> bibliotecas = new ArrayList<>();

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();

        bibliotecas.add(this);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public ArrayList<Midia> getMidia() {
        return this.midias;
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

    public void adicionarMidia(Midia midia) {
        this.midias.add(midia);
    }

    public void listarLivros() {
        for (int i = 0; i < this.livros.size(); i++) {
            System.out.println(i + " - " + this.livros.get(i).toString());
        }
    }

    public void listarMidias() {
        for (int i = 0; i < this.midias.size(); i++) {
            System.out.println(i + " - " + this.midias.get(i).toString());
        }
    }

    public static void listarBibliotecas() {
        for (int i = 0; i < bibliotecas.size(); i++) {
            Biblioteca biblioteca = bibliotecas.get(i);
            System.out.println(i + " - " + biblioteca.toString());
        }
    }

}