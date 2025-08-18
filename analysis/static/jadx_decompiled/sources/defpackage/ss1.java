package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ss1 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ String Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss1(String str, Continuation continuation) {
        super(2, continuation);
        this.Y = str;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ss1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ss1(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            hm9.n("CallsNotification", "handle loading notification image");
            String str = this.Y;
            if (str == null || w9e.C0(str)) {
                hm9.n("CallsNotification", "avatar for call push is empty");
                return null;
            }
            hm9.n("CallsNotification", "start loading call push avatar");
            rs1 rs1Var = new rs1(str, null);
            this.X = 1;
            obj = fp3.I(500L, rs1Var, this);
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
