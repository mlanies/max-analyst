package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class y08 implements OnBackAnimationCallback {
    public final /* synthetic */ w08 a;
    public final /* synthetic */ z08 b;

    public y08(z08 z08Var, w08 w08Var) {
        this.b = z08Var;
        this.a = w08Var;
    }

    public final void onBackCancelled() {
        if (this.b.a != null) {
            this.a.d();
        }
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.b.a != null) {
            this.a.b(new ge0(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.b.a != null) {
            this.a.c(new ge0(backEvent));
        }
    }
}
