package com.services;

import com.exceptions.InvalidNumberRangeException;

public interface MathService {

    // abstract static
    int add(int n1, int n2) throws InvalidNumberRangeException;
    int sub(int n1, int n2) throws InvalidNumberRangeException;
    int div(int n1, int n2) throws InvalidNumberRangeException;
    int multi(int n1, int n2) throws InvalidNumberRangeException;

}
