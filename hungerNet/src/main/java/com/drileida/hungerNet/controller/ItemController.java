package com.drileida.hungerNet.controller;

import com.drileida.hungerNet.service.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class ItemController {

    @Autowired
    private MenuItemService menuItemService;


}
