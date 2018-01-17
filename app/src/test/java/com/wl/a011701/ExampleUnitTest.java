//ExamleUnitTent  是拿來跑測試用的 ，類別外面要加@test   ，常用assertEquals 來判斷兩引數是否相等，
//測試 DAO，便不用每次測試都還要開模擬器
package com.wl.a011701;

import com.wl.a011701.data.student;
import com.wl.a011701.data.studentDAO;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest
{
    @Test
    public void addition_isCorrect() throws Exception
    {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void test1() throws Exception
    {
        assertEquals(8,2+6);
    }

    @Test
    public void test2() throws Exception
    {
        mytest t=new mytest();
        assertEquals(8, t.getadd(2,6));
    }

    @Test
    public void test_add_data()throws Exception  //新增
    {
        studentDAO dao=new studentDAO();
        dao.add(new student(1,"Mary",95));
        dao.add(new student(2,"Bob",90));
        assertEquals(2,dao.getList().size());  //測有無都新增進去
    }

    @Test
    public void test_add_data2()throws Exception    //新增
    {
        studentDAO dao=new studentDAO();
        dao.add(new student(1,"Mary",95));
        dao.add(new student(2,"Bob",90));
        assertEquals(90,dao.getList().get(1).score);  //測新增的資料正確否
    }

    @Test
    public void test_getStudent()throws Exception    //取資料
    {
        studentDAO dao=new studentDAO();
        dao.add(new student(1,"Mary",95));
        dao.add(new student(2,"Bob",90));
        assertEquals(90,dao.getStudent(2).score);  //測資料正確否
    }

    @Test
    public void test_getStudent2()throws Exception    //取資料
    {
        studentDAO dao=new studentDAO();
        dao.add(new student(1,"Mary",95));
        dao.add(new student(2,"Bob",90));
        assertEquals(null,dao.getStudent(3));   //測 反例
    }

    @Test
    public void test_update()throws Exception    //更新資料
    {
        studentDAO dao=new studentDAO();
        dao.add(new student(1,"Mary",95));
        dao.add(new student(2,"Bob",90));
        dao.update(new student(2,"Peter",80));
        assertEquals(80,dao.getStudent(2).score);   //測 反例
    }

    @Test
    public void test_delete()throws Exception    //刪除資料
    {
        studentDAO dao=new studentDAO();
        dao.add(new student(1,"Mary",95));
        dao.add(new student(2,"Bob",90));
        dao.delete(2);
        assertEquals(1,dao.getList().size());   //測 筆數 以確定是否刪除
    }
}