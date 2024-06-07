package org.example.springbootthymeleaf.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.security.Permission;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.example.springbootthymeleaf.entities.Permission.*;

@RequiredArgsConstructor
public enum Post {
    Manager( Set.of(


    )),
     Dev( Set.of(

     )),
    Test( Set.of(

    )),
    DEVOPS( Set.of(

    )),
     TECH_LEAD( Set.of(

    ));
    @Getter
    private final Set<Permission> permissions;

    public <SimpleGrantedAuthority> List<SimpleGrantedAuthority> getAuthorities() {
        var authorities = getPermissions()
                .stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermissions()))
                .collect(Collectors.toList());
        authorities.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
        return authorities;
    }

}
