package com.youtour.admin.web.welcome.dao;

import com.youtour.admin.web.welcome.vo.WelcomeVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WelcomeMapper {
    private static final String NAMESPACE = "com.youtour.admin.web.welcome.dao.WelcomeMapper";
    @Autowired
    private SqlSessionTemplate sqlSession;

    public List<WelcomeVO> selectWelcomeList(WelcomeVO vo) throws Exception {
        return sqlSession.selectList(NAMESPACE + ".selectWelcomeList", vo);
    }
}
