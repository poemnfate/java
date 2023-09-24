package abstest;

public class RemoteControlTest {

	public static void main(String[] args) {
		
		Audio audio=new Audio();
		Television tv=new Television();
		
		audio.setVolume(5);
		tv.setVolume(15);
		
		System.out.println("현재 Audio 볼륨(get) : "+audio.getVolume());
		System.out.println("현재 Tv 볼륨(get) : "+tv.getVolume());
		
		Audio audio2=new Audio(10);
		Television tv2=new Television(1);
		
		System.out.println("현재 Audio 볼륨(get) : "+audio2.getVolume());
		System.out.println("현재 Tv 볼륨(get) : "+tv2.getVolume());
	}

}
