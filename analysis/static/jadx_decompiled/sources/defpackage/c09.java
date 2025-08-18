package defpackage;

import android.widget.PopupWindow;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class c09 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageWriteWidget b;

    public /* synthetic */ c09(MessageWriteWidget messageWriteWidget, int i) {
        this.a = i;
        this.b = messageWriteWidget;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.a) {
            case 0:
                this.b.D0 = null;
                break;
            default:
                this.b.D0 = null;
                break;
        }
    }
}
