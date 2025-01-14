package info.view;

import java.util.Optional;

import info.controller.MemberController;
import info.model.dto.MemberInfoDTO;

public class RunningStartView {

	public static void main(String[] args) {
		RunningStartView consoleView = new RunningStartView();
		consoleView.run();
	}

	public void run() {
		printProgram();
		while (true) {
			printMenu();
			int choice = getUserInput("\n --> 메뉴를 선택하세요 (0-3): ");
			System.out.println("\n");

			switch (choice) {
			case 1 -> viewAllMembers();
			case 2 -> searchMemberMenu();
			case 3 -> viewMyInfo();
			case 0 -> {
				System.out.println("프로그램 종료.");
				return;
			}
			default -> System.out.println("\n\n\n\n\n----잘못된 선택입니다. 다시 시도해주세요!----\n\n\n\n\n");
			}
		}
	}

	private void printProgram() {
		System.out.println("\n\n🟪🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥");
		System.out.println("\n\t🎉🎈 안녕하세요! WOORI INFO 입니다. 🎈🎉");
		System.out.println("📚✏️ 궁금했던 클라우드 엔지니어링 친구들 정보를 확인해보세요! ✏️📚");
		System.out.println("    ✨😎 함께하면 더 즐거운 우리 반 정보 관리 시작! ✨😎");
		System.out.println("\n🟪🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥");
	}

	private void printMenu() {
		System.out.println("\n\n[ 🏫 우리 반 프로필 시스템 🏫 ]");
		System.out.println("===========================");
		System.out.println("  1. 모든 친구들 정보 ✨");
		System.out.println("---------------------------");
		System.out.println("  2. 궁금한 친구들 정보 😎");
		System.out.println("---------------------------");
		System.out.println("  3. 내 정보 👀");
		System.out.println("---------------------------");
		System.out.println("  0. 프로그램 종료 ");
		System.out.println("===========================");
	}

	private int getUserInput(String prompt) {
		System.out.print(prompt);
		try {
			return new java.util.Scanner(System.in).nextInt();
		} catch (Exception e) {
			System.out.println("숫자를 입력해주세요.");
			return -1; // 잘못된 입력
		}
	}

	private String getUserInputString(String prompt) {
		System.out.print(prompt);
		String input = new java.util.Scanner(System.in).nextLine();
		return input.isEmpty() ? null : input; // 입력이 없으면 null 반환
	}

	private void viewAllMembers() {
		System.out.println("\n=== 친구들 정보 보기 ===");
		// 전체 친구 정보 출력 로직
		MemberController.getAllMembers();
	}

	private void searchMemberMenu() {
		System.out.println("\n=== 궁금한 친구 정보 🔍 ===");
		System.out.println("\n1. 이름으로 검색 ");
		System.out.println("2. 등하교 메이트가 원하는 친구 검색 🚶");
		System.out.println("3. 전체 멤버의 이름, 주소 검색 ");
		System.out.println("4. 전체 멤버의 이름, 전화번호 검색 ");
		System.out.println("0. 이전 메뉴로 돌아가기");

		int subChoice = getUserInput("\n --> 검색 옵션을 선택하세요 (0-3): ");
		switch (subChoice) {
		case 1 -> searchByName();
		case 2 -> searchByMateStatusO();
		case 3 -> searchAllNamesAndAddresses();
		case 4 -> searchAllNamesAndPhoneNumbers();
		case 0 -> System.out.println("이전 메뉴로 돌아갑니다.");
		default -> System.out.println("잘못된 선택입니다. 다시 시도해주세요.");
		}
	}

	private void searchByName() {
		System.out.print("검색할 친구의 이름을 입력하세요: ");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("\n=== 결과: 이름으로 검색 ===");
		// 이름으로 친구 검색 로직
		MemberController.viewMembersByName(name);
		System.out.println("입력한 이름: " + name);
	}

	private void searchByMateStatusO() {
		System.out.println("\n=== 결과: 등하교 메이트가 있는 친구 목록 ===");
		// 등하교 메이트가 있는 친구(O) 검색 로직
		MemberController.viewMembersLaptopAndNameByMateStatus();
		System.out.println("\n\n등하교 메이트가 있는 친구들 출력했습니다!");
		System.out.println("------------------------------");

	}

	private void searchAllNamesAndAddresses() {
		System.out.println("\n=== 결과: 모든 친구들의 이름과 주소 목록 ===");
		MemberController.getAllMembersNameAndAddress();
		System.out.println("\n모든 친구들의 이름과 주소 목록을 출력했습니다!");
		System.out.println("------------------------------");
	}

	private void searchAllNamesAndPhoneNumbers() {
		System.out.println("\n=== 결과: 모든 친구들의 이름과 전화번호 목록 ===");
		MemberController.getAllMembersNamesAndPhoneNumbers();
		System.out.println("\n모든 친구들의 이름과 전화번호 목록을 출력했습니다!");
		System.out.println("------------------------------");
	}

	private void viewMyInfo() {
		System.out.println("\n=== 내 정보 보기 😎 ===");

		String notebookNumber = getUserInputString("당신의 노트북 번호를 입력하세요: ");

		// 노트북 번호로 멤버 조회
		if (MemberController.checkLaptopNumber(notebookNumber)) {
			// 결과가 True인 경우, 조회, 수정, 삭제, 뒤로 기능 필요
			System.out.println("\n1. 내 정보 조회하기");
			System.out.println("2. 내 정보 수정하기");
			System.out.println("3. 내 정보 삭제하기");
			System.out.println("0. 이전 메뉴로 돌아가기");

			int subChoice = getUserInput("\n --> 원하는 기능을 선택하세요 (0-3): \n");
			System.out.println("  [내 정보]");

			switch (subChoice) {
			case 1 -> MemberController.viewMemberByLaptop(notebookNumber);
			case 2 -> updateMyInfo(notebookNumber);
			case 3 -> deleteMyInfo(notebookNumber);
			case 0 -> System.out.println("이전 메뉴로 돌아갑니다.");
			default -> System.out.println("잘못된 선택입니다. 다시 시도해주세요.");
			}
		} else {
			System.out.println("== 해당 번호는 존재하지 않습니다. 내 정보를 추가해주세요! ==\n");
			System.out.println("1. 내 정보 추가하기");
			System.out.println("0. 이전 메뉴로 돌아가기");
			// 결과가 False인 경우, 추가, 뒤로 기능 필요
			int subChoice = getUserInput("\n --> 원하는 기능을 선택하세요 (0-1): ");
			switch (subChoice) {
			case 1 -> addMyInfo(notebookNumber);
			case 0 -> System.out.println("이전 메뉴로 돌아갑니다.");
			default -> System.out.println("잘못된 선택입니다. 다시 시도해주세요.");
			}
		}
	}

	// 수정 눌렀을 때
	private void updateMyInfo(String notebookNumber) {
		System.out.println("\n== 수정할 항목을 선택하세요. ==\n");
		System.out.println("1. 이름 수정");
		System.out.println("2. 주소 수정");
		System.out.println("3. 등하교 메이트 희망 수정");
		System.out.println("4. 핸드폰 번호 수정");
		System.out.println("5. 2025년 목표 수정");
		System.out.println("6. 희망하는 스터디 수정");
		System.out.println("0. 이전 메뉴로 돌아가기\n");

		int subChoice = getUserInput(" --> 수정할 항목을 선택하세요 (0-6): ");
		String password = getUserInputString(" --> 비밀번호를 입력하세요 : ");
		switch (subChoice) {
		case 1 -> updateName(notebookNumber, password);
		case 2 -> updateAddress(notebookNumber, password);
		case 3 -> updateCommuteMate(notebookNumber, password);
		case 4 -> updatePhoneNumber(notebookNumber, password);
		case 5 -> updateGoal(notebookNumber, password);
		case 6 -> updateDesiredStudy(notebookNumber, password);
		case 0 -> System.out.println("이전 메뉴로 돌아갑니다.");
		default -> System.out.println("잘못된 선택입니다. 다시 시도해주세요.");
		}

//		int subChoiceAdd = getUserInput("메뉴를 선택하세요 (1-2): ");
//		switch (subChoiceAdd) {
//			case 1 -> addMyInfo(notebookNumber); // 내 정보 추가 호출
//			case 2 -> System.out.println("이전 메뉴로 돌아갑니다.");
//			default -> System.out.println("잘못된 선택입니다. 다시 시도해주세요.");
//		}
	}

	private void addMyInfo(String notebookNumber) {
		System.out.println("\n=== 내 정보 추가 ===");

		// 사용자로부터 정보 입력 받기
		String name = getUserInputString(" -> 이름을 입력하세요: ");
		String address = getUserInputString(" -> 주소(구까지)를 입력하세요: ");
		String commuteMate = getUserInputString(" -> 등하교 메이트 희망 여부(O/X)를 입력하세요: ");
		String phoneNumber = getUserInputString(" -> 핸드폰 번호를 입력하세요: ");
		String goal2025 = getUserInputString(" -> 2025년 목표를 입력하세요: ");
		String desiredStudy = getUserInputString(" -> 희망하는 스터디를 입력하세요: ");
		String password = getUserInputString(" -> 비밀번호를 입력하세요 (삭제/수정시 사용): ");

		// DB에 추가하는 로직 (임시 로직)
		System.out.println("\n입력한 정보는 다음과 같습니다:");
		System.out.println("---------------------------");
		System.out.println("이름: " + name);
		System.out.println("주소: " + address);
		System.out.println("등하교 메이트 희망: " + commuteMate);
		System.out.println("핸드폰 번호: " + phoneNumber);
		System.out.println("2025년 목표: " + goal2025);
		System.out.println("희망하는 스터디: " + desiredStudy);
		System.out.println("비밀번호: " + password);
		System.out.println("---------------------------");

		Boolean commuteMateBool = false;
		if (commuteMate.toUpperCase().equals("O")) {
			commuteMateBool = true;
		}
		MemberInfoDTO newMember = new MemberInfoDTO(notebookNumber, name, address, commuteMateBool, phoneNumber,
				goal2025, desiredStudy, password);
		MemberController.addMember(newMember);
		System.out.println("\n[내 정보가 추가되었습니다.]");
	}

	private void updateName(String notebookNumber, String password) {
		String newName = getUserInputString("새로운 이름을 입력하세요: ");
		if (MemberController.updateName(notebookNumber, newName, password)) {
			System.out.println("\n[이름이 성공적으로 수정되었습니다.]");
		} else {
			System.out.println("[이름 수정에 실패했습니다.]");
		}
	}

	private void updateAddress(String notebookNumber, String password) {
		String newAddress = getUserInputString("새로운 주소를 입력하세요: ");
		if (MemberController.updateAddress(notebookNumber, newAddress, password)) {
			System.out.println("\n[주소가 성공적으로 수정되었습니다.]");
		} else {
			System.out.println("[비밀번호가 일치하지 않습니다.]");
		}
	}

	private void updateCommuteMate(String notebookNumber, String password) {
		if (MemberController.updateMateStatus(notebookNumber, true, password)) {
			System.out.println("\n[등하교 메이트 희망이 성공적으로 수정되었습니다.]");
		} else {
			System.out.println("[등하교 메이트 희망 수정에 실패했습니다.]");
		}
	}

	private void updatePhoneNumber(String notebookNumber, String password) {
		String newPhoneNumber = getUserInputString("새로운 핸드폰 번호를 입력하세요: ");
		if (MemberController.updatePhoneNumber("phone_number", newPhoneNumber, notebookNumber)) {
			System.out.println("\n[핸드폰 번호가 성공적으로 수정되었습니다.]");
		} else {
			System.out.println("[핸드폰 번호 수정에 실패했습니다.]");
		}
	}

	private void updateGoal(String notebookNumber, String password) {
		String newGoal = getUserInputString("새로운 2025년 목표를 입력하세요: ");
		if (MemberController.updateGoal(notebookNumber, newGoal, password)) {
			System.out.println("\n[2025년 목표가 성공적으로 수정되었습니다.]");
		} else {
			System.out.println("[2025년 목표 수정에 실패했습니다.]");
		}
	}

	private void updateDesiredStudy(String notebookNumber, String password) {
		String newDesiredStudy = getUserInputString("새로운 희망하는 스터디를 입력하세요: ");
		if (MemberController.updateDesiredStudy(notebookNumber, newDesiredStudy, password)) {
			System.out.println("\n[희망하는 스터디가 성공적으로 수정되었습니다.]");
		} else {
			System.out.println("[희망하는 스터디 수정에 실패했습니다.]");
		}
	}

	// 삭제
	private void deleteMyInfo(String notebookNumber) {
		String password = getUserInputString(" --> 비밀번호를 입력하세요 : ");
		String deleteYN = getUserInputString(" --> 정말로 삭제 하시겠습니까? (Y/N) ");
		if (deleteYN.toUpperCase().equals("Y")) {
			MemberController.deleteMember(notebookNumber, password);
		} else {
			System.out.println("\n [삭제를 취소 하셨습니다.] ");
		}
	}
//	private boolean updateFieldInDB(String fieldName, String newValue, String notebookNumber, String password) {
//		// 실제 DB 연동 로직 작성
//		// UPDATE user_info SET field_name = ? WHERE notebook_number = ?
//		System.out.println(fieldName + " 업데이트: " + newValue);
//		return true; // 임시 로직
//	}
}
