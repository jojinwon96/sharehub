package com.jinwon.server.dto.response.auth;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.jinwon.server.common.ResponseCode;
import com.jinwon.server.common.ResponseMessage;
import com.jinwon.server.dto.response.ResponseDto;

import lombok.Getter;

@Getter
public class SignUpResponseDto extends ResponseDto{

  private SignUpResponseDto() {
    super(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
  }
  
  public static ResponseEntity<SignUpResponseDto> success(){
    SignUpResponseDto result = new SignUpResponseDto();
    return ResponseEntity.status(HttpStatus.OK).body(result);
  }

  public static ResponseEntity<ResponseDto> duplicateEmail(){
    ResponseDto result = new ResponseDto(ResponseCode.DUPLICATE_EMAIL, ResponseMessage.DUPLICATE_EMAIL);
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
    
  }

  public static ResponseEntity<ResponseDto> duplicateNickname(){
    ResponseDto result = new ResponseDto(ResponseCode.DUPLICATE_NICKNAME, ResponseMessage.DUPLICATE_NICKNAME);
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
    
  }
}
