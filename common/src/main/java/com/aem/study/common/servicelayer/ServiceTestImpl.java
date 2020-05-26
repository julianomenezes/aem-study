package com.aem.study.common.servicelayer;


import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ComponentPropertyType;




@Component(
        immediate = true,
        service = { ServiceTest.class},
        property = {"url=url padrao"})


public class ServiceTestImpl implements ServiceTest {



    @Override
    public int calculateValue(int valueOne, int valueTwo) {
        return valueOne * valueTwo;
    }
}
