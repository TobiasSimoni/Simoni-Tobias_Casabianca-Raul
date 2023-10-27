package com.backend.parcial.test;

import com.backend.parcial.dao.impl.OdontologoDaoH2;
import com.backend.parcial.model.Odontologos;
import com.backend.parcial.service.OdontologosService;

class OdontologosServiceTest {

    public  OdontologosServiceTest{
        private OdontologosService odontologosService = new OdontologosService(new OdontologoDaoH2());


    }

void deberiaagregarunodontologo(){
    Odontologos odontologos = new Odontologos(32313,"Tobias","Simoni");

}



}