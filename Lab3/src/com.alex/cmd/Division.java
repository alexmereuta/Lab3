package com.alex.cmd;

/**
 * Created by Alexandru on 5/26/2017.
 */
public class Division implements Command {

    /**
     * @param a - simple variable of integer type
     * @param b - simple variable of integer type
     * @return Division of A over B
     */
    @Override
    public int compute(int a, int b) {
        return a / b;
    }
}