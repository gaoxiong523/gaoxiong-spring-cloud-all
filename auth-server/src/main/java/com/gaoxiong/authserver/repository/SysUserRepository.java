package com.gaoxiong.authserver.repository;

import com.gaoxiong.authserver.domain.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author gaoxiong
 * @ClassName SysUserRepository
 * @Description TODO
 * @date 2019/7/8 14:27
 */
public interface SysUserRepository extends JpaRepository<SysUser,Long> {

    Optional<SysUser> findOneWithRolesByUsername( String username);
}
