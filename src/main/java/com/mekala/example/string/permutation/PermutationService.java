package com.mekala.example.string.permutation;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class PermutationService {

    public Set<String> getPermutationsForString(String inputStr){

        Set<String> result = Permutation.getPermutationsForString(inputStr)
                .collect(Collectors.toSet());

        result.forEach(System.out::println);

        return result;

    }
}
