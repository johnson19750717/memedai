package cn.memedai.operation.repository;

import cn.memedai.operation.domain.auth.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by dell on 14-6-20.
 */
public interface StaffRepository extends JpaRepository<Staff, Long> {
    public Staff findByStaffId(String staffNo);
}
