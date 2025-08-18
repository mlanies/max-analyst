package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final /* synthetic */ class wje implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ fc0 b;

    public /* synthetic */ wje(fc0 fc0Var) {
        this.b = fc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ey1 ey1Var = this.b.c;
                break;
            default:
                ey1 ey1Var2 = this.b.c;
                break;
        }
    }

    public /* synthetic */ wje(fc0 fc0Var, Bitmap bitmap) {
        this.b = fc0Var;
    }
}
