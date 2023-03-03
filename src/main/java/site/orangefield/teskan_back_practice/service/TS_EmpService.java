package site.orangefield.teskan_back_practice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.orangefield.teskan_back_practice.domain.ts_emp.TS_Emp;
import site.orangefield.teskan_back_practice.domain.ts_emp.TS_EmpRepository;
import site.orangefield.teskan_back_practice.web.dto.TS_EmpDto;

@RequiredArgsConstructor
@Service
public class TS_EmpService {

    // DI
    private final TS_EmpRepository ts_EmpRepository;

    // emp 목록 조회하기
    public List<TS_EmpDto> getEmpList() {
        List<TS_Emp> empsEntity = ts_EmpRepository.findAll();

        List<TS_EmpDto> ts_EmpDto = new ArrayList<>();
        for (TS_Emp empEntity : empsEntity) {
            ts_EmpDto.add(TS_EmpDto.builder()
                    .emp_no(empEntity.getEmp_no())
                    .name(empEntity.getName())
                    .position_code(empEntity.getPosition_code())
                    .dept_code(empEntity.getDept_code())
                    .tel(empEntity.getTel())
                    .build());
        }

        return ts_EmpDto;
    }

}
