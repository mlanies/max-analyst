package defpackage;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;

/* loaded from: classes.dex */
public abstract class wh0 extends li0 {
    @Override // defpackage.li0
    public final void f(g0 g0Var) {
        if (g0Var.h()) {
            o43 o43Var = (o43) g0Var.e();
            try {
                g((o43Var == null || !(o43Var.e0() instanceof CloseableStaticBitmap)) ? null : ((CloseableStaticBitmap) o43Var.e0()).getUnderlyingBitmap());
            } finally {
                o43.S(o43Var);
            }
        }
    }

    public abstract void g(Bitmap bitmap);
}
