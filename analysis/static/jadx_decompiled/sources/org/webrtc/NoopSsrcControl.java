package org.webrtc;

/* loaded from: classes2.dex */
public class NoopSsrcControl implements DecoderSsrcControl {
    @Override // org.webrtc.DecoderSsrcControl
    public void onDecoderInit(AndroidVideoDecoder androidVideoDecoder, long j) {
    }

    @Override // org.webrtc.DecoderSsrcControl
    public void onDecoderRelease(AndroidVideoDecoder androidVideoDecoder, long j) {
    }

    @Override // org.webrtc.DecoderSsrcControl
    public void onDecoderSsrcChanged(AndroidVideoDecoder androidVideoDecoder, long j, long j2) {
    }

    @Override // org.webrtc.DecoderSsrcControl
    public boolean ssrcAllowedCodecInit(AndroidVideoDecoder androidVideoDecoder, long j) {
        return true;
    }

    @Override // org.webrtc.DecoderSsrcControl
    public boolean ssrcAllowedDecode(AndroidVideoDecoder androidVideoDecoder, long j) {
        return true;
    }
}
