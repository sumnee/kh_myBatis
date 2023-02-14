package member.model.service;

import java.util.List;

import member.model.vo.Member;
import member.model.vo.PageData;

public interface MemberService {
	
	/**
	 * 멤버 회원가입 Service
	 * @param mOne
	 * @return int
	 */
	public int registerMember(Member mOne);
	
	
	/**
	 * 멤버 정보 수정 Service
	 * @param member
	 * @return int
	 */
	public int modifyMember(Member member);

	
	/**
	 * 멤버 삭제 Service
	 * @param memberId
	 * @return int
	 */
	public int deleteMember(String memberId);
	
	
	/**
	 * 전체 멤버 목록 조회 Service
	 * @param currentPage
	 * @return PageData
	 */
	public PageData selectAllMembers(int currentPage);
	
	
	/**
	 * 아이디로 회원조회 Service
	 * @param memberId
	 * @return Member
	 */
	public Member selectOneById(String memberId);

	
	/**
	 * 멤버 로그인 Service
	 * @param member
	 * @return Member
	 */
	public Member checkMemberLogin(Member member);

}
