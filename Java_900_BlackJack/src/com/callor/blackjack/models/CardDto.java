package com.callor.blackjack.models;

/*
 * BlackJack 에서 사용하는 
 * 4벌의 suit : 다이아몬드, 하트, 스페이스, 클로버, 
 * 각 suit 시트별 13가지 denomination 값을 갖는다
 * 	: 숫자, 알파벳으로 구성 숫자는 액면가로 
 * 		알파벳 A:1(또는 11, 여기는 1로 설정)
 * 		그외 알파벳 10으로 설정
 * 총 52매(조커 제외)의 카드를 가지고 사용한다
 * 
 * => playing Card
 */
public class CardDto {
	
	public String suit;
	public String denomination;
	public int value;

	// 매개변수가 없는 기본생성자
	public CardDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	// 필드변수와 같은 매개변수를 갖는 임의 생성자(필드생성자)
	public CardDto(String suit, String denomination, int value) {
		super();
		this.suit = suit;
		this.denomination = denomination;
		this.value = value;
	}

	@Override
	public String toString() {
		return "CardDto [suit=" + suit + ", denomination=" + denomination + ", value=" + value + "]";
	}
	
	public String[] getPattern() {
		String[] patterns = {
				String.format("┌─────┐ "),
				String.format("│  %1s  │ ",this.suit),
				String.format("│     │ "),
				String.format("│  %2s │ ",this.denomination),
				String.format("└─────┘ "),
		};
		return patterns;
	}
	
	

}

