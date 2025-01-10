package info.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import info.model.dto.CommuteMateDTO;
import info.model.dto.MemberDTO;

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
	public static ArrayList<MemberDTO> getMemberByName(String name) throws SQLException {
		return null;

	}

	// 등하교 메이트 구하는(O) 멤버의 노트북 번호, 이름 조회
	public static ArrayList<CommuteMateDTO> getMembersLaptopNumberAndNameByMateStatus() throws SQLException {
		return null;

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
