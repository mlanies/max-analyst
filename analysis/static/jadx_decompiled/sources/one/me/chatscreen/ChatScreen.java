package one.me.chatscreen;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a0b;
import defpackage.an9;
import defpackage.ao2;
import defpackage.av3;
import defpackage.bc7;
import defpackage.bo2;
import defpackage.br7;
import defpackage.bt1;
import defpackage.bvc;
import defpackage.cac;
import defpackage.cc8;
import defpackage.cla;
import defpackage.co2;
import defpackage.coc;
import defpackage.d48;
import defpackage.d6b;
import defpackage.do2;
import defpackage.e52;
import defpackage.ec8;
import defpackage.eha;
import defpackage.eia;
import defpackage.eo2;
import defpackage.eqe;
import defpackage.f58;
import defpackage.fg7;
import defpackage.fh;
import defpackage.fn2;
import defpackage.fo2;
import defpackage.foc;
import defpackage.fs;
import defpackage.g39;
import defpackage.gh7;
import defpackage.glc;
import defpackage.gn2;
import defpackage.go2;
import defpackage.gw7;
import defpackage.hc8;
import defpackage.hm9;
import defpackage.hn2;
import defpackage.ho2;
import defpackage.hob;
import defpackage.hw7;
import defpackage.hzc;
import defpackage.i24;
import defpackage.io2;
import defpackage.ir6;
import defpackage.j03;
import defpackage.j31;
import defpackage.j47;
import defpackage.jac;
import defpackage.je7;
import defpackage.jn2;
import defpackage.jo2;
import defpackage.jp2;
import defpackage.kia;
import defpackage.kke;
import defpackage.ko2;
import defpackage.lg3;
import defpackage.ln2;
import defpackage.lq0;
import defpackage.lr0;
import defpackage.m52;
import defpackage.mn2;
import defpackage.mr0;
import defpackage.nec;
import defpackage.ng3;
import defpackage.no2;
import defpackage.np2;
import defpackage.o92;
import defpackage.od2;
import defpackage.oi9;
import defpackage.on2;
import defpackage.p35;
import defpackage.p58;
import defpackage.pg7;
import defpackage.pge;
import defpackage.pnf;
import defpackage.q7c;
import defpackage.qe5;
import defpackage.qn2;
import defpackage.qq0;
import defpackage.qq2;
import defpackage.qqe;
import defpackage.r59;
import defpackage.rg1;
import defpackage.rn2;
import defpackage.rq2;
import defpackage.se5;
import defpackage.sn2;
import defpackage.so2;
import defpackage.sy8;
import defpackage.t03;
import defpackage.t58;
import defpackage.t8a;
import defpackage.tfg;
import defpackage.ti2;
import defpackage.tn2;
import defpackage.to2;
import defpackage.tp2;
import defpackage.tpa;
import defpackage.tu0;
import defpackage.un2;
import defpackage.up2;
import defpackage.us7;
import defpackage.uu3;
import defpackage.uy8;
import defpackage.v3c;
import defpackage.vc7;
import defpackage.vha;
import defpackage.vm9;
import defpackage.vo2;
import defpackage.vx3;
import defpackage.vxd;
import defpackage.w12;
import defpackage.w21;
import defpackage.w29;
import defpackage.w7c;
import defpackage.w9a;
import defpackage.wg0;
import defpackage.wha;
import defpackage.wuc;
import defpackage.wza;
import defpackage.x2;
import defpackage.x27;
import defpackage.x53;
import defpackage.xh0;
import defpackage.xk1;
import defpackage.xn2;
import defpackage.xo2;
import defpackage.xoc;
import defpackage.xp7;
import defpackage.xt3;
import defpackage.xz8;
import defpackage.y16;
import defpackage.yce;
import defpackage.yf3;
import defpackage.yn2;
import defpackage.yoc;
import defpackage.yq0;
import defpackage.yq2;
import defpackage.ys;
import defpackage.yy8;
import defpackage.z7;
import defpackage.z7b;
import defpackage.zmf;
import defpackage.zn2;
import defpackage.zn5;
import defpackage.znc;
import defpackage.zu3;
import defpackage.zz7;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.chatstatus.ChatStatusBottomWidget;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.chatscreen.search.SearchMessageBottomWidget;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.pinbars.PinBarsWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0011\b\u0000\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/chatscreen/ChatScreen;", "Lone/me/sdk/conductor/changehandlers/swipe/SwipeWidget;", "Lxt3;", "Lng3;", "Ly16;", "La0b;", "Lt58;", "Lr59;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "chat-screen_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class ChatScreen extends SwipeWidget implements xt3, ng3, y16, a0b, t58, r59 {
    public static final /* synthetic */ bc7[] k1 = {new hob(ChatScreen.class, "unspecifiedChatId", "getUnspecifiedChatId()J", 0), z7b.g(nec.a, ChatScreen.class, "type", "getType()Lone/me/chatscreen/deeplink/ChatDeepLinkRoutes$Type;", 0), new hob(ChatScreen.class, "openSearchField", "getOpenSearchField()Z", 0), new hob(ChatScreen.class, "startPayload", "getStartPayload()Ljava/lang/String;", 0), new oi9(ChatScreen.class, "forwardMessageIds", "getForwardMessageIds()[J"), new oi9(ChatScreen.class, "forwardAttachId", "getForwardAttachId()Ljava/lang/Long;"), new oi9(ChatScreen.class, "isForwardAttach", "isForwardAttach()Z"), new hob(ChatScreen.class, "messagesContainer", "getMessagesContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new hob(ChatScreen.class, "messagesRouter", "getMessagesRouter()Lcom/bluelinelabs/conductor/Router;", 0), new hob(ChatScreen.class, "bottomContainer", "getBottomContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new hob(ChatScreen.class, "bottomRouter", "getBottomRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new hob(ChatScreen.class, "mediaBarContainer", "getMediaBarContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new hob(ChatScreen.class, "mediaBarRouter", "getMediaBarRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new hob(ChatScreen.class, "mediaKeyboardContainer", "getMediaKeyboardContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new hob(ChatScreen.class, "mediaKeyboardRouter", "getMediaKeyboardRouter()Lcom/bluelinelabs/conductor/Router;", 0), new hob(ChatScreen.class, "chatMainContainer", "getChatMainContainer()Landroid/widget/LinearLayout;", 0), new hob(ChatScreen.class, "videoMsgContainer", "getVideoMsgContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new hob(ChatScreen.class, "videoMsgRouter", "getVideoMsgRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new hob(ChatScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new hob(ChatScreen.class, "searchView", "getSearchView()Lone/me/sdk/uikit/common/search/OneMeSearchView;", 0), new hob(ChatScreen.class, "pinbarsContainer", "getPinbarsContainer()Landroid/view/ViewGroup;", 0), new hob(ChatScreen.class, "chatBackground", "getChatBackground()Landroid/view/View;", 0), new hob(ChatScreen.class, "suggestionsContainer", "getSuggestionsContainer()Landroid/view/ViewGroup;", 0), new hob(ChatScreen.class, "suggestionsRouter", "getSuggestionsRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0)};
    public boolean A0;
    public final je7 B0;
    public final je7 C0;
    public final je7 D0;
    public final je7 E0;
    public final fn2 F0;
    public final je7 G0;
    public final je7 H0;
    public final je7 I0;
    public final je7 J0;
    public final je7 K0;
    public final String L0;
    public final q7c M0;
    public final q7c N0;
    public final q7c O0;
    public final q7c P0;
    public final q7c Q0;
    public final q7c R0;
    public final q7c S0;
    public final q7c T0;
    public hc8 U0;
    public final q7c V0;
    public final q7c W0;
    public final an9 X;
    public final q7c X0;
    public final bt1 Y;
    public final je7 Y0;
    public final je7 Z;
    public final gw7 Z0;
    public final q7c a1;
    public final q7c b1;
    public final q7c c1;
    public final q7c d1;
    public final q7c e1;
    public final q7c f1;
    public final je7 g1;
    public final je7 h1;
    public vha i1;
    public Bundle j1;
    public final glc o;
    public final no2 s0;
    public final fs t0;
    public final fs u0;
    public final fs v0;
    public final fs w0;
    public final fs x0;
    public final fs y0;
    public final fs z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatScreen(Bundle bundle) {
        super(bundle);
        int i = 12;
        int i2 = 9;
        int i3 = 15;
        int i4 = 14;
        int i5 = 2;
        int i6 = 1;
        int i7 = 0;
        int i8 = 13;
        this.o = new glc(new fn2(this, i7), new fn2(this, i8), 4);
        to2 to2Var = to2.a;
        this.X = (an9) to2Var.getAccessor().c(an9.class);
        this.Y = (bt1) to2Var.getAccessor().c(bt1.class);
        je7 je7Var = so2.a;
        this.Z = to2Var.getAccessor().d(qe5.class);
        this.s0 = new no2(this, i7);
        this.t0 = new fs(Long.class, "id");
        this.u0 = new fs(o92.class, "type");
        Boolean bool = Boolean.FALSE;
        this.v0 = new fs(Boolean.class, bool, "open_search_field");
        this.w0 = new fs(String.class, null, ApiProtocol.PARAM_PAYLOAD);
        this.x0 = new fs(long[].class, null, "forward_msg_ids");
        this.y0 = new fs(Long.class, null, "forward_attach_id");
        this.z0 = new fs(Boolean.class, bool, "is_forward_attach");
        this.A0 = true;
        this.B0 = createViewModelLazy(rq2.class, new ti2(7, new fn2(this, i4)));
        this.C0 = createViewModelLazy(xz8.class, new ti2(8, new fn2(this, i3)));
        this.D0 = createViewModelLazy(p58.class, new ti2(i2, new fn2(this, 16)));
        this.E0 = createViewModelLazy(g39.class, new ti2(10, new m52(26)));
        this.F0 = new fn2(this, i6);
        this.G0 = createViewModelLazy(yce.class, new ti2(11, new fn2(this, i5)));
        this.H0 = createViewModelLazy(zz7.class, new ti2(i, new m52(27)));
        this.I0 = createViewModelLazy(cc8.class, new ti2(i8, new m52(28)));
        this.J0 = createViewModelLazy(hzc.class, new ti2(i4, new fn2(this, 4)));
        createViewModelLazy(wza.class, new ti2(i3, new fn2(this, i2)));
        this.K0 = createViewModelLazy(jac.class, new ti2(6, new hn2(i6)));
        this.L0 = "ChatScreen";
        int i9 = t8a.k;
        this.M0 = viewBinding(i9);
        this.N0 = Widget.childRouter$default(this, i9, null, 2, null);
        int i10 = t8a.b;
        this.O0 = viewBinding(i10);
        this.P0 = childSlotRouter(i10);
        int i11 = t8a.i;
        this.Q0 = viewBinding(i11);
        this.R0 = childSlotRouter(i11);
        int i12 = t8a.j;
        this.S0 = viewBinding(i12);
        this.T0 = Widget.childRouter$default(this, i12, null, 2, null);
        this.V0 = viewBinding(t8a.h);
        int i13 = t8a.p;
        this.W0 = viewBinding(i13);
        this.X0 = childSlotRouter(i13);
        this.Y0 = to2Var.getAccessor().d(hw7.class);
        this.Z0 = new gw7();
        this.a1 = viewBinding(t8a.o);
        this.b1 = viewBinding(t8a.m);
        this.c1 = viewBinding(t8a.l);
        this.d1 = viewBinding(t8a.a);
        int i14 = t8a.n;
        this.e1 = viewBinding(i14);
        this.f1 = childSlotRouter(i14);
        this.g1 = tu0.r(3, new fn2(this, i));
        this.h1 = tu0.r(3, new hn2(i5));
    }

    public static void U0(ChatScreen chatScreen, Integer num, String str, Integer num2, Integer num3, int i) {
        String strB = null;
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            num3 = null;
        }
        chatScreen.getClass();
        if (str == null) {
            if (num != null) {
                str = z7.B(chatScreen.getContext(), num.intValue());
            } else {
                str = null;
            }
            if (str == null) {
                return;
            }
        }
        if (num2 != null) {
            strB = z7.B(chatScreen.getContext(), num2.intValue());
        }
        vha vhaVar = chatScreen.i1;
        if (vhaVar != null) {
            vhaVar.a();
        }
        wha whaVar = new wha(chatScreen);
        whaVar.h(str);
        whaVar.b(strB);
        whaVar.c(new eia(0, 0, chatScreen.A0(), 3));
        if (num3 != null) {
            whaVar.e(new kia(num3.intValue()));
        }
        chatScreen.i1 = whaVar.i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void v0(ChatScreen chatScreen, sy8 sy8Var) {
        hc8 hc8Var;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        View view;
        View view2;
        View view3;
        View view4;
        int i2 = 1;
        chatScreen.getClass();
        if (sy8Var.a) {
            hc8 hc8Var2 = chatScreen.U0;
            if (hc8Var2 != null) {
                uu3 parentController = chatScreen;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                foc focVar = parentController instanceof foc ? (foc) parentController : null;
                int bottom = chatScreen.N0().getBottom() + (focVar != null ? focVar.s() : 0);
                boolean z = hc8Var2.e;
                View view5 = hc8Var2.b;
                int i3 = hc8Var2.k;
                if (!z) {
                    int i4 = view5.getContext().getResources().getDisplayMetrics().heightPixels - (i3 + bottom);
                    MediaKeyboardWidget mediaKeyboardWidgetD = hc8Var2.d();
                    if (mediaKeyboardWidgetD != null && (view4 = mediaKeyboardWidgetD.getView()) != null) {
                        ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                        layoutParams.height = i4;
                        view4.setLayoutParams(layoutParams);
                    }
                    ViewGroup.LayoutParams layoutParams2 = view5.getLayoutParams();
                    marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    i = marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0;
                    View view6 = hc8Var2.c;
                    view6.setPadding(view6.getPaddingLeft(), view6.getPaddingTop(), view6.getPaddingRight(), i4 + i);
                    return;
                }
                int i5 = view5.getContext().getResources().getDisplayMetrics().heightPixels - (i3 + bottom);
                ViewGroup.LayoutParams layoutParams3 = view5.getLayoutParams();
                marginLayoutParams = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                int i6 = (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) + i5;
                AnimatorSet animatorSet = hc8Var2.i;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                ValueAnimator valueAnimatorB = hc8Var2.b(i6);
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(hc8Var2.c(), i5);
                valueAnimatorOfInt.addUpdateListener(new ec8(hc8Var2, i2));
                animatorSet2.playTogether(valueAnimatorB, valueAnimatorOfInt);
                animatorSet2.setDuration(200L);
                animatorSet2.start();
                hc8Var2.i = animatorSet2;
                return;
            }
            return;
        }
        hc8 hc8Var3 = chatScreen.U0;
        if (hc8Var3 != null) {
            MediaKeyboardWidget mediaKeyboardWidgetD2 = hc8Var3.d();
            if (((mediaKeyboardWidgetD2 == null || (view3 = mediaKeyboardWidgetD2.getView()) == null) ? 0 : view3.getHeight()) <= hc8Var3.c() || (hc8Var = chatScreen.U0) == null) {
                return;
            }
            x2 x2Var = new x2(sy8Var, 24, chatScreen);
            boolean z2 = hc8Var.e;
            View view7 = hc8Var.b;
            if (!z2) {
                int iC = hc8Var.c();
                MediaKeyboardWidget mediaKeyboardWidgetD3 = hc8Var.d();
                if (mediaKeyboardWidgetD3 != null && (view = mediaKeyboardWidgetD3.getView()) != null) {
                    ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                    if (layoutParams4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams4.height = iC;
                    view.setLayoutParams(layoutParams4);
                }
                ViewGroup.LayoutParams layoutParams5 = view7.getLayoutParams();
                marginLayoutParams = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
                i = marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0;
                View view8 = hc8Var.c;
                view8.setPadding(view8.getPaddingLeft(), view8.getPaddingTop(), view8.getPaddingRight(), iC + i);
                x2Var.invoke();
                return;
            }
            int iC2 = hc8Var.c();
            int iC3 = hc8Var.c();
            ViewGroup.LayoutParams layoutParams6 = view7.getLayoutParams();
            marginLayoutParams = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
            int i7 = iC3 + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
            AnimatorSet animatorSet3 = hc8Var.i;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = new AnimatorSet();
            ValueAnimator valueAnimatorB2 = hc8Var.b(i7);
            MediaKeyboardWidget mediaKeyboardWidgetD4 = hc8Var.d();
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt((mediaKeyboardWidgetD4 == null || (view2 = mediaKeyboardWidgetD4.getView()) == null) ? 0 : view2.getHeight(), iC2);
            valueAnimatorOfInt2.addUpdateListener(new ec8(hc8Var, i2));
            animatorSet4.playTogether(valueAnimatorB2, valueAnimatorOfInt2);
            animatorSet4.setDuration(200L);
            animatorSet4.addListener(new fh(animatorSet4, new yf3(hc8Var, 16, x2Var), 0));
            animatorSet4.start();
            hc8Var.i = animatorSet4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void w0(one.me.chatscreen.ChatScreen r3, defpackage.cla r4, boolean r5) {
        /*
            r3.getClass()
            android.widget.TextView r3 = r4.getTitle()
            float r3 = defpackage.qqe.e(r3)
            int r3 = defpackage.i24.I(r3)
            r0 = 0
            if (r5 == 0) goto L23
            android.widget.TextView r1 = r4.getTitle()
            ecf r1 = defpackage.qqe.a(r1)
            if (r1 == 0) goto L1f
            int r1 = r1.a
            goto L20
        L1f:
            r1 = r0
        L20:
            if (r1 != r3) goto L23
            goto L4c
        L23:
            if (r5 == 0) goto L44
            android.widget.TextView r5 = r4.getTitle()
            ecf r5 = defpackage.qqe.a(r5)
            if (r5 == 0) goto L31
            int r0 = r5.a
        L31:
            if (r0 == r3) goto L44
            ecf r5 = new ecf
            android.content.Context r0 = r4.getContext()
            we1 r1 = new we1
            r2 = 22
            r1.<init>(r2)
            r5.<init>(r0, r3, r1)
            goto L45
        L44:
            r5 = 0
        L45:
            android.widget.TextView r3 = r4.getTitle()
            defpackage.qqe.d(r3, r5)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chatscreen.ChatScreen.w0(one.me.chatscreen.ChatScreen, cla, boolean):void");
    }

    public static final void x0(ChatScreen chatScreen, lr0 lr0Var) {
        chatScreen.getClass();
        int iOrdinal = lr0Var.ordinal();
        String str = chatScreen.L0;
        if (iOrdinal == 0) {
            j03 j03VarB0 = chatScreen.B0();
            if (tpa.f(j03VarB0.c(), "write_controller")) {
                return;
            }
            coc cocVar = new coc(new MessageWriteWidget(str, null), null, null, null, false, -1);
            cocVar.d("write_controller");
            j03VarB0.a.R(cocVar);
            return;
        }
        if (iOrdinal == 1) {
            j03 j03VarB02 = chatScreen.B0();
            if (tpa.f(j03VarB02.c(), "search_bar_controller")) {
                return;
            }
            coc cocVar2 = new coc(new SearchMessageBottomWidget(str, null), null, null, null, false, -1);
            cocVar2.d("search_bar_controller");
            j03VarB02.a.R(cocVar2);
            return;
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        yq2 yq2Var = (yq2) chatScreen.P0().d1.a.getValue();
        if (yq2Var == null) {
            return;
        }
        if (yq2Var == yq2.Y) {
            chatScreen.B0().a();
            return;
        }
        j03 j03VarB03 = chatScreen.B0();
        if (tpa.f(j03VarB03.c(), "unblock_contact_controller_tag")) {
            return;
        }
        coc cocVar3 = new coc(new ChatStatusBottomWidget(str, yq2Var, null), null, null, null, false, -1);
        cocVar3.d("unblock_contact_controller_tag");
        j03VarB03.a.R(cocVar3);
    }

    public final int A0() {
        hc8 hc8Var = this.U0;
        if (hc8Var != null && hc8Var.l) {
            return z0().getMeasuredHeight();
        }
        int measuredHeight = z0().getMeasuredHeight() - z0().getPaddingBottom();
        Integer numX = br7.x(z0());
        return (numX != null ? numX.intValue() : 0) + measuredHeight;
    }

    public final j03 B0() {
        return (j03) this.P0.T0(this, k1[10]);
    }

    public final rg1 C0() {
        return (rg1) this.g1.getValue();
    }

    public final wuc D0() {
        coc cocVar = (coc) x53.q0(getRouter().e());
        Object obj = cocVar != null ? cocVar.a : null;
        uu3 uu3VarB = ((j03) this.R0.T0(this, k1[12])).b();
        if (!tpa.f(obj, this) && (obj instanceof vm9)) {
            return ((vm9) obj).o();
        }
        if (uu3VarB instanceof MediaBarWidget) {
            MediaBarWidget mediaBarWidget = (MediaBarWidget) uu3VarB;
            if (mediaBarWidget.x0().getScrollState() != d6b.a) {
                return mediaBarWidget.o();
            }
        }
        return wuc.CHAT;
    }

    public final w12 E0() {
        return (w12) this.Q0.T0(this, k1[11]);
    }

    public final xz8 F0() {
        return (xz8) this.C0.getValue();
    }

    public final MessageWriteWidget G0() {
        uu3 uu3VarB = B0().b();
        if (uu3VarB instanceof MessageWriteWidget) {
            return (MessageWriteWidget) uu3VarB;
        }
        return null;
    }

    public final g39 H0() {
        return (g39) this.E0.getValue();
    }

    public final znc I0() {
        return (znc) this.N0.T0(this, k1[8]);
    }

    public final hzc J0() {
        return (hzc) this.J0.getValue();
    }

    public final eha K0() {
        return (eha) this.b1.T0(this, k1[19]);
    }

    public final ViewGroup L0() {
        return (ViewGroup) this.e1.T0(this, k1[22]);
    }

    public final j03 M0() {
        return (j03) this.f1.T0(this, k1[23]);
    }

    public final cla N0() {
        return (cla) this.a1.T0(this, k1[18]);
    }

    public final w12 O0() {
        return (w12) this.W0.T0(this, k1[16]);
    }

    public final rq2 P0() {
        return (rq2) this.B0.getValue();
    }

    public final boolean Q0() {
        return tfg.s(getContext()).b && Build.VERSION.SDK_INT >= 30;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    @Override // defpackage.y16
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R(int r17, int r18, android.content.Intent r19) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chatscreen.ChatScreen.R(int, int, android.content.Intent):void");
    }

    public final void R0(CharSequence charSequence) {
        CharSequence charSequence2;
        if (charSequence == null) {
            if (getView() == null) {
                return;
            }
            MessageWriteWidget messageWriteWidgetG0 = G0();
            if ((messageWriteWidgetG0 != null ? messageWriteWidgetG0.getView() : null) == null) {
                return;
            }
        }
        rq2 rq2VarP0 = P0();
        if (charSequence != null) {
            charSequence2 = charSequence;
        } else {
            MessageWriteWidget messageWriteWidgetG02 = G0();
            if (messageWriteWidgetG02 != null) {
                charSequence = messageWriteWidgetG02.q0().getText();
                charSequence2 = charSequence;
            } else {
                charSequence2 = null;
            }
        }
        Long lW = F0().w();
        Long lU = F0().u();
        String name = rq2.class.getName();
        ir6 ir6Var = hm9.m;
        if (ir6Var != null) {
            rq2VarP0.getClass();
            if (ir6Var.c()) {
                ir6Var.d(us7.X, name, "save draft, textLength:" + (charSequence2 != null ? Integer.valueOf(charSequence2.length()) : null), null);
            }
        }
        rq2VarP0.U0.o1(rq2VarP0, rq2.f1[9], j47.S(rq2VarP0.a, ((w9a) rq2VarP0.u()).b(), vx3.b, new up2(rq2VarP0, charSequence2, lW, lU, null)));
    }

    @Override // defpackage.nge
    public final boolean S() {
        return ((se5) ((qe5) this.Z.getValue())).u() && this.A0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void S0(boolean z) {
        bc7[] bc7VarArr = BottomSheetWidget.x0;
        eqe eqeVar = new eqe(yoc.m0);
        Bundle bundle = new Bundle();
        bundle.putBoolean("forward_cancel_stay_on_screen", z);
        lg3 lg3VarA = od2.a(eqeVar, bundle, 4);
        lg3VarA.b(xoc.r0, new eqe(yoc.l0));
        lg3VarA.c(xoc.q0, new eqe(yoc.k0));
        ConfirmationBottomSheet confirmationBottomSheetE = lg3VarA.e();
        confirmationBottomSheetE.setTargetController(this);
        uu3 parentController = this;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        foc focVar = parentController instanceof foc ? (foc) parentController : null;
        znc zncVarT = focVar != null ? focVar.T() : null;
        confirmationBottomSheetE.z0(this);
        if (zncVarT != null) {
            coc cocVar = new coc(confirmationBottomSheetE, null, null, null, false, -1);
            wg0.l(false, cocVar, true, "BottomSheetWidget");
            zncVarT.G(cocVar);
        }
    }

    public final void T0() {
        e52 e52Var = (e52) P0().Y0.a.getValue();
        if (e52Var != null) {
            MessageWriteWidget messageWriteWidgetG0 = G0();
            if (messageWriteWidgetG0 != null) {
                messageWriteWidgetG0.m();
            }
            E0().setVisibility(0);
            boolean zQ0 = Q0();
            bc7[] bc7VarArr = k1;
            if (zQ0) {
                zmf.l(L0(), null);
                zmf.l(z0(), null);
                zmf.l((w12) this.M0.T0(this, bc7VarArr[7]), null);
                zmf.l(O0(), null);
            }
            hc8 hc8Var = this.U0;
            if (hc8Var != null && hc8Var.l) {
                xz8.y(F0(), true, false, 2);
            }
            j03 j03Var = (j03) this.R0.T0(this, bc7VarArr[12]);
            if (!tpa.f(j03Var.c(), "media_bar_controller")) {
                MediaBarWidget mediaBarWidget = new MediaBarWidget(this.L0, e52Var.a, null);
                mediaBarWidget.c1 = this;
                coc cocVar = new coc(mediaBarWidget, null, null, null, false, -1);
                cocVar.d("media_bar_controller");
                j03Var.a.R(cocVar);
            }
            p58 p58Var = (p58) this.D0.getValue();
            Long l = (Long) p58Var.b.invoke();
            if (l == null) {
                p58Var.t0.n(d48.a);
                return;
            }
            vxd vxdVarS = j47.S(p58Var.a, ((w9a) ((kke) p58Var.Y.getValue())).b(), vx3.b, new f58(p58Var, l, null));
            p58Var.G0.o1(p58Var, p58.I0[0], vxdVarS);
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScopeId-IluPPks, reason: from getter */
    public final String getO() {
        return this.L0;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScreenDelegate */
    public final bvc getF0() {
        return this.o;
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        if (C0().g(i)) {
            return;
        }
        rq2 rq2VarP0 = P0();
        rq2VarP0.getClass();
        if (i == t8a.r || i == t8a.s) {
            e52 e52Var = (e52) rq2VarP0.Y0.a.getValue();
            if (e52Var != null) {
                pnf.n(rq2VarP0, ((w9a) rq2VarP0.u()).b(), null, new np2(rq2VarP0, e52Var.a, null), 2);
                return;
            }
            return;
        }
        if (i == xoc.n0 || i == xoc.o0 || i == xoc.m0 || i == xoc.p0) {
            j47.T(rq2VarP0.a, null, null, new jp2(rq2VarP0, i, null), 3);
        } else if (i == xoc.r0) {
            pnf.o(rq2VarP0.b1, new xo2(bundle != null ? bundle.getBoolean("forward_cancel_stay_on_screen") : false));
        }
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget, defpackage.uu3
    public final boolean handleBack() {
        if (getView() != null && N0().b()) {
            g39 g39VarH0 = H0();
            pnf.o(g39VarH0.s0, w29.a);
            return true;
        }
        jac jacVar = (jac) this.K0.getValue();
        if (((Boolean) jacVar.Y.getValue()).booleanValue()) {
            pnf.o(jacVar.c, cac.a);
            return true;
        }
        if (F0().v() != null) {
            S0(false);
            return true;
        }
        MessageWriteWidget messageWriteWidgetG0 = G0();
        CharSequence text = null;
        if (messageWriteWidgetG0 != null && messageWriteWidgetG0.getView() != null) {
            text = messageWriteWidgetG0.q0().getText();
        }
        boolean zHandleBack = super.handleBack();
        if (!zHandleBack) {
            R0(text);
        }
        View view = getView();
        if (view != null) {
            view.requestApplyInsets();
        }
        return zHandleBack;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final void onActivityPaused(Activity activity) {
        ((hw7) this.Y0.getValue()).a(this.Z0);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final void onActivityResumed(Activity activity) {
        if (isAttached()) {
            ((hw7) this.Y0.getValue()).b(this.Z0);
        }
    }

    @Override // defpackage.uu3
    public final void onAttach(View view) {
        super.onAttach(view);
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new qq0(4, this));
        } else if (qqe.c(N0().getTitle())) {
            w0(this, N0(), true);
        }
        getRouter().a(this.s0);
        Bundle bundle = this.j1;
        if (bundle == null) {
            return;
        }
        this.j1 = null;
        onUpdateArgs(getArgs().deepCopy(), bundle);
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget, one.me.sdk.arch.Widget, defpackage.uu3
    public final void onChangeStarted(zu3 zu3Var, av3 av3Var) {
        super.onChangeStarted(zu3Var, av3Var);
        av3 av3Var2 = av3.POP_ENTER;
        je7 je7Var = this.Y0;
        gw7 gw7Var = this.Z0;
        if (av3Var == av3Var2 || av3Var == av3.PUSH_ENTER) {
            ((hw7) je7Var.getValue()).b(gw7Var);
            return;
        }
        if (av3Var == av3.PUSH_EXIT) {
            if (getView() != null) {
                int i = vc7.a;
                if (vc7.b(vc7.c)) {
                    mr0.H(requireActivity());
                }
            }
            J0().q();
            ((hw7) je7Var.getValue()).a(gw7Var);
        }
    }

    @Override // defpackage.uu3
    public final void onContextAvailable(Context context) {
        od2.L(new zn5(P0().e1, new un2(null, this), 5), getLifecycleScope());
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        gn2 gn2Var = new gn2(this, 0);
        pge pgeVar = new pge(getContext());
        pgeVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        gn2Var.invoke(pgeVar);
        return pgeVar;
    }

    @Override // defpackage.uu3
    public final void onDestroy() {
        ((xp7) to2.a.getAccessor().c(xp7.class)).f.k = null;
        super.onDestroy();
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        Drawable background = ((View) this.d1.T0(this, k1[21])).getBackground();
        if (background != null) {
            background.setCallback(null);
        }
        this.i1 = null;
        hc8 hc8Var = this.U0;
        if (hc8Var != null) {
            hc8Var.a();
        }
        this.U0 = null;
        this.Z0.b();
    }

    @Override // defpackage.uu3
    public final void onDetach(View view) {
        super.onDetach(view);
        R0(null);
        getRouter().K(this.s0);
    }

    @Override // defpackage.uu3
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C0().b(i, strArr, iArr);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onUpdateArgs(Bundle bundle, Bundle bundle2) {
        yy8 yy8Var;
        super.onUpdateArgs(bundle, bundle2);
        if (!isAttached()) {
            if (bundle.equals(bundle2)) {
                return;
            }
            this.j1 = bundle2;
            return;
        }
        long[] jArrW = i24.w("forward_msg_ids", bundle2);
        bc7[] bc7VarArr = k1;
        bc7 bc7Var = bc7VarArr[4];
        fs fsVar = this.x0;
        fsVar.b(this, jArrW);
        Long lV = i24.v("forward_attach_id", bundle2);
        bc7 bc7Var2 = bc7VarArr[5];
        fs fsVar2 = this.y0;
        fsVar2.b(this, lV);
        Boolean boolU = i24.u("is_forward_attach", bundle2);
        boolean zBooleanValue = boolU != null ? boolU.booleanValue() : false;
        bc7 bc7Var3 = bc7VarArr[6];
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        fs fsVar3 = this.z0;
        fsVar3.b(this, boolValueOf);
        bc7 bc7Var4 = bc7VarArr[4];
        long[] jArr = (long[]) fsVar.a(this);
        if (jArr != null) {
            Set setN0 = ys.n0(jArr);
            bc7 bc7Var5 = bc7VarArr[5];
            Long l = (Long) fsVar2.a(this);
            bc7 bc7Var6 = bc7VarArr[6];
            yy8Var = new yy8(setN0, l, ((Boolean) fsVar3.a(this)).booleanValue());
        } else {
            yy8Var = null;
        }
        F0().Q0.setValue(yy8Var);
        String string = bundle2.getString(ApiProtocol.PARAM_PAYLOAD);
        if (string != null) {
            rq2 rq2VarP0 = P0();
            rq2VarP0.b = string;
            rq2VarP0.z();
        }
        coc cocVar = (coc) x53.q0(I0().e());
        uu3 uu3Var = cocVar != null ? cocVar.a : null;
        MessagesListWidget messagesListWidget = uu3Var instanceof MessagesListWidget ? (MessagesListWidget) uu3Var : null;
        if (messagesListWidget != null) {
            Bundle bundleDeepCopy = messagesListWidget.getArgs().deepCopy();
            if (bundle2.containsKey("from_forward")) {
                messagesListWidget.getArgs().putBoolean("ARG_SKIP_UNREAD_DECOR", i24.A("from_forward", bundle2));
                messagesListWidget.onUpdateArgs(bundleDeepCopy, messagesListWidget.getArgs());
            }
            if (bundle2.containsKey("message_id")) {
                Bundle args = messagesListWidget.getArgs();
                Object obj = bundle2.get("message_id");
                args.putString("ARG_LOAD_MESSAGE_ID", obj != null ? obj.toString() : null);
                messagesListWidget.onUpdateArgs(bundleDeepCopy, messagesListWidget.getArgs());
                return;
            }
            if (bundle2.containsKey("load_mark")) {
                Bundle args2 = messagesListWidget.getArgs();
                Object obj2 = bundle2.get("load_mark");
                args2.putString("ARG_LOAD_MARK", obj2 != null ? obj2.toString() : null);
                messagesListWidget.onUpdateArgs(bundleDeepCopy, messagesListWidget.getArgs());
            }
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        uy8 uy8Var;
        Continuation continuation = null;
        int i = 3;
        j47.T(getViewLifecycleScope(), null, null, new rn2(null, this), 3);
        bc7[] bc7VarArr = k1;
        znc zncVar = (znc) this.T0.T0(this, bc7VarArr[14]);
        w12 w12Var = (w12) this.S0.T0(this, bc7VarArr[13]);
        w12 w12VarZ0 = z0();
        fn2 fn2Var = new fn2(this, 6);
        boolean zQ0 = Q0();
        pg7 viewLifecycleScope = getViewLifecycleScope();
        p35 p35Var = (p35) F0().B0.a.getValue();
        this.U0 = new hc8(zncVar, w12Var, w12VarZ0, fn2Var, zQ0, viewLifecycleScope, ((p35Var == null || (uy8Var = (uy8) p35Var.a) == null) ? 0 : uy8Var.a) == 2, new fn2(this, 7));
        je7 je7Var = this.I0;
        w7c w7cVar = ((cc8) je7Var.getValue()).Z;
        od2.L(new xk1(new zn5(new t03(w7cVar, 11), new mn2(w7cVar, null, this), 5), 13), getViewLifecycleScope());
        od2.L(new zn5(((cc8) je7Var.getValue()).X, new lq0(2, this, ChatScreen.class, "handleMediaKeyboardEvents", "handleMediaKeyboardEvents(Lone/me/sdk/arch/event/Event;)V", 4, 9), 5), getViewLifecycleScope());
        w7c w7cVar2 = F0().D0;
        od2.L(new xk1(new zn5(new t03(w7cVar2, 11), new on2(w7cVar2, null, this), 5), 14), getViewLifecycleScope());
        w7c w7cVar3 = F0().B0;
        gh7 gh7VarQ = this.lifecycleOwner.Q();
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(new t03(tu0.g(w7cVar3, gh7VarQ, fg7Var), 11), new qn2(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(J0().Z, new jn2(null, this), 5), getViewLifecycleScope());
        j47.T(getViewLifecycleScope(), null, null, new ln2(null, this), 3);
        bc7 bc7Var = bc7VarArr[2];
        fs fsVar = this.v0;
        if (((Boolean) fsVar.a(this)).booleanValue()) {
            hzc hzcVarJ0 = J0();
            bc7 bc7Var2 = bc7VarArr[2];
            hzcVarJ0.r(((Boolean) fsVar.a(this)).booleanValue());
            getArgs().remove("open_search_field");
        }
        od2.L(new zn5(tu0.g(od2.x(new j31(P0().c1, J0().Y, new xh0(i, continuation, 3), 4)), getViewLifecycleOwner().Q(), fg7Var), new tn2(null, this), 5), getViewLifecycleScope());
        hm9.n(v3c.w(this), "onViewCreated: viewstate=" + getViewLifecycleOwner().Q().d);
        od2.L(new zn5(tu0.g(P0().X0, getViewLifecycleOwner().Q(), fg7Var), new bo2(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(P0().Z0, getViewLifecycleOwner().Q(), fg7Var), new co2(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(P0().b1, getViewLifecycleOwner().Q(), fg7.c), new xn2(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(P0().a1, getViewLifecycleOwner().Q(), fg7Var), new do2(null, this), 5), getViewLifecycleScope());
        w7c w7cVar4 = F0().H0;
        od2.L(new xk1(new zn5(new t03(w7cVar4, 11), new ko2(w7cVar4, null, this), 5), 16), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(F0().T0, getViewLifecycleOwner().Q(), fg7Var), new eo2(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((p58) this.D0.getValue()).w0, getViewLifecycleOwner().Q(), fg7Var), new fo2(null, this), 5), getViewLifecycleScope());
        if (P0().v()) {
            od2.L(new zn5(tu0.g(F0().L0, getViewLifecycleOwner().Q(), fg7Var), new go2(null, this), 5), getViewLifecycleScope());
        }
        od2.L(new zn5(tu0.g(H0().t0, getViewLifecycleOwner().Q(), fg7Var), new ho2(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(F0().z0, getViewLifecycleOwner().Q(), fg7Var), new io2(null, this), 5), getViewLifecycleScope());
        znc childRouter = getChildRouter((ViewGroup) this.c1.T0(this, bc7VarArr[20]));
        childRouter.e = 1;
        childRouter.Q(false);
        if (!childRouter.n()) {
            childRouter.R(i24.e(new PinBarsWidget(this.L0, null), null, null));
        }
        od2.L(new zn5(tu0.g(new t03(H0().Z, 11), getViewLifecycleOwner().Q(), fg7Var), new jo2(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(new t03(((zz7) this.H0.getValue()).c, 11), new lq0(2, this, ChatScreen.class, "showAddLinkBottomsheet", "showAddLinkBottomsheet(Lone/me/sdk/messagewrite/markdown/AddLinkState;)V", 4, 10), 5), getViewLifecycleScope());
        je7 je7Var2 = this.K0;
        od2.L(new zn5(tu0.g(((jac) je7Var2.getValue()).b, getViewLifecycleOwner().Q(), fg7Var), new yn2(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((jac) je7Var2.getValue()).t0, getViewLifecycleOwner().Q(), fg7Var), new zn2(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((jac) je7Var2.getValue()).Z, getViewLifecycleOwner().Q(), fg7Var), new ao2(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(new t03(((yce) this.G0.getValue()).D0, 11), new sn2(null, this), 5), getViewLifecycleScope());
        rq2 rq2VarP0 = P0();
        rq2VarP0.getClass();
        hm9.n(rq2.class.getName(), "restore draft");
        rq2VarP0.V0.o1(rq2VarP0, rq2.f1[10], j47.S(rq2VarP0.a, ((w9a) rq2VarP0.u()).b(), vx3.b, new tp2(rq2VarP0, null)));
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final void p0() {
        R0(null);
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final void r0() {
        mr0.G(this);
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final Long t0() {
        return 400L;
    }

    @Override // defpackage.xt3
    public final void y(int i, Bundle bundle) {
        e52 e52Var;
        if (i == xoc.J0) {
            if (bundle != null) {
                long j = bundle.getLong("contact_id");
                C0().l(j, true, new w21(j, 3));
                return;
            }
            return;
        }
        if (i == xoc.H0) {
            K0().d();
            return;
        }
        if (i == xoc.G0) {
            P0().x();
            return;
        }
        if (i == xoc.F0) {
            rq2 rq2VarP0 = P0();
            rq2VarP0.getClass();
            pnf.n(rq2VarP0, null, null, new qq2(rq2VarP0, null), 3);
            return;
        }
        if (i == xoc.E0) {
            if (bundle != null) {
                long j2 = bundle.getLong("chat_server_id");
                vo2.c.P1().b(":settings/folder/by-chat?id=" + j2, null);
                return;
            }
            return;
        }
        if (i != xoc.I0 || (e52Var = (e52) P0().Y0.a.getValue()) == null) {
            return;
        }
        vo2.c.P1().b(":profile/invite?id=" + e52Var.a, null);
    }

    public final void y0() {
        ViewGroup viewGroupL0 = L0();
        int i = 0;
        int i2 = 1;
        if (Q0()) {
            br7.d(viewGroupL0, new x27(i, new yq0(4, 2, true), i2), null);
        }
        w12 w12VarZ0 = z0();
        if (Q0()) {
            br7.d(w12VarZ0, new x27(i, new yq0(4, 2, true), i2), null);
        }
        w12 w12Var = (w12) this.M0.T0(this, k1[7]);
        if (Q0()) {
            br7.d(w12Var, new x27(i, new yq0(1, 2, true), i2), null);
        }
        w12 w12VarO0 = O0();
        if (Q0()) {
            br7.d(w12VarO0, new x27(i, new yq0(4, 2, true), i2), null);
        }
    }

    public final w12 z0() {
        return (w12) this.O0.T0(this, k1[9]);
    }
}
