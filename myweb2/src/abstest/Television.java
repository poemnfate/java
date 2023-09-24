package abstest;

public class Television implements RemoteControl {
	
	private int volume; // 생성자 or setter 메소드
	
	public Television() {
		
	}
	
	public Television(int volume) {
		super();
		setVolume(volume);
	}

	@Override
	public void setVolume(int volume) {
		
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("현재 TV 볼륨 : "+this.volume);

	}

	public int getVolume() {
		return volume;
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");

	}

	@Override
	public void turnOff() {
		System.out.println("TV를 씁니다.");
	}

	

	

}
