package evys42.pairs7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P7App {

	private static final int TOTAL_TARGET = 7;
	private static final Function<Integer[], Integer> STRATEGY = P7App::asStreams;

	/**
	 * Converts arguments into Integer array and
	 * applies pair lookup STRATEGY.
	 * 
	 * @param args - numbers
	 */
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Nothing to process.");
			return;
		}
		System.out.println("...");

		try {
			Integer[] input = Stream.of(args)
				.map(Integer::valueOf)
				.toArray(Integer[]::new)
			;

			int found = STRATEGY.apply(input);

			System.out.printf("%nFound pairs: %d", found);
			System.out.println();
		} catch (NumberFormatException nfe) {
			System.out.println("Failed to convert arguments into integers");
			nfe.printStackTrace();
		}
	}

	/**
	 * Prints distinct pairs of integers (from the sample) that totals 7(TOTAL_TARGET).
	 * <p>Employs stream style self-join.
	 * 
	 * @param sample - an array of Integers.
	 * @return a number of distinct pairs found.
	 */
	static Integer asStreams(final Integer[] sample) {
		return (int) Stream.of(sample)
				.flatMap(i -> Stream.of(sample)
						.map(j -> new Pair(i,j))
				)
				.filter(p -> p.total() == TOTAL_TARGET)
				.distinct()
				.peek(p -> System.out.printf("(%d, %d)", p.left, p.right))
				.count()
		;
	}

	/**
	 * Prints distinct pairs of integers (from the sample) that totals 7(TOTAL_TARGET).
	 * <p>Employs "nested loops" style self-join.
	 * 
	 * @param sample - an array of Integers.
	 * @return a number of distinct pairs found.
	 */
	static Integer asNestedLoops(final Integer[] sample) {
		// Use LinkedHashSet to preserve order.
		final Set<Pair> pairs = new HashSet<>(sample.length * 2); 

		// Generate suitable pairs.
		for (Integer i : sample) {
			for (Integer j : sample) {
				Pair p = new Pair(i,j);
				if (p.total() == TOTAL_TARGET) {
					pairs.add(p);
				}
			}
		}

		// Print result.
		pairs.stream().forEach(p -> System.out.printf("(%d, %d)", p.left, p.right));
		return pairs.size();
	}
}
