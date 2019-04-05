package com.myspringboot.blog.dto;

import com.myspringboot.blog.model.Vo.MetaVo;

public class MetaDto extends MetaVo {

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
