package day7.����ó��;

class Student {
	private int score;

	public int getScore() {
		return score;
	}

	public void setScore(int score) throws MyException{
		if (score < 0 || score >= 100)
			throw new MyException("����� �� �� �־��");
			this.score = score;
	}

}

public class _05��������ǿ��� {
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
		_05��������ǿ��� a = new _05��������ǿ���();
		a.setScore(101);
	}

}
