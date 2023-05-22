package com.callor.blackjack.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import com.callor.blackjack.models.CardDto;
import com.callor.blackjack.utils.Line;

/*
 * hit() : 카드 받기
 * showDeck() : 보유한 카드 보이기
 * showScore() : 보유한 카드의 점수 보이기
 */
public class PlayerServiceV1 {
	
	// player 가 get(취득한, hit한) 카드를 저장할 list
	protected final List<CardDto> deckList;
//	protected final DeckServiceV1 deckService;
	protected final String playerName;

	/*
	 * new PlayerService() 으로 생성자를 호출하면
	 * 		playerName 을 "딜러" 로 설정
	 * new PlayerService("타짜") 으로 생성자를 호출하면
	 * 		playerName 을 "타짜" 로 설정
	 */
	public PlayerServiceV1() {
		this("딜러");
	}
	public PlayerServiceV1(String playerName) {
		// TODO Auto-generated constructor stub
		deckList = new ArrayList<>();
//		deckService = new DeckServiceV1();
		this.playerName = playerName;
	}	
	
	public void hit(CardDto card) {
		deckList.add(card);
	}

	public void showDeck() {
		System.out.println(Line.dLine(100));
		System.out.printf("%s, 받은카드 : %d매\n", playerName, deckList.size());
		System.out.println(Line.sLine(100));
		String[] patterns = deckList.get(0).getPattern();
		
		for(int rows = 0 ; rows < patterns.length ; rows ++) {
			for(CardDto cardDto : deckList) {
				System.out.print(cardDto.getPattern()[rows]);
			}
			System.out.println();
		}
		
		System.out.println(Line.dLine(100));
	}
	
	public int getScore() {
		int score = 0 ;
		for(CardDto card : deckList) {
			score += card.value;
		}
		return score;
	}
	
	
	
	
	

}
