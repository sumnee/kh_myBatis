package notice.model.store;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import notice.model.vo.Notice;

public interface NoticeStore {
	//Dao = Store
	//인터페이스는 몸체 {}가 없음
	
	/**
	 * 공지사항 등록 Store
	 * @param sqlSession
	 * @param notice
	 * @return
	 */
	public int insertNotice(SqlSession sqlSession, Notice notice);
	
	/**
	 * 공지사항 목록 조회 Store
	 * @param sqlSession
	 * @return
	 */
	public List<Notice> selectAllNotice(SqlSession sqlSession);
}
