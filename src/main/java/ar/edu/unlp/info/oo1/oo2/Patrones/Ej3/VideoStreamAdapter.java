package ar.edu.unlp.info.oo1.oo2.Patrones.Ej3;

public class VideoStreamAdapter implements Media{
	private VideoStream videoStream;
	
	public VideoStreamAdapter(VideoStream videoStream) {
		this.videoStream = videoStream;
	}

	public void play() {
		videoStream.reproducir();
	}
}
