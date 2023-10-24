import java.util.ArrayList;

public class Livro {
    private String titulo;
    private Autor autor;
    private boolean disponivel;

    private static ArrayList<Livro> livros = new ArrayList<>();
    private static ArrayList<Livro> livrosEmprestados = new ArrayList<>();
    private static ArrayList<Livro> livrosDisponiveis = new ArrayList<>();

    public Livro(String titulo, Autor autor, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;

        livros.add(this);
    }

    public String getAutor(){
        return this.autor.getNome();
    }

    public void setAutor(Autor autor){
        this.autor = autor;
    }

    public String toString() {
        return "Título: " + this.titulo 
            + ". Autor: " + this.autor.getNome() 
            + ". Disponível: " + (this.disponivel ? "Sim" : "Não");
    }

    public static void listarLivros() {
        for(int i = 0; i < livros.size(); i++) {
            System.out.println(i + " - " + livros.get(i).toString());
        }
    }

    public void emprestar() throws Exception {
        if (!this.disponivel) {
            throw new Exception("Livro não está disponível");
        }
        this.disponivel = false;
    }

    public void devolver() throws Exception {
        if (this.disponivel) {
            throw new Exception("Livro já está disponível");
        }
        this.disponivel = true;
    }
}
