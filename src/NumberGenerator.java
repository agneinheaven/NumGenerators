import java.math.BigInteger;
import java.util.Random;

public class NumberGenerator {
 public static void main(String[] args){
    Random numberA = new Random();

    long genInitialA = numberA.nextLong();

    Random numberB = new Random();

    long genInitialB = numberB.nextLong();

     final int COEFFICIENT_A = 16807;

    long numberAA = 65;
    int multiplicationResult = 2147483647;
    for(int i = 0; i < 1000000; i++){
    long resultA = numberAA * COEFFICIENT_A % multiplicationResult;System.out.println(resultA);numberAA = resultA;}
}
}