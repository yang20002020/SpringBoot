package com.fuyu.controller;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.fuyu.controller.utils.R;
import com.fuyu.domain.Book;
import com.fuyu.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;


@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private IBookService bookService;

    @GetMapping
    public R getAll() {
        return new R(true, bookService.list());
    }

    @PostMapping
    public R save(@RequestBody Book book) throws IOException {
        //模拟异常情况
        if (book.getName().equals("123")) throw new IOException();
       // return new R(bookService.save(book));
        boolean flag = bookService.save(book);
        return new R(flag,flag?"添加成功^_^":"添加失败-_-");

    }

    @PutMapping
    public R update(@RequestBody Book book) {
        System.out.println("----#############??????-------");
        System.out.println("----#############??????-------");
        System.out.println("----#############??????-------");
        System.out.println("----#############??????-------");
        return new R(bookService.updateById(book));
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id) {
        return new R(bookService.removeById(id));
    }

    @GetMapping("{id}")
    public R getById(@PathVariable Integer id) {

        return new R(true, bookService.getById(id));
    }

//    @GetMapping("{currentPage}/{pageSize}")
//    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize) {
//        IPage<Book> page = bookService.getPage(currentPage, pageSize);
//        //如果当前页码数大于总页码数，那么重新执行查询操作，使用最大页码作为当前页码数
//        if(currentPage>page.getPages())
//        {
//            page= bookService.getPage((int)page.getPages(), pageSize);
//        }
//        return new R(true, page);
//    }

    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize,Book book) {

        System.out.println("参数book====>"+book);
        IPage<Book> page = bookService.getPage(currentPage, pageSize,book);
        //如果当前页码数大于总页码数，那么重新执行查询操作，使用最大页码作为当前页码数
        if(currentPage>page.getPages())
        {
            page= bookService.getPage((int)page.getPages(), pageSize,book);
        }
        return new R(true, page);
    }

}
