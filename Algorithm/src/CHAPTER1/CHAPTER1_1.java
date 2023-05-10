//package CHAPTER1;
//
//import java.util.*;
//import java.io.*;
//public class CHAPTER1_1 {
//
//	public static void main(String[] args) throws IOException {
//		int cnt =0;
//		int tf = -1;
//		String c = null;
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
//		StringTokenizer n = null;		
//		
//		String str[][] = new String[3][3];
//		
//		for(int i = 0; i<3; i++) {
//			n = new StringTokenizer(br.readLine());
//			for (int j=0; j<3; j++) str[i][j] = n.nextToken();
//		}
//		StringTokenizer t = new StringTokenizer(br.readLine());
//		int num = Integer.parseInt(t.nextToken());
//		for(int i=0; i<num; i++) {
//			int check =0;
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			int p1 = Integer.parseInt(st.nextToken())-1;
//			int p2 = Integer.parseInt(st.nextToken())-1;
//			int p3 = 0;
//			c = str[0][0];
//			for(int j=0; j<3; j++) {
//				for(int k=0; k<3; k++) if(c.equals(str[j][k])) check++;
//			}
//			if(check == 9) {
//				if(tf==-1) tf = cnt;			
//			}
//			if(p1 == 2 || p1==0){
//				if(p1==0) p3=+1;
//				else p3=0;
//				for(int j=0; j<2; j++) { 
//						if(str[p1-1+j+p3][p2].equals("1")) str[p1-1+j+p3][p2] ="0";
//						else str[p1-1+j+p3][p2] ="1";
//				}
//			}else {
//			for(int j=0; j<3; j++) { 
//					if(str[p1-1+j][p2].equals("1")) str[p1-1+j][p2] ="0";
//					else str[p1-1+j][p2] ="1";
//				}		
//			}
//			if(p2 == 2||p2 ==0) {
//				if(p2==0) p3=+1;
//				else p3 =0;
//				for(int j=0; j<2; j++) { 
//						if(str[p1][p2-1+j+p3].equals("1")) str[p1][p2-1+j+p3] ="0";
//						else str[p1][p2-1+j+p3] ="1";
//				}
//			}else {
//			for(int j=0; j<3; j++) { 
//					if(str[p1][p2-1+j].equals("1")) str[p1][p2-1+j] ="0";
//					else str[p1][p2-1+j] ="1";
//				}		
//			}
//			if(str[p1][p2].equals("1")) str[p1][p2] ="0";
//			else str[p1][p2] ="1";
//			cnt++;
//		}
//		bw.write(tf+"");
//		 br.close();
//	      bw.flush();
//	      bw.close();
//	}
//}
//
//
