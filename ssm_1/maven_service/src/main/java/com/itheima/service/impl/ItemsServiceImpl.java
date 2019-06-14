package com.itheima.service.impl;

import com.itheima.dao.ItemsMapper;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("itemService")
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapper itemsMapper;

    public Items findById(Integer id) {
        return itemsMapper.findById(id);
    }
}
