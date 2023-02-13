package notice.model.service;

import java.util.List;

import notice.model.vo.Notice;

public interface NoticeService {
	
	/**
	 * 공지사항 등록 Service
	 * @param notice
	 */
	public int insertNotice(Notice notice);
	//인터페이스는 몸체 {}가 없음
	
	/**
	 * 공지사항 목록 조회 Service
	 * @return
	 */
	public List<Notice> printAllNotice();
	
}
