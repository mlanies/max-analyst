package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class de6 {
    public final zk X;
    public final Looper Y;
    public final int Z;
    public final Context a;
    public final String b;
    public final qz7 c;
    public final nk o;
    public final mdg s0;
    public final rq9 t0;
    public final ie6 u0;

    public de6(Context context, qz7 qz7Var, GoogleSignInOptions googleSignInOptions, rq9 rq9Var) {
        this(context, qz7Var, googleSignInOptions, new ce6(rq9Var, Looper.getMainLooper()));
    }

    public final c8d a() {
        c8d c8dVar = new c8d(6);
        c8dVar.b = null;
        Set setEmptySet = Collections.emptySet();
        if (((xs) c8dVar.c) == null) {
            c8dVar.c = new xs(0);
        }
        ((xs) c8dVar.c).addAll(setEmptySet);
        Context context = this.a;
        c8dVar.o = context.getClass().getName();
        c8dVar.a = context.getPackageName();
        return c8dVar;
    }

    public final ukg b(hm7 hm7Var, int i) {
        fp3.o(hm7Var, "Listener key cannot be null.");
        ie6 ie6Var = this.u0;
        ie6Var.getClass();
        qne qneVar = new qne();
        ie6Var.e(qneVar, i, this);
        udg udgVar = new udg(new ieg(hm7Var, qneVar), ie6Var.t0.get(), this);
        fc9 fc9Var = ie6Var.x0;
        fc9Var.sendMessage(fc9Var.obtainMessage(13, udgVar));
        return qneVar.a;
    }

    public final ukg c(int i, pw6 pw6Var) {
        qne qneVar = new qne();
        ie6 ie6Var = this.u0;
        ie6Var.getClass();
        ie6Var.e(qneVar, pw6Var.b, this);
        udg udgVar = new udg(new jeg(i, pw6Var, qneVar, this.t0), ie6Var.t0.get(), this);
        fc9 fc9Var = ie6Var.x0;
        fc9Var.sendMessage(fc9Var.obtainMessage(4, udgVar));
        return qneVar.a;
    }

    public de6(Context context, qz7 qz7Var, nk nkVar, ce6 ce6Var) {
        fp3.o(context, "Null context is not permitted.");
        fp3.o(qz7Var, "Api must not be null.");
        fp3.o(ce6Var, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        fp3.o(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.b = attributionTag;
        this.c = qz7Var;
        this.o = nkVar;
        this.Y = ce6Var.b;
        this.X = new zk(qz7Var, nkVar, attributionTag);
        this.s0 = new mdg(this);
        ie6 ie6VarF = ie6.f(applicationContext);
        this.u0 = ie6VarF;
        this.Z = ie6VarF.s0.getAndIncrement();
        this.t0 = ce6Var.a;
        fc9 fc9Var = ie6VarF.x0;
        fc9Var.sendMessage(fc9Var.obtainMessage(7, this));
    }
}
