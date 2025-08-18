package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class p5a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s5a b;
    public final /* synthetic */ Drawable c;

    public /* synthetic */ p5a(s5a s5aVar, Drawable drawable, int i) {
        this.a = i;
        this.b = s5aVar;
        this.c = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.view.View*/.invalidateDrawable(this.c);
                break;
            default:
                super/*android.view.View*/.unscheduleDrawable(this.c);
                break;
        }
    }
}
