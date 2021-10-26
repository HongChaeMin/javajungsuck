package minHong.chapter7.quiz;

class MyTv {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public boolean getIsPowerOn() {
		return isPowerOn;
	}
	public void setIsPowerOn() {
		this.isPowerOn = !this.isPowerOn;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		if (channel < MIN_CHANNEL || channel > MAX_VOLUME) return;
		this.prevChannel = this.channel;
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		if (volume < MIN_VOLUME || volume > MAX_VOLUME) return;
		this.volume = volume;
	}
	
	// 7-5
	public void gotoPrevChannel() {
		setChannel(this.prevChannel); // tmp 역할
	}
}

public class Quiz04 {

	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.setChannel(10);
		System.out.println("CH : " + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL : " + t.getVolume());
		
		System.out.println();
		// 7-5
		t.setChannel(10);
		System.out.println("CH : " + t.getChannel());
		t.setChannel(20);
		System.out.println("CH : " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH : " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH : " + t.getChannel());
	}

}
