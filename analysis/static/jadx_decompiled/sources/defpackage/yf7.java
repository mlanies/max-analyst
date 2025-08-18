package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.LibraryUpgradeHelper$FailToClearStatException;

/* loaded from: classes.dex */
public final class yf7 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ bg7 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf7(bg7 bg7Var, Continuation continuation) {
        super(2, continuation);
        this.Y = bg7Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((yf7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new yf7(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        bg7 bg7Var = this.Y;
        try {
            if (i == 0) {
                od2.a0(obj);
                hmc hmcVar = (hmc) ((je7) bg7Var.h).getValue();
                this.X = 1;
                Object objT0 = j47.t0(((w9a) hmcVar.a).b(), new bmc(hmcVar, null), this);
                if (objT0 != tx3Var) {
                    objT0 = e5fVar;
                }
                if (objT0 == tx3Var) {
                    return tx3Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
            }
        } catch (Throwable th) {
            hm9.p("LibraryUpgradeHelper", "fail to migrate 4", th);
            ((ty3) ((je7) bg7Var.i).getValue()).a("ONEME-14182", new LibraryUpgradeHelper$FailToClearStatException("fail to clear stats", th));
        }
        return e5fVar;
    }
}
