package org.webrtc;

import java.io.IOException;

/* loaded from: classes2.dex */
interface MediaCodecWrapperFactory {
    MediaCodecWrapper createByCodecName(String str) throws IOException;
}
