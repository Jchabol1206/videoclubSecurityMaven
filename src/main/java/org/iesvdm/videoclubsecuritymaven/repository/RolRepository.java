package org.iesvdm.videoclubsecuritymaven.repository;


import org.iesvdm.videoclubsecuritymaven.domain.ERol;
import org.iesvdm.videoclubsecuritymaven.domain.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {
    Optional<Rol> findByRol(ERol rol);
}