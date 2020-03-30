/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass.tutorials;

//1 class co the thuc thi NHIEU interface
public class Student implements IPlayable, ILearning {
    //tao them interface nua nao !
    @Override
    public void playFootball() {
        System.out.println("I am playing football");
    }

    @Override
    public void playTennis() {
        System.out.println("I am playing tennis");
    }

    @Override
    public void gotoLibrary() {
        System.out.println("I am playing tennis");
    }

    @Override
    public void buyABook(String bookName) {
        System.out.println("I am buying book: "+bookName);
    }
    
}
