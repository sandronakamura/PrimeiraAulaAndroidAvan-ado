package com.example.calculadoraimc

import org.junit.Assert.*
import org.junit.Test

class UtilTest {

    @Test
    fun `Teste resultado sobrepeso`() {
        val result = getImcResult("90", alturaTxt = "1.80")

        assertEquals(result.result, Result.SOBREPESO)
    }

    @Test
    fun `Valida campos em branco`() {
        val semPeso = getImcResult("",  "1.80")
        assertEquals(semPeso.result, Result.BLANK)

        val semAltura = getImcResult( "90", "")
        assertEquals(semAltura.result, Result.BLANK)

    }
}