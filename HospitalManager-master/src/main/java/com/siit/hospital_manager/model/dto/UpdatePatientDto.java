package com.siit.hospital_manager.model.dto;

public class UpdatePatientDto {


    private Integer id;
    private Integer age;

    public UpdatePatientDto(Integer id, Integer age) {
        this.id = id;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}
