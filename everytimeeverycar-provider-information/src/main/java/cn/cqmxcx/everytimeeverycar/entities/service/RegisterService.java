package cn.cqmxcx.everytimeeverycar.entities.service;

import cn.cqmxcx.everytimeeverycar.models.branch.req.BraRegisterReqDTO;
import cn.cqmxcx.everytimeeverycar.models.branch.res.BraRegisterResDTO;
import cn.cqmxcx.everytimeeverycar.models.member.req.MemRegisterReqDTO;
import cn.cqmxcx.everytimeeverycar.models.member.res.MemRegisterResDTO;

public interface RegisterService {

    MemRegisterResDTO insertMember(MemRegisterReqDTO registerReqDTO);

    BraRegisterResDTO insertBranch(BraRegisterReqDTO registerReqDTO);
}
