package defpackage;

import one.me.folders.edit.FolderEditScreen;

/* loaded from: classes.dex */
public final /* synthetic */ class ut5 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FolderEditScreen b;

    public /* synthetic */ ut5(FolderEditScreen folderEditScreen, int i) {
        this.a = i;
        this.b = folderEditScreen;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        e5f e5fVar = e5f.a;
        FolderEditScreen folderEditScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = FolderEditScreen.s0;
                folderEditScreen.o0();
                i3a onBackPressedDispatcher = folderEditScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                    break;
                }
                break;
            default:
                bc7[] bc7VarArr2 = FolderEditScreen.s0;
                folderEditScreen.n0().u();
                folderEditScreen.o0();
                break;
        }
        return e5fVar;
    }
}
