package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fhf extends ffe implements a66 {
    public final /* synthetic */ Float X;
    public final /* synthetic */ jhf Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhf(Float f, jhf jhfVar, Continuation continuation) {
        super(2, continuation);
        this.X = f;
        this.Y = jhfVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        fhf fhfVar = (fhf) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        fhfVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new fhf(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        jhf jhfVar = this.Y;
        Float f = this.X;
        if (f == null) {
            dkf dkfVar = jhfVar.d().X;
            if (dkfVar != null) {
                dkfVar.play();
            }
        } else {
            nif nifVarD = jhfVar.d();
            float fFloatValue = f.floatValue();
            ijf ijfVar = (ijf) x53.i0(nifVarD.Z.a.b());
            if ((ijfVar != null ? ijfVar.o : null) == null) {
                hm9.m0(nifVarD.a, "We cannot seek a videoContent because is null", new Object[0]);
            } else {
                long jC = (long) ((fFloatValue / 100.0f) * r0.c());
                dkf dkfVar2 = nifVarD.X;
                if (dkfVar2 != null) {
                    dkfVar2.J0(jC);
                }
            }
        }
        return e5f.a;
    }
}
