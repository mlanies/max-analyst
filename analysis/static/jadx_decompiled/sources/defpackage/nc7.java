package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nc7 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ RecyclerView Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nc7(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        RecyclerView recyclerView = (RecyclerView) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                nc7 nc7Var = new nc7(3, continuation, 0);
                nc7Var.Y = recyclerView;
                e5f e5fVar = e5f.a;
                nc7Var.o(e5fVar);
                return e5fVar;
            case 1:
                nc7 nc7Var2 = new nc7(3, continuation, 1);
                nc7Var2.Y = recyclerView;
                e5f e5fVar2 = e5f.a;
                nc7Var2.o(e5fVar2);
                return e5fVar2;
            default:
                nc7 nc7Var3 = new nc7(3, continuation, 2);
                nc7Var3.Y = recyclerView;
                e5f e5fVar3 = e5f.a;
                nc7Var3.o(e5fVar3);
                return e5fVar3;
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                RecyclerView recyclerView = this.Y;
                recyclerView.setBackgroundColor(qp4.u0.j(recyclerView).b().l);
                break;
            case 1:
                od2.a0(obj);
                RecyclerView recyclerView2 = this.Y;
                recyclerView2.setBackgroundColor(qp4.u0.j(recyclerView2).b().m);
                break;
            default:
                od2.a0(obj);
                RecyclerView recyclerView3 = this.Y;
                pq9 pq9Var = qp4.u0;
                recyclerView3.setBackgroundColor(pq9Var.j(recyclerView3).b().l);
                qp4.d(pq9Var.b(recyclerView3.getContext()), recyclerView3);
                break;
        }
        return e5f.a;
    }
}
