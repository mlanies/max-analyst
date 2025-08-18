package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class ju6 {
    public static final ju6 c;
    public final Bitmap.Config a;
    public final Bitmap.Config b;

    static {
        ph4 ph4Var = new ph4();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        ph4Var.a = config;
        ph4Var.b = config;
        c = new ju6(ph4Var);
    }

    public ju6(ph4 ph4Var) {
        this.a = (Bitmap.Config) ph4Var.a;
        this.b = (Bitmap.Config) ph4Var.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ju6.class != obj.getClass()) {
            return false;
        }
        ju6 ju6Var = (ju6) obj;
        return this.a == ju6Var.a && this.b == ju6Var.b;
    }

    public final int hashCode() {
        int iOrdinal = (this.a.ordinal() - 552645669) * 31;
        Bitmap.Config config = this.b;
        return (iOrdinal + (config != null ? config.ordinal() : 0)) * 29791;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageDecodeOptions{");
        nw4 nw4VarR0 = j47.r0(this);
        nw4VarR0.a(100, "minDecodeIntervalMs");
        nw4VarR0.a(Integer.MAX_VALUE, "maxDimensionPx");
        nw4VarR0.d("decodePreviewFrame", false);
        nw4VarR0.d("useLastFrameForPreview", false);
        nw4VarR0.d("useEncodedImageForPreview", false);
        nw4VarR0.d("decodeAllFrames", false);
        nw4VarR0.d("forceStaticImage", false);
        nw4VarR0.e(this.a.name(), "bitmapConfigName");
        nw4VarR0.e(this.b.name(), "animatedBitmapConfigName");
        nw4VarR0.e(null, "customImageDecoder");
        nw4VarR0.e(null, "bitmapTransformation");
        nw4VarR0.e(null, "colorSpace");
        return zr6.l(sb, nw4VarR0.toString(), "}");
    }
}
