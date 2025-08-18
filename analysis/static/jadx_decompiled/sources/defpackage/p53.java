package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class p53 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q53 b;
    public final /* synthetic */ Drawable c;
    public final /* synthetic */ Runnable o;

    public /* synthetic */ p53(q53 q53Var, Drawable drawable, Runnable runnable, int i) {
        this.a = i;
        this.b = q53Var;
        this.c = drawable;
        this.o = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.view.View*/.unscheduleDrawable(this.c, this.o);
                break;
            default:
                super/*android.view.View*/.unscheduleDrawable(this.c, this.o);
                break;
        }
    }
}
