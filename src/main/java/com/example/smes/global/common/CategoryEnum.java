package com.example.smes.global.common;

public enum CategoryEnum {

    FACILITY("시설")
    , CLIENT("매출처")
    , SUPPLIER("공급처")
    , DEFECT("불량")
    , PROPS("속성");

    private final String name;
    CategoryEnum(String name){
        this.name = name;
    }

    //TODO: null exception handling
    public static String codeOf(String input){
        for(CategoryEnum code : CategoryEnum.values()){
            if(code.name.equals(input))
                return code.toString();
        }
        return null;
    }

}
