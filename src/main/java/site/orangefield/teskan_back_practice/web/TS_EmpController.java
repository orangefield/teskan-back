package site.orangefield.teskan_back_practice.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.orangefield.teskan_back_practice.domain.ts_emp.TS_Emp;
import site.orangefield.teskan_back_practice.service.TS_EmpService;

@RequiredArgsConstructor
@RestController
public class TS_EmpController {
    
    // DI
    private final TS_EmpService ts_EmpService;

    // emp 목록 조회하기
    @GetMapping("/emp/list")
    public List<TS_Emp> empList(){

        return ts_EmpService.getEmpList();
    }
}
