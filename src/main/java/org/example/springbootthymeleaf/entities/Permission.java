package org.example.springbootthymeleaf.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.aspectj.weaver.loadtime.Agent;

@RequiredArgsConstructor
public enum Permission {

    Dev_READ("dev:read"),
    Dev_UPDATE("dev:update"),
    Dev_DELETE("dev:delete"),
    Dev_CREATE("dev:create");

   // Agent_READ("agent:read")





    ;

    @Getter
    private final String permission;
}
