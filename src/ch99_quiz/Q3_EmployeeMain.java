package ch99_quiz;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Q3_EmployeeMain {

	public static void main(String[] args) {
		// 1. 사번과 이름이 같으면 동일한 사람이다. _> HashSet
		Set<Employee> hs = new HashSet<>();
		hs.add(new Employee(123, "김자바", Position.부장, LocalDate.of(1998, 1, 11)));
		hs.add(new Employee(123, "최가람", Position.부장, LocalDate.of(1997, 2, 12)));
		hs.add(new Employee(123, "가람최", Position.차장, LocalDate.of(1996, 3, 13)));
		hs.add(new Employee(123, "람가최", Position.과장, LocalDate.of(1995, 4, 14)));
		hs.add(new Employee(123, "최람가", Position.과장, LocalDate.of(1994, 5, 15)));
		hs.add(new Employee(123, "람최가", Position.대리, LocalDate.of(1993, 6, 16)));
		hs.add(new Employee(123, "최람가", Position.대리, LocalDate.of(1992, 7, 17)));
		hs.add(new Employee(123, "가최람", Position.대리, LocalDate.of(1991, 8, 18)));
		hs.add(new Employee(123, "집에갈", Position.사원, LocalDate.of(1990, 9, 19)));
		hs.add(new Employee(123, "언제가", Position.사원, LocalDate.of(1989, 10, 20)));
		
		// 다음 결과는?
		hs.add(new Employee(513, "한정부", Position.사원, LocalDate.of(1988, 11, 21)));
		hs.add(new Employee(513, "이마리", Position.과장, LocalDate.of(1987, 12, 22)));
		
		for (Employee emp: hs)
			System.out.println(emp);
		System.out.println();
		
		// 2. 출력을 할 경우에는 직급, 입사일자 순으로 출력이 되어야 한다.
		Set<Employee> ts = new TreeSet<>();
		hs.add(new Employee(123, "김자바", Position.부장, LocalDate.of(1998, 1, 1)));
		hs.add(new Employee(124, "최가람", Position.부장, LocalDate.of(1998, 1, 1)));
		hs.add(new Employee(125, "가람최", Position.차장, LocalDate.of(1998, 1, 1)));
		hs.add(new Employee(126, "람가최", Position.과장, LocalDate.of(1998, 1, 1)));
		hs.add(new Employee(127, "최람가", Position.과장, LocalDate.of(1998, 1, 1)));
		hs.add(new Employee(128, "람최가", Position.대리, LocalDate.of(1998, 1, 1)));
		hs.add(new Employee(129, "최람가", Position.대리, LocalDate.of(1998, 1, 1)));
		hs.add(new Employee(130, "가최람", Position.대리, LocalDate.of(1998, 1, 1)));
		hs.add(new Employee(131, "집에갈", Position.사원, LocalDate.of(1998, 1, 1)));
		hs.add(new Employee(132, "언제가", Position.사원, LocalDate.of(1998, 1, 1)));
		
		// 다음 결과는?
		hs.add(new Employee(513, "정유미", Position.사원, LocalDate.of(2019, 1, 1)));
		hs.add(new Employee(153, "이마리", Position.사원, LocalDate.of(2019, 1, 1)));
		
		for (Employee emp: ts)
			System.out.println(emp);
		System.out.println();
	}

}
