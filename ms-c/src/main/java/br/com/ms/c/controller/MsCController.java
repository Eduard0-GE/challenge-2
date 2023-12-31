package br.com.ms.c.controller;

import br.com.ms.c.feignClient.MsAuthAndAutoFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/scholar/")

public class MsCController {
    private final MsAuthAndAutoFeign msAuthAndAutoFeign;

    @Autowired
    public MsCController(MsAuthAndAutoFeign msAuthAndAutoFeign){
        this.msAuthAndAutoFeign = msAuthAndAutoFeign;
    }
    @GetMapping(value = "{id_user}/microsservice/{id_microsservice}")
    public ResponseEntity<Object> getAllUser(@PathVariable Integer id_user,
                                             @PathVariable Integer id_microsservice) {
        return msAuthAndAutoFeign.getAllByIdUserIdMicrosservce(id_user, id_microsservice);
    }
    @GetMapping(value = "microsservice/{id_microsservice}")
    public ResponseEntity<Object> getAllByMicrosservice(@PathVariable Integer id_microsservice){
        return msAuthAndAutoFeign.getByIdMicrosservice(id_microsservice);
    }
}
