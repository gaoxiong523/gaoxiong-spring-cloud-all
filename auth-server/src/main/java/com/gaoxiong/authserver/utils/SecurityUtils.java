package com.gaoxiong.authserver.utils;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @author gaoxiong
 * @ClassName SecurityUtils
 * @Description TODO
 * @date 2019/7/8 14:33
 */
public class SecurityUtils {
    public static String getCurrentUserUsername() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentUserName = null;
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            currentUserName = authentication.getName();

        }
        return currentUserName;
    }
}
