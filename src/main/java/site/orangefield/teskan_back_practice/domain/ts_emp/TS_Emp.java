package site.orangefield.teskan_back_practice.domain.ts_emp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TS_Emp {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String emp_no;
    
    private String id;	
	private String name;
	private String eng_name;
    private String tel;
	private String dept_code;
	private String phone;
    private String position_code;
    private String sex;
    private String reg_no;
    private String email;
    private String semail;
    private String zip;
    private String address_1;
    private String address_2;
    private String mil_yn;
    private String join_code;
    private Integer salary;
    private String join_date;
    private String retire_date;
    private String image;
    private String password;
    private String note;
}
