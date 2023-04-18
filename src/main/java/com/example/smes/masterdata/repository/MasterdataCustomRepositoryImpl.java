package com.example.smes.masterdata.repository;

import com.example.smes.global.common.OrderByUtil;
import com.example.smes.global.common.QSimpleDTO;
import com.example.smes.global.common.SimpleDTO;
import com.example.smes.masterdata.dto.*;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.support.PageableExecutionUtils;

import java.util.List;

import static com.example.smes.masterdata.entity.QMasterdata.masterdata;

@RequiredArgsConstructor
public class MasterdataCustomRepositoryImpl implements MasterdataCustomRepository{
    private final JPAQueryFactory queryFactory;

    //TODO: null exception handling when orderBy is empty
    @Override
    public Page<MasterdataDTO> search(MasterdataSearchCriteria criteria, Pageable pageable) {
        List<MasterdataDTO> content = queryFactory
                .select(new QMasterdataDTO(
                        masterdata.id
                        , masterdata.category
                        , masterdata.name))
                .from(masterdata)
                .where(
                    categoryIn(criteria.getCategory())
                    ,nameLike(criteria.getKeyword())
                )
                .orderBy(OrderByUtil.orderSpecifiers(pageable.getSort()))
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch();

        JPAQuery<Long> countQuery = queryFactory
                .select(masterdata.count())
                .from(masterdata)
                .where(
                        categoryIn(criteria.getCategory())
                        ,nameLike(criteria.getKeyword())
                );

        return PageableExecutionUtils.getPage(content, pageable, countQuery::fetchOne);

    }

    @Override
    public List<SimpleDTO> getByCategory(String category) {
        return queryFactory
                .select(new QSimpleDTO(
                        masterdata.id
                        , masterdata.name
                ))
                .from(masterdata)
                .where(
                        masterdata.category.eq(category)
                )
                .orderBy( )
                .fetch();
    }

    private BooleanExpression categoryIn(List<String> category){
        return category != null? masterdata.category.in(category) : null;
    }

    private BooleanExpression nameLike(String name){
        return name != null? masterdata.name.like("%"+ name +"%") : null;
    }

}
