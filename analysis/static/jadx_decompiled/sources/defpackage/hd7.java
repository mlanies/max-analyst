package defpackage;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public final class hd7 implements ViewTreeObserver.OnGlobalLayoutListener {
    public boolean X;
    public final sj3 c;
    public int o;
    public final Rect b = new Rect();
    public final int a = HttpStatus.SC_BAD_REQUEST;

    public hd7(gd7 gd7Var, v5 v5Var) {
        this.c = v5Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        sj3 sj3Var = this.c;
        Rect rect = this.b;
        sj3Var.accept(rect);
        int iHeight = rect.height();
        int i = this.o;
        if (i != 0) {
            int i2 = this.a;
            if (i > iHeight + i2) {
                this.X = true;
            } else if (i + i2 < iHeight) {
                this.X = false;
            }
        }
        this.o = iHeight;
    }
}
