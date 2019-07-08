package com.gaoxiong.authserver.repository;

import com.gaoxiong.authserver.domain.SysRole;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author gaoxiong
 * @ClassName SysRoleRepository
 * @Description TODO
 * @date 2019/7/8 14:29
 */
public interface SysRoleRepository extends JpaRepository<SysRole,Long> {
}
