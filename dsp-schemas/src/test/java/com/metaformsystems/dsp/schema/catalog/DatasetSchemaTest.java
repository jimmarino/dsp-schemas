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

package com.metaformsystems.dsp.schema.catalog;

import com.metaformsystems.dsp.schema.fixtures.AbstractSchemaTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.networknt.schema.InputFormat.JSON;
import static org.assertj.core.api.Assertions.assertThat;

/**
 *
 */
public class DatasetSchemaTest extends AbstractSchemaTest {

    @Test
    void verifySchema() {
        assertThat(schema.validate(DATASET, JSON)).isEmpty();
    }

    @BeforeEach
    void setUp() {
        setUp("/catalog/dataset-schema.json");
    }

    private static final String DATASET = """
            {
              "@id": "urn:uuid:3dd1add8-4d2d-569e-d634-8394a8836a88",
              "hasPolicy": [
                {
                  "@id": "urn:uuid:3dd1add8-4d2d-569e-d634-8394a8836a88",
                  "@type": "Offer",
                  "permission": [
                    {
                      "action": "use",
                      "constraint": [{
                        "leftOperand": "spatial",
                        "operator": "eq",
                        "rightOperand": "http://example.org/EU"
                      }],
                      "duty": {
                        "action": "Attribution"
                      }
                    }
                  ]
                }
              ]
            }
            """;

}