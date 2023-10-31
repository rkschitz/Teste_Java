import java.util.ArrayList;

public class MidiaDigital extends Midia{
    private String album;
    private static ArrayList<MidiaDigital> midiasDigitais = new ArrayList<MidiaDigital>();

    public MidiaDigital(String titulo, String album, boolean disponivel){
        super(titulo, disponivel);
        this.album = album;
        midiasDigitais.add(this);
    }

    public String getAlbum(){
        return this.album;
    }

    public void setAlbum(String album){
        this.album = album;
    }

    public String toString(){
        return " Album: " + this.album + super.toString();
    }

    public static ArrayList<MidiaDigital> getMidiasDigitais(){
        return midiasDigitais;
    }

    public static void listarMidiasDigitais(){
        for(int i = 0; i < midiasDigitais.size(); i++){
            System.out.println(i + " - " + midiasDigitais.get(i).toString());
        }
    }
}
