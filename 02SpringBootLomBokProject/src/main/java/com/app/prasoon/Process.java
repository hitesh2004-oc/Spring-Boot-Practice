package com.app.prasoon;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


//@Setter
//@Getter
//@ToString
//@EqualsAndHashCode
//@NoArgsConstructor
//@AllArgsConstructor


@Setter
@Getter
@ToString
@Component
public class Process {
       
	  private String code ;
	  private int port;
}