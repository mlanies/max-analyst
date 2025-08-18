package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.folders.picker.FolderMemberPickerScreen;

/* loaded from: classes.dex */
public final class tu5 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ FolderMemberPickerScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu5(Continuation continuation, FolderMemberPickerScreen folderMemberPickerScreen) {
        super(2, continuation);
        this.Y = folderMemberPickerScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        tu5 tu5Var = (tu5) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        tu5Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        tu5 tu5Var = new tu5(continuation, this.Y);
        tu5Var.X = obj;
        return tu5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        boolean z = !((Set) this.X).isEmpty();
        FolderMemberPickerScreen folderMemberPickerScreen = this.Y;
        if (z) {
            bc7[] bc7VarArr = FolderMemberPickerScreen.y0;
            folderMemberPickerScreen.u0().setRightActions(new mka(new c01(3, folderMemberPickerScreen)));
        } else {
            bc7[] bc7VarArr2 = FolderMemberPickerScreen.y0;
            folderMemberPickerScreen.u0().setRightActions(nka.a);
        }
        return e5f.a;
    }
}
