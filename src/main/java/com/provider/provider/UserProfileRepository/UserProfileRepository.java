package com.provider.provider.UserProfileRepository;

import com.provider.provider.UserProfile.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<UserProfile,Long> {
}
