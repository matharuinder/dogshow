package ca.sheridancollege.Beans;

public class ShowList {
	
	private int num;
	private String breed;
	private int mc;
	private int fc;
	private int ms;
	private int fs;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getMc() {
		return mc;
	}
	public void setMc(int mc) {
		this.mc = mc;
	}
	public int getFc() {
		return fc;
	}
	public void setFc(int fc) {
		this.fc = fc;
	}
	public int getMs() {
		return ms;
	}
	public void setMs(int ms) {
		this.ms = ms;
	}
	public int getFs() {
		return fs;
	}
	public void setFs(int fs) {
		this.fs = fs;
	}
	public ShowList(int num, String breed, int mc, int fc, int ms, int fs) {
		super();
		this.num = num;
		this.breed = breed;
		this.mc = mc;
		this.fc = fc;
		this.ms = ms;
		this.fs = fs;
	}
	public ShowList() {
		super();
	}
	@Override
	public String toString() {
		return "ShowList [num=" + num + ", breed=" + breed + ", mc=" + mc + ", fc=" + fc + ", ms=" + ms + ", fs=" + fs
				+ "]";
	}
	
	

}
