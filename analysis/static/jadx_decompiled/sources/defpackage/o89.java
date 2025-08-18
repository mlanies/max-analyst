package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class o89 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;

    public o89(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
        this.d = je7Var4;
        this.e = je7Var5;
    }

    public static /* synthetic */ Object b(o89 o89Var, long j, CharSequence charSequence, Long l, cz5 cz5Var, Continuation continuation, int i) {
        if ((i & 8) != 0) {
            cz5Var = null;
        }
        return o89Var.a(j, charSequence, l, cz5Var, false, continuation);
    }

    public final Object a(long j, CharSequence charSequence, Long l, cz5 cz5Var, boolean z, Continuation continuation) throws Throwable {
        Object objT0 = j47.t0(((w9a) ((kke) this.a.getValue())).b(), new n89(this, j, charSequence, l, z, cz5Var, null), continuation);
        return objT0 == tx3.a ? objT0 : e5f.a;
    }
}
