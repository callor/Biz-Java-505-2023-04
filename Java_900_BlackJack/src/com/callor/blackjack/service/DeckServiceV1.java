package com.callor.blackjack.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.callor.blackjack.models.CardDto;

/*
 * 게임을 위한 52매의 카드 이미지를 생성하기
 * hit를 했을때 사용할 카드 제출하기
 */
public class DeckServiceV1 {
	
	// 52장의 CardDto를 갖는 List
	protected final List<CardDto> cardDeck;
	public DeckServiceV1() {
		cardDeck = new ArrayList<>();
	}
	
	public List<CardDto> newCardDeck() {
		if(cardDeck.isEmpty()) {
			makeDeckList();
		}
		for(int i = 0 ; i < 100 ; i++) {
			Collections.shuffle(cardDeck);
		}
		return cardDeck;
	}
	
	// shuffle 된 carDeck 에 한장씩 카드를 제출하기
	public CardDto getDeck() {
		try {
			return cardDeck.remove(0);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
	public void makeDeckList() {
		
		String strSuit = "◆♥♠♣";
		String strDenomination = "A234567890KQJ";
		
		String[] suits = strSuit.split("");
		String[] denoms = strDenomination.split("");
		
		// suits 와 denoms 배열을 2중 for 문으로 반복하면
		// 모두 52회 반복되는 코드가 생성
		for(String suit : suits) {
			for(String denom : denoms ) {
				CardDto cardDto = new CardDto();
				cardDto.suit = suit;
				try {
					int value = Integer.valueOf(denom);
					if(value == 0) value = 10;
					cardDto.denomination = value + ""; // 보이는 값
					cardDto.value = value; // 계산에 사용될 값
				} catch (Exception e) {
					cardDto.denomination = denom;
					if(denom.equals("A")) cardDto.value = 1;
					else cardDto.value = 10; 
				}
				cardDeck.add(cardDto);
			}
		}
	}

}
