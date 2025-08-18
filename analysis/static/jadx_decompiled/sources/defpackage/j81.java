package defpackage;

import one.me.calllist.ui.page.CallHistoryPageScreen;
import one.me.chats.list.ChatsListWidget;
import one.me.chats.picker.chats.PickerChatsListWidget;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.devmenu.logsviewer.LogsViewerScreen;
import one.me.members.list.MembersListWidget;
import one.me.profile.ProfileScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.gallery.MediaGalleryWidget;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;
import one.me.stickerssearch.StickersSearchScreen;
import one.me.stickersshowcase.StickersShowcaseScreen;

/* loaded from: classes.dex */
public final class j81 implements t15 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;

    public /* synthetic */ j81(Widget widget, int i) {
        this.a = i;
        this.b = widget;
    }

    @Override // defpackage.t15
    public final void l() {
        String str;
        boolean z = true;
        Widget widget = this.b;
        switch (this.a) {
            case 0:
                buc bucVar = CallHistoryPageScreen.u0;
                ks1 ks1Var = ((CallHistoryPageScreen) widget).p0().X;
                ks1Var.getClass();
                ks1Var.g(new u60(ks1Var, z, 5));
                break;
            case 1:
                bc7[] bc7VarArr = ChatsListSearchScreen.J0;
                gw2 gw2VarN0 = ((ChatsListSearchScreen) widget).n0();
                vxd vxdVar = gw2VarN0.N0;
                if (vxdVar == null || !vxdVar.isActive()) {
                    q0e q0eVar = gw2VarN0.E0;
                    q0eVar.m(null, ov2.a((ov2) q0eVar.getValue(), nv2.b, null, null, false, 30));
                    gw2VarN0.N0 = j47.T(gw2VarN0.a, gw2VarN0.L0, null, new tv2(gw2VarN0, null), 2);
                    break;
                }
                break;
            case 2:
                bc7[] bc7VarArr2 = ChatsListWidget.M0;
                ((ChatsListWidget) widget).p0().X.e();
                break;
            case 3:
                bc7[] bc7VarArr3 = LogsViewerScreen.Y;
                ((LogsViewerScreen) widget).m0().q();
                break;
            case 4:
                bc7[] bc7VarArr4 = MediaGalleryWidget.Z;
                z96 z96VarO0 = ((MediaGalleryWidget) widget).o0();
                z96VarO0.getClass();
                hm9.n("z96", "loadMoreItems()");
                vxd vxdVar2 = z96VarO0.I0;
                if ((vxdVar2 != null && vxdVar2.isActive()) || ((Boolean) z96VarO0.z0.getValue()).booleanValue()) {
                    hm9.n("z96", "try to load more items when loading in process, ignore it");
                    break;
                } else {
                    try {
                        x77 x77Var = z96VarO0.H0;
                        if (x77Var != null) {
                            x77Var.cancel(null);
                        }
                    } catch (Throwable unused) {
                    }
                    z96VarO0.H0 = pnf.n(z96VarO0, ((w9a) z96VarO0.s()).e().plus(z96VarO0.o), null, new o96(z96VarO0, null), 2);
                    break;
                }
                break;
            case 5:
                bc7[] bc7VarArr5 = MembersListWidget.D0;
                ((lp8) ((MembersListWidget) widget).p0().s0.getValue()).e();
                break;
            case 6:
                bc7[] bc7VarArr6 = PickerChatsListWidget.C0;
                ((PickerChatsListWidget) widget).q0().c.e();
                break;
            case 7:
                bc7[] bc7VarArr7 = ProfileScreen.D0;
                ((ProfileScreen) widget).r0().O0.s();
                break;
            case 8:
                bc7[] bc7VarArr8 = StickersSearchScreen.u0;
                q5e q5eVarN0 = ((StickersSearchScreen) widget).n0();
                l5e l5eVar = (l5e) q5eVarN0.w0.get();
                vxd vxdVar3 = q5eVarN0.y0;
                if ((vxdVar3 == null || !vxdVar3.isActive()) && (str = l5eVar.a) != null && str.length() != 0) {
                    q5eVarN0.y0 = pnf.n(q5eVarN0, ((w9a) q5eVarN0.c).b(), null, new n5e(q5eVarN0, l5eVar, null), 2);
                    break;
                }
                break;
            case 9:
                bc7[] bc7VarArr9 = StickersShowcaseScreen.v0;
                i7e i7eVarN0 = ((StickersShowcaseScreen) widget).n0();
                g6e g6eVar = i7eVarN0.X;
                if (!g6eVar.a()) {
                    b6e b6eVar = i7eVarN0.c;
                    vxd vxdVar4 = b6eVar.g;
                    if (vxdVar4 == null || !vxdVar4.isActive()) {
                        b6eVar.g = j47.T(b6eVar.c, null, null, new z5e(b6eVar, null), 3);
                        break;
                    }
                } else {
                    vxd vxdVar5 = g6eVar.h;
                    if (vxdVar5 == null || !vxdVar5.isActive()) {
                        g6eVar.h = j47.T(g6eVar.c, null, null, new e6e(g6eVar, null), 3);
                        break;
                    }
                }
                break;
            default:
                bc7[] bc7VarArr10 = SuggestionsWidget.B0;
                yce yceVarB0 = ((SuggestionsWidget) widget).B0();
                yceVarB0.q(((Number) yceVarB0.H0.getValue()).intValue(), (String) yceVarB0.G0.getValue());
                break;
        }
    }

    @Override // defpackage.t15
    public final boolean m() {
        Widget widget = this.b;
        switch (this.a) {
            case 0:
                buc bucVar = CallHistoryPageScreen.u0;
                return ((CallHistoryPageScreen) widget).p0().r();
            case 1:
                bc7[] bc7VarArr = ChatsListSearchScreen.J0;
                ChatsListSearchScreen chatsListSearchScreen = (ChatsListSearchScreen) widget;
                if (((ov2) chatsListSearchScreen.n0().F0.a.getValue()).a != nv2.b && ((ov2) chatsListSearchScreen.n0().F0.a.getValue()).b.length() > 0) {
                    yx7 yx7Var = chatsListSearchScreen.n0().o;
                    if ((!cqc.c(yx7Var.l) || yx7Var.s != null) && chatsListSearchScreen.A0.j() > 0) {
                        return true;
                    }
                }
                return false;
            case 2:
                bc7[] bc7VarArr2 = ChatsListWidget.M0;
                return ((mt2) ((ChatsListWidget) widget).p0().G0.getValue()).b;
            case 3:
                return true;
            case 4:
                bc7[] bc7VarArr3 = MediaGalleryWidget.Z;
                z96 z96VarO0 = ((MediaGalleryWidget) widget).o0();
                b86 b86Var = (b86) z96VarO0.B0.getValue();
                if (b86Var == null) {
                    return false;
                }
                boolean zB = ((fz6) z96VarO0.X).b(b86Var);
                hm9.n("z96", "canLoadMoreItems = " + zB);
                return zB;
            case 5:
                bc7[] bc7VarArr4 = MembersListWidget.D0;
                return ((lp8) ((MembersListWidget) widget).p0().s0.getValue()).c();
            case 6:
                return PickerChatsListWidget.n0((PickerChatsListWidget) widget);
            case 7:
                bc7[] bc7VarArr5 = ProfileScreen.D0;
                return ((ProfileScreen) widget).r0().O0.w();
            case 8:
                bc7[] bc7VarArr6 = StickersSearchScreen.u0;
                return ((StickersSearchScreen) widget).n0().r();
            case 9:
                bc7[] bc7VarArr7 = StickersShowcaseScreen.v0;
                return ((StickersShowcaseScreen) widget).n0().r();
            default:
                bc7[] bc7VarArr8 = SuggestionsWidget.B0;
                yce yceVarB0 = ((SuggestionsWidget) widget).B0();
                if (tpa.f(yceVarB0.B0.a, String.valueOf((String) yceVarB0.G0.getValue()))) {
                    return yceVarB0.B0.f;
                }
                return false;
        }
    }
}
