package com.example.search;

class ThreadExample extends Thread
{
    public void run()
    {
        for (int j = 0; j < 2; j++)
        {
            try
            {Thread.sleep(1000);
                System.out.println("The current thread name is for: " + Thread.currentThread().getName());
            } catch(Exception e)
            {
//                System.out.println("The exception has been caught: " + e);
            }
            System.out.println( j );
        }
    }
}

public class ThreadJoinExample
{
    public static void main (String argvs[])
    {
        ThreadExample th1 = new ThreadExample();
        ThreadExample th2 = new ThreadExample();
        ThreadExample th3 = new ThreadExample();
        th1.start();

        try
        {
            System.out.println("The current thread name is1: "+ Thread.currentThread().getName());
            th1.join();
        }
        catch(Exception e)
        {
            System.out.println("The exception has been caught1 " + e);
        }
        th2.start();
        try
        {
            System.out.println("The current thread name is2: " + Thread.currentThread().getName());
            th2.join();
        }
        catch(Exception e)
        {
            System.out.println("The exception has been caught2 " + e);
        }
        th3.start();
    }
}
//Multithreading
// Java Multithreading asosan o'yinlarda, animatsiyada va hokazolarda qo'llaniladi

//Multithreading  afzalliklari

// 1) U foydalanuvchini bloklamaydi , chunki iplar mustaqil va siz bir vaqtning o'zida bir nechta amallarni bajarishingiz mumkin.
// 2) Ko'p operatsiyalarni birgalikda bajarishingiz mumkin, shuning uchun vaqtni tejaydi .
// 3) Mavzular mustaqildir , shuning uchun bitta ipda istisno bo'lsa, u boshqa mavzularga ta'sir qilmaydi.

// bir vaqtning ozida faqat bitta ip bajariladi

//Thread class Runnabledan interfeysni amalga oshiradi
/*Thread ning usullari
 * 1) start usuli -->  bu ip ning bajarilishini boshlashni bildiradi.
 * 2) run usuli --> bu ip harakatlarini bajarish uchun ishlatiladi.
 * 3) sleep usuli --> bu ip belgillangan vaqt davomida uxlatadi.
 * 4) currentThread usuli --> bu hozir bajarilayotgan ip obyektini qaytradi.
 * */

/*
 * iplar qaysi holatlarda boladi bular quydagi holatlarda boladi
 * 1)  New  Thread.State.NEW
 * 2)  Active Thread.State.RUNNABLE
 * 3)  Blocked / Waiting  kutilmoqda  Thread.State.BLOCKED
 * 4)  Timed Waiting   kutish  Thread.State.TIMED_WAITING
 * 5)  Terminated  tugatilgan  Thread.State.TERMINATED
 * shu holatlarda boladi
 * */

