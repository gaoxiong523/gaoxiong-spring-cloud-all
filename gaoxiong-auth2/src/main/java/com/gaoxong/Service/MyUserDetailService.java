package com.gaoxong.Service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author gaoxiong
 * @ClassName MyUserDetailService
 * @Description
 * @date 2019/7/5 17:12
 */
@Service
public class MyUserDetailService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername ( String name ) throws UsernameNotFoundException {
        if ("admin".equalsIgnoreCase(name)) {
            User user = mockUser();
            return user;
        }
        return null;
    }
    private User mockUser() {
        Collection<GrantedAuthority> authorities = new HashSet<>();
        //用户所拥有的角色信息 ,这写信息生成中都是需要去数据库中取
        authorities.add(new SimpleGrantedAuthority("admin"));
        User user = new User("admin","123456",authorities);
        return user;
    }

}

