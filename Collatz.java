//💀💀💀💀
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class Collatz {
	public static void main(String[] args) {
		BigInteger Number;
		BigInteger Count;
		BigInteger two;
		boolean finish = false;
		Number = BigInteger.ONE;
		Count = BigInteger.ZERO;
		two = BigInteger.valueOf(2);
		ArrayList<BigInteger> arr = new ArrayList<>();
		while (true) {
			if (Number.mod(two).compareTo(BigInteger.ZERO) == 0) {
				//if even
				Number = Number.divide(two);
				arr.add(Number);
			}
			else {
				//if odd
				Number = Number.multiply(BigInteger.valueOf(3));
				Number = Number.add(BigInteger.valueOf(1));
				arr.add(Number);
			}
			if (Number.compareTo(BigInteger.valueOf(4)) == 0) {
				//if normal
				Count = Count.add(BigInteger.ONE);
				System.out.println("Count is " + Count);
				arr.clear();
			}
			//duplicate detection
			Set<BigInteger> ar = new HashSet<BigInteger>();
			for (BigInteger num : arr) {
				if (ar.add(num) == false) {
					System.out.println("Found");
					System.out.println("Final repeating num is " + Number);
					System.out.println("Count is " + Count);
					finish = true;
					break;
				}
			}
			if (finish == true) {
				break;
			}
		}
	}
}
