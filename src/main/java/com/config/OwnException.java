package com.config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by XiuYin.Cui on 2018/1/4.
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND,reason = "Own Exception")
public class OwnException extends RuntimeException {
}
