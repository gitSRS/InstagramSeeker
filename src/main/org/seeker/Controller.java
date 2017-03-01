package main.org.seeker;

import main.org.seeker.model.Provider;

import java.util.Arrays;

/**
 * Created by RStreltsov on 01.03.2017.
 */
public class Controller {
    private Provider provider;

    public Controller(Provider provider) {
        /*if (providers == null || providers.length == 0) {
            throw new IllegalArgumentException("Illegal arguments");
        }*/
        this.provider = provider;
    }

    public Boolean tryLogin(){

        return provider.makeLogin();
    }

    @Override
    public String toString() {
        return "Controller{" +
                "providers=" + provider +
                '}';
    }
}
