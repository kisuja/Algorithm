//package CHAPTER2;
//
//import java.io.	*;
//import java.util.*;
//
//class Make {
//	int city;
//	int bus;
//	int root[][];
//	int nroot[][];
//	int cnt;
//	public Make(BufferedReader br, int c, int b) throws IOException  {
//		city = c;
//		bus = b;
//		root = new int[city+1][city+1];//간선개수 ex) 점 5개면 간선 4개 배열은 0부터 => -2, 좌표 x y;
//		
//		for(int j=0; j<city+1; j++) {
//			for(int k=0; k<city+1; k++)			
//			root[j][k] = 10000;
//		}
//		
//		for(int i=0; i<bus; i++) {
//			StringTokenizer n = new StringTokenizer(br.readLine());
//			int x = Integer.parseInt(n.nextToken());
//			int y = Integer.parseInt(n.nextToken());
//			int di = Integer.parseInt(n.nextToken());
//			if(root[x][y] == 10000)
//				root[x][y] = di;
//			if(root[x][y] > di) 
//				root[x][y] = di;
//		}
//		nroot = root;
//	}
//	
//	public int[][] Makeboard() {
//		for(int i=1; i< city+1; i++) {
//			for(int j=1; j<city+1; j++) {
//				for(int k=1; k<=city; k++){
//					if(i==j||i==k||k==j){
//						continue;
//					}
//					else if(nroot[i][k]==10000||nroot[k][j] == 10000)
//						root[i][j] = root[i][j];
//					else if(nroot[i][k] + nroot[k][j] > nroot[i][j]) {
//						root[i][j] = nroot[i][j];
//					}
//					else if(nroot[i][k] + nroot[k][j] < nroot[i][j]) {
//						root[i][j] = nroot[i][k] + nroot[k][j];
//					}	 
//				}
//				nroot = root;
//			}
//		
//		}
//		return root;
//	}
//	public int[][] mkboard(){
//		if(city == 2)
//			return root;
//		for(int i=0; i< city-2; i++) {
//			root = Makeboard();
//		}
//		return root;
//	}
//
//}
//	
//
//public class CHAPTER2_3 {
//
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int city = Integer.parseInt(st.nextToken());
//		int bus = Integer.parseInt(st.nextToken());
//		
//		
//		Make a = new Make(br, city, bus);
//		a.mkboard();
//		for(int i=1; i<= city; i++) {
//			for(int j=1; j<=city; j++) {
//				if(a.root[i][j] == 10000)
//					a.root[i][j] = 0;
//				bw.write(a.root[i][j]+" ");
//			}
//			bw.write("\n");
//		}		
//		br.close();      
//		bw.flush();
//		bw.close();
//
//	}
//}
