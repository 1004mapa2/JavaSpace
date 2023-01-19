package issue;

public class Credit {

	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution('F'));
		
	}

}
class Solution {
	public String solution(char score) {
		String answer = "";
		
		if(score == 'A' || score == 'B') {
			answer += "Excellent";
		}
		else if(score == 'C' || score == 'D') {
			answer += "Good";
		}
		else {
			answer += "Bye";
		}
		
        return answer;
	}
}