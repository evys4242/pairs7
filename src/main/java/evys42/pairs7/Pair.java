package evys42.pairs7;

/**
 * A simple container for a pair of integers.
 */
public final class Pair {

	public final int left, right;
	
	public Pair(int i, int j) {
		this.left = (i <= j)? i : j;
		this.right = (i <= j)? j : i;
	}
	
	public int total() {
		return this.left + this.right;
	}
	
	@Override
	public boolean equals(Object o) {
		if((o == null) || !(o instanceof Pair)) { 
			return false; 
		}
		Pair other = (Pair) o;
		return this.left == other.left && this.right == other.right;
	}
	
	@Override
	public int hashCode() {
		return (17 * 31 + this.left) * 31 + this.right;
	}
}
