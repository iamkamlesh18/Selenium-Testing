package com.services;

import com.exceptions.InvalidNumberRangeException;

public class MathServiceImpl implements MathService {
    public int add(int n1, int n2) throws InvalidNumberRangeException {
        return n1 + n2;
    }

    public int sub(int n1, int n2) throws InvalidNumberRangeException {
        return 0;
    }

    public int div(int n1, int n2) throws InvalidNumberRangeException {
        return 0;
    }

    public int multi(int n1, int n2) throws InvalidNumberRangeException {
        return 0;
    }
}
