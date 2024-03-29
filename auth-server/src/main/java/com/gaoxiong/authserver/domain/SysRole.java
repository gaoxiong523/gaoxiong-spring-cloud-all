package com.gaoxiong.authserver.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gaoxiong.authserver.utils.SecurityUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.BatchSize;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class SysRole extends AbstractAuditingEntity{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String value;

    @JsonIgnore
    @ManyToMany(targetEntity = SysAuthority.class,fetch = FetchType.EAGER)
    @BatchSize(size = 20)
    private Set<SysAuthority> authorities = new HashSet<>();

    @Override
    public Optional<String> getCurrentAuditor () {
        return Optional.of(SecurityUtils.getCurrentUserUsername());
    }
}