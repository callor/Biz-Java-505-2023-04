package com.callor.blackjack.service;

import java.util.List;

import com.callor.blackjack.models.CardDto;

public interface DeckService {
	
	public List<CardDto> newCardDeck();
	public CardDto getDeck();
	public void makeDeckList();
	
}
