### 백엔드 

#### 환경
- Spring Boot 3.0.6
- Java 17
- MariaDB
- Spring Data JPA

<br/>

#### MBTI 동작

1. 클라이언트로부터 MBTI 질문시 선택 결과를 받는다.
2. 정해진 알고리즘에 의해 결과를 도출한다.
3. 결과를 통계 디비에 저장한다.
4. 클라이언트로 결과를 반환한다.

<br/> 

#### application-dev.properties

```
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
spring.datasource.url=jdbc:mariadb://[IP:PORT]/[DB]
spring.datasource.username=[USERNAME]
spring.datasource.password=[PASSWORD]
```
