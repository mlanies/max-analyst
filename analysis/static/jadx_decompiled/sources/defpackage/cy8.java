package defpackage;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final /* synthetic */ class cy8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Drawable b;

    public /* synthetic */ cy8(Drawable drawable, int i) {
        this.a = i;
        this.b = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dy8.setStartDrawable$lambda$6(this.b);
                break;
            default:
                ((AnimationDrawable) this.b).start();
                break;
        }
    }
}
