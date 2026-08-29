package day10;

public sealed abstract class Account permits Savings, CurrentAccount  {
	protected String name;
	public Account() {
		name="nexturn";
	}
	public String getName() {
		return name;
	}
}
