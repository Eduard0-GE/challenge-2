package br.com.ms.b.controller;

import br.com.ms.b.feignClient.MsAuthAndAutoFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/scholar/", consumes = MediaType.APPLICATION_JSON_VALUE)
public class msBController {
    private final MsAuthAndAutoFeign msAuthAndAutoFeign;

    @Autowired
    public msBController(MsAuthAndAutoFeign msAuthAndAutoFeign) {
        this.msAuthAndAutoFeign = msAuthAndAutoFeign;
    }
}