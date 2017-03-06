/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author user
 */
public class Food {
    private int price;
    private String name;
    Food(int price,String name)  //建構子，為了初始化(一開始就有的參數)物件
    {
        this.price=price;
        this.name=name;
    }
    public void setPrice(int price) //方法   輸入 方法(輸出)
        {
            this.price=price; //這物件裡的屬性和方法 等號的右邊是傳進來的東西
        }    
        public int getPrice() //方法
        {
            return price;
        }   
}
