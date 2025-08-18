package defpackage;

import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.folders.edit.FolderEditScreen;
import one.me.folders.picker.FolderMemberPickerScreen;

/* loaded from: classes.dex */
public final class uu5 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ FolderMemberPickerScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu5(Continuation continuation, FolderMemberPickerScreen folderMemberPickerScreen) {
        super(2, continuation);
        this.Y = folderMemberPickerScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        uu5 uu5Var = (uu5) n((qu5) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        uu5Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        uu5 uu5Var = new uu5(continuation, this.Y);
        uu5Var.X = obj;
        return uu5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        qu5 qu5Var = (qu5) this.X;
        if (!(qu5Var instanceof qu5)) {
            throw new NoWhenBranchMatchedException();
        }
        bc7[] bc7VarArr = FolderMemberPickerScreen.y0;
        FolderMemberPickerScreen folderMemberPickerScreen = this.Y;
        folderMemberPickerScreen.getClass();
        bc7[] bc7VarArr2 = FolderMemberPickerScreen.y0;
        bc7 bc7Var = bc7VarArr2[1];
        fs fsVar = folderMemberPickerScreen.x0;
        if (!w9e.C0((String) fsVar.a(folderMemberPickerScreen))) {
            znc router = folderMemberPickerScreen.getRouter();
            bc7 bc7Var2 = bc7VarArr2[1];
            Object objG = router.g((String) fsVar.a(folderMemberPickerScreen));
            dv5 dv5Var = objG instanceof dv5 ? (dv5) objG : null;
            if (dv5Var != null) {
                Set set = qu5Var.a;
                nu5 nu5VarN0 = ((FolderEditScreen) dv5Var).n0();
                nu5VarN0.C0.o1(nu5VarN0, nu5.D0[1], j47.S(nu5VarN0.a, ((w9a) nu5VarN0.o).b(), vx3.b, new gu5(nu5VarN0, set, null)));
            }
        }
        folderMemberPickerScreen.getRouter().C();
        return e5f.a;
    }
}
