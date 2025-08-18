package defpackage;

import one.me.chats.forward.ForwardPickerScreen;

/* loaded from: classes.dex */
public final /* synthetic */ class pz5 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ForwardPickerScreen b;

    public /* synthetic */ pz5(ForwardPickerScreen forwardPickerScreen, int i) {
        this.a = i;
        this.b = forwardPickerScreen;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        e5f e5fVar = e5f.a;
        ForwardPickerScreen forwardPickerScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = ForwardPickerScreen.I0;
                break;
            case 1:
                break;
            case 2:
                bc7[] bc7VarArr2 = ForwardPickerScreen.I0;
                sv8 sv8Var = new sv8(forwardPickerScreen.getContext());
                sv8Var.setId(m8a.a);
                sv8Var.setInputHint(o8a.a);
                sv8Var.setRightOuterIconActionState(lv8.a);
                sv8Var.setRightOuterIconTouchListener(s5c.a(sv8Var.getContext(), new yf3(forwardPickerScreen, 13, sv8Var)));
                sv8Var.setLeftInnerIconTouchListener(s5c.a(sv8Var.getContext(), new pz5(forwardPickerScreen, 4)));
                break;
            case 3:
                forwardPickerScreen.F0.m();
                break;
            case 4:
                bc7[] bc7VarArr3 = ForwardPickerScreen.I0;
                ((iz5) forwardPickerScreen.v0().c).r.z(0);
                break;
            default:
                bc7[] bc7VarArr4 = ForwardPickerScreen.I0;
                ForwardPickerScreen.x0(forwardPickerScreen, forwardPickerScreen.z0(), new eqe(yoc.i0), true);
                forwardPickerScreen.y0 = new fh5(10);
                break;
        }
        return e5fVar;
    }
}
