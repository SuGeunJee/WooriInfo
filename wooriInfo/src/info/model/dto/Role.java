package info.model.dto;

public enum Role {
    관리자, 사용자;

    // 문자열을 Role로 변환
    public static Role fromString(String value) {
        for (Role role : Role.values()) {
            if (role.name().equals(value)) {
                return role;
            }
        }
        throw new IllegalArgumentException("Unknown role: " + value);
    }

    // Role을 문자열로 반환 (DB 저장 시 사용)
    public String toString() {
        return name();
    }
}
