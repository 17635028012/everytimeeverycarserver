package cn.cqmxcx.everytimeeverycar.entities.service.impl;

import cn.cqmxcx.everytimeeverycar.entities.Branch;
import cn.cqmxcx.everytimeeverycar.entities.Member;
import cn.cqmxcx.everytimeeverycar.entities.repository.BraRegisterRepository;
import cn.cqmxcx.everytimeeverycar.entities.repository.RegisterRepository;
import cn.cqmxcx.everytimeeverycar.entities.service.RegisterService;
import cn.cqmxcx.everytimeeverycar.models.branch.req.BraRegisterReqDTO;
import cn.cqmxcx.everytimeeverycar.models.branch.res.BraRegisterResDTO;
import cn.cqmxcx.everytimeeverycar.models.common.res.CommonResHeaderDTO;
import cn.cqmxcx.everytimeeverycar.models.member.req.MemRegisterReqDTO;
import cn.cqmxcx.everytimeeverycar.models.member.res.MemRegisterResDTO;
import lombok.extern.slf4j.Slf4j;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

@Service("registerService")
@Slf4j
public class RegisterServiceImpl implements RegisterService {

    @Resource
    private RegisterRepository registerRepository;

    @Resource
    private BraRegisterRepository braRegisterRepository;

    @Override
    public MemRegisterResDTO insertMember(MemRegisterReqDTO registerReqDTO) {
        Member member = new Member();
        MemRegisterResDTO memRegisterResDTO = new MemRegisterResDTO();
        CommonResHeaderDTO commonResHeaderDTO = new CommonResHeaderDTO();
        String result = null;
        String phone = null;
        try {
            result = braRegisterRepository.findByUsername(registerReqDTO.getMemberUsername());
            phone = braRegisterRepository.findByPhone(registerReqDTO.getMemberPhone());
            if (registerReqDTO.getMemberUsername().equals(result)){
                commonResHeaderDTO.res("999999","账号已存在");
                memRegisterResDTO.setCommonResHeaderDTO(commonResHeaderDTO);
                return memRegisterResDTO;
            }if (registerReqDTO.getMemberPhone().equals(phone)){
                commonResHeaderDTO.res("999999","手机号已存在");
                memRegisterResDTO.setCommonResHeaderDTO(commonResHeaderDTO);
                return memRegisterResDTO;
            }else {
                MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
                member = mapperFactory.getMapperFacade(MemRegisterReqDTO.class,Member.class).map(registerReqDTO);
                member.setMemberId(UUID.randomUUID().toString());
                member.setMemberMemcode("2");
                member.setMemberIsStatus((byte) 0);
                member.setMemberCreate((new Timestamp(new Date().getTime())));
                member.setMemberModified((new Timestamp(new Date().getTime())));
                registerRepository.save(member);
                commonResHeaderDTO.setCode("000000");
                commonResHeaderDTO.setMessage("注册成功");
                memRegisterResDTO.setCommonResHeaderDTO(commonResHeaderDTO);
            }
        }catch (Exception e){
            e.getStackTrace();
        }
        return memRegisterResDTO;
    }

    @Override
    public BraRegisterResDTO insertBranch(BraRegisterReqDTO braRegisterReqDTO) {
        Branch branch = new Branch();
        BraRegisterResDTO braRegisterResDTO = new BraRegisterResDTO();
        CommonResHeaderDTO commonResHeaderDTO = new CommonResHeaderDTO();
        String result = null;
        String phone = null;
        try {
            result = braRegisterRepository.findByUsername(braRegisterReqDTO.getBranchUsername());
            phone = braRegisterRepository.findByPhone(branch.getBranchPhone());
            if (braRegisterReqDTO.getBranchUsername().equals(result)){
                commonResHeaderDTO.res("999999","账号已存在");
                braRegisterResDTO.setCommonResHeaderDTO(commonResHeaderDTO);
                return braRegisterResDTO;
            }if (branch.getBranchPhone().equals(phone)){
                commonResHeaderDTO.res("999999","手机号已存在");
                braRegisterResDTO.setCommonResHeaderDTO(commonResHeaderDTO);
                return braRegisterResDTO;
            } else {
                MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
                branch = mapperFactory.getMapperFacade(BraRegisterReqDTO.class,Branch.class).map(braRegisterReqDTO);
                branch.setBranchId(UUID.randomUUID().toString());
                branch.setBranchIsStatus((byte) 0);
                branch.setBranchCreate(new Timestamp(new Date().getTime()));
                branch.setBranchModified((new Timestamp(new Date().getTime())));
                braRegisterRepository.save(branch);
                commonResHeaderDTO.setCode("000000");
                commonResHeaderDTO.setMessage("注册成功");
                braRegisterResDTO.setCommonResHeaderDTO(commonResHeaderDTO);
            }
        }catch (Exception e){
            e.getStackTrace();
        }
        return braRegisterResDTO;
    }
}
