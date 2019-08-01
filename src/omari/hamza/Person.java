package omari.hamza;

import javax.inject.Inject;

public class Person {

    private Body body;

    @Inject
    public Person(Body body) {
        this.body = body;
    }
}
