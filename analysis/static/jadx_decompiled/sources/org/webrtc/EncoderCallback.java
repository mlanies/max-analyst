package org.webrtc;

/* loaded from: classes2.dex */
public interface EncoderCallback {
    void onEncodedImage(EncodedImage encodedImage);

    void onFrameDropped(int i);
}
