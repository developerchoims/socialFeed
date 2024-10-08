package backend.socialFeed.user.constant;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Constants {
    public static final String EMAIL_ALREADY_EXISTS = "이미 존재하는 이메일입니다.";
    public static final String EMAIL_NOT_EXISTS = "존재하지 않는 계정입니다.";
    public static final String PASSWORD_NOT_MATCH = "올바른 비밀번호가 아닙니다.";
    public static final String CODE_NOT_MATCH = "올바른 인증 코드가 아닙니다.";
    public static final String LOG_OUT = "로그아웃되었습니다.";
    public static final String JWT_EXCEPTION = "토큰 생성에 실패했습니다.";
}
