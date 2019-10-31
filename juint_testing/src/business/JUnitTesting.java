package business;

public class JUnitTesting {
	
	
		
	public int square(int i) {
		return i*i;
	}
	
	public int countA(String str) {
		int count = 0;
		for (int i = 0; i<str.length(); i++) {
			char a = str.charAt(i);
			if (a== 'a'||a=='A') {
				count++;
			}
		}
		return count;
	}

}
