package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vhd extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cid Y;
    public final /* synthetic */ boolean Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vhd(cid cidVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = cidVar;
        this.Z = z;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((vhd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new vhd(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7VarArr = cid.O0;
            cid cidVar = this.Y;
            boolean z = ((jp) cidVar.s()).g.getBoolean("app.privacy.online.show", true);
            boolean z2 = this.Z;
            if (z == z2) {
                return e5fVar;
            }
            ((jp) cidVar.s()).j("app.privacy.online.show", z2);
            pk pkVarR = cidVar.r();
            eaf eafVar = new eaf();
            eafVar.h = Boolean.valueOf(!z2);
            pkVarR.a(new gaf(eafVar));
            this.X = 1;
            if (cid.q(cidVar, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5fVar;
    }
}
