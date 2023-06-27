package ch08_interface.sec04_example;

public interface DataAccessObject {
	void select();	// 실제로는 데이터 DTO type (실제로는 select가 void가 아니라...?)
	void insert();
	void update();
	void delete();
//	public abstract void delete(); 생략되어있음
}
