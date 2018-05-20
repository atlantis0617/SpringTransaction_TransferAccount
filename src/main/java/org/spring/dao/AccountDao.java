package org.spring.dao;

/**   
 * @ClassName:  AccountDao   
 * @Description:转账操作DAO层接口
 * @author: 华洋科技 
 * @date:   2018年5月20日 上午8:17:53   
 *     
 * @Copyright: 2018 www.yhy.com Inc. All rights reserved. 
 * 
 */
public interface AccountDao {
	/**
     * 转出
     *
     * @param out
     *              转出账户
     * @param money
     *              转出金额
     */
    void outMoney(String out, double money);
     
    /**
     * 转入
     *
     * @param in
     *              转入账户
     * @param money
     *              转入金额
     */
    void inMoney(String in, double money);
}
