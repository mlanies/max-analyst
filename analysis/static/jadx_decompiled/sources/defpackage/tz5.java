package defpackage;

import one.me.chats.forward.ForwardPickerScreen;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.sdk.arch.Widget;
import one.me.sharedata.ShareDataPickerScreen;

/* loaded from: classes.dex */
public final class tz5 implements uc7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;

    public /* synthetic */ tz5(Widget widget, int i) {
        this.a = i;
        this.b = widget;
    }

    @Override // defpackage.uc7
    public final void m() {
        Widget widget = this.b;
        switch (this.a) {
            case 0:
                qm0 qm0Var = ((ForwardPickerScreen) widget).A0;
                if (qm0Var.a()) {
                    ((sv8) qm0Var.getValue()).e(false);
                    break;
                }
                break;
            case 1:
                bc7[] bc7VarArr = MediaBarWidget.d1;
                ((MediaBarWidget) widget).w0().e(false);
                break;
            default:
                qm0 qm0Var2 = ((ShareDataPickerScreen) widget).x0;
                if (qm0Var2.a()) {
                    ((sv8) qm0Var2.getValue()).e(false);
                    break;
                }
                break;
        }
    }
}
