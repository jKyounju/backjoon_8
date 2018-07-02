package backjoon_8;
import java.util.*;

public class 요일규칙찾기 {
	// https://www.acmicpc.net/problem/1924
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt(); int d = scan.nextInt();
		if(!checkDate(m,d)) {
			System.out.println("잘못된 날짜 입니다.");
		} else {
			String weekday = checkWeekDay(m, d);
			System.out.println(weekday);
		}
	}
	static boolean checkDate(int month, int day) {
		// 요일을 정확히 입력했는지 예외처리하기
		if(month > 0 && month < 13) {
		switch(month) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 : 
		case 12 :
			if(day < 1 && day > 31)
				return false;
			else
				return true;
		case 2 :
			if(day < 1 && day > 28) 
				return false;
			else 
				return true;
		default :
			if(day < 1 && day > 30)
				return false;
			else 
				return true;
		}
		}
		else 
			return false;
	}
	
	static String checkWeekDay(int month, int day) {
		// 총 일자를 수를 구해 %7를 하여 나머지를 요일로 계산한다.
		String[] weekday = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int total = 0;
		for(int i = 1; i < month; i ++) {
			if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
				total += 31;
			} else if(i == 2) {
				total += 28;
			} else {
				total += 30;
			}
		}
		total += day;
		return weekday[total%7];
	}
}
