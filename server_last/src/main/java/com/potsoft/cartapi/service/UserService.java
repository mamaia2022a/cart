package com.potsoft.cartapi.service;

import com.potsoft.cartapi.model.user.User;
import com.potsoft.cartapi.payload.ApiResponse;
import com.potsoft.cartapi.payload.InfoRequest;
import com.potsoft.cartapi.payload.UserIdentityAvailability;
import com.potsoft.cartapi.payload.UserProfile;
import com.potsoft.cartapi.payload.UserSummary;
import com.potsoft.cartapi.security.UserPrincipal;

public interface UserService {

	UserSummary getCurrentUser(UserPrincipal currentUser);

	UserIdentityAvailability checkUsernameAvailability(String username);

	UserIdentityAvailability checkEmailAvailability(String email);

	UserProfile getUserProfile(String username);

	User addUser(User user);

	User updateUser(User newUser, String username, UserPrincipal currentUser);

	ApiResponse deleteUser(String username, UserPrincipal currentUser);

	ApiResponse giveAdmin(String username);

	ApiResponse removeAdmin(String username);

	UserProfile setOrUpdateInfo(UserPrincipal currentUser, InfoRequest infoRequest);

}