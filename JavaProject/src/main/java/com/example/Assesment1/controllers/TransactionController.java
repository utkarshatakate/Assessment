package com.example.Assesment1.controllers;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Assesment1.models.WalletUser;
import com.example.Assesment1.repository.TransactionRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/transaction")
public class TransactionController {
	@Autowired TransactionRepository  transactionRepository;
	
    @GetMapping("/getData")
    public List<WalletUser> getData() {
    	 List<WalletUser> data=transactionRepository.findAll();
    	 System.out.println("in transaction controller "+data.size());
        return data;
    }
    
    @PostMapping("/saveData")
    public WalletUser saveData(@RequestBody WalletUser data) {
    	 System.out.println("in transaction controller saveData "+data.getSendingAmt());
    	 WalletUser result=transactionRepository.save(data);
    	 System.out.println("in transaction controller saveData "+result.getUserid());
    	 return result;
    }
    
	@DeleteMapping("/deleteData/{uid}")
	public boolean deleteData(@PathVariable Long uid, @RequestHeader HttpHeaders headers
			, HttpServletRequest request) {
		
		HashMap<String, Object> viewData = new HashMap<>();
	
		    transactionRepository.deleteById(uid);
		
		return true;
	}

}
