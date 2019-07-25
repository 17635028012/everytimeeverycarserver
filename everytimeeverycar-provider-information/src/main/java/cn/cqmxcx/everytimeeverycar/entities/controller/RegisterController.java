package cn.cqmxcx.everytimeeverycar.entities.controller;

import cn.cqmxcx.everytimeeverycar.entities.service.RegisterService;
import cn.cqmxcx.everytimeeverycar.models.branch.req.BraRegisterReqDTO;
import cn.cqmxcx.everytimeeverycar.models.branch.res.BraRegisterResDTO;
import cn.cqmxcx.everytimeeverycar.models.member.req.MemRegisterReqDTO;
import cn.cqmxcx.everytimeeverycar.models.member.res.MemRegisterResDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/register")
@Slf4j
public class RegisterController {

    @Resource
    private RegisterService registerService;

    /**
     * 会员/合伙人注册
     * @param registerReqDTO
     * @return
     */
    @PostMapping("/memberRegister")
    public MemRegisterResDTO insertMember(@RequestBody MemRegisterReqDTO registerReqDTO){
        return registerService.insertMember(registerReqDTO);
    }

    /**
     * 租赁公司注册
     */


    /**
     * 网点信息注册
     */
    @PostMapping("/branchRegister")
    public BraRegisterResDTO insertBranch(@RequestBody BraRegisterReqDTO registerReqDTO){
        return registerService.insertBranch(registerReqDTO);
    }
}
