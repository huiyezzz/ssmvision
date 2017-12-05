package cm.hm.test;


import cm.hm.dao.Singer;
import cm.hm.mapper.SingerMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by HUIYE on 2017/12/5.
 */


public class Demo {

 @Autowired
 public SingerMapper singerMapper;


    @Test
    public void bbb(){
        ApplicationContext ApplicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
        SingerMapper  singerMapper = (SingerMapper) ApplicationContext.getBean("singerMapper");
     Singer s = singerMapper.selectByName("薛");
     System.out.println(s);


    }
}
