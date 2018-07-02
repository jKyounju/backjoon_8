package backjoon_8;
import java.util.*;

public class Ä«À×´Þ·Â {
	static public void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt(); int n = scan.nextInt();
		int x = scan.nextInt(); int y = scan.nextInt();
		int year = kaingCalendar(m,n,x,y);
		System.out.println(year);
	}
	static int kaingCalendar(int m, int n, int x, int y) {
		int count_x = 0, count_y = 0;
		int count = 0;
		for(int i = 0; i < m*n; i++) {
			count++;
			if(count_x < m) 
				count_x++;
			else
				count_x = 1;
			if(count_y < n)
				count_y++;
			else
				count_y = 1;
			if(count_x == x && count_y == y)
				return count;
		}
		return -1;
	}
}
