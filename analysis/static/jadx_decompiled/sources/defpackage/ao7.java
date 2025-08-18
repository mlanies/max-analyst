package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ao7 {
    public final je7 a;
    public final je7 b;

    public ao7(je7 je7Var, je7 je7Var2) {
        this.a = je7Var;
        this.b = tu0.r(3, new dr(je7Var, je7Var2, 5));
    }

    public static Object a(ao7 ao7Var, Context context, ze0 ze0Var, Continuation continuation) {
        return j47.t0(((w9a) ((kke) ao7Var.a.getValue())).b(), new zn7(ao7Var, ze0Var, context, false, null), continuation);
    }
}
