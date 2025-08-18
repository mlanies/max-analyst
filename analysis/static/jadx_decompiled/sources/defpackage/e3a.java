package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class e3a implements OnBackAnimationCallback {
    public final /* synthetic */ m56 a;
    public final /* synthetic */ m56 b;
    public final /* synthetic */ k56 c;
    public final /* synthetic */ k56 d;

    public e3a(m56 m56Var, m56 m56Var2, k56 k56Var, k56 k56Var2) {
        this.a = m56Var;
        this.b = m56Var2;
        this.c = k56Var;
        this.d = k56Var2;
    }

    public final void onBackCancelled() {
        this.d.invoke();
    }

    public final void onBackInvoked() {
        this.c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        this.b.invoke(new ge0(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.a.invoke(new ge0(backEvent));
    }
}
