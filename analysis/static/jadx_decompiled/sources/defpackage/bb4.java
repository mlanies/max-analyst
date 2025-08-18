package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class bb4 implements lj6, mj6 {
    public final gpb a;
    public final Context b;
    public final gpb c;
    public final Set d;
    public final Executor e;

    public bb4(Context context, String str, Set set, gpb gpbVar, Executor executor) {
        this.a = new ec3(context, 1, str);
        this.d = set;
        this.e = executor;
        this.c = gpbVar;
        this.b = context;
    }

    public final ukg a() {
        return daf.a(this.b) ^ true ? j1e.r("") : j1e.g(new ab4(this, 0), this.e);
    }

    public final void b() {
        if (this.d.size() <= 0) {
            j1e.r(null);
        } else if (!daf.a(this.b)) {
            j1e.r(null);
        } else {
            j1e.g(new ab4(this, 1), this.e);
        }
    }
}
