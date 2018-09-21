import java.util.Scanner;
import java.util.Arrays;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.*;
class Words {
	String[] words;
	int[] count;
	String[] unique;
	Words(String[] tokens) {
		this.words = tokens;
	}
	public String[] getWords() {
		return this.words;
	} public String[] uniqueWords() {
		return this.unique;
	} public int[] getWordCount() {
		return this.count;
	}
	public void setCount(int[] tokens) {
		this.count = tokens;
	}
	public void setUnique(String[] tokens) {
		this.unique = tokens;
	}
}
class BagOfWords {
	Words[] words;
	int a;
	BagOfWords() {
		words = new Words[20];
		a = 0;
	}
	public void addWords(Words token) {
		words[a++] = token;
	}
	public String[] getDistinct(String[] names) {
		// System.out.println(Arrays.toString(names));
		String[] unique = new String[names.length];
		int index = 0;
		boolean flag = false;
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < index + 1; j++) {
				if (names[i].equals(unique[j])) {
					flag = true;
				}
			}
			if (!flag && names[i].length() != 0) {
				unique[index] = names[i];
				index += 1;
			}
			flag = false;
		}
		unique = Arrays.copyOf(unique, index);
		// System.out.println(Arrays.toString(unique));
		words[a - 1].setUnique(unique);
		return unique;
	}
	public int[] getCount(String[] tokens, String[] unique) {
		int[] count = new int[unique.length];
		int index = 0;
		int size = 0;
		for (String uniq : unique) {
			if (null == uniq) {
				break;
			}
			for (String word : tokens) {
				if (uniq.equals(word)) {
					size += 1;
				}
			}
			count[index] = size;
			index += 1;
			size = 0;
		}
		words[a - 1].setCount(count);
		return count;
	}
	public void frequency(int index, int index1) {
		String[] one = words[index].uniqueWords();
		int[] onecount = words[index].getWordCount();
		String[] two = words[index1].uniqueWords();
		int[] twocount = words[index1].getWordCount();
		double freq = 0.0;
		for (int g = 0; g < one.length; g++) {
			for (int f = 0; f < two.length; f++) {
				if (one[g].equals(two[f])) {
					freq += (onecount[g] * twocount[f]);
				}
			}
		}
		//System.out.println(fl);
		double onecoun = 0.0;
		double twocoun = 0.0;
		for (int ele = 0; ele < one.length; ele++) {
			onecoun += onecount[ele] * onecount[ele];
		}
		for (int ele = 0; ele < two.length; ele++) {
			twocoun += twocount[ele] * twocount[ele];
		}
		double ans = freq / (Math.sqrt(onecoun * twocoun));
		System.out.println(ans * 100.0);
	}
}
public class Solution {
	public static void main(String[] args) {
		BagOfWords word = new BagOfWords();
		try {
			Scanner sc = new Scanner(System.in);
			String line = sc.nextLine();
			File files = new File(line);
			File[] list = files.listFiles();
			int length = list.length;
			for (int i = 0; i < length; i++) {
				String s = toText(list[i]);
				String[] tokens = s.toLowerCase().split(" ");
				word.addWords(new Words(tokens));
				String[] unique = word.getDistinct(tokens);
				int[] count = word.getCount(tokens, unique);
			}
			for (int i = 0; i < length; i++) {
				for (int j = 0; j < length; j++) {
					word.frequency(i,j);
				}
			}
		} catch (Exception e) {
			System.out.println("empty dictionary");
		}
	}
	public static String toText(File file) {
		String str = "";
		try {
			Scanner line = new Scanner(new FileReader(file));
			StringBuilder text = new StringBuilder();
			while (line.hasNext()) {
				text.append(line.next());
				text.append(" ");
			}
			line.close();
			str = text.toString().replaceAll("[^\\p{Alpha} ]", "");
		} catch (Exception e) {
			System.out.println("No File");
		}
		return str;
	}
}

