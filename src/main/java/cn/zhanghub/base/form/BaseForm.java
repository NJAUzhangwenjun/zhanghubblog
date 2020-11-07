package cn.zhanghub.base.form;

/**
 * @author 张文军
 * Date: Created in 2019-05-29 17:02
 * Utils: Intellij Idea
 * Description: 通用表单
 */
public abstract class BaseForm<T> {

	/**
	 * 获取实例
	 * @return 返回实体类
	 */
	public abstract T buildEntity();

}
