package defpackage;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes.dex */
public final /* synthetic */ class gn2 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatScreen b;

    public /* synthetic */ gn2(ChatScreen chatScreen, int i) {
        this.a = i;
        this.b = chatScreen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        Activity activityD;
        MessageWriteWidget messageWriteWidgetG0;
        int i = 6;
        int i2 = 4;
        int i3 = 3;
        int i4 = 5;
        int i5 = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        e5f e5fVar = e5f.a;
        int i6 = 0;
        ChatScreen chatScreen = this.b;
        switch (this.a) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) obj;
                bc7[] bc7VarArr = ChatScreen.k1;
                viewGroup.setId(vvb.chat__root_container);
                View view = new View(viewGroup.getContext());
                view.setId(t8a.a);
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                br7.d(view, new x27(5, new yq0(5, 1, true)), null);
                viewGroup.addView(view);
                gn2 gn2Var = new gn2(chatScreen, i5);
                uo2 uo2Var = new uo2(viewGroup.getContext());
                uo2Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                gn2Var.invoke(uo2Var);
                viewGroup.addView(uo2Var);
                w12 w12Var = new w12(viewGroup.getContext());
                w12Var.setId(t8a.i);
                w12Var.setVisibility(8);
                w12Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                viewGroup.addView(w12Var);
                break;
            case 1:
                int iIntValue = ((Integer) obj).intValue();
                bc7[] bc7VarArr2 = ChatScreen.k1;
                g39 g39VarH0 = chatScreen.H0();
                g39VarH0.getClass();
                pnf.o(g39VarH0.s0, new y29(iIntValue));
                break;
            case 2:
                ViewGroup viewGroup2 = (ViewGroup) obj;
                bc7[] bc7VarArr3 = ChatScreen.k1;
                gn2 gn2Var2 = new gn2(chatScreen, i3);
                LinearLayout linearLayout = new LinearLayout(viewGroup2.getContext());
                linearLayout.setId(t8a.h);
                linearLayout.setOrientation(1);
                linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                gn2Var2.invoke(linearLayout);
                viewGroup2.addView(linearLayout);
                View w12Var2 = new w12(viewGroup2.getContext());
                w12Var2.setId(t8a.p);
                w12Var2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                w12Var2.setVisibility(8);
                if (chatScreen.Q0()) {
                    br7.d(w12Var2, new x27(0, new yq0(4, 2, true), 1), null);
                }
                viewGroup2.addView(w12Var2);
                w12 w12Var3 = new w12(viewGroup2.getContext());
                w12Var3.setId(t8a.b);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 80;
                w12Var3.setLayoutParams(layoutParams);
                if (chatScreen.Q0()) {
                    br7.d(w12Var3, new x27(0, new yq0(4, 2, true), 1), null);
                }
                w12Var3.addOnLayoutChangeListener(new i61(i5, chatScreen));
                v3c.y(new br(i3, (Continuation) (objArr == true ? 1 : 0), i2), w12Var3);
                viewGroup2.addView(w12Var3);
                w12 w12Var4 = new w12(viewGroup2.getContext());
                w12Var4.setId(t8a.n);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams2.gravity = 80;
                layoutParams2.bottomMargin = tu0.G(48 * fk4.d().getDisplayMetrics().density);
                w12Var4.setLayoutParams(layoutParams2);
                if (chatScreen.Q0()) {
                    br7.d(w12Var4, new x27(0, new yq0(4, 2, true), 1), null);
                }
                viewGroup2.addView(w12Var4);
                w12 w12Var5 = new w12(viewGroup2.getContext());
                w12Var5.setId(t8a.j);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams3.gravity = 80;
                w12Var5.setLayoutParams(layoutParams3);
                int i7 = vc7.a;
                w12Var5.setTranslationY(vc7.a(w12Var5.getContext()));
                if (chatScreen.Q0()) {
                    br7.d(w12Var5, new x27(0, new yq0(5, 1, true), 1), new gn2(chatScreen, i2));
                }
                viewGroup2.addView(w12Var5);
                br7.d(viewGroup2, chatScreen.Q0() ? x27.c : new x27(0, x27.d.b), null);
                break;
            case 3:
                LinearLayout linearLayout2 = (LinearLayout) obj;
                bc7[] bc7VarArr4 = ChatScreen.k1;
                gn2 gn2Var3 = new gn2(chatScreen, i4);
                FrameLayout frameLayout = new FrameLayout(linearLayout2.getContext());
                frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                br7.e(frameLayout);
                frameLayout.setElevation(10.0f);
                v3c.y(new ro2(i3, objArr2 == true ? 1 : 0, i6), frameLayout);
                gn2Var3.invoke(frameLayout);
                linearLayout2.addView(frameLayout);
                w12 w12VarB = s36.b(linearLayout2.getContext());
                w12VarB.setId(t8a.l);
                w12VarB.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                v3c.y(new mo2(3, null, 0), w12VarB);
                w12VarB.setElevation(10.0f);
                linearLayout2.addView(w12VarB);
                w12 w12Var6 = new w12(linearLayout2.getContext());
                w12Var6.setId(t8a.k);
                w12Var6.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
                if (chatScreen.Q0()) {
                    br7.d(w12Var6, new x27(0, new yq0(1, 2, true), 1), null);
                }
                linearLayout2.addView(w12Var6);
                break;
            case 4:
                hc8 hc8Var = chatScreen.U0;
                if (hc8Var != null && hc8Var.l && hc8Var.g) {
                    int iC = hc8Var.c();
                    View view2 = hc8Var.b;
                    ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    int i8 = iC + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
                    View view3 = hc8Var.c;
                    if (view3.getPaddingBottom() != i8) {
                        hc8Var.g = false;
                        AnimatorSet animatorSet = hc8Var.i;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        view2.setTranslationY(0.0f);
                        view3.setPadding(view3.getPaddingLeft(), view3.getPaddingTop(), view3.getPaddingRight(), i8);
                        break;
                    }
                }
                break;
            case 5:
                ViewGroup viewGroup3 = (ViewGroup) obj;
                bc7[] bc7VarArr5 = ChatScreen.k1;
                cla claVar = new cla(viewGroup3.getContext(), 6);
                claVar.setId(t8a.o);
                claVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                claVar.setForm(uka.c);
                claVar.setTitle("");
                claVar.setSubtitle("");
                claVar.setLeftActions(new kka(new gn2(chatScreen, i)));
                claVar.setTitleClickListener(new fn2(chatScreen, 11));
                viewGroup3.addView(claVar);
                eha ehaVar = new eha(viewGroup3.getContext());
                ehaVar.setId(t8a.m);
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams5.setMarginEnd(tu0.G(12 * fk4.d().getDisplayMetrics().density));
                layoutParams5.gravity = 8388629;
                ehaVar.setLayoutParams(layoutParams5);
                ehaVar.setShouldShowSearchIcon(false);
                ehaVar.setListener(new qo2(chatScreen));
                ehaVar.setSearchHint(z7.B(chatScreen.getContext(), chatScreen.P0().v() ? u8a.k : u8a.r));
                viewGroup3.addView(ehaVar);
                break;
            default:
                bc7[] bc7VarArr6 = ChatScreen.k1;
                if (chatScreen.F0().v() == null) {
                    int i9 = vc7.a;
                    if (vc7.b(vc7.c) && (messageWriteWidgetG0 = chatScreen.G0()) != null) {
                        messageWriteWidgetG0.m();
                    }
                    chatScreen.R0(null);
                    x95 x95Var = chatScreen.P0().c;
                    x95Var.a.f(x95Var);
                    jac jacVar = (jac) chatScreen.K0.getValue();
                    if (!((Boolean) jacVar.Y.getValue()).booleanValue()) {
                        vo2 vo2Var = vo2.c;
                        if (!vo2Var.P1().d() && (activityD = ((haa) vo2Var.P1().a()).f().C().d()) != null) {
                            activityD.finish();
                            break;
                        }
                    } else {
                        pnf.o(jacVar.c, cac.a);
                        break;
                    }
                } else {
                    chatScreen.S0(false);
                    break;
                }
                break;
        }
        return e5fVar;
    }
}
