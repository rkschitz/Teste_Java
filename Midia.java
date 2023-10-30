import java.util.ArrayList;

public class Midia{
    protected String titulo;
    protected boolean disponivel;
    private static ArrayList<Midia> midias = new ArrayList<Midia>();

    public Midia(String titulo, boolean disponivel){
        this.titulo = titulo;
        this.disponivel = disponivel;
        midias.add(this);
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public boolean getDisponivel(){
        return this.disponivel;
    }

    public void emprestar(){
        try{
            if(this.disponivel == false){
                throw new Exception("Midia indisponível");
            }
            this.disponivel = false;
        } catch(Exception e){ {
            System.out.println("Midia indisponível");
            }
       }
    }
}