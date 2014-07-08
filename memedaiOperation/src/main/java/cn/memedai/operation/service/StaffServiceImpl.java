package cn.memedai.operation.service;

import cn.memedai.operation.domain.auth.Staff;
import cn.memedai.operation.repository.StaffRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by dell on 14-6-20.
 */
@Service(value = "staffService")
@Transactional
public class StaffServiceImpl implements StaffService {
    @Inject
    private StaffRepository staffRepository;

    @Override
    public Staff register(Staff staff) {
        return staffRepository.save(staff);
    }

    @Override
    public Staff findBy(String staffNo) {
        return staffRepository.findByStaffId(staffNo);
    }

    @Override
    public List<Staff> findStaffs() {
        return staffRepository.findAll();
    }
}
