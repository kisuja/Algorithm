package CHAPTER1;

import java.io.*;
import java.util.*;

class Smoney{
	
	int years[][];
	int length;
	
	Smoney(int n[][],int s) {
		this.years = n;
		length = s;
	}

	public void input(int n, int a, int b) {
		this.years[0][n] = a;
		this.years[1][n] = b;
	}

	public int cal() {
		
		int max = 0;  
		int arr[][]=new int[3][length];
		arr[0][0] = years[0][0];
	    arr[1][0] = years[1][0]; 
	    arr[2][0] = 0; 
	    
		for (int i = 1; i < length; i++) {
			for(int j = 0; j < 3; j++) {
				if(j == 2) {
					arr[2][i] = ((arr[0][i-1] > arr[1][i-1]) ? arr[0][i-1] : arr[1][i-1]);
					continue;
				}
				arr[0][i] = ((arr[1][i-1] > arr[2][i-1]) ? arr[1][i-1] : arr[2][i-1]) + years[0][i];
	            arr[1][i] = ((arr[0][i-1] > arr[2][i-1]) ? arr[0][i-1] : arr[2][i-1]) + years[1][i];
			}	
		}
		
         for(int i = 0; i < 3; i++) {
             if(max < arr[i][length-1]) {
                max = arr[i][length-1];
             }
          }
         
         return max;
	} 	
}

public class CHAPTER1_2 {
	
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());	
		int s[][] = new int[2][n];
		Smoney smoney = new Smoney(s,n);
		
		for(int i=0; i<n; i++) {			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b =Integer.parseInt(st.nextToken());
			smoney.input(i,a,b);			
		}
		int m =smoney.cal();
		bw.write(m+"");		
		br.close();      
		bw.flush();
		bw.close();
	}
}
 