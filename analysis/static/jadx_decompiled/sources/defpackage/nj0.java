package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class nj0 implements q6b {
    public static final Bitmap.Config a = Bitmap.Config.ARGB_8888;
    public static Method b;

    @Override // defpackage.q6b
    public o43 a(Bitmap bitmap, s2b s2bVar) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = a;
        }
        o43 o43VarC = s2bVar.c(width, height, config);
        try {
            d((Bitmap) o43VarC.e0(), bitmap);
            return o43VarC.clone();
        } finally {
            o43.S(o43VarC);
        }
    }

    public void c(Bitmap bitmap) {
    }

    public void d(Bitmap bitmap, Bitmap bitmap2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (nu0.D0 && bitmap.getConfig() == bitmap2.getConfig()) {
            try {
                if (b == null) {
                    int i = Bitmaps.a;
                    b = Bitmaps.class.getDeclaredMethod("copyBitmap", Bitmap.class, Bitmap.class);
                }
                b.invoke(null, bitmap, bitmap2);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e4);
            }
        } else {
            new Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
        c(bitmap);
    }

    @Override // defpackage.q6b
    public String getName() {
        return "Unknown postprocessor";
    }
}
