package javabook1.array;

public class DefineDemo {

	public static void main(String[] args) {
		
		// [문제1] 프로젝트 팀원의 이름을 저장하는 배열을 생성하시오.
		String[] team = {"이현주", "조다혜"};
	
		
		// [문제2] 프로제트 팀원의 이름을 저장하는 배열을 출력하시오.(for문 사용)
		for(int i = 0; i <team.length; i++) {
			System.out.println("팀원 이름 : " + team[i]);
		}
			
		
		// [문제3] 프로젝트 팀원의 이름과 성별을 저장하는 배열을 생성하시오.
		System.out.println("=======================");
		String[][] team1 = {
				{"이현주", "조다혜"},
				{"여자", "여자"}
		};
		
		for(int i = 0; i <2; i++) {
			System.out.println("팀원 이름 : " + team1[0][i]);
			System.out.println("팀원 성별 : " + team1[1][i]);
			
		}
		
		// [문제4] 프로젝트 팀원을 저장한 배열에서 자신의 이름만 출력하시오
		System.out.println("======================");
		System.out.println(team[1]);
		
		
	
	}

}
