package com.facebook.imagepipeline.nativecode;

import android.graphics.ColorSpace;
import defpackage.anc;
import defpackage.fm5;
import defpackage.fm9;
import defpackage.g05;
import defpackage.jic;
import defpackage.mqd;
import defpackage.od2;
import defpackage.ou6;
import defpackage.pm4;
import defpackage.q43;
import defpackage.qb4;
import defpackage.r97;
import defpackage.rq8;
import defpackage.wz;
import defpackage.yv6;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@pm4
/* loaded from: classes.dex */
public class NativeJpegTranscoder implements yv6 {
    public boolean a;
    public int b;
    public boolean c;

    public static void e(InputStream inputStream, rq8 rq8Var, int i, int i2, int i3) throws IOException {
        fm9.s();
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException();
        }
        if (!(i2 <= 16)) {
            throw new IllegalArgumentException();
        }
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException();
        }
        if (!(i3 <= 100)) {
            throw new IllegalArgumentException();
        }
        wz wzVar = r97.a;
        if (!(i >= 0 && i <= 270 && i % 90 == 0)) {
            throw new IllegalArgumentException();
        }
        od2.k("no transformation requested", (i2 == 8 && i == 0) ? false : true);
        nativeTranscodeJpeg(inputStream, rq8Var, i, i2, i3);
    }

    public static void f(InputStream inputStream, rq8 rq8Var, int i, int i2, int i3) throws IOException {
        boolean z;
        fm9.s();
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException();
        }
        if (!(i2 <= 16)) {
            throw new IllegalArgumentException();
        }
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException();
        }
        if (!(i3 <= 100)) {
            throw new IllegalArgumentException();
        }
        wz wzVar = r97.a;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        if (!z) {
            throw new IllegalArgumentException();
        }
        od2.k("no transformation requested", (i2 == 8 && i == 1) ? false : true);
        nativeTranscodeJpegWithExifOrientation(inputStream, rq8Var, i, i2, i3);
    }

    @pm4
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    @pm4
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    @Override // defpackage.yv6
    public final String a() {
        return "NativeJpegTranscoder";
    }

    @Override // defpackage.yv6
    public final fm5 b(g05 g05Var, rq8 rq8Var, anc ancVar, jic jicVar, ColorSpace colorSpace) {
        Integer num = 85;
        if (ancVar == null) {
            ancVar = anc.b;
        }
        int iG = mqd.g(ancVar, jicVar, g05Var, this.b);
        try {
            int iC = r97.c(ancVar, jicVar, g05Var, this.a);
            int iMax = Math.max(1, 8 / iG);
            if (this.c) {
                iC = iMax;
            }
            InputStream inputStreamN = g05Var.n();
            wz wzVar = r97.a;
            g05Var.o0();
            if (wzVar.contains(Integer.valueOf(g05Var.X))) {
                int iA = r97.a(ancVar, g05Var);
                od2.o(inputStreamN, "Cannot transcode from null input stream!");
                f(inputStreamN, rq8Var, iA, iC, num.intValue());
            } else {
                int iB = r97.b(ancVar, g05Var);
                od2.o(inputStreamN, "Cannot transcode from null input stream!");
                e(inputStreamN, rq8Var, iB, iC, num.intValue());
            }
            q43.b(inputStreamN);
            return new fm5(iG != 1 ? 0 : 1, 7);
        } catch (Throwable th) {
            q43.b(null);
            throw th;
        }
    }

    @Override // defpackage.yv6
    public final boolean c(ou6 ou6Var) {
        return ou6Var == qb4.a;
    }

    @Override // defpackage.yv6
    public final boolean d(g05 g05Var, anc ancVar, jic jicVar) {
        if (ancVar == null) {
            ancVar = anc.b;
        }
        return r97.c(ancVar, jicVar, g05Var, this.a) < 8;
    }
}
