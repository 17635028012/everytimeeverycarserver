package cn.cqmxcx.everytimeeverycar.entities.repository;

import cn.cqmxcx.everytimeeverycar.entities.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BraRegisterRepository extends JpaRepository<Branch,String>{
    @Query(value ="select branch_username from branch where branch_username = ?1",nativeQuery = true)
    String findByUsername(String username);

    @Query(value ="select branch_phone from branch where branch_phone = ?1",nativeQuery = true)
    String findByPhone(String phone);
}
