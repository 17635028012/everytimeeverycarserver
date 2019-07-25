package cn.cqmxcx.everytimeeverycar.entities.repository;

import cn.cqmxcx.everytimeeverycar.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RegisterRepository extends JpaRepository<Member,String>{
    @Query(value ="select member_username from member where member_username = ?1",nativeQuery = true)
    String findByUsername(String username);

    @Query(value ="select member_phone from member where member_phone = ?1",nativeQuery = true)
    String findByPhone(String phone);
}
