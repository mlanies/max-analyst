package defpackage;

import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.folders.edit.FolderEditScreen;

/* loaded from: classes.dex */
public final class vt5 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ FolderEditScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt5(FolderEditScreen folderEditScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = folderEditScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((vt5) n((qt5) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        vt5 vt5Var = new vt5(this.Y, continuation);
        vt5Var.X = obj;
        return vt5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        xx6 xx6Var;
        od2.a0(obj);
        qt5 qt5Var = (qt5) this.X;
        boolean z = qt5Var instanceof nt5;
        e5f e5fVar = e5f.a;
        FolderEditScreen folderEditScreen = this.Y;
        if (z) {
            bc7[] bc7VarArr = FolderEditScreen.s0;
            folderEditScreen.o0();
            folderEditScreen.getRouter().C();
            if (((nt5) qt5Var).a && (xx6Var = (xx6) xv5.a.getAccessor().e()) != null) {
                xx6Var.f(Collections.singleton(new wx6(ux6.c, 1)), wuc.SETTINGS_FOLDERS);
            }
        } else if (qt5Var instanceof pt5) {
            String str = ((coc) x53.p0(folderEditScreen.getRouter().e())).b;
            if (str == null) {
                return e5fVar;
            }
            folderEditScreen.o0();
            bv5.c.P1().b(rh4.k(":settings/folder/members-picker?tag=", str, "&members_ids=", x53.n0(((pt5) qt5Var).a, ",", null, null, null, 62)), null);
        } else {
            if (!(qt5Var instanceof ot5)) {
                throw new NoWhenBranchMatchedException();
            }
            bc7[] bc7VarArr2 = FolderEditScreen.s0;
            nd7.S(String.valueOf(((zt5) folderEditScreen.n0().u0.a.getValue()).a()), folderEditScreen);
        }
        return e5fVar;
    }
}
