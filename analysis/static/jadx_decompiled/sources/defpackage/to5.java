package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class to5 extends ffe implements a66 {
    public mec X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ mec s0;
    public final /* synthetic */ on5 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to5(mec mecVar, on5 on5Var, Continuation continuation) {
        super(2, continuation);
        this.s0 = mecVar;
        this.t0 = on5Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((to5) n(new i42(((i42) obj).a), (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        to5 to5Var = new to5(this.s0, this.t0, continuation);
        to5Var.Z = obj;
        return to5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        mec mecVar;
        mec mecVar2;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        if (i == 0) {
            od2.a0(obj);
            Object obj2 = ((i42) this.Z).a;
            boolean z = obj2 instanceof h42;
            mecVar = this.s0;
            if (!z) {
                mecVar.a = obj2;
            }
            if (z) {
                Throwable thA = i42.a(obj2);
                if (thA != null) {
                    throw thA;
                }
                Object obj3 = mecVar.a;
                if (obj3 != null) {
                    if (obj3 == ay9.a) {
                        obj3 = null;
                    }
                    this.Z = obj2;
                    this.X = mecVar;
                    this.Y = 1;
                    if (this.t0.a(obj3, this) == tx3Var) {
                        return tx3Var;
                    }
                    mecVar2 = mecVar;
                }
                mecVar.a = ay9.c;
            }
            return e5f.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mecVar2 = this.X;
        od2.a0(obj);
        mecVar = mecVar2;
        mecVar.a = ay9.c;
        return e5f.a;
    }
}
