package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ag7 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ bg7 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag7(bg7 bg7Var, Continuation continuation) {
        super(2, continuation);
        this.Y = bg7Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ag7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ag7(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            bg7 bg7Var = this.Y;
            bkb bkbVar = new bkb((je7) bg7Var.d, (je7) bg7Var.e, (je7) bg7Var.f);
            this.X = 1;
            if (bkbVar.r(this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}
