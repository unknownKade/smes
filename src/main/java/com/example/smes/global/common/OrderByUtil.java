package com.example.smes.global.common;

import com.querydsl.core.types.Order;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.Expressions;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OrderByUtil {
    public static OrderSpecifier[] orderSpecifiers(Sort sort){
        Iterator iterator = sort.stream().iterator();
        List<OrderSpecifier> list = new ArrayList<>();

        while(iterator.hasNext()){
            Sort.Order order = (Sort.Order)iterator.next();
            Order direction = order.getDirection().isAscending()? Order.ASC : Order.DESC;
            Path<Object> sortBy = Expressions.path(Object.class, order.getProperty());
            list.add(new OrderSpecifier(direction, sortBy));
        }

        return list.toArray(new OrderSpecifier[list.size()]);
    }
}
