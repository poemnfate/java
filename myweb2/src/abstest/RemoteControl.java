package abstest;

public interface RemoteControl {
	
	int MAX_VOLUME=10; //상수 변수명은 모두 대문자로
	int MIN_VOLUME=0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	

}
