package cn.cqmxcx.everytimeeverycar.models.common.res;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommonResHeaderDTO {

    private String transid;
    private String code;
    private String message;

    public void res(String code,String message){
        this.code = code;
        this.message = message;
    }
}
