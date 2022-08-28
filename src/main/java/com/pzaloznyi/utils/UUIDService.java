package com.pzaloznyi.utils;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class UUIDService {
    public List<UUID> generate(long size) {
        return Stream.generate(UUID::randomUUID)
                .limit(size)
                .collect(Collectors.toList());
    }
}
