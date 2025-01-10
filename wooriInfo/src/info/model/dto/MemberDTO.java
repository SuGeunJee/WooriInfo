package info.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
public class MemberDTO {
    private String laptopNumber; // 노트북 번호 (고유한 식별자)
    private String name; // 이름 (3글자 이상 입력될 것)
    private String address; // 주소
    private boolean mateStatus; // 등하교 메이트 구함 여부 (O(1): 원함, X(0): 원하지 않음)
    private String phoneNumber; // 전화번호
    private String goal; // 2025년 목표
    private String desiredStudy; // 희망하는 스터디 분야
    
    @Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("1. 노트북 번호 : ");
		builder.append(laptopNumber);
		builder.append(" 2. 이름 : ");
		builder.append(name);
		builder.append(" 3. 주소 : ");
		builder.append(address);
		builder.append(" 4. 등하교 메이트 구함 여부 (O: 원함, X: 원하지 않음) : ");
		builder.append(mateStatus);
		builder.append(" 5. 전화번호 : ");
		builder.append(phoneNumber);
		builder.append(" 6. 2025년 목표 : ");
		builder.append(goal);
		builder.append(" 7. 희망하는 스터디 분야 : ");
		builder.append(desiredStudy);
		return builder.toString();
	}

}
