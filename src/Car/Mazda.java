/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

 import Workshop.Workshop;
public class Mazda extends Car {

    public Mazda(Workshop workShop1, Workshop workShop2, Workshop workShop3, Workshop workShop4) {
        super(workShop1, workShop2, workShop3, workShop4);
    }
 
 
 
 @Override
 public void production_house() {
 System.out.print("Mazda Car ");
 workShop1.work();
 workShop2.work();
  workShop3.work();
 workShop4.work();
 }
 
}