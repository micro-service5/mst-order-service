package com.thoughtworks.mstorderservice.util;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

import java.util.List;
import java.util.stream.Collectors;

public class EntityMapper {
    public static <T> T map(Object object, Class<T> type){
        return getStrictModelMapper().map(object, type);
    }

    private static ModelMapper getStrictModelMapper() {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return mapper;
    }

    public static <T> List<T> mapToList(List<Object> list, Class<T> type){
        ModelMapper mapper = getStrictModelMapper();
        return list.stream().map(o -> mapper.map(o, type)).collect(Collectors.toList());
    }

    public static <R, T> List<T> mapList(List<R> list, Class<T> type){
        ModelMapper mapper = getStrictModelMapper();
        return list.stream().map(o -> mapper.map(o, type)).collect(Collectors.toList());
    }
}
