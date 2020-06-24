package com.bridgelabz.bookstore.utils;

import com.bridgelabz.bookstore.constants.Constant;

public class TokenUtility {
	private TokenUtility() {
	}

	public static String verifyResponse(Long userId,Long roleId) {
		return Constant.VERIFY_ADDRESS + JwtValidate.createJWT(userId,roleId, Constant.REGISTER_EXP);
	}

}
