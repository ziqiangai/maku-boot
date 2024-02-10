package net.xsn.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import net.xsn.framework.mybatis.entity.BaseEntity;

/**
 * 用户岗位关系
 *
 * @author zzq ziqiangytu@gmail.com
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("sys_user_post")
public class SysUserPostEntity extends BaseEntity {
	/**
	 * 用户ID
	 */
	private Long userId;
	/**
	* 岗位ID
	*/
	private Long postId;
}