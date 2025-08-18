package defpackage;

import com.facebook.animated.gif.GifImage;

/* loaded from: classes.dex */
public final class df {
    public static final GifImage a;
    public static final GifImage b;

    static {
        GifImage gifImage;
        GifImage gifImage2 = null;
        try {
            gifImage = (GifImage) GifImage.class.newInstance();
        } catch (Throwable unused) {
            gifImage = null;
        }
        a = gifImage;
        try {
            gifImage2 = (GifImage) Class.forName("com.facebook.animated.webp.WebPImage").newInstance();
        } catch (Throwable unused2) {
        }
        b = gifImage2;
    }

    public static j43 a(String str, ju6 ju6Var, GifImage gifImage) {
        ju6Var.getClass();
        m5d m5dVar = new m5d(2, gifImage);
        m5dVar.o = null;
        m5dVar.X = null;
        m5dVar.b = str;
        a8g a8gVarT = m5dVar.t();
        j43 j43Var = new j43();
        j43Var.o = a8gVarT;
        j43Var.X = true;
        return j43Var;
    }
}
