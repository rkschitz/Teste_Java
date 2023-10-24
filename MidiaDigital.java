public class MidiaDigital{
    private String album;
    private Midia midia;

    public MidiaDigital(String titulo, boolean disponivel, String album){
        this.midia = new Midia(titulo, disponivel);
        this.album = album;
    }

    public String getAlbum(){
        return this.album;
    }

    public void setAlbum(String album){
        this.album = album;
    }

    public String toString(){
        return "Titulo: " + this.midia.titulo + " Album: " + this.album;
    }
}
