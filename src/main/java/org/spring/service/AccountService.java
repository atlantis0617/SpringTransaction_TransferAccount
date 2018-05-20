package org.spring.service;

/**   
 * @ClassName:  AccountService   
 * @Description:转账操作业务层接口
 * @author: 华洋科技 
 * @date:   2018年5月20日 上午8:21:01   
 *     
 * @Copyright: 2018 www.yhy.com Inc. All rights reserved. 
 * 
 */
public interface AccountService {
	
	/**   
	 * @Title: transfer   
	 * @Description: 转账
	 * @param: @param out
	 * @param: @param in
	 * @param: @param money      
	 * @return: void      
	 * @throws   
	 */
	void transfer(String out, String in, double money);
}
