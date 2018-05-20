package org.spring.service.impl;

import org.spring.dao.AccountDao;
import org.spring.service.AccountService;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**   
 * @ClassName:  AccountServiceImpl   
 * @Description:转账操作业务层实现类
 * @author: 华洋科技 
 * @date:   2018年5月20日 上午8:22:30   
 *     
 * @Copyright: 2018 www.yhy.com Inc. All rights reserved. 
 * 
 */
public class AccountServiceImpl implements AccountService{
	
	private AccountDao accountDao;
	
	private TransactionTemplate transactionTemplate;
	
	public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
	
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }
	
	/**   
	 * <p>Title: transfer</p>   
	 * <p>Description:转账 </p>   
	 * @param out
	 * @param in
	 * @param money   
	 * @see org.spring.service.AccountService#transfer(java.lang.String, java.lang.String, double)   
	 */
	@Override
	public void transfer(final String out,final String in,final double money) {
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus arg0) {
				 accountDao.outMoney(out, money);
				 accountDao.inMoney(in, money);
			}
		});
	}

}
