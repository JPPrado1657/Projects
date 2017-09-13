import sun.audio.*;
import java.io.*;
public class Sound {

	private InputStream in;
	private AudioStream as;
	
	public Sound() throws IOException, FileNotFoundException{
		in = new FileInputStream("Imagenes/beat.wav");
		as= new AudioStream(in);
		this.play();
	}
	
	public void play(){
		AudioPlayer.player.start(as);
	}
	
	public void stop(){
		AudioPlayer.player.stop(as);
	}
	
}