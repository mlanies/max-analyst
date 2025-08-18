package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class r5a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s5a b;
    public final /* synthetic */ Drawable c;
    public final /* synthetic */ Runnable o;

    public /* synthetic */ r5a(s5a s5aVar, Drawable drawable, Runnable runnable, int i) {
        this.a = i;
        this.b = s5aVar;
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
