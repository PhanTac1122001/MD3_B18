package com.tac.ss18b3.controller;


import com.tac.ss18b3.model.Account;
import com.tac.ss18b3.service.IAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class AccountController
{
	private final IAccountService accountService;
	

	@GetMapping
	public String findAll(Model model)
	{
		model.addAttribute("accounts", accountService.findAll());
		return "accounts";
	}
	
	@GetMapping("/add")
	public String viewAdd()
	{
		return "add_account";
	}
	
	@PostMapping("/add")
	public String doAddAccount(@ModelAttribute Account account)
	{
		accountService.save(account);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteAccount(@PathVariable Long id)
	{
		accountService.deleteById(id);
		return "redirect:/";
	}
	
}
