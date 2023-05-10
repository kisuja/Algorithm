//package CHAPTER2;
//
//import java.io.*;
//import java.util.*;
//
//public class CHAPTER2_1 {
//
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int a = Integer.parseInt(st.nextToken());
//		String m[] = new String [a];
//		for(int i =0; i<a; i++) {
//			m[i] = new String();
//		}
//		int b = Integer.parseInt(st.nextToken());
//		for(int i=0; i < b; i++) {
//			StringTokenizer n = new StringTokenizer(br.readLine());
//			String c = n.nextToken();
//			String d = n.nextToken();
//			if(c.equals(d))
//				continue;
//			else {
//				m[Integer.parseInt(d)-1] = m[Integer.parseInt(d)-1].concat(c+" ");
//				m[Integer.parseInt(c)-1] = m[Integer.parseInt(c)-1].concat(d+" ");
//			}
//		}		
//		for(int i=0; i<a; i++) {
//			bw.write(m[i]+"\n");
//		}
//		br.close();      
//		bw.flush();
//		bw.close();
//	}
//
//}
