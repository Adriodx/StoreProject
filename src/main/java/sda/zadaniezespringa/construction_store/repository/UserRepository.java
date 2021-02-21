package sda.zadaniezespringa.construction_store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sda.zadaniezespringa.construction_store.model.User;

public interface UserRepository extends JpaRepository <User, Long> {

}
