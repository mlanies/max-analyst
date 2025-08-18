package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ab6 {
    public final je7 a;
    public final je7 b;
    public final je7 c;

    public ab6(je7 je7Var, je7 je7Var2, je7 je7Var3) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
    }

    public static Object a(ab6 ab6Var, long j, Continuation continuation) {
        int i = ft4.o;
        return j47.t0(((w9a) ((kke) ab6Var.c.getValue())).b(), new za6(ab6Var, j, z7.R(3, kt4.SECONDS), true, null), continuation);
    }
}
