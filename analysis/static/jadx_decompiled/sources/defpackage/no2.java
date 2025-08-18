package defpackage;

import one.me.android.root.RootController;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.arch.Widget;

/* loaded from: classes.dex */
public final class no2 implements yu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;

    public /* synthetic */ no2(Widget widget, int i) {
        this.a = i;
        this.b = widget;
    }

    private final void c(uu3 uu3Var, uu3 uu3Var2, boolean z) {
    }

    private final void d(uu3 uu3Var, uu3 uu3Var2, boolean z) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yu3
    public final void a(uu3 uu3Var, uu3 uu3Var2, boolean z) {
        switch (this.a) {
            case 0:
                if (uu3Var instanceof vm9) {
                    ChatScreen chatScreen = (ChatScreen) this.b;
                    if (!tpa.f(uu3Var, chatScreen)) {
                        an9.g(chatScreen.X, ((vm9) uu3Var).o());
                        break;
                    }
                }
                break;
            default:
                if (uu3Var2 != null) {
                    RootController rootController = (RootController) this.b;
                    if (rootController.T().a.a.size() > 0 && (uu3Var instanceof Widget) && !((Widget) uu3Var).getIsDialog()) {
                        rootController.T().C();
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.yu3
    public final void b(uu3 uu3Var, uu3 uu3Var2, boolean z) {
        int i = this.a;
    }
}
