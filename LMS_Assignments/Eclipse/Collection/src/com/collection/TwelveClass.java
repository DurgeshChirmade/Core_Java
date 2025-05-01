package com.collection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TwelveClass {

	public static void main(String[] args) throws Exception {

		List<List<Integer>> lst = new ArrayList<>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.print("Enter space separated integers & enter 'stop' for end of the line : ");

			String str = br.readLine();
			if (str.equalsIgnoreCase("stop")) {
				break;
			}

			List<Integer> l = new ArrayList<Integer>();

			String num[] = str.split(" ");
			for (String n : num) {
				try {
					l.add(Integer.parseInt(n));
				} catch (NumberFormatException e) {
					System.out.println("Give only integers no other...");
					l.clear();
					break;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			if (!l.isEmpty()) {
				lst.add(l);
			}

		}

		int maxsum = 0;
		int totalsum = 0;
		int maxindex = -1;
		int index = 0;

		Iterator<List<Integer>> itr1 = lst.iterator();
		while (itr1.hasNext()) {
			List<Integer> cl = itr1.next();
			Iterator<Integer> itr2 = cl.iterator();

			int sum = 0;

			while (itr2.hasNext()) {
				sum += itr2.next();
			}

			totalsum += sum;

			if (sum > maxsum) {
				maxsum = sum;
				maxindex = index;
			}
			index++;
		}

		if (maxindex != -1) {
			System.out.println("List with the highest sum : " + lst.get(maxindex));
			System.out.println("Maximum index of highest sum : " + maxindex);
			System.out.println("Total sum of all elements : " + totalsum);
		} else {
			System.out.println("No intput in correct format.");
		}

	}

}
