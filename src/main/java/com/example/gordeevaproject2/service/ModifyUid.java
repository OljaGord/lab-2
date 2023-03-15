package com.example.gordeevaproject2.service;

import com.example.gordeevaproject2.model.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Qualifier("id1")

public class ModifyUid implements MyModifyService{
    @Override
    public Response modify (Response response) {
        response.setUid("New Uid");
        return response;
    }
}

