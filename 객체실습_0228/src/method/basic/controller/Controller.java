package method.basic.controller;

public class Controller {
	public String twoString(String str1, String str2) {
		return str1 + str2;
	}
	
	public int sumInt(int i1, int i2) {
		if(i1 <= i2) {
			System.out.println("계산할 수 없습니다.");
			return 0;
		} else {
			int sum = 0;
			for(int i=i1; i<=i2; i++) {
				sum += i;
			}
			return sum;
		}
	}
	
	public boolean isStrEng(char c) {
		if(c>='A' && c<='z')
			return true;
		return false;
	}
	
	public boolean isEqualStr(String str1, String str2) {
		int count = 0;
		if(str1.length() == str2.length()) {
			for(int i=0; i<str1.length(); i++) {
				if(str1.charAt(i)==str2.charAt(i))
					count ++;
			}
			if(count == str1.length()) 
				return true;
			else
				return false;
		} else
			return false;

	}
}
