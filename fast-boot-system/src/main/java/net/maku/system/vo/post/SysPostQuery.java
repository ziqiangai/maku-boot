package net.maku.system.vo.post;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import net.maku.framework.common.query.Query;

/**
 * 岗位管理
 *
 * @author 阿沐 babamu@126.com
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(name = "岗位管理查询")
public class SysPostQuery extends Query {
    @Schema(name = "岗位编码")
    private String postCode;

    @Schema(name = "岗位名称")
    private String postName;

    @Schema(name = "状态  0：停用   1：正常")
    private Integer status;

}
