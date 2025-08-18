package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class orc extends ffe implements a66 {
    public int X;
    public final /* synthetic */ qrc Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ boolean s0;
    public final /* synthetic */ boolean t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public orc(qrc qrcVar, String str, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.Y = qrcVar;
        this.Z = str;
        this.s0 = z;
        this.t0 = z2;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((orc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new orc(this.Y, this.Z, this.s0, this.t0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            obj = qrc.a(this.Y, this.Z, this.s0, this.t0, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return obj;
    }
}
