package dp.structural.Adapter;

public class Mp4Player implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		// do nothing}
	}
	
	@Override
	public void playMp4(String fileName) {
		System.out.println("playing mp4 : " + fileName);
	}

}
