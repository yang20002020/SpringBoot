package com.fuyu.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fuyu.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class BookDaoTest {
    @Autowired
    private BookDao bookDao;
    @Test
    void testGetById(){
        System.out.println(bookDao.selectById(2));
    }
    @Test
    void testSave(){
        Book book = new Book();
        book.setType("测试123");
        book.setName("java");
        book.setDescription("测试数据123");
        bookDao.insert(book);
    }

    @Test
    void testUpDate(){
        Book book = new Book();
        book.setId(23);
        book.setType("测试123abc");
        book.setName("java123");
        book.setDescription("测试数据123abc");
        bookDao.updateById(book);
    }
    @Test
    void testDelete(){
       bookDao.deleteById(24);
    }
    @Test
    void testGetAll(){
        List<Book> books = bookDao.selectList(null);
        System.out.println(books);
    }
    //分页
    @Test
    void testGetPage(){
        IPage page = new Page(1, 5);
        bookDao.selectPage(page,null);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(page.getRecords());
    }
    //条件查询
    @Test
    void testGetBy(){
       // select *from tbl_book where name like %Spring%
        QueryWrapper<Book> qw = new QueryWrapper<>();
        qw.like("name","Spring");
        bookDao.selectList(qw);
    }
    //方法二
    @Test
    void testGetBy2(){
        LambdaQueryWrapper<Book> lqw=new LambdaQueryWrapper<Book>();
        String name="Spring";
        lqw.like(Book::getName,name);
        bookDao.selectList(lqw);
    }
    //运行该测试用例会出现sql语句bug
    @Test
    void testGetBy3(){
        LambdaQueryWrapper<Book> lqw=new LambdaQueryWrapper<Book>();
        String name=null;
        lqw.like(Book::getName,name);
        bookDao.selectList(lqw);
    }
    //改进
    @Test
    void testGetBy4(){
        LambdaQueryWrapper<Book> lqw=new LambdaQueryWrapper<Book>();
        String name=null;
        lqw.like(name !=null,Book::getName,name);//如果name不等于null,则执行该语句；否则不执行该语句
        bookDao.selectList(lqw);
    }
    @Test
    void testGetBy5(){
        LambdaQueryWrapper<Book> lqw=new LambdaQueryWrapper<Book>();
        bookDao.selectList(lqw);
    }
}
