package info.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import info.model.MemberDAO;
import info.model.dto.MemberDTO;
import info.model.dto.MemberInfoDTO;
import info.view.RunningEndView;

public class MemberController {
	
	// 노트북 번호 DB 존재 여부 검증 로직
	public static boolean checkLaptopNumber(String laptopNumber) {
		boolean result = false;
		try {
			result = MemberDAO.checkLaptopNumber(laptopNumber);
		} catch (SQLException s) {
			s.printStackTrace();
//			/RunningEndView.showError("새로운 멤버 저장 시 에러 발생");
		}
		return result;	
	}
	
	// 새로운 멤버 저장 로직
	public static boolean addMember(MemberInfoDTO memberinfoDto) {
		boolean result = false;

		try {
			result = MemberDAO.addMember(memberinfoDto);
		} catch (SQLException s) {
			s.printStackTrace();
			// RunningEndView.showError("새로운 멤버 저장 시 에러 발생");
		}
		return result;
	}

	// 모든 멤버 검색 로직
	public static void getAllMembers() {
		try {
			RunningEndView.memberListView(MemberDAO.getAllMembers());
		} catch (SQLException s) {
			RunningEndView.showError("모든 멤버 검색 시 에러 발생");
		}
	}

	// 노트북 번호로 해당 멤버의 모든 정보 검색
	public static void viewMemberByLaptop(String laptopNumber) {
		try {
			RunningEndView.memberView(MemberDAO.getMemberByLaptopNumber(laptopNumber));
		} catch (SQLException e) {
			e.printStackTrace();
			RunningEndView.showError("노트북 번호로 해당 멤버의 모든 정보 검색 시 에러 발생");
		}
//		} catch (NotExistException x) {
//			RunningEndView.showError("등록되지 않은 멤버입니다.");
//		}
	}

	// 이름으로 해당 멤버의 모든 정보 검색
	public static void viewMembersByName(String name) {
		try {
			RunningEndView.memberListView(MemberDAO.getMembersByName(name)); 
		} catch (SQLException e) {
			//e.printStackTrace();
			RunningEndView.showError("이름으로 해당 멤버의 모든 정보 검색 시 에러 발생");
		}
	}

	// 등하교 메이트 구하는 멤버의 노트북 번호, 이름 검색
	public static void viewMembersLaptopAndNameByMateStatus() {
		try {
			RunningEndView.CommuteMateMemberListView(MemberDAO.getMembersLaptopNumberAndNameByMateStatus());
		} catch (SQLException e) {
			e.printStackTrace();
			// RunningEndView.showError("등하교 메이트 구하는 멤버의 노트북 번호, 이름 검색 시 에러 발생");
		}
	}

	// 노트북 번호로 이름 수정
	public static boolean updateName(String laptopNumber, String newName, String password) {
		boolean result = false;
		try {
			result = MemberDAO.updateName(laptopNumber, newName, password);
		} catch (SQLException s) {
			s.printStackTrace();
			// RunningEndView.showError("노트북 번호로 이름 수정");
		}
		return result;
	}

	// 노트북 번호로 주소 수정
	public static boolean updateAddress(String laptopNumber, String newAddress, String password) {
		boolean result = false;
		try {
			result = MemberDAO.updateAddress(laptopNumber, newAddress, password);
		} catch (SQLException s) {
			s.printStackTrace();
			// RunningEndView.showError("노트북 번호로 주소 수정");
		}
		return result;
	}

	// 노트북 번호로 등하교 메이트 상태 수정
	public static boolean updateMateStatus(String laptopNumber, boolean newMateStatus, String password) {
		boolean result = false;
		try {
			result = MemberDAO.updateMateStatus(laptopNumber, newMateStatus, password);
		} catch (SQLException s) {
			s.printStackTrace();
			// RunningEndView.showError("노트북 번호로 등하교 메이트 상태 수정");
		}
		return result;
	}

	// 노트북 번호로 전화번호 수정
	public static boolean updatePhoneNumber(String laptopNumber, String newPhoneNumber, String password) {
		boolean result = false;
		try {
			result = MemberDAO.updatePhoneNumber(laptopNumber, newPhoneNumber, password);
		} catch (SQLException s) {
			s.printStackTrace();
			// RunningEndView.showError("노트북 번호로 전화번호 수정");
		}
		return result;
	}

	// 노트북 번호로 목표 수정
	public static boolean updateGoal(String laptopNumber, String newGoal, String password) {
		boolean result = false;
		try {
			result = MemberDAO.updateGoal(laptopNumber, newGoal, password);
		} catch (SQLException s) {
			s.printStackTrace();
			// RunningEndView.showError("노트북 번호로 목표 수정");
		}
		return result;
	}

	// 노트북 번호로 희망 스터디 분야 수정
	public static boolean updateDesiredStudy(String laptopNumber, String newDesiredStudy, String password) {
		boolean result = false;
		try {
			result = MemberDAO.updateDesiredStudy(laptopNumber, newDesiredStudy, password);
		} catch (SQLException s) {
			s.printStackTrace();
			// RunningEndView.showError("노트북 번호로 희망 스터디 분야 수정");
		}
		return result;
	}

	// 노트북 번호로 해당 멤버의 정보 삭제
	public static boolean deleteMember(String laptopNumber, String password) {
		boolean result = false;
		try {
			result = MemberDAO.deleteMember(laptopNumber, password);
		} catch (SQLException s) {
			s.printStackTrace();
			// RunningEndView.showError("노트북 번호로 해당 멤버의 정보 삭제");
		}
		return result;
	}
}
