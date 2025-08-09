package demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


public class Doctor implements Stuff, BeanNameAware {

   @Override
   public String toString()
   {
       return "Doctor{" +
               "qualification="+qualification+'\n'+'}';
   }
    private String qualification;

    public void assist()
    {
        System.out.println("Working");
    }


    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public void setBeanName(String name)
    {
        System.out.println("I am in set bean");
    }

    @PostConstruct
    public void postConstruct()
    {
        System.out.println("Post Method is Called");
    }
}
