package defpackage;

import one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget;
import one.me.settings.privacy.ui.pincode.ConfirmPinCodeScreen;

/* loaded from: classes.dex */
public final /* synthetic */ class k41 implements k64 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ k41(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.k64
    public final Object a() {
        switch (this.a) {
            case 0:
                return new CallJoinLinkPreviewWidget(this.b);
            default:
                return new ConfirmPinCodeScreen(this.b);
        }
    }
}
