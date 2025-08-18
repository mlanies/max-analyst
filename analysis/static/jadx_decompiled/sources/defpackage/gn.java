package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* loaded from: classes.dex */
public final class gn {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static gn c;
    public oic a;

    public static synchronized gn a() {
        try {
            if (c == null) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        return oic.g(i, mode);
    }

    public static synchronized void d() {
        if (c == null) {
            gn gnVar = new gn();
            c = gnVar;
            gnVar.a = oic.c();
            oic oicVar = c.a;
            q40 q40Var = new q40();
            synchronized (oicVar) {
                oicVar.e = q40Var;
            }
        }
    }

    public static void e(Drawable drawable, qh3 qh3Var, int[] iArr) {
        PorterDuff.Mode mode = oic.f;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = qh3Var.c;
            if (!z && !qh3Var.b) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilterG = null;
            ColorStateList colorStateList = z ? (ColorStateList) qh3Var.d : null;
            PorterDuff.Mode mode2 = qh3Var.b ? (PorterDuff.Mode) qh3Var.e : oic.f;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterG = oic.g(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterG);
        }
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.f(context, i);
    }
}
