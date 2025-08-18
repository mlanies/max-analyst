package defpackage;

import one.me.dialogs.share.media.ChatMediaDownloadBottomSheet;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* loaded from: classes.dex */
public final class ke2 extends t9 {
    public final /* synthetic */ int c;
    public final /* synthetic */ BaseBottomSheetWidget d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ke2(BaseBottomSheetWidget baseBottomSheetWidget, int i) {
        super(baseBottomSheetWidget, 1);
        this.c = i;
        this.d = baseBottomSheetWidget;
    }

    @Override // defpackage.t9, defpackage.z5b
    public int a() {
        switch (this.c) {
            case 1:
                bc7[] bc7VarArr = WebAppRootScreen.G0;
                if (((WebAppRootScreen) this.d).B0()) {
                    return 0;
                }
                return c();
            default:
                return super.a();
        }
    }

    @Override // defpackage.z5b
    public int b() {
        switch (this.c) {
            case 1:
                return 2;
            default:
                return super.b();
        }
    }

    @Override // defpackage.t9, defpackage.z5b
    public int c() {
        switch (this.c) {
            case 1:
                bc7[] bc7VarArr = WebAppRootScreen.G0;
                if (!((WebAppRootScreen) this.d).B0()) {
                    break;
                }
                break;
        }
        return super.c();
    }

    @Override // defpackage.t9, defpackage.z5b
    public void k() {
        switch (this.c) {
            case 0:
                bc7[] bc7VarArr = ChatMediaDownloadBottomSheet.E0;
                ChatMediaDownloadBottomSheet chatMediaDownloadBottomSheet = (ChatMediaDownloadBottomSheet) this.d;
                od2.L(new zn5(tu0.g(((ye2) chatMediaDownloadBottomSheet.y0.getValue()).v0, chatMediaDownloadBottomSheet.getViewLifecycleOwner().Q(), fg7.X), new je2(null, chatMediaDownloadBottomSheet), 5), chatMediaDownloadBottomSheet.getViewLifecycleScope());
                break;
            default:
                super.k();
                break;
        }
    }

    @Override // defpackage.t9, defpackage.z5b
    public boolean n(float f, float f2) {
        switch (this.c) {
            case 1:
                bc7[] bc7VarArr = WebAppRootScreen.G0;
                WebAppRootScreen webAppRootScreen = (WebAppRootScreen) this.d;
                return !webAppRootScreen.B0() && webAppRootScreen.A0().b;
            default:
                return super.n(f, f2);
        }
    }
}
