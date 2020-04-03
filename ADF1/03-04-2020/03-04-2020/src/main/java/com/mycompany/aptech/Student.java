/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aptech;

/**
Vi du ve Cloneable Interface
* Muc dich la NHAN BAN(clone) 1 doi tuong bat ky
* Neu ko dung interface Cloneable => phai clone bang tay, rat mat cong...
* Thu nhe !
* 
*/
public class Student implements Cloneable {
    private String name, email;
    private Integer age;

    public Student(String name, String email, Integer age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
