package omari.hamza;

import dagger.Component;

@Component(modules = {RandomInjectionModule.class})
public interface Doctor {

    Body injectBlood();

}
