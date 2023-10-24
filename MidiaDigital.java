public class MidiaDigital extends Midia {
    private String album;

    public MidiaDigital(String titulo, boolean disponivel, String album){
        super(titulo, disponivel);
        this.album = album;
    }

    public String getAlbum(){
        return this.album;
    }

    public void setAlbum(String album){
        this.album = album;
    }

    public String toString(){
        return "Titulo: " + this.titulo + " Album: " + this.album;
    }
}
