package com.CSA.CSA.Controller;

import entities.Role;

public interface RoleService {
    Role findByName(String name);
}