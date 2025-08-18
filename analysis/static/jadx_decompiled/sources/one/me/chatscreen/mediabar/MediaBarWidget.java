package one.me.chatscreen.mediabar;

import android.animation.IntEvaluator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.a48;
import defpackage.a68;
import defpackage.an9;
import defpackage.au1;
import defpackage.axe;
import defpackage.ay7;
import defpackage.b68;
import defpackage.bc7;
import defpackage.bc8;
import defpackage.bm8;
import defpackage.br7;
import defpackage.c68;
import defpackage.cc8;
import defpackage.cla;
import defpackage.coc;
import defpackage.d58;
import defpackage.d68;
import defpackage.d6b;
import defpackage.dw1;
import defpackage.dy7;
import defpackage.e68;
import defpackage.eia;
import defpackage.eua;
import defpackage.ew1;
import defpackage.f68;
import defpackage.f6b;
import defpackage.fg7;
import defpackage.fk4;
import defpackage.fs;
import defpackage.fua;
import defpackage.g68;
import defpackage.h68;
import defpackage.hc8;
import defpackage.hga;
import defpackage.hob;
import defpackage.hv1;
import defpackage.i24;
import defpackage.i5d;
import defpackage.im;
import defpackage.j03;
import defpackage.je7;
import defpackage.jpc;
import defpackage.ju0;
import defpackage.kia;
import defpackage.kpa;
import defpackage.l5g;
import defpackage.lq0;
import defpackage.lv8;
import defpackage.m00;
import defpackage.m57;
import defpackage.m64;
import defpackage.mpf;
import defpackage.mv8;
import defpackage.n00;
import defpackage.nec;
import defpackage.ng3;
import defpackage.nj4;
import defpackage.nka;
import defpackage.nv8;
import defpackage.od2;
import defpackage.p4d;
import defpackage.p58;
import defpackage.p92;
import defpackage.pg7;
import defpackage.pka;
import defpackage.q0e;
import defpackage.q3d;
import defpackage.q58;
import defpackage.q7c;
import defpackage.qm0;
import defpackage.qp4;
import defpackage.qp7;
import defpackage.rp7;
import defpackage.rrb;
import defpackage.s58;
import defpackage.s86;
import defpackage.s8a;
import defpackage.ska;
import defpackage.suc;
import defpackage.sv8;
import defpackage.t03;
import defpackage.t58;
import defpackage.t8a;
import defpackage.t9;
import defpackage.tfg;
import defpackage.to2;
import defpackage.tpa;
import defpackage.tu0;
import defpackage.tz5;
import defpackage.up7;
import defpackage.urb;
import defpackage.uu3;
import defpackage.uy8;
import defpackage.v58;
import defpackage.vc7;
import defpackage.vha;
import defpackage.vka;
import defpackage.vm9;
import defpackage.vvb;
import defpackage.w12;
import defpackage.w7c;
import defpackage.wha;
import defpackage.wuc;
import defpackage.x27;
import defpackage.xp7;
import defpackage.xq0;
import defpackage.y58;
import defpackage.yq0;
import defpackage.z58;
import defpackage.z7b;
import defpackage.z84;
import defpackage.zn5;
import defpackage.znc;
import defpackage.zr6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import one.me.chatscreen.mediabar.mediatypepicker.MediaTypePickerWidget;
import one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.messages.media.mediabar.ActLocalMedias;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u000e\u000fB\u0011\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0010"}, d2 = {"Lone/me/chatscreen/mediabar/MediaBarWidget;", "Lone/me/sdk/arch/Widget;", "Lvm9;", "Lng3;", "Ldw1;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "", ApiProtocol.PARAM_CHAT_ID, "(Ljava/lang/String;JLz84;)V", "t58", "t9", "chat-screen_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class MediaBarWidget extends Widget implements vm9, ng3, dw1 {
    public static final /* synthetic */ bc7[] d1 = {new hob(MediaBarWidget.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), z7b.g(nec.a, MediaBarWidget.class, "selectMediaTypeRouter", "getSelectMediaTypeRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new hob(MediaBarWidget.class, "primaryRouter", "getPrimaryRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new hob(MediaBarWidget.class, "popupLayout", "getPopupLayout()Lone/me/sdk/uikit/common/views/PopupLayout;", 0), new hob(MediaBarWidget.class, "closeDragView", "getCloseDragView()Landroid/widget/FrameLayout;", 0), new hob(MediaBarWidget.class, "closeDragElement", "getCloseDragElement()Landroid/widget/FrameLayout;", 0), new hob(MediaBarWidget.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new hob(MediaBarWidget.class, "primaryContainer", "getPrimaryContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new hob(MediaBarWidget.class, "partialMediaAccessRouter", "getPartialMediaAccessRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new hob(MediaBarWidget.class, "partialMediaAccessContainer", "getPartialMediaAccessContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new hob(MediaBarWidget.class, "cameraContainerView", "getCameraContainerView()Lone/me/sdk/gallery/view/CameraContainerView;", 0), new hob(MediaBarWidget.class, "selectedMediaAdapter", "getSelectedMediaAdapter()Lone/me/chatscreen/mediabar/SelectedMediaAdapter;", 0), new hob(MediaBarWidget.class, "selectedMediaRecycler", "getSelectedMediaRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0), new hob(MediaBarWidget.class, "selectedMediaContent", "getSelectedMediaContent()Landroid/widget/LinearLayout;", 0), new hob(MediaBarWidget.class, "messageContent", "getMessageContent()Lone/me/sdk/uikit/common/chat/MessageInputView;", 0), new hob(MediaBarWidget.class, "draggableContainer", "getDraggableContainer()Landroid/widget/LinearLayout;", 0), new hob(MediaBarWidget.class, "selectMediaTypeContainer", "getSelectMediaTypeContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new hob(MediaBarWidget.class, "bottomContainer", "getBottomContainer()Landroid/widget/LinearLayout;", 0), new hob(MediaBarWidget.class, "selectedAlbumRouter", "getSelectedAlbumRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new hob(MediaBarWidget.class, "selectedAlbumContainer", "getSelectedAlbumContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new hob(MediaBarWidget.class, "mediaKeyboardContainer", "getMediaKeyboardContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new hob(MediaBarWidget.class, "mediaKeyboardRouter", "getMediaKeyboardRouter()Lcom/bluelinelabs/conductor/Router;", 0)};
    public static final x27 e1 = new x27(0, new yq0(4, 3, true), 1);
    public final q7c A0;
    public final qm0 B0;
    public final ColorDrawable C0;
    public final qm0 D0;
    public float E0;
    public float F0;
    public int G0;
    public final qm0 H0;
    public final qm0 I0;
    public final qm0 J0;
    public final qm0 K0;
    public final xq0 L0;
    public final ColorDrawable M0;
    public ValueAnimator N0;
    public final qm0 O0;
    public final qm0 P0;
    public final qm0 Q0;
    public final je7 R0;
    public final je7 S0;
    public final je7 T0;
    public final je7 U0;
    public final q7c V0;
    public final qm0 W0;
    public final xp7 X;
    public final je7 X0;
    public final IntEvaluator Y;
    public final q7c Y0;
    public final q7c Z;
    public final q7c Z0;
    public final String a;
    public final tz5 a1;
    public final fs b;
    public hc8 b1;
    public final je7 c;
    public t58 c1;
    public final an9 o;
    public final q7c s0;
    public final q7c t0;
    public vha u0;
    public final qm0 v0;
    public final qm0 w0;
    public final qm0 x0;
    public final qm0 y0;
    public final je7 z0;

    public MediaBarWidget(String str, long j, z84 z84Var) {
        this(dy7.g(new kpa("scope_id", new suc(str)), new kpa("chat_id", Long.valueOf(j))));
    }

    public static final void m0(MediaBarWidget mediaBarWidget, int i, int i2) {
        vha vhaVar = mediaBarWidget.u0;
        if (vhaVar != null) {
            vhaVar.a();
        }
        wha whaVar = new wha(mediaBarWidget.x0());
        whaVar.c(new eia(0, 0, mediaBarWidget.r0().getHeight(), 3));
        whaVar.e(new kia(i));
        whaVar.h(mediaBarWidget.getContext().getString(i2));
        mediaBarWidget.u0 = whaVar.i();
    }

    public static final void n0(MediaBarWidget mediaBarWidget, int i) throws Resources.NotFoundException {
        vha vhaVar = mediaBarWidget.u0;
        if (vhaVar != null) {
            vhaVar.a();
        }
        String quantityString = mediaBarWidget.getContext().getResources().getQuantityString(hga.a, i, Integer.valueOf(i));
        wha whaVar = new wha(mediaBarWidget.x0());
        whaVar.c(new eia(0, 0, mediaBarWidget.r0().getHeight(), 3));
        whaVar.h(quantityString);
        mediaBarWidget.u0 = whaVar.i();
    }

    public static final void o0(MediaBarWidget mediaBarWidget) {
        mediaBarWidget.getClass();
        bc7[] bc7VarArr = d1;
        bc7 bc7Var = bc7VarArr[5];
        int paddingTop = mediaBarWidget.t0().getPaddingTop() + mediaBarWidget.A0().getMeasuredHeight() + ((FrameLayout) mediaBarWidget.w0.getValue()).getMeasuredHeight();
        bc7 bc7Var2 = bc7VarArr[9];
        float measuredHeight = mediaBarWidget.F0 + mediaBarWidget.E0 + ((w12) mediaBarWidget.B0.getValue()).getMeasuredHeight() + paddingTop;
        LinearLayout linearLayoutR0 = mediaBarWidget.r0();
        Rect rect = mpf.a;
        mpf.d(rect, linearLayoutR0);
        int height = (mediaBarWidget.s0().getHeight() + ((int) measuredHeight)) - rect.top;
        if (height < 0) {
            height = 0;
        }
        ew1 ew1VarS0 = mediaBarWidget.s0();
        int i = (-((int) mediaBarWidget.E0)) + mediaBarWidget.G0;
        ew1VarS0.v0 = i;
        ew1VarS0.w0 = height;
        if (!ew1VarS0.z0) {
            axe axeVar = ew1VarS0.x0;
            axeVar.a = i;
            axeVar.b = height;
            ew1VarS0.invalidateOutline();
        }
        mediaBarWidget.s0().setPreviewTranslationY(measuredHeight);
    }

    public final cla A0() {
        bc7 bc7Var = d1[6];
        return (cla) this.x0.getValue();
    }

    public final p58 B0() {
        return (p58) this.T0.getValue();
    }

    public final void C0(up7 up7Var, int i, String str) {
        im imVarRequireActivity = requireActivity();
        boolean zS = B0().s();
        qp7 qp7Var = new qp7();
        qp7Var.a = true;
        qp7Var.b = false;
        qp7Var.c = str;
        qp7Var.e = i;
        qp7Var.d = up7Var.a();
        qp7Var.f = 0;
        qp7Var.g = 0;
        qp7Var.a = true;
        qp7Var.b = zS;
        int i2 = ActLocalMedias.s1;
        Intent intent = new Intent(imVarRequireActivity, (Class<?>) ActLocalMedias.class);
        intent.putExtra("ru.ok.tamtam.extra.PROFILE_CREATION", false);
        intent.putExtra("ru.ok.tamtam.extra.OPTIONS", new rp7(qp7Var));
        Pair pairCreate = Pair.create(intent, null);
        startActivityForResult((Intent) pairCreate.first, 39393, (Bundle) pairCreate.second);
    }

    public final void D0(i5d i5dVar) {
        int iOrdinal = i5dVar.ordinal();
        if (iOrdinal == 0) {
            w0().setRightOuterIconActionState(mv8.a);
        } else if (iOrdinal == 1) {
            w0().setRightOuterIconActionState(lv8.a);
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            w0().setRightOuterIconActionState(nv8.a);
        }
    }

    public final void E0(n00 n00Var) {
        int i;
        ska pkaVar;
        cla claVarA0 = A0();
        if (B0().s()) {
            pkaVar = nka.a;
        } else {
            int iOrdinal = n00Var.ordinal();
            if (iOrdinal == 0) {
                i = s8a.i;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i = s8a.h;
            }
            pkaVar = new pka(null, new vka(i, new s58(this, 0)));
        }
        claVarA0.setRightActions(pkaVar);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScopeId-IluPPks, reason: from getter */
    public final String getB() {
        return this.a;
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        if (i != 1) {
            return;
        }
        p58 p58VarB0 = B0();
        p58VarB0.getClass();
        p58VarB0.t0.n(new a48(false));
    }

    @Override // defpackage.uu3
    public final boolean handleBack() {
        if (s0().z0) {
            s0().a(false, true);
            an9.g(this.o, wuc.CHAT_ATTACH_PICKER);
            return true;
        }
        d6b scrollState = x0().getScrollState();
        scrollState.getClass();
        if (scrollState == d6b.a) {
            return false;
        }
        if (v0().n()) {
            B0().v0.z(1);
            return true;
        }
        if (!B0().u()) {
            return true;
        }
        x0().j(true);
        return true;
    }

    @Override // defpackage.vm9
    public final wuc o() {
        return s0().z0 ? wuc.CHAT_ATTACH_PICKER_CAMERA : wuc.CHAT_ATTACH_PICKER;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final void onActivityPaused(Activity activity) {
        if (getView() != null) {
            p0();
        }
        super.onActivityPaused(activity);
    }

    @Override // defpackage.uu3
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        p58 p58VarB0 = B0();
        int i3 = p58VarB0.r().l;
        int i4 = i3 == 0 ? -1 : d58.$EnumSwitchMapping$2[au1.s(i3)];
        int i5 = 3;
        q0e q0eVar = p58VarB0.s0;
        if (i4 == 1 || i4 == 2) {
            q0eVar.m(null, n00.a);
            p4d p4dVarR = p58VarB0.r();
            int i6 = m00.$EnumSwitchMapping$0[0];
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i5 = 2;
            }
            p4dVarR.p(i5);
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            q0eVar.m(null, n00.b);
            p4d p4dVarR2 = p58VarB0.r();
            int i7 = m00.$EnumSwitchMapping$0[1];
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i5 = 2;
            }
            p4dVarR2.p(i5);
        }
        if (i == 39393) {
            s0().a(false, false);
            if (i2 == -1) {
                B0().t(true);
            }
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final void onActivityResumed(Activity activity) {
        if (getView() != null) {
            if (x0().getScrollState() != d6b.a) {
                q0();
            }
            w0().setText(this.X.f.k);
        }
        p58 p58VarB0 = B0();
        p58VarB0.y0.h();
        p58VarB0.z0.h();
        urb urbVar = (urb) this.z0.getValue();
        urbVar.x0.h();
        urbVar.y0.h();
        super.onActivityResumed(activity);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        f6b f6bVar = new f6b(getContext());
        f6bVar.setId(vvb.media_bar__popup_layout);
        qp4.u0.j(f6bVar).b();
        f6bVar.setBackground(new ColorDrawable(-1728053248));
        f6bVar.addView(t0());
        f6bVar.addView(r0());
        f6bVar.addView(s0());
        View w12Var = new w12(f6bVar.getContext());
        w12Var.setId(t8a.y);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        w12Var.setLayoutParams(layoutParams);
        int i = vc7.a;
        w12Var.setTranslationY(vc7.a(w12Var.getContext()));
        br7.d(w12Var, new x27(0, new yq0(5, 1, false), 1), null);
        f6bVar.addView(w12Var);
        f6bVar.setCallback(new t9(this, 2));
        i24.s(new zn5(vc7.f, new v58(this, f6bVar, null), 5), getViewLifecycleScope());
        return f6bVar;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        f6b f6bVarX0 = x0();
        ValueAnimator valueAnimator = f6bVarX0.s0;
        if (valueAnimator != null) {
            ju0.i(valueAnimator);
        }
        f6bVarX0.s0 = null;
        rrb rrbVar = s0().a;
        if (rrbVar != null) {
            if (rrbVar == null) {
                rrbVar = null;
            }
            rrbVar.getCameraApi().c();
        }
        hc8 hc8Var = this.b1;
        if (hc8Var != null) {
            hc8Var.a();
        }
        this.b1 = null;
    }

    @Override // defpackage.uu3
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        je7 je7Var = this.c;
        if (i == 159) {
            eua.l((eua) je7Var.getValue(), new l5g(this, 1), strArr, iArr, eua.l, jpc.U1, jpc.V1);
        } else {
            if (i != 171) {
                return;
            }
            eua.l((eua) je7Var.getValue(), new l5g(this, 1), strArr, iArr, eua.h, jpc.S1, jpc.R1);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        bc7[] bc7VarArr = d1;
        j03 j03Var = (j03) this.Z.T0(this, bc7VarArr[1]);
        if (!tpa.f(j03Var.c(), "media_type_picker_widget")) {
            bc7 bc7Var = bc7VarArr[0];
            coc cocVar = new coc(new MediaTypePickerWidget(this.a, ((Number) this.b.a(this)).longValue(), null), null, null, null, false, -1);
            cocVar.d("media_type_picker_widget");
            j03Var.a.R(cocVar);
        }
        q0e q0eVar = B0().s0;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(q0eVar, getViewLifecycleOwner().Q(), fg7Var), new c68(null, this), 5), getViewLifecycleScope());
        i24.s(new zn5(B0().A0, new g68(null, this), 5), getViewLifecycleScope());
        i24.s(new zn5(od2.R(B0().t0), new h68(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(B0().F0, getViewLifecycleOwner().Q(), fg7Var), new d68(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(B0().D0, getViewLifecycleOwner().Q(), fg7Var), new e68(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(B0().B0, getViewLifecycleOwner().Q(), fg7Var), new f68(null, this), 5), getViewLifecycleScope());
        i24.s(new zn5(u0().c, new a68(null, this), 5), getViewLifecycleScope());
        i24.s(new zn5(((bm8) this.S0.getValue()).b, new b68(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((urb) this.z0.getValue()).w0, getViewLifecycleOwner().Q(), fg7Var), new z58(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((q3d) this.U0.getValue()).o, getViewLifecycleOwner().Q(), fg7Var), new y58(null, this), 5), getViewLifecycleScope());
        znc zncVarV0 = v0();
        w12 w12Var = (w12) this.Y0.T0(this, bc7VarArr[20]);
        LinearLayout linearLayoutR0 = r0();
        q58 q58Var = new q58(this, 15);
        boolean z = tfg.s(getContext()).b && Build.VERSION.SDK_INT >= 30;
        pg7 viewLifecycleScope = getViewLifecycleScope();
        uy8 uy8Var = (uy8) ((w7c) B0().v0.c).a.getValue();
        this.b1 = new hc8(zncVarV0, w12Var, linearLayoutR0, q58Var, z, viewLifecycleScope, (uy8Var != null ? uy8Var.a : 0) == 2, new q58(this, 16));
        new bc8((cc8) this.X0.getValue(), w0()).a(getViewLifecycleScope());
        od2.L(new zn5(new t03((w7c) B0().v0.c, 11), new lq0(2, this, MediaBarWidget.class, "onToggleEmoji", "onToggleEmoji(Lone/me/sdk/messagewrite/MessageWriteEvent$ToggleEmoji;)V", 4, 19), 5), getViewLifecycleScope());
    }

    public final void p0() {
        rrb rrbVar = s0().a;
        if (rrbVar != null) {
            if (rrbVar == null) {
                rrbVar = null;
            }
            rrbVar.getCameraApi().h();
        }
        uu3 uu3VarB = y0().b();
        if (uu3VarB instanceof MediaBarPermissionWidget) {
            qm0 qm0Var = ((MediaBarPermissionWidget) uu3VarB).o;
            if (qm0Var.a()) {
                ((hv1) qm0Var.getValue()).h();
            }
        }
        uu3 uu3VarB2 = ((j03) this.V0.T0(this, d1[18])).b();
        SelectAlbumWidget selectAlbumWidget = uu3VarB2 instanceof SelectAlbumWidget ? (SelectAlbumWidget) uu3VarB2 : null;
        if (selectAlbumWidget != null) {
            selectAlbumWidget.n0().j(false);
        }
        A0().setDropdownRotationProgress(0.0f);
    }

    public final void q0() {
        rrb rrbVar = s0().a;
        if (rrbVar != null) {
            if (rrbVar == null) {
                rrbVar = null;
            }
            rrbVar.getCameraApi().e();
        }
        uu3 uu3VarB = y0().b();
        if (uu3VarB instanceof MediaBarPermissionWidget) {
            qm0 qm0Var = ((MediaBarPermissionWidget) uu3VarB).o;
            if (qm0Var.a()) {
                ((hv1) qm0Var.getValue()).e();
            }
        }
    }

    public final LinearLayout r0() {
        bc7 bc7Var = d1[17];
        return (LinearLayout) this.Q0.getValue();
    }

    public final ew1 s0() {
        bc7 bc7Var = d1[10];
        return (ew1) this.D0.getValue();
    }

    public final LinearLayout t0() {
        bc7 bc7Var = d1[15];
        return (LinearLayout) this.O0.getValue();
    }

    public final s86 u0() {
        return (s86) this.R0.getValue();
    }

    public final znc v0() {
        return (znc) this.Z0.T0(this, d1[21]);
    }

    public final sv8 w0() {
        bc7 bc7Var = d1[14];
        return (sv8) this.K0.getValue();
    }

    public final f6b x0() {
        return (f6b) this.t0.T0(this, d1[3]);
    }

    public final j03 y0() {
        return (j03) this.s0.T0(this, d1[2]);
    }

    public final w12 z0() {
        bc7 bc7Var = d1[19];
        return (w12) this.W0.getValue();
    }

    public MediaBarWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        p92.b.getClass();
        this.a = m64.a(p92.c.a);
        this.b = new fs(Long.class, "chat_id");
        this.c = fua.a.b();
        to2 to2Var = to2.a;
        this.o = (an9) to2Var.getAccessor().c(an9.class);
        this.X = (xp7) to2Var.getAccessor().c(xp7.class);
        this.Y = new IntEvaluator();
        this.Z = childSlotRouter(vvb.media_bar__bottom_container);
        this.s0 = childSlotRouter(vvb.media_bar__primary_container);
        this.t0 = viewBinding(vvb.media_bar__popup_layout);
        this.v0 = binding(new q58(this, 0));
        this.w0 = binding(new q58(this, 1));
        this.x0 = binding(new q58(this, 2));
        this.y0 = binding(new q58(this, 3));
        this.z0 = createViewModelLazy(urb.class, new nj4(21, new m57(26)));
        this.A0 = childSlotRouter(vvb.media_bar__partial_media_access_container);
        this.B0 = binding(new q58(this, 4));
        ColorDrawable colorDrawable = new ColorDrawable(-16777216);
        colorDrawable.setAlpha(0);
        this.C0 = colorDrawable;
        this.D0 = binding(new q58(this, 5));
        this.H0 = binding(new q58(this, 6));
        this.I0 = binding(new q58(this, 7));
        this.J0 = binding(new q58(this, 8));
        this.K0 = binding(new q58(this, 9));
        this.L0 = new xq0(1, fk4.d().getDisplayMetrics().density * 12.0f);
        ColorDrawable colorDrawable2 = new ColorDrawable(-16777216);
        colorDrawable2.setAlpha(0);
        this.M0 = colorDrawable2;
        this.O0 = binding(new q58(this, 14));
        this.P0 = binding(new q58(this, 17));
        this.Q0 = binding(new q58(this, 18));
        tu0.r(3, new q58(this, 19));
        this.R0 = createViewModelLazy(s86.class, new nj4(22, new q58(this, 20)));
        this.S0 = createViewModelLazy(bm8.class, new nj4(23, new m57(27)));
        Object objV = ay7.v(bundle, "scope_id", suc.class);
        if (objV != null) {
            this.T0 = m41getSharedViewModelcp94BC8(((suc) ((Parcelable) objV)).a, p58.class, null);
            this.U0 = createViewModelLazy(q3d.class, new nj4(24, new m57(28)));
            this.V0 = childSlotRouter(t8a.A);
            this.W0 = binding(new q58(this, 21));
            Object objV2 = ay7.v(bundle, "scope_id", suc.class);
            if (objV2 != null) {
                this.X0 = m41getSharedViewModelcp94BC8(((suc) ((Parcelable) objV2)).a, cc8.class, null);
                int i = t8a.y;
                this.Y0 = viewBinding(i);
                this.Z0 = Widget.childRouter$default(this, i, null, 2, null);
                this.a1 = new tz5(this, 1);
                return;
            }
            throw new IllegalArgumentException(zr6.i("No value passed for key scope_id of type ", suc.class.getSimpleName(), " in bundle").toString());
        }
        throw new IllegalArgumentException(zr6.i("No value passed for key scope_id of type ", suc.class.getSimpleName(), " in bundle").toString());
    }
}
