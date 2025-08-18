package defpackage;

import kotlin.coroutines.Continuation;
import one.me.complaintbottomsheet.ComplaintBottomSheet;

/* loaded from: classes.dex */
public final class ha3 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;
    public final /* synthetic */ ComplaintBottomSheet s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha3(kq1 kq1Var, Continuation continuation, ComplaintBottomSheet complaintBottomSheet) {
        super(2, continuation);
        this.Z = kq1Var;
        this.s0 = complaintBottomSheet;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ha3) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ha3 ha3Var = new ha3((kq1) this.Z, continuation, this.s0);
        ha3Var.Y = obj;
        return ha3Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            y40 y40Var = new y40(new jec(), (on5) this.Y, this.s0);
            this.X = 1;
            if (this.Z.d(y40Var, this) == tx3Var) {
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
