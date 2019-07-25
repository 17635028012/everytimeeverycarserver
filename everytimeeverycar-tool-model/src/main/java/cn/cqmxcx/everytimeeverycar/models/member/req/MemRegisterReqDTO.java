package cn.cqmxcx.everytimeeverycar.models.member.req;

import cn.cqmxcx.everytimeeverycar.models.common.req.CommonReqHeaderDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemRegisterReqDTO {

    private String epId;
    private String memberUsername;
    private String memberPassword;
    private String memberPhone;
    private Byte memberLevel;
    CommonReqHeaderDTO commonReqHeaderDTO;

}
