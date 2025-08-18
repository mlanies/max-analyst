package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.Set;

/* loaded from: classes.dex */
public final class xdg extends sdg implements ge6, he6 {
    public static final ddg k = beg.a;
    public final Context d;
    public final Handler e;
    public final ddg f;
    public final Set g;
    public final kad h;
    public iod i;
    public od j;

    public xdg(Context context, Handler handler, kad kadVar) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 0);
        this.d = context;
        this.e = handler;
        this.h = kadVar;
        this.g = (Set) kadVar.b;
        this.f = k;
    }

    @Override // defpackage.ge6
    public final void R(int i) {
        od odVar = this.j;
        kdg kdgVar = (kdg) ((ie6) odVar.Y).u0.get((zk) odVar.c);
        if (kdgVar != null) {
            if (kdgVar.k) {
                kdgVar.n(new ph3(17));
            } else {
                kdgVar.R(i);
            }
        }
    }

    @Override // defpackage.he6
    public final void k(ph3 ph3Var) {
        this.j.i(ph3Var);
    }

    @Override // defpackage.ge6
    public final void onConnected() {
        this.i.x(this);
    }
}
