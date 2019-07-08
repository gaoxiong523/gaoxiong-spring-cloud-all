package com.gaoxiong.authserver.domain;

import com.gaoxiong.authserver.utils.SecurityUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Optional;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public  class SysAuthority extends AbstractAuditingEntity{
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String value;

    @Override
    public Optional<String> getCurrentAuditor () {
        return Optional.of(SecurityUtils.getCurrentUserUsername());
    }
}