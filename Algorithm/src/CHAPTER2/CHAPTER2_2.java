package CHAPTER2;

import java.io.*;
import java.util.*;

class check{	
	String s[];
	int cnt = 0;
	String tf[];
	
	public check(String[] b) {
		this.s = b;
		tf = new String[s.length];
		for(int i=0; i<tf.length; i++) {
			tf[i] = "NO";
		}
	}

	public int chr(int a) {		
		if(tf[a].equals("NO"))
			chr2(a);					
		return cnt;
	}
	
	public void chr2(int a) {
		if(tf[a].equals("NO")) {
			tf[a] =tf[a].replace("NO", "YES");			
			cnt++;
			if(s[a].equals("")) {
				return;
			}			
			String ns[] = s[a].split("/");			
			for(int i=0; i<ns.length; i++) {
				chr2(Integer.parseInt(ns[i]));
			}
		}
	}
}

public class CHAPTER2_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		String s[] = new String[a+1];
		for(int i=0; i<=a; i++)
			s[i] = new String();
		for(int i=0; i< b; i++) {
			StringTokenizer n = new StringTokenizer(br.readLine());
			int c = Integer.parseInt(n.nextToken());
			String d = n.nextToken();
			s[c] = s[c].concat(d+"/");				
		}
		check ch = new check(s);
		
		bw.write(ch.chr(1)+"");		
		br.close();      
		bw.flush();
		bw.close();
	}
}