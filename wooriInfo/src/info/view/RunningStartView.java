package info.view;

public class RunningStartView {

	public static void main(String[] args) {
		RunningStartView consoleView = new RunningStartView();
		consoleView.run();
	}

	public void run() {
		while (true) {
			printMenu();
			int choice = getUserInput("메뉴를 선택하세요 (0-3): ");

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

	private void printMenu() {
		System.out.println("\n🎉🎈 안녕하세요! WOORI INFO 입니다. 🎈🎉");
		System.out.println("📚✏️ 궁금했던 클라우드 엔지니어링 친구들 정보를 확인해보세요! ✏️📚");
		System.out.println("✨😎 함께하면 더 즐거운 우리 반 정보 관리 시작! ✨😎");
		System.out.println("\n[  🏫 우리 반 프로필 시스템 🏫  ]");
		System.out.println("===========================");
		System.out.println("  1. 친구들 정보 ✨");
		System.out.println("---------------------------");
		System.out.println("  2. 궁금한 친구 정보 👀");
		System.out.println("---------------------------");
		System.out.println("  3. 내 정보 👀");
		System.out.println("---------------------------");
		System.out.println("  0. 프로그램 종료 👀");
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
		return new java.util.Scanner(System.in).nextLine();
	}

	private void viewAllMembers() {
		System.out.println("\n=== 친구들 정보 보기 ===");
		// 전체 친구 정보 출력 로직
	}

	private void searchMemberMenu() {
		System.out.println("\n=== 궁금한 친구 정보 ===");
		System.out.println("1. 이름으로 검색 🔍");
		System.out.println("2. 등하교 메이트가 있는 친구 검색 🚶");
		System.out.println("0. 이전 메뉴로 돌아가기");

		int subChoice = getUserInput("검색 옵션을 선택하세요 (0-2): ");
		switch (subChoice) {
		case 1 -> searchByName();
		case 2 -> searchByMateStatusO();
		case 0 -> System.out.println("이전 메뉴로 돌아갑니다.");
		default -> System.out.println("잘못된 선택입니다. 다시 시도해주세요.");
		}
	}

	private void searchByName() {
		System.out.print("검색할 친구의 이름을 입력하세요: ");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("\n=== 결과: 이름으로 검색 ===");
		// 이름으로 친구 검색 로직
		System.out.println("[예시] 입력한 이름: " + name);
	}

	private void searchByMateStatusO() {
		System.out.println("\n=== 결과: 등하교 메이트가 있는 친구 목록 ===");
		// 등하교 메이트가 있는 친구(O) 검색 로직
		System.out.println("[예시] 등하교 메이트가 있는 친구를 출력합니다.");
	}

	private void viewMyInfo() {
		System.out.println("\n=== 내 정보 보기 ===");
		String laptopNumber = getUserInputString("노트북 번호를 입력하세요: ");

		boolean isRegistered = checkIfRegistered(laptopNumber); // 등록 여부 확인 로직

		if (isRegistered) {
			System.out.println("\n1. 내 정보 추가");
			System.out.println("2. 내 정보 수정");
			System.out.println("3. 내 정보 삭제");
			System.out.println("0. 이전 메뉴로 돌아가기");

			int subChoice = getUserInput("메뉴를 선택하세요 (0-3): ");
			switch (subChoice) {
			case 1 -> addMyInfo();
			case 2 -> updateMyInfo();
			case 3 -> deleteMyInfo();
			case 0 -> System.out.println("이전 메뉴로 돌아갑니다.");
			default -> System.out.println("잘못된 선택입니다. 다시 시도해주세요.");
			}
		} else {
			System.out.println("\n1. 내 정보 추가");
			System.out.println("0. 이전 메뉴로 돌아가기");

			int subChoice = getUserInput("메뉴를 선택하세요 (0-1): ");
			switch (subChoice) {
			case 1 -> addMyInfo();
			case 0 -> System.out.println("이전 메뉴로 돌아갑니다.");
			default -> System.out.println("잘못된 선택입니다. 다시 시도해주세요.");
			}
		}
	}

	private boolean checkIfRegistered(String laptopNumber) {
		// DB에서 노트북 번호가 등록되어 있는지 확인하는 로직
		System.out.println("[예시] DB에서 노트북 번호를 확인합니다: " + laptopNumber);
		return laptopNumber.equals("EXAMPLE123"); // 임시 로직
	}

	private void addMyInfo() {
		System.out.println("\n=== 내 정보 추가 ===");
		String laptopNumber = getUserInputString("노트북 번호를 입력하세요: ");
		String name = getUserInputString("이름을 입력하세요: ");
		String address = getUserInputString("주소(구까지)를 입력하세요: ");
		String commuteMate = getUserInputString("등하교 메이트 희망(O/X)을 입력하세요: ");
		String phoneNumber = getUserInputString("핸드폰 번호를 입력하세요: ");
		String goal = getUserInputString("2025년 목표를 입력하세요: ");
		String desiredStudy = getUserInputString("희망하는 스터디를 입력하세요: ");

		// DB에 추가하는 로직을 호출 (가정: addUserInfoToDB 메서드)
		boolean success = addUserInfoToDB(laptopNumber, name, address, commuteMate, phoneNumber, goal,
				desiredStudy);

		if (success) {
			System.out.println("내 정보가 성공적으로 추가되었습니다.");
		} else {
			System.out.println("내 정보 추가에 실패했습니다.");
		}
	}

	private boolean addUserInfoToDB(String laptopNumber, String name, String address, String commuteMate,
			String phoneNumber, String goal, String desiredStudy) {
		// 실제 DB 연동 로직 작성
		// 예시: SQL INSERT 쿼리를 사용하여 정보 추가
		// INSERT INTO user_info (laptop_number, name, address, commute_mate,
		// phone_number, goal, desired_study)
		// VALUES (?, ?, ?, ?, ?, ?, ?);

		System.out.println("DB에 삽입될 정보:");
		System.out.println("노트북 번호: " + laptopNumber);
		System.out.println("이름: " + name);
		System.out.println("주소: " + address);
		System.out.println("등하교 메이트 희망: " + commuteMate);
		System.out.println("핸드폰 번호: " + phoneNumber);
		System.out.println("2025년 목표: " + goal);
		System.out.println("희망하는 스터디: " + desiredStudy);

		// 임시 로직 (실제 DB 연동 로직 필요)
		return true; // 성공적으로 삽입되었다고 가정
	}

	private void updateMyInfo() {
		System.out.println("\n=== 내 정보 수정 ===");
		String laptopNumber = getUserInputString("수정할 정보의 노트북 번호를 입력하세요: ");

		boolean isRegistered = checkIfRegistered(laptopNumber);

		if (isRegistered) {
			System.out.println("수정할 항목을 선택하세요.");
			System.out.println("1. 이름 수정");
			System.out.println("2. 주소 수정");
			System.out.println("3. 등하교 메이트 희망 수정");
			System.out.println("4. 핸드폰 번호 수정");
			System.out.println("5. 2025년 목표 수정");
			System.out.println("6. 희망하는 스터디 수정");
			System.out.println("0. 이전 메뉴로 돌아가기");

			int subChoice = getUserInput("수정할 항목을 선택하세요 (0-6): ");
			switch (subChoice) {
			case 1 -> updateField("name", laptopNumber);
			case 2 -> updateField("address", laptopNumber);
			case 3 -> updateField("commute_mate", laptopNumber);
			case 4 -> updateField("phone_number", laptopNumber);
			case 5 -> updateField("goal", laptopNumber);
			case 6 -> updateField("desired_study", laptopNumber);
			case 0 -> System.out.println("이전 메뉴로 돌아갑니다.");
			default -> System.out.println("잘못된 선택입니다. 다시 시도해주세요.");
			}
		} else {
			System.out.println("해당 노트북 번호로 등록된 정보가 없습니다.");
		}
	}

	private void updateField(String fieldName, String laptopNumber) {
		String newValue = getUserInputString(fieldName + "을/를 수정할 값을 입력하세요: ");

		// DB에서 해당 항목 업데이트하는 로직
		boolean success = updateFieldInDB(fieldName, newValue, laptopNumber);

		if (success) {
			System.out.println(fieldName + "이 성공적으로 수정되었습니다.");
		} else {
			System.out.println(fieldName + " 수정에 실패했습니다.");
		}
	}

	private boolean updateFieldInDB(String fieldName, String newValue, String laptopNumber) {
		// 실제 DB 연동 로직 작성
		// UPDATE user_info SET field_name = ? WHERE laptop_number = ?
		System.out.println(fieldName + " 업데이트: " + newValue);
		return true; // 임시 로직
	}

	private void deleteMyInfo() {
		System.out.println("\n=== 내 정보 삭제 ===");
		String laptopNumber = getUserInputString("삭제할 정보의 노트북 번호를 입력하세요: ");

		boolean isRegistered = checkIfRegistered(laptopNumber);

		if (isRegistered) {
			boolean success = deleteUserInfoFromDB(laptopNumber);

			if (success) {
				System.out.println("내 정보가 성공적으로 삭제되었습니다.");
			} else {
				System.out.println("내 정보 삭제에 실패했습니다.");
			}
		} else {
			System.out.println("해당 노트북 번호로 등록된 정보가 없습니다.");
		}
	}

	private boolean deleteUserInfoFromDB(String laptopNumber) {
		// 실제 DB 연동 로직 작성
		// DELETE FROM user_info WHERE laptop_number = ?
		System.out.println("DB에서 해당 노트북 번호의 정보를 삭제합니다: " + laptopNumber);
		return true; // 임시 로직
	}
}
