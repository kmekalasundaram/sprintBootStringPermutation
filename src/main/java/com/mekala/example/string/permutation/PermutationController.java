package com.mekala.example.string.permutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import com.mekala.example.string.permutation.PermutationService;

@RestController
public class PermutationController {
	

	@AutoWired
	private PermutationService permutationService;


	@GetMapping(value="/string-permutation")
	public String getStringPermutation(@Valid final String inputStr) {

		return permutationService.getPermutationsForString();
	
	}

}
