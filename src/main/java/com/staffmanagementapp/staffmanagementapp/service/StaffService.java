package com.staffmanagementapp.staffmanagementapp.service;

import com.staffmanagementapp.staffmanagementapp.domain.Staff;
import com.staffmanagementapp.staffmanagementapp.repository.StaffRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {
    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public Staff save(Staff employee){
        return staffRepository.save(employee);
    }

    public List<Staff> findAll(){
        return staffRepository.findAll();
    }

    public Staff findById(Long id){
        return staffRepository.findById(id).get();
    }

    public List<Staff> findByName(String name){
        return staffRepository.findByFirstName(name);
    }

    public List<Staff> findAllByParam(String name){
        return  staffRepository.findAllByLike(name);
    }

    public void delete(Long id){
        Staff employee = staffRepository.getOne(id);
        staffRepository.delete(employee);
    }
}
