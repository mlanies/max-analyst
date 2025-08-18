package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.util.LruCache;
import android.util.Range;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class eff extends u2 implements dff {
    public static final mu1 o = new mu1(16);
    public final MediaCodecInfo.VideoCapabilities c;

    public eff(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        MediaCodecInfo.VideoCapabilities videoCapabilities = ((MediaCodecInfo.CodecCapabilities) this.b).getVideoCapabilities();
        Objects.requireNonNull(videoCapabilities);
        this.c = videoCapabilities;
    }

    public static eff Z1(ic0 ic0Var) throws Throwable {
        MediaCodecInfo mediaCodecInfo;
        MediaCodec mediaCodecCreateEncoderByType;
        LruCache lruCache = w43.a;
        String str = ic0Var.a;
        LruCache lruCache2 = w43.a;
        synchronized (lruCache2) {
            mediaCodecInfo = (MediaCodecInfo) lruCache2.get(str);
        }
        if (mediaCodecInfo == null) {
            try {
                try {
                    mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(str);
                    try {
                        MediaCodecInfo codecInfo = mediaCodecCreateEncoderByType.getCodecInfo();
                        synchronized (lruCache2) {
                            lruCache2.put(str, codecInfo);
                        }
                        mediaCodecCreateEncoderByType.release();
                        mediaCodecInfo = codecInfo;
                    } catch (Throwable th) {
                        th = th;
                        if (mediaCodecCreateEncoderByType != null) {
                            mediaCodecCreateEncoderByType.release();
                        }
                        throw th;
                    }
                } catch (IOException | IllegalArgumentException e) {
                    throw new InvalidConfigException(e);
                }
            } catch (Throwable th2) {
                th = th2;
                mediaCodecCreateEncoderByType = null;
            }
        }
        return new eff(mediaCodecInfo, ic0Var.a);
    }

    @Override // defpackage.dff
    public final boolean A1(int i, int i2) {
        return this.c.isSizeSupported(i, i2);
    }

    @Override // defpackage.dff
    public final Range E1() {
        return this.c.getSupportedHeights();
    }

    @Override // defpackage.dff
    public final int a1() {
        return this.c.getWidthAlignment();
    }

    @Override // defpackage.dff
    public final Range b1() {
        return this.c.getBitrateRange();
    }

    @Override // defpackage.dff
    public final boolean h1() {
        return true;
    }

    @Override // defpackage.dff
    public final Range r1(int i) {
        try {
            return this.c.getSupportedWidthsFor(i);
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException(th);
        }
    }

    @Override // defpackage.dff
    public final Range v1(int i) {
        try {
            return this.c.getSupportedHeightsFor(i);
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException(th);
        }
    }

    @Override // defpackage.dff
    public final int w1() {
        return this.c.getHeightAlignment();
    }

    @Override // defpackage.dff
    public final Range x1() {
        return this.c.getSupportedWidths();
    }
}
