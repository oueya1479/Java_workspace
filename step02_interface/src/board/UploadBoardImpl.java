package board;

public class UploadBoardImpl implements BoardInterface{

	@Override
	public  boolean insert(BoardVo board) {
		System.out.println("UploadBoardmpl�� insert");
		return false;
	}

	@Override
	public  boolean update(BoardVo board) {
		System.out.println("UploadBoardmpl�� update");
		return false;
	}

	@Override
	public  BoardVo selectByNo(int no) {
		System.out.println("UploadBoardmp3�� selectByNo�Դϴ�.");
		return null;
	}
	
	@Override
	public boolean delete(int no) {
		System.out.println("UploadBoardmp3�� selectByNo�Դϴ�.");
		return false;
	}

}