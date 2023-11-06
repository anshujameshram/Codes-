
public class triplet_with_given_sum0 {

	public static void main(String[] args) {
		int arr[] = { 1 ,2 ,4 ,3 ,6};
		boolean found = false;
		int len = arr.length;
		for (int i = 0; i < len - 2; i++) {
			for (int j = i + 1; j < len - 1; j++) {
				for (int k = j + 1; k < len; k++) {
					if (arr[i] + arr[j] + arr[k] == 10) {
						//System.out.print("[" + arr[i] + " " + arr[j] + " " + arr[k] + " ]");
						found = true;
					}
				}
			}
		}
		if (found == true) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

}
