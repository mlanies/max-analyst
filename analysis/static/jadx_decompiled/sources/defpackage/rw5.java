package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.folders.pickerfolders.FoldersPickerScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes.dex */
public final class rw5 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ FoldersPickerScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw5(Continuation continuation, FoldersPickerScreen foldersPickerScreen) {
        super(2, continuation);
        this.Y = foldersPickerScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        rw5 rw5Var = (rw5) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        rw5Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        rw5 rw5Var = new rw5(continuation, this.Y);
        rw5Var.X = obj;
        return rw5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        List list = (List) this.X;
        bc7[] bc7VarArr = FoldersPickerScreen.s0;
        FoldersPickerScreen foldersPickerScreen = this.Y;
        foldersPickerScreen.getClass();
        if (list == null || !list.isEmpty()) {
            foldersPickerScreen.o.F(list, new dd4(24, foldersPickerScreen));
        } else {
            View view = foldersPickerScreen.getView();
            ConstraintLayout constraintLayout = view instanceof ConstraintLayout ? (ConstraintLayout) view : null;
            if (constraintLayout != null) {
                bc7 bc7Var = FoldersPickerScreen.s0[4];
                aba abaVar = (aba) foldersPickerScreen.Z.getValue();
                ti3 ti3Var = new ti3(0, -2);
                ti3Var.i = 0;
                ti3Var.e = 0;
                ti3Var.h = 0;
                ti3Var.l = 0;
                ay7.a(constraintLayout, abaVar, ti3Var);
            }
            bc7[] bc7VarArr2 = FoldersPickerScreen.s0;
            ((RecyclerView) foldersPickerScreen.X.T0(foldersPickerScreen, bc7VarArr2[1])).setVisibility(8);
            ((OneMeButton) foldersPickerScreen.Y.T0(foldersPickerScreen, bc7VarArr2[3])).setVisibility(8);
        }
        return e5f.a;
    }
}
