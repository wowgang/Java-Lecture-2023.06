package ch06_class;

public class Melon {
	// 속성, attrubute, 주로 접근제한을 private 로 설정함.
	private int rank;
	private String title;
	private String artist;
	private String album;
	private String imgUrl;
	
	
	public Melon() { } // 빈생성자를 하나 더 만들어 줘야한다. 
	// 생성자, constructor -> 생성자를 만들고 빈생성자 만들기 
	// 인스턴스를 만들때 쓰이는데 생성자 


	public Melon(int rank, String title, String artist, String album, String imgUrl) {
		super();
		this.rank = rank;
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.imgUrl = imgUrl;
	}

	// 메서드, getter/setter
	public int getRank() {
		return rank;
	}


	public void setRank(int rank) {
		this.rank = rank;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getArtist() {
		return artist;
	}


	public void setArtist(String artist) {
		this.artist = artist;
	}


	public String getAlbum() {
		return album;
	}


	public void setAlbum(String album) {
		this.album = album;
	}


	public String getImgUrl() {
		return imgUrl;
	}


	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	// toString
	@Override  //조상 object가 갖고있는 메소드 // 상속받은자식이 사용하는중 (오버라이딩=메소드 재정의)
	public String toString() {
		return "Melon [rank=" + rank + ", title=" + title + ", artist=" + artist + ", album=" + album + ", imgUrl="
				+ imgUrl + "]";
	}
	
	
	
	
	
	
	
	
}
