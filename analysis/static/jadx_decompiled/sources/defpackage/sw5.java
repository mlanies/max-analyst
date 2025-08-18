package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import one.me.folders.pickerfolders.FoldersPickerScreen;

/* loaded from: classes.dex */
public final class sw5 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ FoldersPickerScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw5(Continuation continuation, FoldersPickerScreen foldersPickerScreen) {
        super(2, continuation);
        this.Y = foldersPickerScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        sw5 sw5Var = (sw5) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        sw5Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        sw5 sw5Var = new sw5(continuation, this.Y);
        sw5Var.X = obj;
        return sw5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        bc7[] bc7VarArr = FoldersPickerScreen.s0;
        FoldersPickerScreen foldersPickerScreen = this.Y;
        foldersPickerScreen.getClass();
        ((RecyclerView) foldersPickerScreen.X.T0(foldersPickerScreen, FoldersPickerScreen.s0[1])).invalidate();
        return e5f.a;
    }
}
