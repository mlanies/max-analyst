package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qzf extends ffe implements a66 {
    public final /* synthetic */ zzf X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qzf(zzf zzfVar, Continuation continuation) {
        super(2, continuation);
        this.X = zzfVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        qzf qzfVar = (qzf) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        qzfVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new qzf(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        cpa cpaVar = cpa.a;
        zzf zzfVar = this.X;
        zzfVar.E0.m(null, cpaVar);
        pnf.o(zzfVar.M0, czf.a);
        vsf vsfVar = (vsf) zzfVar.w0.getValue();
        wsf wsfVar = zzfVar.B0;
        if (wsfVar != null) {
            vsfVar.a(3, wsfVar.a, wsfVar.b, wsfVar.c, wsfVar.d, null);
        }
        return e5f.a;
    }
}
