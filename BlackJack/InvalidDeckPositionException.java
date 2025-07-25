package BlackJack;

public class InvalidDeckPositionException extends Exception {

	private int positionIdentifier = 0;

	public InvalidDeckPositionException(int inValidPosition) {

		positionIdentifier = inValidPosition;

		System.out.println("Invalid Position" + inValidPosition);

	}

	public String toString() {

		return ("Attempted to get a card from a position not in Deck" + " " + this.positionIdentifier);
	}

	public int getPositionValue() {
		return positionIdentifier;
	}
} //End class
