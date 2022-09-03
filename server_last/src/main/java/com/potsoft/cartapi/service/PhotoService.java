package com.potsoft.cartapi.service;

import com.potsoft.cartapi.payload.ApiResponse;
import com.potsoft.cartapi.payload.PagedResponse;
import com.potsoft.cartapi.payload.PhotoRequest;
import com.potsoft.cartapi.payload.PhotoResponse;
import com.potsoft.cartapi.security.UserPrincipal;

public interface PhotoService {

	PagedResponse<PhotoResponse> getAllPhotos(int page, int size);

	PhotoResponse getPhoto(Long id);

	PhotoResponse updatePhoto(Long id, PhotoRequest photoRequest, UserPrincipal currentUser);

	PhotoResponse addPhoto(PhotoRequest photoRequest, UserPrincipal currentUser);

	ApiResponse deletePhoto(Long id, UserPrincipal currentUser);

	PagedResponse<PhotoResponse> getAllPhotosByAlbum(Long albumId, int page, int size);

}