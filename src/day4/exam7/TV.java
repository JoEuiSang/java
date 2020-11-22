package day4.exam7;

public class TV {
	int channel;
	int volume;
	boolean power;

	public TV() {
		channel = 7;
		volume = 20;
		power = false;
	}

	public void channelUp() {
		this.channel++;
	}

	public void channelDown() {
		this.channel--;
	}

	public void volumeUp() {
		this.volume++;
	}

	public void volumeDown() {
		this.volume--;
	}

	public void powerOn() {
		this.power = true;
	}

	public void powerOff() {
		this.power = false;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public boolean isPower() {
//		if(power==true) {
//			System.out.println("������ �����ս��ϴ�");
//		}else {
//			System.out.println("������ �����ս��ϴ�");
//		}
		return power;
	}

	public int getVolume() {
		return volume;
	}

}
