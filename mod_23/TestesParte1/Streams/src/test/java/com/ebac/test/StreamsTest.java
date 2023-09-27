
package com.ebac.test;
import com.ebac.streams.Contato;
import com.ebac.streams.Streams;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class StreamsTest {

    @Test
    public void testContatosFemininos() {
        // Obtém a lista contatosFemininos da classe Streams
        List<Contato> contatosFemininos = Streams.getContatosFemininos();
        List<Contato> contatosMasculinos = Streams.getContatosMasculinos();
        
        // Verificando se a lista contatosFemininos contém apenas gênero feminino
        for (Contato contato : contatosFemininos) {
            assertEquals("Feminino", contato.getGenero(), "A lista contém um contato não feminino: " + contato.getNome());
        }
        // Verificando se a lista contatosMasculino contém apenas gênero masculino
        for (Contato contato : contatosMasculinos) {
            assertEquals("Masculino", contato.getGenero(), "A lista contém um contato não feminino: " + contato.getNome());
        }
    }
}



