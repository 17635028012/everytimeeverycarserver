package cn.cqmxcx.everytimeeverycar.models.common.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommonReqHeaderDTO {

    private String transid;
    private String channelcode;
    private String channelname;

}
