package javase.base.exception;

public class TestFinally {
	public static void main(String[] args) throws Exception {
		try {
			String name = "������";
			int i = 3/0;
		} catch(Exception e) {
			throw new Exception("�����");
		} finally {
			System.out.println("");
		}
	}
}
