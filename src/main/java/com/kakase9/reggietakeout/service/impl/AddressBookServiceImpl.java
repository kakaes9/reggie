package com.kakase9.reggietakeout.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kakase9.reggietakeout.entity.AddressBook;
import com.kakase9.reggietakeout.mapper.AddressBookMapper;
import com.kakase9.reggietakeout.service.AddressBookService;
import org.springframework.stereotype.Service;

/**
 * @author yjt
 * @create 2022-07-16-1:05
 */
@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {
}
