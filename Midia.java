import java.util.ArrayList;

public class Midia {
    private String titulo;
    private boolean disponivel;
    private static ArrayList<Midia> midias = new ArrayList<Midia>();

    public Midia(String titulo, boolean disponivel) {
        this.titulo = titulo;
        this.disponivel = disponivel;
        midias.add(this);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public boolean getDisponivel() {
        return this.disponivel;
    }

    public void emprestar() {
        try {
            if (this.disponivel == false) {
                throw new Exception("Midia indisponível");
            }
            this.disponivel = false;
            System.out.println("Midia emprestada");
        } catch (Exception e) {
            {
                System.out.println("Midia indisponível");
            }
        }
    }

    public void devolver() {
        try {
            if (this.disponivel == true) {
                throw new Exception("Midia indisponível");
            }
            this.disponivel = true;
        } catch (Exception e) {
            {
                System.out.println("Midia indisponível");
            }
        }
    }

    public String toString(){
        return " Titulo: " + this.titulo + " Disponivel: " + this.disponivel;
    }
}