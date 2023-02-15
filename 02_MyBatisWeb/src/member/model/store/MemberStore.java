package member.model.store;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import member.model.vo.Member;
import member.model.vo.Pagination;

public interface MemberStore {
	
	/**
	 * 멤버 등록 Store
	 * @param session
	 * @param member
	 * @return int
	 */
	public int insertMember(SqlSession session, Member member);
	
	
	/**
	 * 멤버 정보 수정 Store
	 * @param session
	 * @param member
	 * @return int
	 */
	public int updateMember(SqlSession session, Member member);
	
	
	/**
	 * 멤버 삭제 Store
	 * @param session
	 * @param memberId
	 * @return int
	 */
	public int deleteMember(SqlSession session, String memberId);
	
	
	/**
	 * 전체 멤버 목록 조회 Store
	 * @param session
	 * @return List<Member>
	 */
	public List<Member> selectAllMembers(SqlSession session, Pagination pn);
	
	/**
	 * 아이디로 회원조회 Store
	 * @param memberId
	 * @return Member
	 */
	public Member selectOneById(SqlSession session, String memberId);
	
	/**
	 * 멤버 로그인 Store
	 * @param member
	 * @return Member
	 */
	public Member checkMemberLogin(SqlSession session, Member member);

	
	/**
	 * 페이지 네비게이터 생성 Store
	 * @param session
	 * @param currentPage
	 * @return String
	 */
	public String generateNavi(SqlSession session, int currentPage);
	
	
	/**
	 * 전체 회원 수 Store
	 * @param session
	 * @return int
	 */
	public int getTotalCount(SqlSession session);
}
