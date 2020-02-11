package com.dcy.db.base.model;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author：dcy
 * @Description: 公共实体类
 * @Date: 2019/9/6 13:55
 */
@Data
public class BaseModel implements Serializable {
    /**
     * 创建者
     */
    @TableField(fill = FieldFill.INSERT)
    private String createBy;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private String createDate;

    /**
     * 更新者
     */
    @TableField(fill = FieldFill.UPDATE)
    private String updateBy;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.UPDATE)
    private String updateDate;

    /**
     * 删除标识
     * 不查询此字段
     */
    @TableLogic
    @TableField(select = false)
    private Integer delFlag;

    /**
     * 备注
     */
    private String remark;

    public static final String CREATE_BY = "create_by";

    public static final String CREATE_DATE = "create_date";

    public static final String UPDATE_BY = "update_by";

    public static final String UPDATE_DATE = "update_date";

    public static final String DEL_FLAG = "del_flag";

    public static final String REMARK = "remark";
}
