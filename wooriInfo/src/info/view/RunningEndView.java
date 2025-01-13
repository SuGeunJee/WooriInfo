package info.view;

import java.util.ArrayList;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

import info.model.dto.CommuteMateDTO;
import info.model.dto.MemberDTO;

public class RunningEndView {

	// 모든 멤버 출력
	public static void memberListView(ArrayList<MemberDTO> memberList) {
		int listSize = memberList.size();

		if (listSize != 0) {
			AtomicInteger count = new AtomicInteger(1);
			
			memberList.stream()
					.forEach(p -> System.out.println("\n------- " + count.getAndIncrement() + "번" + " -------\n" + p));
		} else {
			System.out.println("검색 정보 0");
		}
	}

	// 등하교 메이트 찾는 모든 멤버 출력
	public static void CommuteMateMemberListView(ArrayList<CommuteMateDTO> memberList) {
		int listSize = memberList.size();

		if (listSize != 0) {
			int count = 1;
			for (CommuteMateDTO p : memberList) {
				// 정상 종료시 count 변수값 1 증가
				System.out.println("\n------- " + (count++) + "번" + " -------\n" + p);
			}
		} else {
			System.out.println("검색 정보 0");
		}
	}

	// 모든 멤버의 이름, 주소 출력
	public static void memberNamesAndAddressesView(ArrayList<MemberDTO> memberList) {
		System.out.println("\n[이름]\t[주소]");
		System.out.println("-----------------------");
		memberList.forEach(member -> System.out
				.println(member.getName() + "\t" + Optional.ofNullable(member.getAddress()).orElse("-")));
	}

	// 모든 멤버의 이름, 전화번호 출력
	public static void memberNamesAndPhoneNumbersView(ArrayList<MemberDTO> memberList) {
		System.out.println("\n[이름]\t[전화번호]");
		System.out.println("-----------------------");
		memberList.forEach(member -> System.out
				.println(member.getName() + "\t" + Optional.ofNullable(member.getPhoneNumber()).orElse("-")));
	}

	// 특정 member 정보 출력
	public static void memberView(MemberDTO member) {
		System.out.println(member);
	}

	// Object 출력
	public static void allView(Object object) {
		System.out.println(object);
	}

	// 예외 상황 출력
	public static void showError(String message) {
		System.out.println(message);
	}

}
