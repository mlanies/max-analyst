package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qb extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ RecyclerView Y;
    public final /* synthetic */ h8e Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qb(h8e h8eVar, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Z = h8eVar;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        RecyclerView recyclerView = (RecyclerView) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                qb qbVar = new qb(this.Z, continuation, 0);
                qbVar.Y = recyclerView;
                e5f e5fVar = e5f.a;
                qbVar.o(e5fVar);
                return e5fVar;
            case 1:
                qb qbVar2 = new qb(this.Z, continuation, 1);
                qbVar2.Y = recyclerView;
                e5f e5fVar2 = e5f.a;
                qbVar2.o(e5fVar2);
                return e5fVar2;
            case 2:
                qb qbVar3 = new qb(this.Z, continuation, 2);
                qbVar3.Y = recyclerView;
                e5f e5fVar3 = e5f.a;
                qbVar3.o(e5fVar3);
                return e5fVar3;
            case 3:
                qb qbVar4 = new qb(this.Z, continuation, 3);
                qbVar4.Y = recyclerView;
                e5f e5fVar4 = e5f.a;
                qbVar4.o(e5fVar4);
                return e5fVar4;
            default:
                qb qbVar5 = new qb(this.Z, continuation, 4);
                qbVar5.Y = recyclerView;
                e5f e5fVar5 = e5f.a;
                qbVar5.o(e5fVar5);
                return e5fVar5;
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                RecyclerView recyclerView = this.Y;
                this.Z.j();
                recyclerView.Y();
                break;
            case 1:
                od2.a0(obj);
                RecyclerView recyclerView2 = this.Y;
                this.Z.j();
                recyclerView2.Y();
                break;
            case 2:
                od2.a0(obj);
                RecyclerView recyclerView3 = this.Y;
                this.Z.j();
                recyclerView3.Y();
                break;
            case 3:
                od2.a0(obj);
                RecyclerView recyclerView4 = this.Y;
                this.Z.j();
                recyclerView4.Y();
                break;
            default:
                od2.a0(obj);
                RecyclerView recyclerView5 = this.Y;
                this.Z.j();
                recyclerView5.Y();
                break;
        }
        return e5f.a;
    }
}
