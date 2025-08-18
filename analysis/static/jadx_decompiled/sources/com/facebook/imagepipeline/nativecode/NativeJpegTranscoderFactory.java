package com.facebook.imagepipeline.nativecode;

import defpackage.fm9;
import defpackage.ou6;
import defpackage.pm4;
import defpackage.qb4;
import defpackage.yv6;
import defpackage.zv6;

@pm4
/* loaded from: classes.dex */
public class NativeJpegTranscoderFactory implements zv6 {
    public final int a;
    public final boolean b;
    public final boolean c;

    @pm4
    public NativeJpegTranscoderFactory(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.zv6
    @pm4
    public yv6 createImageTranscoder(ou6 ou6Var, boolean z) {
        if (ou6Var != qb4.a) {
            return null;
        }
        NativeJpegTranscoder nativeJpegTranscoder = new NativeJpegTranscoder();
        nativeJpegTranscoder.a = z;
        nativeJpegTranscoder.b = this.a;
        nativeJpegTranscoder.c = this.b;
        if (this.c) {
            fm9.s();
        }
        return nativeJpegTranscoder;
    }
}
