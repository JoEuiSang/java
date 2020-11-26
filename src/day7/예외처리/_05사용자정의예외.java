package day7.예외처리;

class Student {
	private int score;

	public int getScore() {
		return score;
	}

	public void setScore(int score) throws MyException{
		if (score < 0 || score >= 100)
			throw new MyException("제대로 된 값 넣어라");
			this.score = score;
	}

}

public class _05사용자정의예외 {
	Student st = new Student();

	public void setScore(int score) {
		try {
			st.setScore(score);
		} catch (MyException e) {
			try {
				st.setScore(0);
			} catch (MyException e1) {			
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		_05사용자정의예외 a = new _05사용자정의예외();
		a.setScore(101);
	}

}
