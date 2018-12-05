package com.avitesh.dailyproblem.work;

public class UberArrayQuizSolution {

	public void guard() {
		int[] input = new int[3];
		int[] result = new int[input.length];
		input[0] = 3;
		input[1] = 2;
		input[2] = 1;
		//input[3] = 4;
		//input[4] = 5;
		result = ProposedWorker(input);
		for (int walker : result) {
			System.out.println(walker);
		}

	}

	private int[] ProposedWorker(int[] input) {
		int[] result = new int[input.length];
		int resultWalker = 0;
		for (; resultWalker < result.length; resultWalker++) {
			int temp = 1;
			for (int inputWalker = 0; inputWalker < input.length; inputWalker++) {
				if (inputWalker != resultWalker) {
					temp = temp * input[inputWalker];
				}
			}
			result[resultWalker] = temp;
		}
		return result;
	}
}