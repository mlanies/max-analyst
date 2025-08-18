package defpackage;

import android.view.View;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.stickerspreview.set.StickerSetBottomSheet;
import one.me.stickerssearch.StickersSearchScreen;
import one.me.stickerssettings.stickersscreen.StickersScreen;

/* loaded from: classes2.dex */
public final class yc7 implements qdc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yc7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(View view) {
    }

    private final void c(View view) {
    }

    private final void e(View view) {
    }

    private final void f(View view) {
    }

    private final void g(View view) {
    }

    private final void h(View view) {
    }

    @Override // defpackage.qdc
    public final void b(View view) {
        int i = this.a;
    }

    @Override // defpackage.qdc
    public final void d(View view) {
        gw7 gw7Var;
        switch (this.a) {
            case 0:
                gw7 gw7Var2 = ((KeyboardStickersWidget) this.b).c;
                if (gw7Var2 != null) {
                    iw7 iw7Var = view instanceof iw7 ? (iw7) view : null;
                    if (iw7Var != null) {
                        iw7Var.b(gw7Var2);
                    }
                    a4g a4gVar = view instanceof a4g ? (a4g) view : null;
                    if (a4gVar != null) {
                        a4gVar.b(gw7Var2);
                        break;
                    }
                }
                break;
            case 1:
                zs8 zs8Var = view instanceof zs8 ? (zs8) view : null;
                View contentView$message_list_release = zs8Var != null ? zs8Var.getContentView$message_list_release() : null;
                if ((contentView$message_list_release instanceof x2e) && (gw7Var = ((MessagesListWidget) this.b).I0) != null) {
                    ((x2e) contentView$message_list_release).b(gw7Var);
                    break;
                }
                break;
            case 2:
                gw7 gw7Var3 = ((StickerSetBottomSheet) this.b).u0;
                if (gw7Var3 != null) {
                    iw7 iw7Var2 = view instanceof iw7 ? (iw7) view : null;
                    if (iw7Var2 != null) {
                        iw7Var2.b(gw7Var3);
                    }
                    a4g a4gVar2 = view instanceof a4g ? (a4g) view : null;
                    if (a4gVar2 != null) {
                        a4gVar2.b(gw7Var3);
                        break;
                    }
                }
                break;
            case 3:
                iw7 iw7Var3 = view instanceof iw7 ? (iw7) view : null;
                StickersScreen stickersScreen = (StickersScreen) this.b;
                if (iw7Var3 != null) {
                    iw7Var3.b(stickersScreen.t0);
                }
                a4g a4gVar3 = view instanceof a4g ? (a4g) view : null;
                if (a4gVar3 != null) {
                    a4gVar3.b(stickersScreen.t0);
                    break;
                }
                break;
            case 4:
                iw7 iw7Var4 = view instanceof iw7 ? (iw7) view : null;
                StickersSearchScreen stickersSearchScreen = (StickersSearchScreen) this.b;
                if (iw7Var4 != null) {
                    iw7Var4.b(stickersSearchScreen.o);
                }
                a4g a4gVar4 = view instanceof a4g ? (a4g) view : null;
                if (a4gVar4 != null) {
                    a4gVar4.b(stickersSearchScreen.o);
                    break;
                }
                break;
            default:
                iw7 iw7Var5 = view instanceof iw7 ? (iw7) view : null;
                gw7 gw7Var4 = (gw7) this.b;
                if (iw7Var5 != null) {
                    iw7Var5.b(gw7Var4);
                }
                a4g a4gVar5 = view instanceof a4g ? (a4g) view : null;
                if (a4gVar5 != null) {
                    a4gVar5.b(gw7Var4);
                    break;
                }
                break;
        }
    }
}
