/**
 * 
 */
package com.sagframe.sqltoy.showcase;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.sagacity.sqltoy.dao.SqlToyLazyDao;
import org.sagacity.sqltoy.service.SqlToyCRUDService;
import org.sagacity.sqltoy.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;
import com.sagframe.sqltoy.SqlToyApplication;
import com.sagframe.sqltoy.showcase.vo.IdentityTableVO;
import com.sagframe.sqltoy.showcase.vo.SequenceTableVO;

/**
 * @project sqltoy-showcase
 * @description
 *              <p>
 *              请在此说明类的功能
 *              </p>
 * @author chenrenfei <a href="mailto:zhongxuchen@gmail.com">联系作者</a>
 * @version id:PrimaryKeyTest.java,Revision:v1.0,Date:2020年2月6日
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SqlToyApplication.class)
public class PrimaryKeyTest {
	@Autowired
	private SqlToyCRUDService sqlToyCRUDService;
	@Resource(name = "sqlToyLazyDao")
	private SqlToyLazyDao sqlToyLazyDao;

	@Test
	public void testIdentity() {
		IdentityTableVO vo = new IdentityTableVO();
		vo.setName("测试");
		vo.setCreateTime(DateUtil.getTimestamp(null));
		System.err.println(sqlToyCRUDService.save(vo));
	}

	@Test
	public void testSequence() {
		SequenceTableVO vo = new SequenceTableVO();
		vo.setName("测试");
		vo.setCreateTime(DateUtil.getTimestamp(null));
		System.err.println(sqlToyCRUDService.save(vo));
	}

	@Test
	public void testLoadSequence() {
		SequenceTableVO vo = sqlToyCRUDService.load(new SequenceTableVO(BigDecimal.ONE));

		System.err.println(JSON.toJSONString(vo));
	}

	@Test
	public void testSaveOrUpdate() {
		List<SequenceTableVO> entities = new ArrayList<SequenceTableVO>();
		SequenceTableVO vo = new SequenceTableVO();
		vo.setId(BigDecimal.ONE);
		vo.setName("测试变更");
		vo.setCreateTime(DateUtil.getTimestamp(null));
		entities.add(vo);

		SequenceTableVO vo1 = new SequenceTableVO();
		vo1.setName("新建测试");
		vo1.setCreateTime(DateUtil.getTimestamp(null));
		entities.add(vo1);

		System.err.println(sqlToyCRUDService.saveOrUpdateAll(entities));
	}
	
	@Test
	public void testSaveIgnoreExist() {
		List<SequenceTableVO> entities = new ArrayList<SequenceTableVO>();
		SequenceTableVO vo = new SequenceTableVO();
		vo.setId(BigDecimal.ONE);
		vo.setName("测试变更");
		vo.setCreateTime(DateUtil.getTimestamp(null));
		entities.add(vo);

		SequenceTableVO vo1 = new SequenceTableVO();
		vo1.setName("新建测试2");
		vo1.setCreateTime(DateUtil.getTimestamp(null));
		entities.add(vo1);

		System.err.println(sqlToyCRUDService.saveAllIgnoreExist(entities));
	}
}
