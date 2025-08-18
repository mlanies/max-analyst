package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class im4 implements mn5 {
    public final mn5 a;
    public final m56 b;
    public final a66 c;

    public im4(mn5 mn5Var, a66 a66Var) {
        pz2 pz2Var = ngg.a;
        this.a = mn5Var;
        this.b = pz2Var;
        this.c = a66Var;
    }

    @Override // defpackage.mn5
    public final Object d(on5 on5Var, Continuation continuation) {
        mec mecVar = new mec();
        mecVar.a = ay9.a;
        Object objD = this.a.d(new y40((Object) this, (Object) mecVar, on5Var, 5), continuation);
        return objD == tx3.a ? objD : e5f.a;
    }
}
