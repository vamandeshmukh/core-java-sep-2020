package com.core.java.day21;

class VotingException extends Exception { // checked exception

	public VotingException() {
		super();
	}

	public VotingException(String errorMessage) {
		super(errorMessage);
	}
}

class LetUsVote {

	void checkEligibility(int age) throws VotingException {
		if (age < 18) {
			throw new VotingException("Can not vote");
		} else {
			System.out.println("You can vote.");
		}
	}
}

public class CustomException {

	public static void main(String[] args) {

		System.out.println("Start");

		LetUsVote voter1 = new LetUsVote();

		try {
			voter1.checkEligibility(17);
		} catch (VotingException e) {
			System.out.println("Stop voting");
		}
		finally { // closing connections 
			System.out.println("End");
		}
	}

}
