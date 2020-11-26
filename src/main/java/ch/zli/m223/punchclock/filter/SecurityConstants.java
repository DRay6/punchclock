package ch.zli.m223.punchclock.filter;

public class SecurityConstants {
    public static final String SECRET = "SecretKeyToGenJWTs";
    public static final long EXPIRATION_TIME = 000_003_600; // 1 Hour
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/users/sign-up";
    public static final String LOG_IN_URL = "/login";
    public static final String GET_ROLES_URL = "/userRoles";
}