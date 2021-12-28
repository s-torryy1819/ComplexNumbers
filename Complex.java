import java.lang.*;

import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

public class Complex {
    float real, img;
    double moduleOfNumber;
    Complex(){}
    Complex(float i, float r){
        real = r;
        img = i;
    }

    void display(){
        //System.out.println(img + "i + " + real);
        if(real < 0)
            System.out.println(img + "i  " + real);
        else if(real == 0)
            System.out.println(img + "i  ");
        else
            System.out.println(img + "i + " + real);
    }

    void module(){
        moduleOfNumber = sqrt(pow(real,2) + pow(img,2));
        System.out.format("%.4f",moduleOfNumber);
    }

    Complex add(Complex c2){
        Complex result = new Complex();
        result.real = real + c2.real;
        result.img = img + c2.img;
        return(result);
    }

    Complex multiply(Complex c2){
        Complex result = new Complex();
        result.real = real*c2.real - img*c2.img;
        result.img = real*c2.img + img*c2.real;
        return(result);
    }

    Complex division(Complex c2){
        Complex result = new Complex();
        result.real = (float) ((real*c2.real + img*c2.img) / (pow(c2.real, 2) + pow(c2.img,2)));
        result.img = (float) ((-real*c2.img + img*c2.real) / (pow(c2.real, 2) + pow(c2.img,2)));
        return(result);
    }


    double moduleOfSum(Complex c3){
        Complex result = new Complex();
        result.real = real*real;
        result.img = img*img;
        System.out.println(sqrt(result.real + result.img));
        return(sqrt(result.real + result.img));
    }



}
