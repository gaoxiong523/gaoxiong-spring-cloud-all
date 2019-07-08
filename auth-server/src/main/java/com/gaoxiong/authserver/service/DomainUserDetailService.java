package com.gaoxiong.authserver.service;

import com.gaoxiong.authserver.domain.SysUser;
import com.gaoxiong.authserver.repository.SysUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

/**
 * @author gaoxiong
 * @ClassName DomainUserDetailService
 * @Description TODO
 * @date 2019/7/8 11:37
 */
@Service
public class DomainUserDetailService implements UserDetailsService {

    @Autowired
    private SysUserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername ( String username ) throws UsernameNotFoundException {
        String lowerCase = username.toLowerCase();
        Optional<SysUser> realUser = userRepository.findOneWithRolesByUsername(lowerCase);

        return realUser.map(user->{
            Set<GrantedAuthority> authorities = user.getAuthorities();
            return new User(user.getUsername(), user.getPassword(), authorities);
        }).orElseThrow(()->new UsernameNotFoundException("用户"+lowerCase+"不存在"));
    }
}
