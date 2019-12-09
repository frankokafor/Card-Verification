package com.frankokafor.card_verification.service.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.web.client.RestTemplate;

import com.frankokafor.card_verification.repository.CardInfoRepository;


class CardDetailsServiceTest {

	@InjectMocks
	CardDetailsInfoServiceImpl service;
	@Mock
	CardInfoRepository repo;
	@Mock
	RestTemplate restTemplate;
	
	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
