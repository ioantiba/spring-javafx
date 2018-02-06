package net.global.software.springfx.service;

import org.springframework.stereotype.Component;

@Component
public class DefaultAwesomeActionService implements AwesomeActionService {

  @Override
  public String processName(final String name) {
    if (name.equals("Johnny")) {
      return "Hello Johnny!";
    }
    else {
      return "Hello Unknown Stranger!";
    }
  }

}
