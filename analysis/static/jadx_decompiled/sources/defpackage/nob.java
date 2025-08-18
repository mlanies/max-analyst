package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class nob {
    public final Context a;
    public final je7 b;
    public final je7 c;

    public nob(Context context, je7 je7Var, je7 je7Var2) {
        this.a = context;
        this.b = je7Var;
        this.c = je7Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0058 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence a(java.lang.CharSequence r10, defpackage.q07[] r11) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nob.a(java.lang.CharSequence, q07[]):java.lang.CharSequence");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0289 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0160 A[PHI: r22 r23
      0x0160: PHI (r22v3 java.lang.Object[]) = (r22v2 java.lang.Object[]), (r22v2 java.lang.Object[]), (r22v6 java.lang.Object[]) binds: [B:124:0x0220, B:100:0x01bb, B:80:0x0153] A[DONT_GENERATE, DONT_INLINE]
      0x0160: PHI (r23v3 int) = (r23v2 int), (r23v2 int), (r23v6 int) binds: [B:124:0x0220, B:100:0x01bb, B:80:0x0153] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList b(java.lang.CharSequence r25) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nob.b(java.lang.CharSequence):java.util.ArrayList");
    }

    public final v84 c(Drawable drawable) {
        try {
            s2b s2bVarH = ((lv6) this.b.getValue()).h();
            int iWidth = drawable.getBounds().width();
            int iHeight = drawable.getBounds().height();
            if (iWidth <= 0) {
                iWidth = tu0.G(18 * fk4.d().getDisplayMetrics().density);
            }
            if (iHeight <= 0) {
                iHeight = tu0.G(18 * fk4.d().getDisplayMetrics().density);
            }
            Rect bounds = drawable.getBounds();
            int i = bounds.left;
            int i2 = bounds.top;
            int i3 = bounds.right;
            int i4 = bounds.bottom;
            o43 o43VarC = s2bVarH.c(iWidth, iHeight, Bitmap.Config.ARGB_8888);
            drawable.setBounds(0, 0, iWidth, iHeight);
            Canvas canvas = new Canvas((Bitmap) o43VarC.e0());
            canvas.drawColor(0, PorterDuff.Mode.SRC);
            drawable.draw(canvas);
            drawable.setBounds(i, i2, i3, i4);
            return (v84) o43VarC;
        } catch (Throwable th) {
            hm9.p(drawable.getClass().getName(), "fail to fetch image from Drawable", th);
            return null;
        }
    }
}
