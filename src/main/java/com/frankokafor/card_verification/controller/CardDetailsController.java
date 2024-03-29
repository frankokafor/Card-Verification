package com.frankokafor.card_verification.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.frankokafor.card_verification.model.CardInfo;
import com.frankokafor.card_verification.responses.InfoResponse;
import com.frankokafor.card_verification.service.CardDetailsInfoService;

@Controller
public class CardDetailsController {
	@Autowired
	private CardDetailsInfoService service;
	

	@GetMapping(path = "/card-scheme/verify/{cardNumber}", produces = {MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public ResponseEntity getInfo(@PathVariable("cardNumber") String cardNumber) {
		return new ResponseEntity<>(service.getCardInfo(cardNumber),HttpStatus.OK);
	}

	@GetMapping(path = "/card-scheme/stats", produces = {MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public ResponseEntity getAllDrinks(@RequestParam(value = "start", defaultValue = "0") int start,
			@RequestParam(value = "limit", defaultValue = "25") int limit) {
		return new ResponseEntity<>(service.getCardStats(start, limit), HttpStatus.OK);
	}
	
	@RequestMapping("/")
	public String homePage() {
		return "index";
	}

	@RequestMapping(value = "/show/{cardNumber}",method = RequestMethod.GET)
	public ModelAndView showDetails(@PathVariable("cardNumber") String cardNumber) {
		ModelAndView mav = new ModelAndView("show_card_details");
		InfoResponse response = service.getCardInfo(cardNumber);
		mav.addObject("response", response);
		return mav;
	}
	
	@RequestMapping("/show/all")
	public String showStats(Model model) {
		List<CardInfo> cards = service.allCards();
		model.addAttribute("cards", cards);
		return "cards_stats";
	}
	
}
