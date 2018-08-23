/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tocadormp3;

import java.awt.Image;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 *
 * @author maivo
 */
public class Musica {
    private String titulo;
    private String artista;
    private Image imagem;
    private Media media;
    private MediaPlayer mediaPlayer;
    
    public Musica(String urlMusica){
        media = new Media(urlMusica);  
        mediaPlayer = new MediaPlayer(media);
    }
    public MediaPlayer getMediaPlayer(){
        return mediaPlayer;
    }
}
