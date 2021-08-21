package com.blz.user_registration.constants;

public class Constants {
	public static final String FIRST_NAME_REGEX = "^[A-Z][a-z]{2,}";
	public static final String LAST_NAME_REGEX = "^[A-Z][a-z]{2,}";
	public static final String EMAIL_ID_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
	public static final String MOBILE_NUMBER_REGEX = "^[0-9]{2}[ ][6789]{1}+[0-9]{9}$";
	public static final String PASSWORD_REGEX = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-])(?=\\S+$).{8,}$";

}
