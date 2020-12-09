package com.simplilearn.collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestAllNumericSet {

	public static void main(String[] args) {
		// WAP for three different set 
		// priceSet -> Double -> HashSet();  -> Set<Double> priceSet = new HashSet();
		// numberSet ->Integer ->LinkedHashSet();
		// temperatureSet -> Float -> TreeSet()
		Set<Double> doubles=new HashSet<>();
		doubles.add((double) 466231);
		doubles.add((double) 466231);
		doubles.add((double) 461);
		doubles.add((double) 5231);
		doubles.add((double) 7231);
		System.out.println("Double:");
		for(Double d:doubles)
		{
			System.out.print(d +", ");
		}
		System.out.println();
		Set<Integer> integers=new LinkedHashSet<Integer>();
		integers.add(56789);
		integers.add(456789);
		integers.add(98765);
		System.out.println("Integers :");
		for(int i:integers)
		{
			System.out.print(i +", ");
		}
		System.out.println();
		Set<Float> floats=new TreeSet<>();
		floats.add((float) 56789);
		floats.add((float) 456789);
		floats.add((float) 98765);
		System.out.println("Floats :");
		for(float f:floats)
		{
			System.out.print(f +", ");
		}
		

	}

}
