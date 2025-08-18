package defpackage;

import android.widget.LinearLayout;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ee1 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ LinearLayout Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ee1(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        LinearLayout linearLayout = (LinearLayout) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                ee1 ee1Var = new ee1(3, continuation, 0);
                ee1Var.Y = linearLayout;
                e5f e5fVar = e5f.a;
                ee1Var.o(e5fVar);
                return e5fVar;
            case 1:
                ee1 ee1Var2 = new ee1(3, continuation, 1);
                ee1Var2.Y = linearLayout;
                e5f e5fVar2 = e5f.a;
                ee1Var2.o(e5fVar2);
                return e5fVar2;
            default:
                ee1 ee1Var3 = new ee1(3, continuation, 2);
                ee1Var3.Y = linearLayout;
                e5f e5fVar3 = e5f.a;
                ee1Var3.o(e5fVar3);
                return e5fVar3;
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                LinearLayout linearLayout = this.Y;
                linearLayout.setBackgroundColor(qp4.u0.p(linearLayout).c.b().g);
                break;
            case 1:
                od2.a0(obj);
                LinearLayout linearLayout2 = this.Y;
                linearLayout2.setBackgroundColor(qp4.u0.j(linearLayout2).b().m);
                break;
            default:
                od2.a0(obj);
                LinearLayout linearLayout3 = this.Y;
                linearLayout3.setBackgroundColor(qp4.u0.j(linearLayout3).b().j);
                break;
        }
        return e5f.a;
    }
}
