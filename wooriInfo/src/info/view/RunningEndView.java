package info.view;

import java.util.ArrayList;

import info.model.dto.CommuteMateDTO;
import info.model.dto.MemberDTO;

public class RunningEndView {
	
	//모든 member 출력
	public static void memberListView(ArrayList<MemberDTO> memberList) {
		int listSize = memberList.size();
		
		if(listSize != 0) {
			int count = 1;
			
			for(MemberDTO p : memberList) {
				// ; 정상 종료시 count 변수값 1 증가
				System.out.println("\n------- " + (count++)+"번" + " -------\n" + p); 
			} 
			
		}else {
			System.out.println("검색 정보 0");
		}
	}
	
	//모든 member 출력
	public static void CommuteMateMemberListView(ArrayList<CommuteMateDTO> memberList) {
		int listSize = memberList.size();
		
		if(listSize != 0) {
			int count = 1;
			
			for(CommuteMateDTO p : memberList) {
				// ; 정상 종료시 count 변수값 1 증가
				System.out.println("\n------- " + (count++)+"번" + " -------\n" + p); 
			} 
			
		}else {
			System.out.println("검색 정보 0");
		}
	}
	
	//특정 member 정보 출력
	public static void memberView(MemberDTO member){
		System.out.println(member);		
	}
	//Object 출력
	public static void allView(Object object){
		System.out.println(object);
	}
	
	//예외 상황 출력
	public static void showError(String message){
		System.out.println(message);		
	}
}
