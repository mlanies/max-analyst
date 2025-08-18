package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* loaded from: classes.dex */
public final class l88 implements j88, k88 {
    public final /* synthetic */ int a;
    public final int b;
    public MediaCodecInfo[] c;

    public l88(int i, boolean z, boolean z2) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = (z || z2) ? 1 : 0;
                break;
            default:
                this.b = (z || z2) ? 1 : 0;
                break;
        }
    }

    @Override // defpackage.j88, defpackage.k88
    public final MediaCodecInfo a(int i) {
        switch (this.a) {
            case 0:
                if (this.c == null) {
                    this.c = new MediaCodecList(this.b).getCodecInfos();
                }
                break;
            default:
                if (this.c == null) {
                    this.c = new MediaCodecList(this.b).getCodecInfos();
                }
                break;
        }
        return this.c[i];
    }

    @Override // defpackage.j88, defpackage.k88
    public final boolean d(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        switch (this.a) {
        }
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // defpackage.j88, defpackage.k88
    public final boolean e(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        switch (this.a) {
        }
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // defpackage.j88, defpackage.k88
    public final int g() {
        switch (this.a) {
            case 0:
                if (this.c == null) {
                    this.c = new MediaCodecList(this.b).getCodecInfos();
                }
                break;
            default:
                if (this.c == null) {
                    this.c = new MediaCodecList(this.b).getCodecInfos();
                }
                break;
        }
        return this.c.length;
    }

    @Override // defpackage.j88, defpackage.k88
    public final boolean h() {
        switch (this.a) {
        }
        return true;
    }
}
