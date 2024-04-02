package com.staffmanagementapp.staffmanagementapp.rest;

import com.staffmanagementapp.staffmanagementapp.domain.Staff;
import com.staffmanagementapp.staffmanagementapp.service.StaffService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class StaffResource {
    private final StaffService staffService;

    public StaffResource(StaffService staffService) {
        this.staffService = staffService;
    }


    @PostMapping("/staffs")
    public ResponseEntity create(@RequestBody Staff staff){
        Staff staff1 = staffService.save(staff);
        return ResponseEntity.ok(staff1);
    }

    @PutMapping("/staffs")
    public ResponseEntity update(@RequestBody Staff staff){
        Staff staff1 = staffService.save(staff);
        return ResponseEntity.ok(staff1);
    }

    @GetMapping("/staffs")
    public ResponseEntity getAll(){
        List<Staff> staffs = staffService.findAll();
        return ResponseEntity.ok(staffs);
    }

    @GetMapping("/staffs/{name}")
    public ResponseEntity getAll(@PathVariable String name){
        List<Staff> staffs = staffService.findByName(name);
        return ResponseEntity.ok(staffs);
    }

    @GetMapping("/staffs/search")
    public ResponseEntity getAllSearch(@RequestParam String name){
        List<Staff> staffs = staffService.findAllByParam(name);
        return ResponseEntity.ok(staffs);
    }

    @DeleteMapping("/staffs/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        staffService.delete(id);
        return ResponseEntity.ok("row has been deleted.");
    }
}
