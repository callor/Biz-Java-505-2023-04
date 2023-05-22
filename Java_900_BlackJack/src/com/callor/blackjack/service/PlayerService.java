package com.callor.blackjack.service;

import com.callor.blackjack.models.CardDto;

public interface PlayerService {
	
	public void hit(CardDto card);
	public void showDeck();
	public int getScore() ;

}
