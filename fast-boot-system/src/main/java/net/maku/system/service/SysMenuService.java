package net.maku.system.service;

import net.maku.framework.common.service.BaseService;
import net.maku.framework.security.user.UserDetail;
import net.maku.system.entity.SysMenuEntity;
import net.maku.system.vo.menu.SysMenuPostVO;
import net.maku.system.vo.menu.SysMenuPutVO;
import net.maku.system.vo.menu.SysMenuVO;

import java.util.List;
import java.util.Set;


/**
 * 菜单管理
 * 
 * @author 阿沐 babamu@126.com
 */
public interface SysMenuService extends BaseService<SysMenuEntity> {

	void save(SysMenuPostVO vo);

	void update(SysMenuPutVO vo);

	void delete(Long id);

	/**
	 * 菜单列表
	 *
	 * @param type 菜单类型
	 */
	List<SysMenuVO> getMenuList(Integer type);

	/**
	 * 用户菜单列表
	 *
	 * @param user  用户
	 * @param type 菜单类型
	 */
	List<SysMenuVO> getUserMenuList(UserDetail user, Integer type);

	/**
	 * 获取子菜单的数量
	 * @param pid  父菜单ID
	 */
	Long getSubMenuCount(Long pid);

	/**
	 * 获取用户权限列表
	 */
	Set<String> getUserAuthority(UserDetail user);
}
