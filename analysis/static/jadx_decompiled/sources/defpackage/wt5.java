package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.folders.edit.FolderEditScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes.dex */
public final class wt5 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ FolderEditScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt5(FolderEditScreen folderEditScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = folderEditScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        wt5 wt5Var = (wt5) n((zt5) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        wt5Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        wt5 wt5Var = new wt5(this.Y, continuation);
        wt5Var.X = obj;
        return wt5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        zt5 zt5Var = (zt5) this.X;
        boolean z = zt5Var instanceof xt5;
        ska mkaVar = nka.a;
        FolderEditScreen folderEditScreen = this.Y;
        if (z) {
            FolderEditScreen.m0(folderEditScreen).setTitle(qba.k);
            bc7[] bc7VarArr = FolderEditScreen.s0;
            bc7 bc7Var = bc7VarArr[3];
            q7c q7cVar = folderEditScreen.Z;
            ((OneMeButton) q7cVar.T0(folderEditScreen, bc7Var)).setVisibility(0);
            ((OneMeButton) q7cVar.T0(folderEditScreen, bc7VarArr[3])).setEnabled(((xt5) zt5Var).b);
            FolderEditScreen.m0(folderEditScreen).setRightActions(mkaVar);
        } else {
            if (!(zt5Var instanceof yt5)) {
                throw new NoWhenBranchMatchedException();
            }
            FolderEditScreen.m0(folderEditScreen).setTitle(qba.l);
            ((OneMeButton) folderEditScreen.Z.T0(folderEditScreen, FolderEditScreen.s0[3])).setVisibility(8);
            cla claVarM0 = FolderEditScreen.m0(folderEditScreen);
            if (((yt5) zt5Var).c) {
                mkaVar = new mka(new ut5(folderEditScreen, 1));
            }
            claVarM0.setRightActions(mkaVar);
        }
        return e5f.a;
    }
}
