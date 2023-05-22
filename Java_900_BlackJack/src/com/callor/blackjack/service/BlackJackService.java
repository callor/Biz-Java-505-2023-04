package com.callor.blackjack.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.blackjack.service.impl.DeckServiceImplV1;
import com.callor.blackjack.service.impl.PlayerServiceImplV1;

public class BlackJackService {
	
	protected final List<PlayerService> playerList;
	protected final DeckService deckService;;
	
	public BlackJackService() {
		playerList = new ArrayList<>();
		deckService = new DeckServiceImplV1();
	}
	
	public void gameStart() {
		playerList.add(new PlayerServiceImplV1());
		playerList.add(new PlayerServiceImplV1("타짜"));
		playerList.add(new PlayerServiceImplV1("영수"));
		
		for(int i = 0 ; i < 2 ; i++) {
			for(PlayerService player : playerList) {
				player.hit(deckService.getDeck());
			}
		}
		if(playerList.get(0).getScore() < 17) {
			playerList.get(0).hit(deckService.getDeck());
		}
		for(PlayerService  player : playerList) {
			player.showDeck();
		}
		
		// play가 다수일 경우 승부를 어떻게 계산할 것인가?
		int maxScore = 0;
		String maxScorePlayer = "";
		for(PlayerService player : playerList) {
			int score = player.getScore();
			String playerName = player.getPlayName();
			if(score > maxScore) {
				maxScore = score;
				maxScorePlayer = playerName;
			}
		}
		System.out.printf("%s 승리, 점수 : %d",maxScorePlayer, maxScore);
		
		// 딜러(0 번 player)와 각 게이머간의 점수를 비교하여
		// 딜러 : 타짜 = 타짜승, 딜러 : 영수 = 영수승 을 출력
		// 단 각 player 의 점수가 21점 초과하면 무조건 패
		// 동점이면 무승부
		
		
		
	}

}
