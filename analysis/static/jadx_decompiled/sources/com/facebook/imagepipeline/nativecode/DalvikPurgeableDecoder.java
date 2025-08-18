package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import com.facebook.imagepipeline.common.TooManyBitmapsException;
import defpackage.g05;
import defpackage.hm9;
import defpackage.mv6;
import defpackage.nu0;
import defpackage.o43;
import defpackage.om4;
import defpackage.pm4;
import defpackage.qn0;
import defpackage.qo0;
import defpackage.qq8;
import defpackage.rn0;
import defpackage.t2b;
import defpackage.v84;
import defpackage.wg0;
import java.util.Locale;

@pm4
/* loaded from: classes.dex */
public abstract class DalvikPurgeableDecoder implements t2b {
    public static final byte[] b;
    public final qn0 a;

    @om4
    public static class OreoUtils {
        private OreoUtils() {
        }
    }

    static {
        int i = mv6.a;
        hm9.M("imagepipeline");
        b = new byte[]{-1, -39};
    }

    public DalvikPurgeableDecoder() {
        if (rn0.c == null) {
            synchronized (rn0.class) {
                if (rn0.c == null) {
                    rn0.c = new qn0(rn0.b, rn0.a);
                }
            }
        }
        this.a = rn0.c;
    }

    public static boolean e(int i, o43 o43Var) {
        qq8 qq8Var = (qq8) o43Var.e0();
        return i >= 2 && qq8Var.o(i + (-2)) == -1 && qq8Var.o(i - 1) == -39;
    }

    @pm4
    private static native void nativePinBitmap(Bitmap bitmap);

    @Override // defpackage.t2b
    public final o43 a(g05 g05Var, Bitmap.Config config) {
        int i = g05Var.s0;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        options.inMutable = true;
        options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        o43 o43VarO = o43.o(g05Var.a);
        o43VarO.getClass();
        try {
            return f(b(o43VarO, options));
        } finally {
            o43.S(o43VarO);
        }
    }

    public abstract Bitmap b(o43 o43Var, BitmapFactory.Options options);

    public abstract Bitmap c(o43 o43Var, int i, BitmapFactory.Options options);

    @Override // defpackage.t2b
    public final o43 d(g05 g05Var, Bitmap.Config config, int i, ColorSpace colorSpace) {
        int i2 = g05Var.s0;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i2;
        options.inMutable = true;
        if (colorSpace == null) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        options.inPreferredColorSpace = colorSpace;
        o43 o43VarO = o43.o(g05Var.a);
        o43VarO.getClass();
        try {
            return f(c(o43VarO, i, options));
        } finally {
            o43.S(o43VarO);
        }
    }

    public final v84 f(Bitmap bitmap) {
        int i;
        long j;
        int i2;
        bitmap.getClass();
        try {
            nativePinBitmap(bitmap);
            qn0 qn0Var = this.a;
            synchronized (qn0Var) {
                int iD = qo0.d(bitmap);
                int i3 = qn0Var.a;
                if (i3 < qn0Var.c) {
                    long j2 = qn0Var.b + iD;
                    if (j2 <= qn0Var.d) {
                        qn0Var.a = i3 + 1;
                        qn0Var.b = j2;
                        return o43.p0(bitmap, this.a.e, o43.Y);
                    }
                }
                int iD2 = qo0.d(bitmap);
                bitmap.recycle();
                Locale locale = Locale.US;
                qn0 qn0Var2 = this.a;
                synchronized (qn0Var2) {
                    i = qn0Var2.a;
                }
                qn0 qn0Var3 = this.a;
                synchronized (qn0Var3) {
                    j = qn0Var3.b;
                }
                qn0 qn0Var4 = this.a;
                synchronized (qn0Var4) {
                    i2 = qn0Var4.c;
                }
                int iB = this.a.b();
                StringBuilder sbJ = wg0.j("Attempted to pin a bitmap of size ", iD2, " bytes. The current pool count is ", i, ", the current pool size is ");
                sbJ.append(j);
                sbJ.append(" bytes. The current pool max count is ");
                sbJ.append(i2);
                sbJ.append(", the current pool max size is ");
                sbJ.append(iB);
                sbJ.append(" bytes.");
                throw new TooManyBitmapsException(sbJ.toString());
            }
        } catch (Exception e) {
            bitmap.recycle();
            nu0.H(e);
            throw null;
        }
    }
}
