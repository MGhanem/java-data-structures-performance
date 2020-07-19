package io.ghanem.performance;

import java.util.ArrayList;

public class ArrayListInitSize
{


	public static void main(String[] args)
	{
		int testSize = 10000000;
		int wrightSize = 10000001;
		int wrongSize = 1000;

		long t = System.currentTimeMillis();

		ArrayList<String> x = new ArrayList<>();
		for (int i = 0; i < testSize; i++)
		{
			x.add("as");
		}

		long defaultTime = (System.currentTimeMillis() - t);
		System.out.println("default :: " + defaultTime);
		t = System.currentTimeMillis();

		ArrayList<String> y = new ArrayList<>(wrightSize);
		for (int i = 0; i < testSize; i++)
		{
			y.add("as");
		}

		long wrightTime = (System.currentTimeMillis() - t);
		System.out.println(
				"wright value :: " + wrightTime + " , " + (100 * wrightTime / defaultTime) + "%");
		t = System.currentTimeMillis();

		ArrayList<String> z = new ArrayList<>(wrongSize);
		for (int i = 0; i < testSize; i++)
		{
			z.add("as");
		}
		long wrongTime = (System.currentTimeMillis() - t);
		System.out.println("wrong value :: " + wrongTime + " , " + (100 * wrongTime / defaultTime) + "%");

		System.out.println("DOING IT WRIGHT TAKES " + (100 * wrightTime / wrongTime) + "% OF DOING IT WRONG!");
	}

}
