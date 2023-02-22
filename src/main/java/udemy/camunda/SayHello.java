package udemy.camunda;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class SayHello implements JavaDelegate {

  @Override
  public void execute(DelegateExecution ctx) throws Exception {
    System.out.println("\n** Hello World **\n");
  }
}