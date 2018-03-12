package com.OneToMany.EmpAddr;

import com.OneToMany.EmpAdrr.EmpAddrApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EmpAddrApplication.class)
@AutoConfigureMockMvc
public class EmpAddrApplicationTests {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void shouldReturnDefaultMessage() throws Exception {
        /*this.mockMvc.perform(get("/emp/1")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Revon Desilva")));*/
		this.mockMvc.perform(get("/emp/1")).andDo(print()).andExpect(status().isOk());
		// .andExpect(content().json("{\"firstName\":\"Revon\",\"lastName\":\"Desilva\",\"fullName\":\"Revon Desilva\"}"));
	}

}
