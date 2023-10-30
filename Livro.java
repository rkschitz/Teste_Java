import java.util.ArrayList;

public class Livro extends Midia {
    private Autor autor;

    private static ArrayList<Livro> livros = new ArrayList<>();

    public Livro(String titulo, Autor autor, boolean disponivel) {
        super(titulo, disponivel);
        this.autor = autor;
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

    // public void emprestar() throws Exception {
    //     if (!this.disponivel) {
    //         throw new Exception("Livro não está disponível");
    //     }
    //     this.disponivel = false;
    // }

    // public void devolver() throws Exception {
    //     if (this.disponivel) {
    //         throw new Exception("Livro já está disponível");
    //     }
    //     this.disponivel = true;
    // }
}
