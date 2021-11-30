package com.qzx.secondhand.mapper;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author qzx
 * @create 2021-11-30 20:58
 * @function
 */
public class TradeCollectionMapperTest {
    private static TradeCollectionMapper mapper;

    @BeforeClass
    public static void setUpMybatisDatabase() {
        SqlSessionFactory builder = new SqlSessionFactoryBuilder().build(TradeCollectionMapperTest.class.getClassLoader().getResourceAsStream("mybatisTestConfiguration/TradeCollectionMapperTestConfiguration.xml"));
        //you can use builder.openSession(false) to not commit to database
        mapper = builder.getConfiguration().getMapper(TradeCollectionMapper.class, builder.openSession(true));
    }

    @Test
    public void testSelectCollectionVoJoin() {
        mapper.selectCollectionVoJoin(1423L);
    }
}
