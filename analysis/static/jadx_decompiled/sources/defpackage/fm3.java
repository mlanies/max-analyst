package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fm3 extends ffe implements a66 {
    public final /* synthetic */ jm3 X;
    public final /* synthetic */ faf Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm3(jm3 jm3Var, faf fafVar, Continuation continuation) {
        super(2, continuation);
        this.X = jm3Var;
        this.Y = fafVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((fm3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new fm3(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        pk pkVar = (pk) this.X.z.getValue();
        eaf eafVar = new eaf();
        eafVar.q = this.Y;
        return new Long(pkVar.a(new gaf(eafVar)));
    }
}
