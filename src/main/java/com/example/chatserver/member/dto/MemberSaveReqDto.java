package com.example.chatserver.member.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//getter, setter등을 사용할 수 있음
@NoArgsConstructor
@AllArgsConstructor
public class MemberSaveReqDto {
    private String name;
    private String email;
    private String password;

}
