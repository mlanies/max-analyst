package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class ld0 {
    public static final int j;
    public static final jd0 k = new jd0(20);
    public final ida a;
    public final p82 b;
    public final pd0 c;
    public final uj3 d;
    public final String e;
    public final CharSequence f;
    public final Long g;
    public final int h;
    public final boolean i;

    static {
        int dimension = (int) Resources.getSystem().getDimension(R.dimen.notification_large_icon_width);
        if (dimension == 0) {
            dimension = Math.round(64 * Resources.getSystem().getDisplayMetrics().density);
        }
        j = dimension;
    }

    public ld0(ida idaVar, p82 p82Var, pd0 pd0Var, CharSequence charSequence) {
        this.h = -1;
        this.a = idaVar;
        this.c = pd0Var;
        this.f = charSequence;
        this.g = null;
        this.i = false;
        this.b = p82Var;
    }

    public static Bitmap a(Context context, ida idaVar, p82 p82Var, pd0 pd0Var, uj3 uj3Var, String str, String str2, ztc ztcVar) throws InterruptedException {
        int i = j;
        ld0 ld0Var = str != null ? new ld0(idaVar, p82Var, pd0Var, str) : uj3Var != null ? new ld0(idaVar, p82Var, pd0Var, uj3Var) : new ld0(idaVar, p82Var, pd0Var, (CharSequence) null);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (ld0Var.b(str2) == null) {
            Drawable drawableC = ld0Var.c(context);
            drawableC.setBounds(0, 0, i, i);
            drawableC.draw(canvas);
        } else {
            s1a s1aVarR = new hb3(2, new id0(ld0Var, str2, i, context)).r(ztcVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            Objects.requireNonNull(timeUnit, "unit is null");
            nd7.U(new b2a(s1aVarR, 1000L, timeUnit, ztcVar), new hd0(i, 0, canvas), new id0(canvas, ld0Var, context, i), ft.d);
        }
        return bitmapCreateBitmap;
    }

    public final Uri b(String str) {
        String str2 = this.e;
        if (str2 != null) {
            return j47.N(str2);
        }
        kk0 kk0Var = kk0.c;
        uj3 uj3Var = this.d;
        if (uj3Var != null) {
            return j47.N(uj3Var.q(str, kk0Var));
        }
        return null;
    }

    public final Drawable c(Context context) {
        int i;
        uj3 uj3Var = this.d;
        Bitmap bitmap = uj3Var != null ? (Bitmap) k.get(Long.valueOf(uj3Var.n() ^ this.b.K())) : null;
        if (bitmap != null && !bitmap.isRecycled()) {
            try {
                return new BitmapDrawable(context.getResources(), bitmap.copy(bitmap.getConfig(), false));
            } catch (Throwable th) {
                hm9.l0("ld0", "couldnt use cached bitmap", th);
            }
        }
        if (this.e != null && (i = this.h) != -1) {
            return kt3.b(context, i);
        }
        boolean z = this.i;
        ida idaVar = this.a;
        pd0 pd0Var = this.c;
        if (uj3Var != null) {
            return new qd0(pd0Var, uj3Var, z);
        }
        CharSequence charSequence = this.f;
        if (oag.t(charSequence)) {
            return kt3.b(context, 0);
        }
        Long l = this.g;
        if (l == null || l.longValue() == 0) {
            return new qd0(pd0Var, idaVar, charSequence);
        }
        return new qd0(this.c, this.a, this.f, l.longValue(), this.i);
    }

    public ld0(ida idaVar, p82 p82Var, pd0 pd0Var, uj3 uj3Var) {
        this.g = null;
        this.h = -1;
        this.a = idaVar;
        this.c = pd0Var;
        this.d = uj3Var;
        this.b = p82Var;
    }

    public ld0(ida idaVar, p82 p82Var, pd0 pd0Var, String str) {
        this.g = null;
        this.a = idaVar;
        this.c = pd0Var;
        this.e = str;
        this.h = 0;
        this.b = p82Var;
    }
}
