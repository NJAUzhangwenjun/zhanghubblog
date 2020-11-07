package cn.zhanghub.base.mapper;


import cn.zhanghub.base.entity.User;
import cn.zhanghub.base.form.user.ListUserForm;
import cn.zhanghub.base.vo.UserVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 张文军
 * @date Created in 2020/3/7 2:21 下午
 * Utils: Intellij Idea
 * Description: 数据库资源操作类
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

	/**
	 * 获取用户列表
	 * @param listUserForm 表单数据
	 * @return 用户列表
	 */
	@Select("SELECT id,nickname,username,birthday FROM `user` WHERE `status`= #{status} LIMIT #{current},#{size}")
	List<UserVo> listUser(ListUserForm listUserForm);

}
