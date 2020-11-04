package org.finals;

import org.mark.SubjectMark;

public class FinalResult extends SubjectMark  {
	public void MonthResult() {
		System.out.println("All clear");
		System.out.println("all pass");
	}
	
	public void mayMonthResult() {
		System.out.println("All clear");
	
	}
public static void main(String[] args) {
	FinalResult b=new FinalResult();
	b.tamilMark();
	b.mayMonthResult();
	b.MonthResult();
}
}
