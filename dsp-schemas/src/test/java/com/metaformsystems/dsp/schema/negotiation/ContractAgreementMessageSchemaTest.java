/*
 *  Copyright (c) 2024 Bayerische Motoren Werke Aktiengesellschaft (BMW AG)
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 *
 *  Contributors:
 *       Bayerische Motoren Werke Aktiengesellschaft (BMW AG) - initial API and implementation
 *
 */

package com.metaformsystems.dsp.schema.negotiation;

import com.metaformsystems.dsp.schema.fixtures.AbstractSchemaTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class ContractAgreementMessageSchemaTest extends AbstractSchemaTest {

    @Test
    void verifySchema() throws IOException {
        var node = mapper.readTree(getClass().getResourceAsStream("/negotiation/example/contract-agreement-message.json"));
        assertThat(schema.validate(node)).isEmpty();
    }

    @BeforeEach
    void setUp() {
        setUp("/negotiation/contract-agreement-message-schema.json");
    }

}
