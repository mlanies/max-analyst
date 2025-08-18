package defpackage;

import android.widget.FrameLayout;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lc8 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ FrameLayout Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lc8(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        FrameLayout frameLayout = (FrameLayout) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                lc8 lc8Var = new lc8(3, continuation, 0);
                lc8Var.Y = frameLayout;
                e5f e5fVar = e5f.a;
                lc8Var.o(e5fVar);
                return e5fVar;
            case 1:
                lc8 lc8Var2 = new lc8(3, continuation, 1);
                lc8Var2.Y = frameLayout;
                e5f e5fVar2 = e5f.a;
                lc8Var2.o(e5fVar2);
                return e5fVar2;
            case 2:
                lc8 lc8Var3 = new lc8(3, continuation, 2);
                lc8Var3.Y = frameLayout;
                e5f e5fVar3 = e5f.a;
                lc8Var3.o(e5fVar3);
                return e5fVar3;
            case 3:
                lc8 lc8Var4 = new lc8(3, continuation, 3);
                lc8Var4.Y = frameLayout;
                e5f e5fVar4 = e5f.a;
                lc8Var4.o(e5fVar4);
                return e5fVar4;
            default:
                lc8 lc8Var5 = new lc8(3, continuation, 4);
                lc8Var5.Y = frameLayout;
                e5f e5fVar5 = e5f.a;
                lc8Var5.o(e5fVar5);
                return e5fVar5;
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                FrameLayout frameLayout = this.Y;
                frameLayout.setBackgroundColor(qp4.u0.j(frameLayout).b().l);
                break;
            case 1:
                od2.a0(obj);
                FrameLayout frameLayout2 = this.Y;
                frameLayout2.setBackgroundColor(qp4.u0.j(frameLayout2).b().m);
                break;
            case 2:
                od2.a0(obj);
                FrameLayout frameLayout3 = this.Y;
                frameLayout3.setBackgroundColor(qp4.u0.j(frameLayout3).a().h().a.d);
                break;
            case 3:
                od2.a0(obj);
                FrameLayout frameLayout4 = this.Y;
                frameLayout4.setBackgroundColor(qp4.u0.j(frameLayout4).b().k);
                break;
            default:
                od2.a0(obj);
                FrameLayout frameLayout5 = this.Y;
                frameLayout5.setBackgroundColor(qp4.u0.j(frameLayout5).b().k);
                break;
        }
        return e5f.a;
    }
}
