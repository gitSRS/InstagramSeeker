package main.org.seeker.model;

/**
 * Created by RStreltsov on 01.03.2017.
 */
public class Provider {
    private Strategy strategy;

    public Provider(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public Boolean makeLogin() {
        return strategy.login();
    }
}
