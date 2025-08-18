package one.me.stickerspreview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import defpackage.av3;
import defpackage.bc7;
import defpackage.bja;
import defpackage.c32;
import defpackage.c3e;
import defpackage.cla;
import defpackage.dy7;
import defpackage.fs;
import defpackage.gic;
import defpackage.gw7;
import defpackage.hob;
import defpackage.hw7;
import defpackage.i24;
import defpackage.i3e;
import defpackage.j47;
import defpackage.je7;
import defpackage.k56;
import defpackage.kpa;
import defpackage.mr0;
import defpackage.nec;
import defpackage.nhd;
import defpackage.nu0;
import defpackage.od2;
import defpackage.oec;
import defpackage.p3e;
import defpackage.p4e;
import defpackage.q7c;
import defpackage.shb;
import defpackage.vc7;
import defpackage.vx3;
import defpackage.vxd;
import defpackage.w9a;
import defpackage.x27;
import defpackage.yq0;
import defpackage.zn5;
import defpackage.znc;
import defpackage.zr6;
import defpackage.zu3;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.stickerspreview.StickerPreviewScreen;
import one.me.stickerspreview.set.StickerSetBottomSheet;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/stickerspreview/StickerPreviewScreen;", "Lone/me/sdk/arch/Widget;", "Lp3e;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "stickerId", ApiProtocol.PARAM_CHAT_ID, "forwardId", "(JJJ)V", "stickers-preview_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class StickerPreviewScreen extends Widget implements p3e {
    public static final /* synthetic */ bc7[] A0;
    public final je7 X;
    public final je7 Y;
    public final gw7 Z;
    public final fs a;
    public final fs b;
    public final x27 c;
    public final String o;
    public final q7c s0;
    public final q7c t0;
    public final q7c u0;
    public final q7c v0;
    public final q7c w0;
    public final gic x0;
    public final gic y0;
    public final gic z0;

    static {
        hob hobVar = new hob(StickerPreviewScreen.class, "stickerId", "getStickerId()J", 0);
        oec oecVar = nec.a;
        A0 = new bc7[]{hobVar, zr6.e(oecVar, StickerPreviewScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), zr6.f(StickerPreviewScreen.class, "forwardId", "getForwardId()J", 0, oecVar), zr6.f(StickerPreviewScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0, oecVar), zr6.f(StickerPreviewScreen.class, "contentContainer", "getContentContainer()Landroid/view/ViewGroup;", 0, oecVar), zr6.f(StickerPreviewScreen.class, "stickerContainer", "getStickerContainer()Landroid/widget/FrameLayout;", 0, oecVar), zr6.f(StickerPreviewScreen.class, "favoriteButton", "getFavoriteButton()Lone/me/stickerspreview/IconButtonWithLabel;", 0, oecVar), zr6.f(StickerPreviewScreen.class, "stickerSetSheetRouter", "getStickerSetSheetRouter()Lcom/bluelinelabs/conductor/Router;", 0, oecVar)};
    }

    public StickerPreviewScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        fs fsVar = new fs(Long.class, 0L, "arg_key_sticker_id");
        this.a = new fs(Long.class, 0L, "arg_key_chat_id");
        this.b = new fs(Long.class, 0L, "arg_key_forward_id");
        this.c = new x27(3, new yq0(3, 1, false));
        this.o = "StickerPreviewScreen";
        final int i = 0;
        this.X = createViewModelLazy(i3e.class, new nhd(7, new k56(this) { // from class: b3e
            public final /* synthetic */ StickerPreviewScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                StickerPreviewScreen stickerPreviewScreen = this.b;
                switch (i) {
                    case 0:
                        bc7[] bc7VarArr = StickerPreviewScreen.A0;
                        stickerPreviewScreen.getClass();
                        bc7 bc7Var = StickerPreviewScreen.A0[1];
                        long jLongValue = ((Number) stickerPreviewScreen.a.a(stickerPreviewScreen)).longValue();
                        p4e p4eVar = p4e.a;
                        kke kkeVar = (kke) p4eVar.getAccessor().c(kke.class);
                        p4eVar.getAccessor().d(o2e.class);
                        return new i3e(jLongValue, kkeVar, p4eVar.getAccessor().d(y4e.class), p4eVar.getAccessor().d(a4e.class), p4eVar.getAccessor().d(md5.class), p4eVar.getAccessor().d(sc5.class), p4eVar.getAccessor().d(iy2.class), p4eVar.getAccessor().d(s8g.class), p4eVar.getAccessor().d(qe5.class));
                    case 1:
                        bc7[] bc7VarArr2 = StickerPreviewScreen.A0;
                        i2e i2eVar = new i2e(stickerPreviewScreen.getContext());
                        i2eVar.setId(bja.f);
                        int iG = tu0.G(160 * fk4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iG, iG);
                        layoutParams.gravity = 17;
                        i2eVar.setLayoutParams(layoutParams);
                        return i2eVar;
                    case 2:
                        bc7[] bc7VarArr3 = StickerPreviewScreen.A0;
                        iw7 iw7Var = new iw7(stickerPreviewScreen.getContext());
                        iw7Var.setId(bja.e);
                        int iG2 = tu0.G(160 * fk4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iG2, iG2);
                        layoutParams2.gravity = 17;
                        iw7Var.setLayoutParams(layoutParams2);
                        return iw7Var;
                    default:
                        bc7[] bc7VarArr4 = StickerPreviewScreen.A0;
                        a4g a4gVar = new a4g(stickerPreviewScreen.getContext());
                        a4gVar.setId(bja.l);
                        int iG3 = tu0.G(160 * fk4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iG3, iG3);
                        layoutParams3.gravity = 17;
                        a4gVar.setLayoutParams(layoutParams3);
                        return a4gVar;
                }
            }
        }));
        this.Y = p4e.a.getAccessor().d(hw7.class);
        this.Z = new gw7();
        this.s0 = viewBinding(bja.k);
        this.t0 = viewBinding(bja.d);
        this.u0 = viewBinding(bja.g);
        this.v0 = viewBinding(bja.a);
        this.w0 = Widget.childRouter$default(this, bja.h, null, 2, null);
        final int i2 = 1;
        this.x0 = nu0.L(new k56(this) { // from class: b3e
            public final /* synthetic */ StickerPreviewScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                StickerPreviewScreen stickerPreviewScreen = this.b;
                switch (i2) {
                    case 0:
                        bc7[] bc7VarArr = StickerPreviewScreen.A0;
                        stickerPreviewScreen.getClass();
                        bc7 bc7Var = StickerPreviewScreen.A0[1];
                        long jLongValue = ((Number) stickerPreviewScreen.a.a(stickerPreviewScreen)).longValue();
                        p4e p4eVar = p4e.a;
                        kke kkeVar = (kke) p4eVar.getAccessor().c(kke.class);
                        p4eVar.getAccessor().d(o2e.class);
                        return new i3e(jLongValue, kkeVar, p4eVar.getAccessor().d(y4e.class), p4eVar.getAccessor().d(a4e.class), p4eVar.getAccessor().d(md5.class), p4eVar.getAccessor().d(sc5.class), p4eVar.getAccessor().d(iy2.class), p4eVar.getAccessor().d(s8g.class), p4eVar.getAccessor().d(qe5.class));
                    case 1:
                        bc7[] bc7VarArr2 = StickerPreviewScreen.A0;
                        i2e i2eVar = new i2e(stickerPreviewScreen.getContext());
                        i2eVar.setId(bja.f);
                        int iG = tu0.G(160 * fk4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iG, iG);
                        layoutParams.gravity = 17;
                        i2eVar.setLayoutParams(layoutParams);
                        return i2eVar;
                    case 2:
                        bc7[] bc7VarArr3 = StickerPreviewScreen.A0;
                        iw7 iw7Var = new iw7(stickerPreviewScreen.getContext());
                        iw7Var.setId(bja.e);
                        int iG2 = tu0.G(160 * fk4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iG2, iG2);
                        layoutParams2.gravity = 17;
                        iw7Var.setLayoutParams(layoutParams2);
                        return iw7Var;
                    default:
                        bc7[] bc7VarArr4 = StickerPreviewScreen.A0;
                        a4g a4gVar = new a4g(stickerPreviewScreen.getContext());
                        a4gVar.setId(bja.l);
                        int iG3 = tu0.G(160 * fk4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iG3, iG3);
                        layoutParams3.gravity = 17;
                        a4gVar.setLayoutParams(layoutParams3);
                        return a4gVar;
                }
            }
        });
        final int i3 = 2;
        this.y0 = nu0.L(new k56(this) { // from class: b3e
            public final /* synthetic */ StickerPreviewScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                StickerPreviewScreen stickerPreviewScreen = this.b;
                switch (i3) {
                    case 0:
                        bc7[] bc7VarArr = StickerPreviewScreen.A0;
                        stickerPreviewScreen.getClass();
                        bc7 bc7Var = StickerPreviewScreen.A0[1];
                        long jLongValue = ((Number) stickerPreviewScreen.a.a(stickerPreviewScreen)).longValue();
                        p4e p4eVar = p4e.a;
                        kke kkeVar = (kke) p4eVar.getAccessor().c(kke.class);
                        p4eVar.getAccessor().d(o2e.class);
                        return new i3e(jLongValue, kkeVar, p4eVar.getAccessor().d(y4e.class), p4eVar.getAccessor().d(a4e.class), p4eVar.getAccessor().d(md5.class), p4eVar.getAccessor().d(sc5.class), p4eVar.getAccessor().d(iy2.class), p4eVar.getAccessor().d(s8g.class), p4eVar.getAccessor().d(qe5.class));
                    case 1:
                        bc7[] bc7VarArr2 = StickerPreviewScreen.A0;
                        i2e i2eVar = new i2e(stickerPreviewScreen.getContext());
                        i2eVar.setId(bja.f);
                        int iG = tu0.G(160 * fk4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iG, iG);
                        layoutParams.gravity = 17;
                        i2eVar.setLayoutParams(layoutParams);
                        return i2eVar;
                    case 2:
                        bc7[] bc7VarArr3 = StickerPreviewScreen.A0;
                        iw7 iw7Var = new iw7(stickerPreviewScreen.getContext());
                        iw7Var.setId(bja.e);
                        int iG2 = tu0.G(160 * fk4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iG2, iG2);
                        layoutParams2.gravity = 17;
                        iw7Var.setLayoutParams(layoutParams2);
                        return iw7Var;
                    default:
                        bc7[] bc7VarArr4 = StickerPreviewScreen.A0;
                        a4g a4gVar = new a4g(stickerPreviewScreen.getContext());
                        a4gVar.setId(bja.l);
                        int iG3 = tu0.G(160 * fk4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iG3, iG3);
                        layoutParams3.gravity = 17;
                        a4gVar.setLayoutParams(layoutParams3);
                        return a4gVar;
                }
            }
        });
        final int i4 = 3;
        this.z0 = nu0.L(new k56(this) { // from class: b3e
            public final /* synthetic */ StickerPreviewScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                StickerPreviewScreen stickerPreviewScreen = this.b;
                switch (i4) {
                    case 0:
                        bc7[] bc7VarArr = StickerPreviewScreen.A0;
                        stickerPreviewScreen.getClass();
                        bc7 bc7Var = StickerPreviewScreen.A0[1];
                        long jLongValue = ((Number) stickerPreviewScreen.a.a(stickerPreviewScreen)).longValue();
                        p4e p4eVar = p4e.a;
                        kke kkeVar = (kke) p4eVar.getAccessor().c(kke.class);
                        p4eVar.getAccessor().d(o2e.class);
                        return new i3e(jLongValue, kkeVar, p4eVar.getAccessor().d(y4e.class), p4eVar.getAccessor().d(a4e.class), p4eVar.getAccessor().d(md5.class), p4eVar.getAccessor().d(sc5.class), p4eVar.getAccessor().d(iy2.class), p4eVar.getAccessor().d(s8g.class), p4eVar.getAccessor().d(qe5.class));
                    case 1:
                        bc7[] bc7VarArr2 = StickerPreviewScreen.A0;
                        i2e i2eVar = new i2e(stickerPreviewScreen.getContext());
                        i2eVar.setId(bja.f);
                        int iG = tu0.G(160 * fk4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iG, iG);
                        layoutParams.gravity = 17;
                        i2eVar.setLayoutParams(layoutParams);
                        return i2eVar;
                    case 2:
                        bc7[] bc7VarArr3 = StickerPreviewScreen.A0;
                        iw7 iw7Var = new iw7(stickerPreviewScreen.getContext());
                        iw7Var.setId(bja.e);
                        int iG2 = tu0.G(160 * fk4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iG2, iG2);
                        layoutParams2.gravity = 17;
                        iw7Var.setLayoutParams(layoutParams2);
                        return iw7Var;
                    default:
                        bc7[] bc7VarArr4 = StickerPreviewScreen.A0;
                        a4g a4gVar = new a4g(stickerPreviewScreen.getContext());
                        a4gVar.setId(bja.l);
                        int iG3 = tu0.G(160 * fk4.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iG3, iG3);
                        layoutParams3.gravity = 17;
                        a4gVar.setLayoutParams(layoutParams3);
                        return a4gVar;
                }
            }
        });
        i3e i3eVarN0 = n0();
        bc7 bc7Var = A0[0];
        i3eVarN0.s(((Number) fsVar.a(this)).longValue());
        i3e i3eVarN02 = n0();
        if (i3eVarN02.b == 0) {
            return;
        }
        vxd vxdVarS = j47.S(i3eVarN02.a, ((w9a) i3eVarN02.c).b(), vx3.b, new c3e(i3eVarN02, null));
        i3eVarN02.E0.o1(i3eVarN02, i3e.H0[1], vxdVarS);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getA() {
        return this.c;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScopeId-IluPPks, reason: from getter */
    public final String getL0() {
        return this.o;
    }

    public final hw7 m0() {
        return (hw7) this.Y.getValue();
    }

    public final i3e n0() {
        return (i3e) this.X.getValue();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final void onActivityPaused(Activity activity) {
        m0().b = null;
        m0().a(this.Z);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final void onActivityResumed(Activity activity) {
        WeakReference weakReference;
        if (isAttached()) {
            hw7 hw7VarM0 = m0();
            gw7 gw7Var = this.Z;
            if (gw7Var == null) {
                weakReference = null;
            } else {
                hw7VarM0.getClass();
                weakReference = new WeakReference(gw7Var);
            }
            hw7VarM0.b = weakReference;
            m0().b(gw7Var);
        }
    }

    @Override // defpackage.uu3
    public final void onAttach(View view) {
        Window window;
        View currentFocus;
        Activity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null || (currentFocus = window.getCurrentFocus()) == null) {
            return;
        }
        currentFocus.clearFocus();
        int i = vc7.a;
        if (vc7.b(vc7.c)) {
            mr0.I(currentFocus);
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final void onChangeStarted(zu3 zu3Var, av3 av3Var) {
        super.onChangeStarted(zu3Var, av3Var);
        av3 av3Var2 = av3.POP_ENTER;
        WeakReference weakReference = null;
        gw7 gw7Var = this.Z;
        if (av3Var != av3Var2 && av3Var != av3.PUSH_ENTER) {
            if (av3Var == av3.PUSH_EXIT || av3Var == av3.POP_EXIT) {
                m0().b = null;
                m0().a(gw7Var);
                return;
            }
            return;
        }
        hw7 hw7VarM0 = m0();
        if (gw7Var != null) {
            hw7VarM0.getClass();
            weakReference = new WeakReference(gw7Var);
        }
        hw7VarM0.b = weakReference;
        m0().b(gw7Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x01e7  */
    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r23, android.view.ViewGroup r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.stickerspreview.StickerPreviewScreen.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        m0().b = null;
        this.Z.b();
        c32 c32Var = c32.Y;
        this.x0.b = c32Var;
        this.y0.b = c32Var;
        this.z0.b = c32Var;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        bc7[] bc7VarArr = A0;
        bc7 bc7Var = bc7VarArr[7];
        q7c q7cVar = this.w0;
        if (!((znc) q7cVar.T0(this, bc7Var)).n()) {
            znc zncVar = (znc) q7cVar.T0(this, bc7VarArr[7]);
            StickerSetBottomSheet stickerSetBottomSheet = new StickerSetBottomSheet(this.o, null);
            stickerSetBottomSheet.u0 = this.Z;
            zncVar.R(i24.e(stickerSetBottomSheet, null, null));
        }
        od2.L(new zn5(n0().y0, new shb(2, this, StickerPreviewScreen.class, "handleNewSticker", "handleNewSticker(Lone/me/sdk/stickers/model/StickerModel;)V", 4, 7), 5), getViewLifecycleScope());
        int i = 2;
        Class<cla> cls = cla.class;
        String str = "setTitle";
        od2.L(new zn5(n0().A0, new shb(i, (cla) this.s0.T0(this, bc7VarArr[3]), cls, str, "setTitle(Ljava/lang/CharSequence;)V", 4, 8), 5), getViewLifecycleScope());
        od2.L(new zn5(n0().v0, new shb(2, this, StickerPreviewScreen.class, "handleNavEvent", "handleNavEvent(Lone/me/sdk/arch/event/NavigationEvent;)V", 4, 9), 5), getViewLifecycleScope());
        od2.L(new zn5(n0().w0, new shb(2, this, StickerPreviewScreen.class, "handleEvent", "handleEvent(Lone/me/sdk/arch/event/Event;)V", 4, 10), 5), getViewLifecycleScope());
    }

    public StickerPreviewScreen(long j, long j2, long j3) {
        this(dy7.g(new kpa("arg_key_sticker_id", Long.valueOf(j)), new kpa("arg_key_chat_id", Long.valueOf(j2)), new kpa("arg_key_forward_id", Long.valueOf(j3))));
    }
}
