package mysql.ex05_world;

public class City {
	private int id;
	private String name;
	private String countryCode;
	private String district;
	private int population;
	
	public City() { }
	// Insert할 경우 ID는 자동생성되므로, ID값을 제외한 나머지로 생성자를 만들어 줌 
	public City(String name, String countryCode, String district, int population) {
//		super();	// 조상이 없으니 사용x
//		this.id = id; // id 지움 오버로딩을 위해서
		this.name = name;
		this.countryCode = countryCode;
		this.district = district;
		this.population = population;
	}
	public City(int id, String name, String countryCode, String district, int population) {
//		super();	// 조상이 없으니 사용x
		this.id = id;
		this.name = name;
		this.countryCode = countryCode;
		this.district = district;
		this.population = population;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	
	
	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", countryCode=" + countryCode + ", district=" + district
				+ ", population=" + population + "]";
	}
	
}
