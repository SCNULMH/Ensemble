package smhrd.db;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionManager {

   // 사용하고자 하는 DB의 기본정보(드라이버, url, id, pw)를 가지고
   // 여러개의 sqlSession을 생성할 수 있는 SqlSessionFactory를 생성하고
   // 관리할 수 있는 클래스

   // 서버가 실행 될 때 딱 1번 읽어서 사용하는 구간 -> static
   // static{} 초기화 블럭 문법! -> main() 시작되자마자 같이 호줄될 수 있는 구조!
   static SqlSessionFactory sqlSessionFactory;
   static {

      try {
         String resource = "smhrd/db/mybatis-config.xml";
         InputStream inputStream;
         inputStream = Resources.getResourceAsStream(resource);
         sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

      } catch (IOException e) {

         e.printStackTrace();
      }

   }

   // 다른 클래스에서 해당하는 sqlSessionFactory를 호출할 수 있는 메소드를 생성
   public static SqlSessionFactory getSqlSession() {
      return sqlSessionFactory;
   }

}
