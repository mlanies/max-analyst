package defpackage;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class mdg {
    public static final Set b = Collections.newSetFromMap(new WeakHashMap());
    public final de6 a;

    public mdg(de6 de6Var) {
        this.a = de6Var;
    }

    public final qjg a(qjg qjgVar) {
        de6 de6Var = this.a;
        de6Var.getClass();
        boolean z = true;
        if (!qjgVar.m && !((Boolean) BasePendingResult.n.get()).booleanValue()) {
            z = false;
        }
        qjgVar.m = z;
        ie6 ie6Var = de6Var.u0;
        ie6Var.getClass();
        udg udgVar = new udg(new deg(qjgVar), ie6Var.t0.get(), de6Var);
        fc9 fc9Var = ie6Var.x0;
        fc9Var.sendMessage(fc9Var.obtainMessage(4, udgVar));
        return qjgVar;
    }
}
