package cn.memedai.operation.service;

import cn.memedai.operation.domain.auth.Staff;
import org.springframework.security.access.annotation.Secured;

import java.util.List;

/**
 * Created by dell on 14-6-20.
 */
public interface StaffService {
    @Secured("ADMIN")
    public Staff register(Staff staff);

    public Staff findBy(String staffNo);

    public List<Staff> findStaffs();

}
