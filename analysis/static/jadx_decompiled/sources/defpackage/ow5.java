package defpackage;

import android.view.View;
import one.me.folders.pickerfolders.FoldersPickerScreen;

/* loaded from: classes.dex */
public final /* synthetic */ class ow5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FoldersPickerScreen b;

    public /* synthetic */ ow5(FoldersPickerScreen foldersPickerScreen, int i) {
        this.a = i;
        this.b = foldersPickerScreen;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FoldersPickerScreen foldersPickerScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = FoldersPickerScreen.s0;
                yw5 yw5VarM0 = foldersPickerScreen.m0();
                yw5VarM0.getClass();
                j47.S(yw5VarM0.a, xq9.a.plus(((w9a) yw5VarM0.X).b()), vx3.c, new xw5(yw5VarM0, null));
                foldersPickerScreen.getRouter().C();
                break;
            default:
                bc7[] bc7VarArr2 = FoldersPickerScreen.s0;
                bv5 bv5Var = bv5.c;
                foldersPickerScreen.getClass();
                bc7 bc7Var = FoldersPickerScreen.s0[0];
                long jLongValue = ((Number) foldersPickerScreen.b.a(foldersPickerScreen)).longValue();
                bv5Var.P1().d();
                bv5Var.P1().b(":settings/folder/create?chat_id=" + jLongValue, null);
                break;
        }
    }
}
