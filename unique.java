
class Unique {
	public static void main(String[] args)
	{
		String str = "hi hello how are you";
		int count;
		String[] words = str.split("\\W");
		System.out.println(words);
		for (int i = 0; i < words.length; i++) {
			count = 1;

			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equalsIgnoreCase(words[j])) {
					count++;

					words[j] = "";
				}
			}
			if (count == 1 && words[i] != "")
				System.out.println(words[i]);
		}
	}

}
