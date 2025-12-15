/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project1lap5;

/**
 *
 * @author fa_50
 */
public class Project1lap5 {

    public static void main(String[] args) {
        Product[] product = new Product[3];
        product[0]=new Product("lama",6.3);
        product[1]=new Product("maha",67.3);
        product[2]=new Product("sara",92.3);

        System.out.println(product[0].getInfo());
        System.out.println(product[1].getInfo());
        System.out.println(product[2].getInfo());
        
        double totalPrice=0.0;
        for(Product p : product){ //Product p - declares a variable of the same type as the array elements
        //· product - the array you're iterating through
            totalPrice += p.getPrice();
        }
        //· The loop automatically goes through each element in the array, one by one

        System.out.println("total price "+totalPrice);
        System.out.println("total products "+Product.productCount); 
//        Product name of the class and the var inside it is productCount

    }
}
