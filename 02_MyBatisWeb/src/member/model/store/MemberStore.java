package member.model.store;

import org.apache.ibatis.session.SqlSession;

import member.model.vo.Member;

public interface MemberStore {
	
	/**
	 * 멤버 등록 store
	 * @param session
	 * @param member
	 * @return int
	 */
	public int insertMember(SqlSession session, Member member);
	
	/**
	 * 멤버 로그인 store
	 * @param member
	 * @return Member
	 */
	public Member checkMemberLogin(SqlSession session, Member member);

}
