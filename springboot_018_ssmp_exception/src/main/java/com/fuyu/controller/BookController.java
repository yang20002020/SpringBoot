package com.fuyu.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.fuyu.controller.utils.R;
import com.fuyu.domain.Book;
import com.fuyu.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

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
        if (true) throw new IOException();
        return new R(bookService.save(book));

    }

    @PutMapping
    public R update(@RequestBody Book book) {
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

    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize) {

        return new R(true, bookService.getPage(currentPage, pageSize));
    }


}
