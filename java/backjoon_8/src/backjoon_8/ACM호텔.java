package backjoon_8;
import java.util.*;

public class ACM호텔 {
	// https://www.acmicpc.net/problem/10250
	static public void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt(); int w = scan.nextInt(); int n = scan.nextInt();
		int[][] init_hotel = hotel(h, w);
		init_hotel = reservation(init_hotel, n);
	}
	
	static int[][] hotel(int h, int w) {
		/* 호텔크기만큼 배열을 정의하고, 0으로 초기화 시킨다. */
		int[][] hotel = new int[h][w];
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				hotel[i][j]  = 0;
			}
		}
		return hotel;
	}
	
	static int[][] reservation(int[][] hotel, int count) {
		/* 해당 호수에 인덱스에 1을 넣고, 해당 호수를 리턴한다. */
		int w = (int)count/hotel.length; // 층의 수를 계산
		int h = (int)count%hotel.length; // 호수의 수를 계산
		hotel[h][w] = 1; 
		if(w < 10) {
			System.out.println(String.valueOf(h+1) + '0' + String.valueOf(w));
		} else {
			System.out.println(String.valueOf(h+1) + String.valueOf(w));
		}
		return hotel;
	}
}
