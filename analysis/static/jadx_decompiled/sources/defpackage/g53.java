package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class g53 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k53 b;
    public final /* synthetic */ Drawable c;

    public /* synthetic */ g53(k53 k53Var, Drawable drawable, int i) {
        this.a = i;
        this.b = k53Var;
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
