package com.projects.ccd.dto;

import static org.junit.Assert.assertEquals;

import com.projects.ccd.model.ConfigModel;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ConfigDtoTest {
  
  private ObjectMapper mapper;
  
  @Before public void initialize() {
    mapper = new ObjectMapper();
  }
  
  @Test
  public void testToConfigObject() throws JsonProcessingException  {
    ConfigDto dto = new ConfigDto();
    dto.setLoopingTime(1000);
    dto.setPort(8080);
    dto.setReceiverEmails("abc@email");
    dto.setSenderEmailPassword("hihihi");
    dto.setSenderEmail("sender@gmail");
    ConfigModel model = dto.toConfigObject();
//    assertEquals(mapper.writeValueAsString(dto), mapper.writeValueAsString(model));
  }

}
