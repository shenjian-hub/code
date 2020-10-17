package com.shenjian.code.entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import javax.persistence.*;

/*
* 资源类型实体
* */
@Entity
@Table(name = "actType")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer","hander","fieldHandler"})
public class ActType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private   Integer actTypeId;  //资源类型ID

    @Column(length = 200)
    private  String actTypeName; //资源类型名称

    @Column(length = 1000)
    private  String remark; //备注

    private  Integer sort;//排序

    public Integer getActTypeId() {
        return actTypeId;
    }

    public void setActTypeId(Integer actTypeId) {
        this.actTypeId = actTypeId;
    }

    public String getActTypeName() {
        return actTypeName;
    }

    public void setActTypeName(String actTypeName) {
        this.actTypeName = actTypeName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}
