package one.me.startconversation.chattitleicon;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import defpackage.ad0;
import defpackage.an9;
import defpackage.bc7;
import defpackage.bs2;
import defpackage.bvc;
import defpackage.c01;
import defpackage.cka;
import defpackage.cla;
import defpackage.dy7;
import defpackage.eua;
import defpackage.fg7;
import defpackage.fs;
import defpackage.glc;
import defpackage.gs2;
import defpackage.hn2;
import defpackage.hob;
import defpackage.hs2;
import defpackage.je7;
import defpackage.khe;
import defpackage.kke;
import defpackage.kpa;
import defpackage.ks2;
import defpackage.mr0;
import defpackage.nec;
import defpackage.ng3;
import defpackage.nyd;
import defpackage.od2;
import defpackage.oec;
import defpackage.pnf;
import defpackage.pyd;
import defpackage.qm0;
import defpackage.s5a;
import defpackage.syd;
import defpackage.ti2;
import defpackage.tu0;
import defpackage.w7c;
import defpackage.w9a;
import defpackage.wr2;
import defpackage.x2;
import defpackage.x27;
import defpackage.xh4;
import defpackage.yr2;
import defpackage.zia;
import defpackage.zn5;
import defpackage.zr2;
import defpackage.zr6;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001b\b\u0010\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\r"}, d2 = {"Lone/me/startconversation/chattitleicon/ChatTitleIconScreen;", "Lone/me/sdk/arch/Widget;", "Lng3;", "Lad0;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "ids", "Lpyd;", "createType", "([JLpyd;)V", "start-conversation_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ChatTitleIconScreen extends Widget implements ng3, ad0 {
    public static final /* synthetic */ bc7[] z0;
    public final glc X;
    public final je7 Y;
    public final je7 Z;
    public final x27 a;
    public final khe b;
    public final fs c;
    public final fs o;
    public final je7 s0;
    public final qm0 t0;
    public final qm0 u0;
    public final qm0 v0;
    public final qm0 w0;
    public final qm0 x0;
    public final qm0 y0;

    static {
        hob hobVar = new hob(ChatTitleIconScreen.class, "ids", "getIds()[J", 0);
        oec oecVar = nec.a;
        z0 = new bc7[]{hobVar, zr6.e(oecVar, ChatTitleIconScreen.class, "createType", "getCreateType()Lone/me/startconversation/deeplink/StartConversationDeepLinkRoutes$CreateType;", 0), zr6.f(ChatTitleIconScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0, oecVar), zr6.f(ChatTitleIconScreen.class, "hint", "getHint()Landroid/widget/TextView;", 0, oecVar), zr6.f(ChatTitleIconScreen.class, "chatIcon", "getChatIcon()Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", 0, oecVar), zr6.f(ChatTitleIconScreen.class, "chatTitle", "getChatTitle()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0, oecVar), zr6.f(ChatTitleIconScreen.class, "chatDescription", "getChatDescription()Lone/me/sdk/uikit/common/views/DescriptionTextViewWithLimit;", 0, oecVar), zr6.f(ChatTitleIconScreen.class, "confirmButton", "getConfirmButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, oecVar)};
    }

    public ChatTitleIconScreen(long[] jArr, pyd pydVar) {
        this(dy7.g(new kpa("ids", jArr), new kpa("create_type", pydVar)));
    }

    public static final xh4 m0(ChatTitleIconScreen chatTitleIconScreen) {
        chatTitleIconScreen.getClass();
        bc7 bc7Var = z0[6];
        return (xh4) chatTitleIconScreen.x0.getValue();
    }

    public static final s5a n0(ChatTitleIconScreen chatTitleIconScreen) {
        chatTitleIconScreen.getClass();
        bc7 bc7Var = z0[4];
        return (s5a) chatTitleIconScreen.v0.getValue();
    }

    @Override // defpackage.ad0
    public final void a(String str, RectF rectF, Rect rect) {
        r0().r(str, rectF, rect);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getA() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget
    public final bvc getScreenDelegate() {
        return this.X;
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        if (i == zia.b) {
            syd sydVar = syd.c;
            sydVar.getClass();
            sydVar.P1().b(":media-picker/select/photo", null);
        } else if (i == zia.c) {
            r0().s();
        }
    }

    public final cka o0() {
        bc7 bc7Var = z0[5];
        return (cka) this.w0.getValue();
    }

    @Override // defpackage.uu3
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 666) {
            if (i == 777 && i2 == -1) {
                ks2 ks2VarR0 = r0();
                pnf.n(ks2VarR0, ((w9a) ((kke) ks2VarR0.Z.getValue())).b(), null, new gs2(ks2VarR0, intent != null ? intent.getData() : null, null), 2);
                return;
            }
            return;
        }
        if (i2 == -1) {
            if (intent == null) {
                r0().u();
            } else {
                ks2 ks2VarR02 = r0();
                pnf.n(ks2VarR02, ((w9a) ((kke) ks2VarR02.Z.getValue())).b(), null, new hs2(intent, ks2VarR02, null), 2);
            }
        }
    }

    @Override // defpackage.uu3
    public final void onAttach(View view) {
        mr0.V(o0().a);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        bc7 bc7Var = z0[2];
        linearLayout.addView((cla) this.t0.getValue());
        NestedScrollView nestedScrollView = new NestedScrollView(linearLayout.getContext(), null);
        nestedScrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        nestedScrollView.setFillViewport(true);
        c01 c01Var = new c01(1, this);
        ConstraintLayout constraintLayout = new ConstraintLayout(nestedScrollView.getContext());
        constraintLayout.setId(zia.d);
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        c01Var.invoke(constraintLayout);
        nestedScrollView.addView(constraintLayout);
        linearLayout.addView(nestedScrollView);
        return linearLayout;
    }

    @Override // defpackage.uu3
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 158 && ((eua) this.Z.getValue()).b(strArr)) {
            r0().s();
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        w7c w7cVar = r0().z0;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(w7cVar, getViewLifecycleOwner().Q(), fg7Var), new yr2(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(r0().A0, getViewLifecycleOwner().Q(), fg7Var), new zr2(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(r0().B0, new bs2(null, this), 5), getLifecycleScope());
    }

    public final OneMeButton p0() {
        bc7 bc7Var = z0[7];
        return (OneMeButton) this.y0.getValue();
    }

    public final pyd q0() {
        bc7 bc7Var = z0[1];
        return (pyd) this.o.a(this);
    }

    public final ks2 r0() {
        return (ks2) this.Y.getValue();
    }

    public ChatTitleIconScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = x27.d;
        this.b = new khe(new hn2(5));
        this.c = new fs(long[].class, new long[0], "ids");
        this.o = new fs(pyd.class, "create_type");
        this.X = new glc(new wr2(this, 1), null, 6);
        this.Y = createViewModelLazy(ks2.class, new ti2(16, new x2(this, 25, bundle)));
        nyd nydVar = nyd.a;
        this.Z = nydVar.getAccessor().d(eua.class);
        this.s0 = nydVar.getAccessor().d(an9.class);
        this.t0 = binding(new wr2(this, 2));
        this.u0 = binding(new wr2(this, 3));
        this.v0 = binding(new wr2(this, 4));
        this.w0 = binding(new wr2(this, 5));
        this.x0 = binding(new wr2(this, 6));
        this.y0 = binding(new wr2(this, 7));
    }
}
