package defpackage;

import android.os.Handler;

/* loaded from: classes.dex */
public final class q9b implements eh7 {
    public static final q9b s0 = new q9b();
    public Handler X;
    public int a;
    public int b;
    public boolean c = true;
    public boolean o = true;
    public final gh7 Y = new gh7(this);
    public final nn6 Z = new nn6(29, this);

    @Override // defpackage.eh7
    public final gh7 Q() {
        return this.Y;
    }

    public final void a() {
        int i = this.b + 1;
        this.b = i;
        if (i == 1) {
            if (!this.c) {
                this.X.removeCallbacks(this.Z);
            } else {
                this.Y.d(eg7.ON_RESUME);
                this.c = false;
            }
        }
    }
}
