package notice.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import common.SqlSessionTemplate;
import notice.model.store.NoticeStore;
import notice.model.store.NoticeStoreLogic;
import notice.model.vo.Notice;

public class NoticeServiceImpl implements NoticeService{

	private NoticeStore nStore;
	
	public NoticeServiceImpl() {
		nStore = new NoticeStoreLogic();
	}
			
	@Override
	public int insertNotice(Notice notice) {
		// 1. 연결 생성 -> Store에 전달
		// 2. 커밋/롤백
		SqlSession sqlSession = SqlSessionTemplate.getSqlSession(); //연결생성
		int result = nStore.insertNotice(sqlSession, notice);
		sqlSession.commit();
		return result;
	}

	@Override
	public List<Notice> printAllNotice() {
		SqlSession sqlSession = SqlSessionTemplate.getSqlSession();
		List<Notice> nList = nStore.selectAllNotice(sqlSession);
		return nList;
	}
	
}
