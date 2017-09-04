package ride;
/*
ID: isaiahl1
LANG: JAVA
TASK: ride
*/
import java.io.*;
import java.util.*;

class ride {
  public static void main (String [] args) throws IOException {
    // Use BufferedReader rather than RandomAccessFile; it's much faster
    BufferedReader f = new BufferedReader(new FileReader("ride.in"));
                                                  // input file name goes above
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
    // Use StringTokenizer vs. readLine/split -- lots faster
    String w1 = f.readLine();
    String w2 = f.readLine();
//    System.err.println(getModVal(w1));
//    System.err.println(getModVal(w2));
    if (getModVal(w1) == getModVal(w2)) {
    	out.println("GO");
    } else {
    	out.println("STAY");
    }
    out.close();
  }

private static int getModVal(String w1) {
	long n = 1; 
	for (int i = 0; i < w1.length(); i++) {
//		System.err.println(w1.charAt(i) );
		n *= w1.charAt(i)- 'A' + 1; 
	}
	return (int) (n % 47);
}
}