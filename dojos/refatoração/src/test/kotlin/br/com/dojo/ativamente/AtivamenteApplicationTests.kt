package br.com.dojo.ativamente

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
internal class AtivamenteApplicationTests {

    @Autowired
    private lateinit var mockMvc: MockMvc;

	@Autowired
	private lateinit var fraudeController: FraudeController;

    @BeforeAll
    fun `montar os dados`() {

    }

    @Test
    fun `teste - Busca da pagina Google Utilizando mock`() {
        mockMvc.get("https://google.com").andExpect { status { 200 } }
    }

    @Test
    fun `teste - Assert Equals`() {
        assertEquals(1, 1)
    }

}
