//package CHAPTER3;
//
//import java.io.*;
//import java.util.*;
//
//class CoinChange{
//	int price[];
//	int minCoin;
//	int cnt;
//	
//	public CoinChange(int a, int b, BufferedReader br) throws IOException {
//		price = new int[a];
//		minCoin = b;
//		for(int i=0; i<a; i++) {
//			StringTokenizer n = new StringTokenizer(br.readLine());
//			price[i] = Integer.parseInt(n.nextToken());
//		}
//	}
//	
//	public int moneycnt() {
//		while(true) {
//			for(int i=price.length-1; i>=0; i--) {
//				if(minCoin-price[i]>=0) {
//					minCoin = minCoin - price[i];
//					cnt++;
//					break;
//				}
//			}
//			if(minCoin == 0)
//				break;
//		}
//		
//		
//		
//		return cnt;
//	}
//}
//
//public class CHAPTER3_1 {
//
//		public static void main(String[] args) throws IOException {
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//			
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			int a = Integer.parseInt(st.nextToken());
//			int b = Integer.parseInt(st.nextToken());
//			CoinChange m = new CoinChange(a,b,br);
//
//			bw.write(m.moneycnt()+"");		
//			br.close();      
//			bw.flush();
//			bw.close();
//		}
//}
