package site.orangefield.teskan_back_practice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.orangefield.teskan_back_practice.domain.ts_emp.TS_Emp;
import site.orangefield.teskan_back_practice.domain.ts_emp.TS_EmpRepository;

@RequiredArgsConstructor
@Service
public class TS_EmpService {
    
    // DI
    private final TS_EmpRepository ts_EmpRepository;

    // emp 목록 조회하기
    public List<TS_Emp> getEmpList(){
        List<TS_Emp> empEntity = ts_EmpRepository.findAll();

        return empEntity;
    }

}
