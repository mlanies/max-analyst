package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.folders.list.FoldersListScreen;

/* loaded from: classes.dex */
public final class dw5 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ FoldersListScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw5(Continuation continuation, FoldersListScreen foldersListScreen) {
        super(2, continuation);
        this.Y = foldersListScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        dw5 dw5Var = (dw5) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        dw5Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        dw5 dw5Var = new dw5(continuation, this.Y);
        dw5Var.X = obj;
        return dw5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        List list = (List) this.X;
        bc7[] bc7VarArr = FoldersListScreen.Z;
        FoldersListScreen foldersListScreen = this.Y;
        foldersListScreen.getClass();
        ((aw5) ((RecyclerView) foldersListScreen.Y.T0(foldersListScreen, FoldersListScreen.Z[0])).getAdapter()).F(list, new re(21, foldersListScreen));
        return e5f.a;
    }
}
