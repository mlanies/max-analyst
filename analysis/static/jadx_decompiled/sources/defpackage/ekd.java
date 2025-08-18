package defpackage;

import one.me.sharedata.ShareDataPickerScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class ekd implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ShareDataPickerScreen b;

    public /* synthetic */ ekd(ShareDataPickerScreen shareDataPickerScreen, int i) {
        this.a = i;
        this.b = shareDataPickerScreen;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        e5f e5fVar = e5f.a;
        ShareDataPickerScreen shareDataPickerScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = ShareDataPickerScreen.D0;
                sv8 sv8Var = new sv8(shareDataPickerScreen.getContext());
                sv8Var.setId(qha.a);
                sv8Var.setInputHint(rha.a);
                sv8Var.setRightOuterIconActionState(lv8.a);
                sv8Var.setRightOuterIconTouchListener(s5c.a(sv8Var.getContext(), new zja(shareDataPickerScreen, 22, sv8Var)));
                sv8Var.setLeftInnerIconTouchListener(s5c.a(sv8Var.getContext(), new ekd(shareDataPickerScreen, 3)));
                return sv8Var;
            case 1:
                shareDataPickerScreen.B0.m();
                return e5fVar;
            case 2:
                return shareDataPickerScreen.B0;
            default:
                bc7[] bc7VarArr2 = ShareDataPickerScreen.D0;
                ((ckd) shareDataPickerScreen.v0().c).k.z(0);
                return e5fVar;
        }
    }
}
