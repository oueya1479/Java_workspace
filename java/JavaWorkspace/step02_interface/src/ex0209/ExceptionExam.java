package ex0209;

public class ExceptionExam {
	public static void main(String[] args) {

		try {
			System.out.println("---메인 시작---");
			String data = args[0];
			int convertNo = Integer.parseInt(data);		
			int result = 100 / convertNo;
			
		} catch(ArrayIndexOutOfBoundsException e) {
			
		} catch(NumberFormatException e) {
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("---메인 끝---");
	}
}