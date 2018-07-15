package com.hellozjf.study.jpa.dataobject;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author hellozjf
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
public class BaseDataObject implements Serializable {

    /**
     * 主键
     */
    @Id
    @GeneratedValue
    protected Long id;

    /**
     * 创建时间
     */
    @Column(insertable = false, updatable = false, columnDefinition = "datetime default current_timestamp")
    protected Date gmtCreate;

    /**
     * 修改时间
     */
    @Column(insertable = false, updatable = false, columnDefinition = "datetime default current_timestamp on update current_timestamp")
    protected Date gmtModified;
}
