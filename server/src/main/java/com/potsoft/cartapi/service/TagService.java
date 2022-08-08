package com.potsoft.cartapi.service;

import com.potsoft.cartapi.model.Tag;
import com.potsoft.cartapi.payload.ApiResponse;
import com.potsoft.cartapi.payload.PagedResponse;
import com.potsoft.cartapi.security.UserPrincipal;

public interface TagService {

	PagedResponse<Tag> getAllTags(int page, int size);

	Tag getTag(Long id);

	Tag addTag(Tag tag, UserPrincipal currentUser);

	Tag updateTag(Long id, Tag newTag, UserPrincipal currentUser);

	ApiResponse deleteTag(Long id, UserPrincipal currentUser);

}
