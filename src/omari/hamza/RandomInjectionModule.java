package omari.hamza;

import dagger.Module;
import dagger.Provides;
import omari.hamza.blood.*;

import java.util.Random;

@Module
class RandomInjectionModule {

    private static Blood blood;

    @Provides
    static Blood injectBlood() {

        if (blood != null) return blood;

        int random = new Random().nextInt(4);

        System.out.println(random);

        switch (random) {

            case 0: {
                blood = new ABlood();
                break;
            }

            case 1: {
                blood = new BBlood();
                break;
            }

            case 2: {
                blood = new ABBlood();
                break;

            }

            case 3: {
                blood = new OBlood();
                break;
            }

            default: {
                blood = new ABlood();
            }

        }

        return blood;

    }

}
