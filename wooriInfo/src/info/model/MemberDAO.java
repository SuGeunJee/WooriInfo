package info.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import info.model.dto.CommuteMateDTO;
import info.model.dto.MemberDTO;
import info.model.util.DBUtil;

public class MemberDAO {

	// 멤버 등록
	public static boolean addMember(MemberDTO memberDto) throws SQLException {
		return false;
	}

	// 모든 멤버 정보 반환
	public static ArrayList<MemberDTO> getAllMembers() throws SQLException {
		return null;

	}

	// 노트북 번호로 해당 멤버의 모든 정보 반환
	public static MemberDTO getMemberByLaptopNumber(String laptopNumber) throws SQLException {
		return null;

	}

	// 이름으로 해당 멤버의 모든 정보 반환
	public static ArrayList<MemberDTO> getsMemberByName(String name) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		// 동명이인 있을 수 있어 ArrayList로 처리
		ArrayList<MemberDTO> members = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from member where name=?");
			pstmt.setString(1, name);
			rset = pstmt.executeQuery();
			members = new ArrayList<MemberDTO>();
			while (rset.next()) {
				members.add(MemberDTO.builder()
						.laptopNumber(rset.getString(1))
						.name(rset.getString(2))
						.address(rset.getString(3))
						.mateStatus(rset.getBoolean(4))
						.phoneNumber(rset.getString(5))
						.goal(rset.getString(6))
						.desiredStudy(rset.getString(7))
						.build());
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return members;
	}

	// 등하교 메이트 구하는(O) 멤버의 노트북 번호, 이름 조회
	public static ArrayList<CommuteMateDTO> getMembersLaptopNumberAndNameByMateStatus() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<CommuteMateDTO> members = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select laptop_number, name from member where mate_status=?");
			pstmt.setBoolean(1, true);
			rset = pstmt.executeQuery();
			members = new ArrayList<CommuteMateDTO>();
			
			while (rset.next()) {
				members.add(CommuteMateDTO.builder()
						.laptopNumber(rset.getString(1))
						.name(rset.getString(2))
						.build());
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return members;
	}

	// 노트북 번호로 멤버 정보 수정
	public static boolean updateMember(String laptopNumber, String password) throws SQLException {
		// 비밀번호 확인 로직 추가

		return false;
	}

	// 노트북 번호로 해당 멤버의 정보 삭제
	public static boolean deleteMember(String laptopNumber, String password) throws SQLException {
		// 비밀번호 확인 로직 추가

		return false;
	}

	// 노트북 번호로 조회한 비밀번호와 DB에 저장된 비밀번호가 동일한지 확인
	public static boolean checkPassword(String laptopNumber, String password) throws SQLException {
		return false;
	}
}
