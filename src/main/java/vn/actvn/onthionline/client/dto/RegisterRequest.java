package vn.actvn.onthionline.client.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.actvn.onthionline.service.dto.UserRegisterDto;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
    private UserRegisterDto userRegister;
}
