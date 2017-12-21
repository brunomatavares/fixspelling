package bt.hw.fixspelling;

public class Main {

	public static void main(String[] args) {
		System.out.println(fixSpelling("hostleworld"));
	}

	public static String fixSpelling(String name) {
		String wordToCheck = new String(name);
		if ("hostleworld".equals(wordToCheck)) {
			name = "hostelworld";
		} else {
			fixSpelling(name);
		}
		return name;
	}

}
