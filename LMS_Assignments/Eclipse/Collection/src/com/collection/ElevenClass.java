package com.collection;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Comparator;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class ElevenClass {

	public static void main(String[] args) {

		Set<Mail> s = new TreeSet<>(new Comparator<Mail>() {

			@Override
			public int compare(Mail m1, Mail m2) {

				int diff = m2.getRec_time().compareTo(m1.getRec_time());
				return diff;
			}

		});
		
		s.add(new Mail(1234567645,"abc","asd","mailbody",LocalDateTime.of(1987, Month.DECEMBER,4,10,0)));//int mailid, String from, String subject, String body, LocalDateTime rec_time
		s.add(new Mail(646565675,"arty","atyty","gmail",LocalDateTime.of(2001, Month.JANUARY,1,10,45)));
		s.add(new Mail(798989895,"aqwe","tytyya","email",LocalDateTime.of(2000, Month.AUGUST,22,10,45)));
		
		for(Mail m:s) {
			System.out.println(m);
		}
		
	}

}
