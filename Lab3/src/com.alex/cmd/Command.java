package com.alex.cmd;

/**
 * Created by Alexandru on 5/26/2017.
 */
public interface Command {

    /**
     * @param a - simple variable of integer type
     * @param b - simple variable of integer type
     * @return - this will return an integer result depending on what command will be executed
     * possible commands are Addition, Multiplication, Subtraction, Division
     */
    int compute(int a, int b);
}