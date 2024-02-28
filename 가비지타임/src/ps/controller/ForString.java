package ps.controller;

import java.util.Scanner;
import java.util.HashMap;

public class ForString {
	public void bananaTest1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 하나 입력");
        String test = sc.nextLine();
        
        int count = 0;
        char[] store = new char[test.length()];
        int k = 0;
        t:
        for(int i=0; i<test.length(); i++) {
            char ch = test.charAt(i);
            for(int l=0; l<store.length; l++) {
                if(store[l] == ch) {
                    continue t;
                }
            }
            f:
            for(int j=0; j<test.length(); j++) {
                char target = test.charAt(j);
                for(int l=0; l<store.length; l++) {
                    if(store[l] == ch) {
                        continue f;
                    }
                }
                if(i != j && ch == target) { 
                    count++;
                    store[k++] = ch;
                }
            }
        }
        System.out.println("중복된 문자 수: " + count);
        for(int i=0; i<store.length; i++) {
            if(store[i] == '\0') {
                break;
            } else {
                System.out.println("중복된 문자: " + store[i]);
            }
        }
    }
    

    public void bananaTest2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 하나 입력");
        String word = sc.next();
        
        int count;
        HashMap<Character, Integer> dual = new HashMap<>();

        for(int i=0; i<word.length(); i++) {
            char ch = word.charAt(i);
            if(!dual.containsKey(ch)) {
                dual.put(ch, 0);
            }
            dual.put(ch, dual.get(ch)+1);
        }
        
        //Set<Character> kSet = dual.keySet(); 
        for(char c : dual.keySet()) {
            if(dual.get(c) > 1) {
                System.out.println("중복 문자: " + c);
                System.out.println("중복 개수: " + dual.get(c));
            }
        }
    }
}
