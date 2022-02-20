package com.company.dymrin25_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ClientEngineTest {

    @Test
    public void testThrowOurRunTimeException_whenTheClientStartedBeforeServer() {
        Assertions.assertThrows(RuntimeException.class, () -> new ClientEngine().start());
    }

}

