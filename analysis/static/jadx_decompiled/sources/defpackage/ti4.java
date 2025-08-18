package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Size;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class ti4 extends ri4 {
    public static int m = -1;
    public static Size n;
    public final u8e g;
    public final je7 h;
    public final je7 i;
    public final je7 j;
    public t9f k;
    public final AtomicReference l;

    public ti4(Context context, m7b m7bVar, u8e u8eVar, je7 je7Var, je7 je7Var2, je7 je7Var3) {
        super(context, m7bVar, je7Var3);
        this.g = u8eVar;
        this.h = je7Var;
        this.i = je7Var2;
        this.j = je7Var3;
        this.l = new AtomicReference(null);
    }

    public static Size i(Context context) {
        Size size = n;
        if (size == null) {
            size = new Size(s5c.G(context).getWidth(), s5c.G(context).getHeight());
        }
        n = size;
        return size;
    }

    @Override // defpackage.ri4
    public final boolean c() {
        lqf lqfVar = (lqf) this.j.getValue();
        return lqfVar != null && lqfVar.h > 0;
    }

    @Override // defpackage.ri4
    public final void e() {
        je7 je7Var = this.h;
        ((x6a) je7Var.getValue()).getClass();
        ((x6a) je7Var.getValue()).getClass();
    }

    @Override // defpackage.ri4
    public final void f(String str) {
        lqf lqfVar = (lqf) this.j.getValue();
        if (lqfVar != null) {
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.X, "lqf", "onForegroundServiceStarted:".concat(str), null);
            }
            lqfVar.h++;
        }
    }

    @Override // defpackage.ri4
    public final void g(String str) {
        int i;
        lqf lqfVar = (lqf) this.j.getValue();
        if (lqfVar != null) {
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.X, "lqf", "onForegroundServiceStropped:".concat(str), null);
            }
            int i2 = lqfVar.h;
            if (i2 <= 0) {
                i = 0;
            } else {
                i = i2 - 1;
                lqfVar.h = i;
            }
            lqfVar.h = i;
        }
    }

    @Override // defpackage.ri4
    public final t9f h() {
        String str;
        p7b p7bVar = (p7b) this.b;
        p7bVar.a.j.getClass();
        bcf.a.b().getClass();
        ((x6a) this.h.getValue()).getClass();
        t9f t9fVar = this.k;
        if (!tpa.f(t9fVar != null ? t9fVar.b : null, "25.8.1")) {
            this.k = null;
        }
        t9f t9fVar2 = this.k;
        if (t9fVar2 == null) {
            String str2 = String.format(Locale.ENGLISH, "Android %s", Arrays.copyOf(new Object[]{Build.VERSION.RELEASE}, 1));
            String strR = p7bVar.a.r();
            if (oag.t(strR)) {
                strR = Resources.getSystem().getConfiguration().getLocales().get(0).getLanguage();
            }
            String language = Resources.getSystem().getConfiguration().getLocales().get(0).getLanguage();
            String strJ = rh4.j(Build.MANUFACTURER, " ", Build.MODEL);
            DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
            int i = displayMetrics.densityDpi;
            if (i == 120) {
                str = "ldpi";
            } else if (i == 160) {
                str = "mdpi";
            } else if (i == 240) {
                str = "hdpi";
            } else if (i == 320) {
                str = "xhdpi";
            } else if (i == 480) {
                str = "xxhdpi";
            } else if (i != 640) {
                str = i + "dpi";
            } else {
                str = "xxxhdpi";
            }
            String str3 = str + " " + i + "dpi " + displayMetrics.widthPixels + "x" + displayMetrics.heightPixels;
            this.g.getClass();
            t9fVar2 = new t9f(str2, strR, language, strJ, str3);
            this.k = t9fVar2;
        }
        return t9fVar2;
    }

    public final int j() throws Resources.NotFoundException {
        int i = m;
        if (i != -1) {
            return i;
        }
        Context context = this.a;
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(identifier);
        m = dimensionPixelSize;
        return dimensionPixelSize;
    }
}
