/*
 *  Copyright (c) 2024 Metaform Systems, Inc.
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 *
 *  Contributors:
 *       Metaform Systems, Inc. - initial API and implementation
 *
 */

package com.metaformsystems.dsp.context.transfer;

import com.metaformsystems.dsp.context.fixtures.AbstractJsonLdTest;
import org.junit.jupiter.api.Test;

public class TransferContextTest extends AbstractJsonLdTest {

    @Test
    void verifyTransferError() {
        verifyRoundTrip("/transfer/example/transfer-error.json", "/transfer/transfer-error-schema.json");
    }


}
