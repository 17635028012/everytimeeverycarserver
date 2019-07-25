package cn.cqmxcx.everytimeeverycar.models.branch.req;

import cn.cqmxcx.everytimeeverycar.models.common.req.CommonReqHeaderDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BraRegisterReqDTO {

    private String branchUsername;
    private String branchPassword;
    private String branchNickname;
    private Byte branchLevel;
    private String branchPhone;
    private String branchEmail;
    private String branchSite;
    private String branchAccount;
    CommonReqHeaderDTO commonReqHeaderDTO;

}
