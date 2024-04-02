package com.staffmanagementapp.staffmanagementapp.repository;

import com.staffmanagementapp.staffmanagementapp.domain.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StaffRepository extends JpaRepository<Staff, Long> {
    List<Staff> findByFirstName(String name);

    List<Staff> findByFirstNameAndLastName(String lastName, String name);

    @Query("select e from Staff e where e.firstName = :name")
    List<Staff> findByNameQuery(@Param("name") String name);

    @Query(value = "select * from Staff e WHERE e.firstName = :name ", nativeQuery = true)
    List<Staff> findByNameQueryNative(@Param("name") String name);

    List<Staff> findAllByFirstNameLike(String name);

    List<Staff> findAllByFirstNameStartingWith(String name);

    List<Staff> findAllByFirstNameEndingWith(String name);

    @Query("select e from Staff e where e.firstName ilike concat('%', :name, '%')")
    List<Staff> findAllByLike(String name);

    @Query(value = "select * from staff e where e.first_name like %:name% ", nativeQuery = true)
    List<Staff> findAllNativeLike(String name);
}
