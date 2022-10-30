package com.potsoft.cart2api.utils;

import com.potsoft.cart2api.exception.CartapiException;
import org.springframework.http.HttpStatus;

public class AppUtils {
	public static void validatePageNumberAndSize(int page, int size) {
		if (page < 0) {
			throw new CartapiException(HttpStatus.BAD_REQUEST, "Page number cannot be less than zero.");
		}

		if (size < 0) {
			throw new CartapiException(HttpStatus.BAD_REQUEST, "Size number cannot be less than zero.");
		}

		if (size > AppConstants.MAX_PAGE_SIZE) {
			throw new CartapiException(HttpStatus.BAD_REQUEST, "Page size must not be greater than " + AppConstants.MAX_PAGE_SIZE);
		}
	}
}
