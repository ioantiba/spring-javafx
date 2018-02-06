package net.global.software.springfx.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import net.global.software.springfx.view.HelloworldView;

@SpringBootApplication(scanBasePackages="net.global.software.springfx")
public class SpringBootJavaFX extends AbstractJavaFxApplicationSupport {
  public static void main(String[] args) {
    launchApp(SpringBootJavaFX.class, HelloworldView.class, args);
  }
}
