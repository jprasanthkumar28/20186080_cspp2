import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

class Calculator {
	String[] word;
	HashMap<String, Integer> val;

	Calculator (String file) {
		word = calci(file);
		// System.out.println(Arrays.toString());

	}
	public String[] calci(String file) {
		String[] str = null;
		String s = "";
		try {
			// File filename1 = new File("input000.txt");
			Scanner s1 = new Scanner(new File(file));
			while (s1.hasNext()) {
				s += (s1.nextLine().replaceAll("[^a-zA-Z0-9_]+"," ").toLowerCase())+" ";
			}
			str = s.split(" ");
		} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		return str;

	}
	public HashMap<String, Integer> frequency() {
		val = new HashMap<String, Integer>();
		for (int i = 0; i < word.length; i++) {
			if (val.containsKey(word[i])) {
				val.put(word[i], val.get(word[i]) + 1);
			} else {
				val.put(word[i], 1);
			}
		}
		return val;
	}
}
class Distance {
	private Calculator doc1;
	private Calculator doc2;
    Distance(Calculator d1, Calculator d2) {
    	doc1 = d1;
    	doc2 = d2;

    }
    public double Euclidean(Calculator d) {
    	HashMap<String,Integer> hash = new HashMap<String,Integer>();
    	hash = d.frequency();
        long sum = 0;
        for(Map.Entry<String, Integer> m : hash.entrySet()) {
            // int val = (int)m.getValue();
            sum += m.getValue()*m.getValue();
        }
        double prod = Math.sqrt(sum);
        return prod;
    }
    public double DotProduct() {
    	HashMap<String, Integer> dict1 = doc1.frequency(); 	
    	HashMap<String, Integer> dict2 = doc2.frequency(); 	
        String key;
        int sum = 0;
        for (Map.Entry<String, Integer> m: dict1.entrySet()) {
            key = m.getKey();
            if (dict2.containsKey(key)) {
                int val1 = dict1.get(key);
                int val2 = dict2.get(key);
                sum += (val1*val2);
            }
        }
        return sum;
    }
    public double similarity() {
        double a = Euclidean(doc1);
        double b = Euclidean(doc2);
        double numer = a*b;
        double denom = DotProduct();
        double result = denom/numer;
        result = result * 100;
        return Math.round(result);
    }
}
public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        try {

        String foldername = scan.nextLine();
        final File folder = new File(foldername);
        File[] allfiles = folder.listFiles();
        String s = "\t";
        for (File file: allfiles) {
            s += file.getName() + "\t";
        }
        s += "\n";
        if (allfiles.length != 0) {
            for (File file1: allfiles) {
                s += file1.getName() + "\t";
                for (File file2: allfiles) {
                    Calculator d1 = new Calculator(file1 + "");
                    Calculator d2 = new Calculator(file2 + "");
                    Distance d = new Distance(d1, d2);
                    s += d.similarity() + "" + "\t";
                }
                s = s.trim();
                s += "\n";
            }
            System.out.println(s);
        } }
        catch(Exception e) {
            System.out.println("empty directory");
        }
    }
}
