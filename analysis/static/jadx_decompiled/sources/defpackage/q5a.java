package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class q5a implements Runnable {
    public final /* synthetic */ long X;
    public final /* synthetic */ int a;
    public final /* synthetic */ s5a b;
    public final /* synthetic */ Drawable c;
    public final /* synthetic */ Runnable o;

    public /* synthetic */ q5a(s5a s5aVar, Drawable drawable, Runnable runnable, long j, int i) {
        this.a = i;
        this.b = s5aVar;
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
