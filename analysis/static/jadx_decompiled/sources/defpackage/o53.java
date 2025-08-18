package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class o53 implements Runnable {
    public final /* synthetic */ long X;
    public final /* synthetic */ int a;
    public final /* synthetic */ q53 b;
    public final /* synthetic */ Drawable c;
    public final /* synthetic */ Runnable o;

    public /* synthetic */ o53(q53 q53Var, Drawable drawable, Runnable runnable, long j, int i) {
        this.a = i;
        this.b = q53Var;
        this.c = drawable;
        this.o = runnable;
        this.X = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.view.View*/.scheduleDrawable(this.c, this.o, this.X);
                break;
            default:
                super/*android.view.View*/.scheduleDrawable(this.c, this.o, this.X);
                break;
        }
    }
}
