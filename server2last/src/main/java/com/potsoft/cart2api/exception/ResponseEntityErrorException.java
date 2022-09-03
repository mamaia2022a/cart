package com.potsoft.cart2api.exception;

import com.potsoft.cart2api.payload.response.ApiResponse;
import org.springframework.http.ResponseEntity;

public class ResponseEntityErrorException extends RuntimeException {
	private static final long serialVersionUID = -3156815846745801694L;

	private transient ResponseEntity<ApiResponse> apiResponse;

	public ResponseEntityErrorException(ResponseEntity<ApiResponse> apiResponse) {
		this.apiResponse = apiResponse;
	}

	public ResponseEntity<ApiResponse> getApiResponse() {
		return apiResponse;
	}
}
