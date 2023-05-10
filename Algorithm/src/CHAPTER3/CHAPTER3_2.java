//package CHAPTER3;
//
//import java.io.*;
//import java.util.*;
//
//public class CHAPTER3_2 {
//
//	public static void main(String[] args) throws IOException  {
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			int a = Integer.parseInt(st.nextToken());
//			int d[] = new int [a];
//			
//			int change, sum =0;
//			for(int i=0; i<a; i++) {
//				StringTokenizer n = new StringTokenizer(br.readLine());
//				d[i] = Integer.parseInt(n.nextToken());
//			}
//			for(int i=0; i<a; i++) {
//				for(int j=0; j<a-1; j++) {
//					if(d[j]<d[j+1]) {
//						change = d[j];
//						d[j] = d[j+1];
//						d[j+1] = change;
//					}
//						
//				}				
//			}
//			for(int i=0; i<a; i++) {
//				sum +=d[i];
//				i+=1;
//			}
//				bw.write(sum+" ");		
//			br.close();      
//			bw.flush();
//			bw.close();
//
//	}
//
//}
