public class palindrone {

	public boolean ispalindrone(String s) {

		s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		int left = 0;
		int right = s.length() - 1;

		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;

			}
			left++;
			right--;
		}
		return true;

	}

	public static void main(String[] args) {

		palindrone obj = new palindrone();

		boolean result = obj.ispalindrone("MADAM");
		System.out.println(result);

	}

}
