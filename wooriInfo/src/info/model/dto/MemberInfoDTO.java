package info.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class MemberInfoDTO {
	private String laptopNumber; // 노트북 번호 (고유한 식별자)
    private String name; // 이름
    private String address; // 주소
    private boolean mateStatus; // 등하교 메이트 구함 여부 (O(True): 원함, X(False): 원하지 않음)
    private String phoneNumber; // 전화번호
    private String goal; // 2025년 목표
    private String desiredStudy; // 희망하는 스터디 분야
    private String password; // 비밀번호
    private Role role; // 역할
}
