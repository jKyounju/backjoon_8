package backjoon_8;
import java.util.*;

public class ACMȣ�� {
	// https://www.acmicpc.net/problem/10250
	static public void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt(); int w = scan.nextInt(); int n = scan.nextInt();
		int[][] init_hotel = hotel(h, w);
		init_hotel = reservation(init_hotel, n);
	}
	
	static int[][] hotel(int h, int w) {
		/* ȣ��ũ�⸸ŭ �迭�� �����ϰ�, 0���� �ʱ�ȭ ��Ų��. */
		int[][] hotel = new int[h][w];
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				hotel[i][j]  = 0;
			}
		}
		return hotel;
	}
	
	static int[][] reservation(int[][] hotel, int count) {
		/* �ش� ȣ���� �ε����� 1�� �ְ�, �ش� ȣ���� �����Ѵ�. */
		int w = (int)count/hotel.length; // ���� ���� ���
		int h = (int)count%hotel.length; // ȣ���� ���� ���
		hotel[h][w] = 1; 
		if(w < 10) {
			System.out.println(String.valueOf(h+1) + '0' + String.valueOf(w));
		} else {
			System.out.println(String.valueOf(h+1) + String.valueOf(w));
		}
		return hotel;
	}
}
