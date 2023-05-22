package com.callor.blackjack.exec;

import java.util.List;

import com.callor.blackjack.models.CardDto;
import com.callor.blackjack.service.DeckServiceV1;
import com.callor.blackjack.service.PlayerServiceV1;

public class JackExecA {
	
	public static void main(String[] args) {
		
		DeckServiceV1 deckService = new DeckServiceV1();
		
		PlayerServiceV1 딜러 = new PlayerServiceV1();
		PlayerServiceV1 타자 = new PlayerServiceV1("타짜");
		PlayerServiceV1 영수 = new PlayerServiceV1("영수");
		
		deckService.newCardDeck();
		
		딜러.hit(deckService.getDeck());
		타자.hit(deckService.getDeck());
		영수.hit(deckService.getDeck());
		
		딜러.hit(deckService.getDeck());
		영수.hit(deckService.getDeck());
		타자.hit(deckService.getDeck());
		
		딜러.showDeck();
		타자.showDeck();
		영수.showDeck();
		
		int 딜러점수 = 딜러.getScore();
		int 타자점수 = 타자.getScore();
		int 영수점수 = 영수.getScore();
		
		if(딜러점수 > 타자점수 && 딜러점수 > 영수점수) {
			System.out.println("딜러 승리");
		} else if(타자점수 > 딜러점수 && 타자점수 > 영수점수) {
			System.out.println("타자 승리");
		} else if(영수점수 > 타자점수 && 영수점수 > 딜러점수) {
			System.out.println("영수 승리");
		}
		
		
		
		
		
		
	}

}
