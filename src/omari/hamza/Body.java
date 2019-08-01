package omari.hamza;

import omari.hamza.blood.Blood;

import javax.inject.Inject;

public class Body {

    @Inject
    Blood blood;

    @Inject
    public Body() {
    }

    Blood getBlood() {
        return blood;
    }

    public void setBlood(Blood blood) {
        this.blood = blood;
    }
}
