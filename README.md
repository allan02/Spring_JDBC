# Spring_JDBC

<br>
<ul>

  <li>DTO란?</li><br>
  
  <ul>
    <li>Data Transfer Object의 약자입니다.</li><br>
    <li>계층 간 데이터 교환을 위한 Java Bean입니다.</li><br>
    <li>일반적으로 로직을 가지고 있지 않고, 순수한 데이터 객체입니다.</li><br>
  </ul>
  
  <br>
  <li>DAO란?</li><br>
  
  <ul>
    <li>Data Access Object의 약자입니다.</li><br>
    <li>데이터를 조회하거나 조작하는 기능을 전담하도록 만든 객체입니다.</li><br>
    <li>보통 데이터 베이스를 조작하는 기능을 전담하는 목적으로 만들어집니다.</li><br>
  </ul>
  
  
  <br>
  <li>DataSource란?</li><br>
  
  <ul>
    <li>DataSource는 JDBC 명세의 일부분이면서 일반화된 연결 팩토리입니다.</li><br>
    <li>DB와 관계된 connection 정보를 담고 있으며, Bean을 인자로 사용합니다.</li><br>
    <li>Spring은 DataSource로 DB와의 연결을 획득합니다.</li><br>
  </ul>
 
  <br>
  <li>DB Connection Pooling이란?</li><br>
  
  <ul>
    <li>자바 프로그램에서 데이터베이스에 연결(Connection 객체를 얻는 작업)은 시간이 많이 걸립니다.</li><br>
    <li>일정량의 Connection을 미리 생성시켜 저장소에 저장하여 시간을 절약하는 프로그래밍 기법입니다.</li><br>
  </ul>
 
  <br>
  <li>NamedParameterJdbcTemplate란?</li><br>
  
  <ul>
    <li>기존에 사용하던 JdbcTemplate의 경우, 변수를 넣을 부분에 "?"를 입력했습니다.<br><br>
    -> 이러한 방식은 입력 시에 인자 위치의 순서를 강제시켜 가독성을 떨어트립니다.
    </li><br>
    <li>NamedParameterJdbcTemplate는 "?" 대신 ":변수명" 을 입력하여 순서를 지킬 필요가 없습니다.</li><br>
  </ul>
  
  <br>
  <li>BeanPropertyRowMapper란?</li><br>
  
  <ul>
    <li>Bean Property를 기반으로 RowMapper를 생성합니다.</li><br>
    <li>DBMS와 Java의 이름 규칙을 맞춰주는 기능을 합니다.</li><br>
  </ul>
 
</ul>
