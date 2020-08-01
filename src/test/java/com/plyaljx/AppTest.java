package com.plyaljx;

import static org.junit.Assert.assertTrue;

import com.plyaljx.deptMapper.DeptMapper;
import com.plyaljx.entity.Dept;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.TransactionIsolationLevel;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void deptFindByDeptnoTest()
    {
        String rs = "mybatis-configuration.xml";

        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader(rs);
        }catch(IOException e)
        {
            e.printStackTrace();

        }

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sqlSessionFactory.openSession(TransactionIsolationLevel.REPEATABLE_READ);
        DeptMapper deptOperation = session.getMapper(DeptMapper.class);
        Dept dept = deptOperation.findBydeptno(10);

        session.commit();
        System.out.println(dept.toString());


        session.close();


    }
}
