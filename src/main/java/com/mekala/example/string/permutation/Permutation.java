package com.mekala.example.string.permutation;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Permutation {

	public static Stream<String> getPermutationsForString(String str){
		if(str.isEmpty()){
			return Stream.empty();
		}

		if(Stream.of(str).allMatch(a -> a.equals(str.substring(0,1)))){
			return Stream.of(str);
		}

		return IntStream.range(0,str.length()).boxed()
				.flatMap(i -> getPermutationsForString(str.substring(0,i) + str.substring(i+1))
						.map(t -> str.charAt(i)+t));
	}

}
