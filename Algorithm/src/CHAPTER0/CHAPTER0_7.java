//package CHAPTER0;
//
//import java.io.*;
//import java.util.*;
//
//public class CHAPTER0_7 {
//	 
//	public static void main(String[] args) throws IOException {
// 
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		  StringTokenizer n = new StringTokenizer(br.readLine());
//	      int num = Integer.parseInt(n.nextToken());
//	      int a = 1;
//	      int b = 1;
//	      
//	      StringTokenizer st = new StringTokenizer(br.readLine());
//	      
//	      while (st.hasMoreTokens()) {
//	         String c = st.nextToken();
//	         if(c.equals("U")){
//	        	 if(a==1) a=1;
//	        	 else a--;
//	         }
//	         else if(c.equals("D")) {
//	        	 if(a==num) a = num;
//	        	 else a++;
//	         }
//	         else if(c.equals("L")) {
//	        	 if(b==1) b=1;
//	        	 else b--;
//	        	 }
//	         else if(c.equals("R")) {
//	        	 if(b==num) b = num;
//	        	 else b++;
//	         }	 
//	      }
//
//	      bw.write(a+ " "+ b);
//	      
//	      br.close();
//	      bw.flush();
//	      bw.close();
//	 
//	   
//
//	}
//}
// 