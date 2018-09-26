import java.io.*;
import java.util.*;
public class LongestString {
	public String longestString(String a, String b) {
		String result = "";
		if (a.length()==0 || b.length()==0) {
			int[][] answer = new int[a.length()][b.length()];
			for (int i = 0; i < a.length(); i++) {
				for (int j = 0; j < b.length(); j++) {
					if (a.charAt(i) == b.charAt(j)) {
						if (i == 0 || j == 0) {
							answer[i][j] = 1;	
						} else {
							answer[i][j] = answer[i-1][j-1] + 1;
						}
						if (answer[i][j] > result.length()) {
							result = a.subString(i - answer[i][j] + 1, i + 1);
						}
					}
				}
			}
		}
		return answer;
	}
}