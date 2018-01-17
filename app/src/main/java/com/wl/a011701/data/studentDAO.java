package com.wl.a011701.data;

import java.util.ArrayList;

/**
 * Created by Student on 2018/1/17.
 */

public class studentDAO
{
    public ArrayList<student> mylist;

    public studentDAO()
    {
        mylist =new ArrayList<>();
    }

    ///////////////////////////////////////////////////////////////////////////////////////

    public boolean add(student s)  //新增 ，且回傳有無成功
    {
        mylist.add(s);
        return  true;
    }

    ///////////////////////////////////////////////////////////////////////////////////////

    public ArrayList<student> getList() //回傳清單  所以類型訂為ArrayList<student>
    {
        return mylist;
    }

    ///////////////////////////////////////////////////////////////////////////////////////

    public student getStudent(int id)////取得學生資料 所以回傳類型 為student類別
    {
        for(student s:mylist)
        {
            if(s.id==id)
            {
                return s;
            }
        }
        return null;
    }
    ///////////////////////////////////////////////////////////////////////////////////////

    public boolean update(student x) //更新名字、分數
    {
        for(student s:mylist)
        {
            if(s.id==x.id)
            {
                s.name=x.name;
                s.score=x.score;
                return true;
            }
        }
        return false;
    }

    ///////////////////////////////////////////////////////////////////////////////////////

    public boolean delete(int id)  //刪除
    {
        for(student s:mylist)
        {
            if(id==s.id)
            {
                mylist.remove(s);
                return true;
            }
        }
        return false;
    }
}
