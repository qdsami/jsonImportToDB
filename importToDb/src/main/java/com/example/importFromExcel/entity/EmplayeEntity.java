package com.example.importFromExcel.entity;


import javax.persistence.*;

@Entity
@Table(name = "mt_employee")
public class EmplayeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Long id;


    @Column(name = "code")
    private Integer code;
    @Column(name = "NameEng")
    private String nameEng;
    @Column(name = "nameRus")
    private String nameRus;
    @Column(name = "charCode")
    private String charCode;

    public EmplayeEntity() {
    }

    public EmplayeEntity(Long id, String nameEng, String nameRus, String nameCharCode) {
        this.id = id;
        this.code = code;
        this.nameEng = nameEng;
        this.nameRus = nameRus;
        this.charCode = charCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getNameEng() {
        return nameEng;
    }

    public void setNameEng(String nameEng) {
        this.nameEng = nameEng;
    }

    public String getNameRus() {
        return nameRus;
    }

    public void setNameRus(String nameRus) {
        this.nameRus = nameRus;
    }

    public String getCharCode() {
        return charCode;
    }

    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }
}
