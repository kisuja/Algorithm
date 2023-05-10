package CHAPTER3;

import java.io.*;
import java.util.*;

class besthunttime {

	int time[][];
	int cnt =0;
	int end = 0;
	
	public besthunttime(int[][] time, BufferedReader br) throws IOException {
		this.time = time;

		for (int i = 0; i < time.length; i++) {
			StringTokenizer n = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(n.nextToken());
			int b = Integer.parseInt(n.nextToken());
			time[i][0] = a;
			time[i][1] = b + time[i][0];
			
		}

	}

	public void goodTime() {
	      Arrays.sort(time, new Comparator<int[]>() {
	          public int compare(int[] o1, int[] o2) {
	             if(o1[1] == o2[1]) 
	            	 return o1[0] - o2[0];         
	             
	             return o1[1] - o2[1];
	          }
	       }
	       );

	}
	
	public int Eat() {
		goodTime();
		
		for(int i = 0; i < time.length; i++) {
	         if(end <= time[i][0]) {
	            end = time[i][1];
	            cnt++;
	         }
		}
		return cnt;
	}
	
}


public class CHAPTER3_3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());

		int[][] time = new int[a][2];
		besthunttime w = new besthunttime(time,br);
		bw.write(w.Eat()+"");		
		br.close();      
		bw.flush();
		bw.close();
	}

}
