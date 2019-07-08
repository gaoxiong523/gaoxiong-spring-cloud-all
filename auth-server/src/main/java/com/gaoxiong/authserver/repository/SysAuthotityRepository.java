package com.gaoxiong.authserver.repository;

import com.gaoxiong.authserver.domain.SysAuthority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author gaoxiong
 * @ClassName SysAuthotityRepository
 * @Description TODO
 * @date 2019/7/8 14:30
 */
public interface SysAuthotityRepository extends JpaRepository<SysAuthority,Long> {
}
