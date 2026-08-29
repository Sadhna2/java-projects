package day10;

public class SampleRecordMain {

	public static void main(String[] args) {
		SampleRecord rec=new SampleRecord(123,"nexturn",389.738);
		System.out.println(rec.code()+" "+rec.name()+" "+rec.amount());

	}

}
