package one.me.keyboardmedia;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import defpackage.a02;
import defpackage.ay7;
import defpackage.b81;
import defpackage.bc7;
import defpackage.bd7;
import defpackage.cc8;
import defpackage.dy7;
import defpackage.e11;
import defpackage.ed7;
import defpackage.eh7;
import defpackage.fd7;
import defpackage.fk4;
import defpackage.fka;
import defpackage.fm9;
import defpackage.fs;
import defpackage.gw7;
import defpackage.hob;
import defpackage.hp;
import defpackage.i3a;
import defpackage.jca;
import defpackage.je7;
import defpackage.kc8;
import defpackage.kpa;
import defpackage.kre;
import defpackage.kxc;
import defpackage.lc8;
import defpackage.lh0;
import defpackage.lz7;
import defpackage.nec;
import defpackage.nz4;
import defpackage.oec;
import defpackage.q7c;
import defpackage.qg2;
import defpackage.ru3;
import defpackage.suc;
import defpackage.tu0;
import defpackage.u00;
import defpackage.v3c;
import defpackage.vc7;
import defpackage.wj4;
import defpackage.wz7;
import defpackage.xr3;
import defpackage.xu3;
import defpackage.y20;
import defpackage.y53;
import defpackage.y8;
import defpackage.z84;
import defpackage.zr6;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lone/me/keyboardmedia/MediaKeyboardWidget;", "Lone/me/sdk/arch/Widget;", "Lkre;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "", ApiProtocol.PARAM_CHAT_ID, "", "onlyEmoji", "(Ljava/lang/String;JZLz84;)V", "kc8", "keyboard-media_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class MediaKeyboardWidget extends Widget implements kre {
    public static final /* synthetic */ bc7[] C0;
    public ObjectAnimator A0;
    public AnimatorSet B0;
    public final q7c X;
    public final q7c Y;
    public final q7c Z;
    public final fs a;
    public final fs b;
    public final je7 c;
    public gw7 o;
    public final q7c s0;
    public final q7c t0;
    public final q7c u0;
    public xu3 v0;
    public final fd7 w0;
    public qg2 x0;
    public lh0 y0;
    public final EnumMap z0;

    static {
        hob hobVar = new hob(MediaKeyboardWidget.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0);
        oec oecVar = nec.a;
        C0 = new bc7[]{hobVar, zr6.e(oecVar, MediaKeyboardWidget.class, "onlyEmoji", "getOnlyEmoji()Z", 0), zr6.f(MediaKeyboardWidget.class, "bottomPanelView", "getBottomPanelView()Landroid/view/View;", 0, oecVar), zr6.f(MediaKeyboardWidget.class, "keyboardBottomTabs", "getKeyboardBottomTabs()Lone/me/keyboardmedia/tablayout/KeyboardTabLayout;", 0, oecVar), zr6.f(MediaKeyboardWidget.class, "keyboardViewPager", "getKeyboardViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0, oecVar), zr6.f(MediaKeyboardWidget.class, "settingsButton", "getSettingsButton()Landroid/view/View;", 0, oecVar), zr6.f(MediaKeyboardWidget.class, "removeButton", "getRemoveButton()Landroid/view/View;", 0, oecVar), zr6.f(MediaKeyboardWidget.class, "showcaseButton", "getShowcaseButton()Landroid/view/View;", 0, oecVar)};
    }

    public MediaKeyboardWidget(String str, long j, boolean z, z84 z84Var) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str)), new kpa("arg_key_chat_id", Long.valueOf(j)), new kpa("arg_key_only_emoji", Boolean.valueOf(z))));
    }

    public final void m0() {
        if (getView() == null) {
            return;
        }
        List list = (List) this.w0.a;
        int currentItem = o0().getCurrentItem();
        if (currentItem < 0 || currentItem > y53.L(list)) {
            return;
        }
        bd7 bd7Var = (bd7) list.get(currentItem);
        int iOrdinal = bd7Var.ordinal();
        if (iOrdinal == 0) {
            q0(bd7Var, (RecyclerView) o0().findViewById(jca.n));
        } else {
            if (iOrdinal != 1) {
                return;
            }
            q0(bd7Var, (RecyclerView) o0().findViewById(jca.c));
        }
    }

    public final View n0() {
        return (View) this.X.T0(this, C0[2]);
    }

    public final ViewPager2 o0() {
        return (ViewPager2) this.Z.T0(this, C0[4]);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 3;
        final int i2 = 0;
        final int i3 = 1;
        FrameLayout frameLayout = new FrameLayout(getContext());
        Continuation continuation = null;
        v3c.y(new lc8(i, continuation, i3), frameLayout);
        int i4 = vc7.a;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, vc7.a(frameLayout.getContext())));
        ViewPager2 viewPager2 = new ViewPager2(frameLayout.getContext());
        viewPager2.setId(jca.f);
        viewPager2.setUserInputEnabled(false);
        viewPager2.setOverScrollMode(2);
        viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        fm9.z(viewPager2);
        frameLayout.addView(viewPager2);
        FrameLayout frameLayout2 = new FrameLayout(frameLayout.getContext());
        frameLayout2.setId(jca.a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, tu0.G(48 * fk4.d().getDisplayMetrics().density));
        layoutParams.gravity = 80;
        frameLayout2.setLayoutParams(layoutParams);
        v3c.y(new lc8(i, continuation, i2), frameLayout2);
        frameLayout2.setClickable(true);
        View view = new View(frameLayout2.getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, tu0.F(fk4.d().getDisplayMetrics().density * 0.5d));
        layoutParams2.gravity = 48;
        view.setLayoutParams(layoutParams2);
        v3c.y(new xr3(i, continuation, i3), view);
        frameLayout2.addView(view);
        int iG = tu0.G(28 * fk4.d().getDisplayMetrics().density);
        View appCompatImageView = new AppCompatImageView(frameLayout2.getContext(), null);
        appCompatImageView.setId(jca.j);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iG, iG);
        layoutParams3.gravity = 8388627;
        float f = 12;
        layoutParams3.leftMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        appCompatImageView.setLayoutParams(layoutParams3);
        appCompatImageView.setPadding(4, 4, 4, 4);
        v3c.y(new a02(i, continuation, i3), appCompatImageView);
        tu0.K(appCompatImageView, 300L, new y20(4));
        frameLayout2.addView(appCompatImageView);
        View appCompatImageView2 = new AppCompatImageView(frameLayout2.getContext(), null);
        appCompatImageView2.setId(jca.k);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(iG, iG);
        layoutParams4.gravity = 8388629;
        layoutParams4.rightMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        appCompatImageView2.setLayoutParams(layoutParams4);
        appCompatImageView2.setPadding(4, 4, 4, 4);
        v3c.y(new a02(i, continuation, 2), appCompatImageView2);
        tu0.K(appCompatImageView2, 300L, new View.OnClickListener(this) { // from class: ic8
            public final /* synthetic */ MediaKeyboardWidget b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MediaKeyboardWidget mediaKeyboardWidget = this.b;
                switch (i2) {
                    case 0:
                        bc7[] bc7VarArr = MediaKeyboardWidget.C0;
                        sc7 sc7Var = sc7.c;
                        mediaKeyboardWidget.getClass();
                        bc7 bc7Var = MediaKeyboardWidget.C0[0];
                        long jLongValue = ((Number) mediaKeyboardWidget.a.a(mediaKeyboardWidget)).longValue();
                        sc7Var.P1().b(":stickers/showcase?chat_id=" + jLongValue, null);
                        break;
                    default:
                        bc7[] bc7VarArr2 = MediaKeyboardWidget.C0;
                        View view3 = mediaKeyboardWidget.getView();
                        if (view3 != null) {
                            pag.F(view3, mi6.KEYBOARD_TAP);
                        }
                        pnf.o(((cc8) mediaKeyboardWidget.c.getValue()).X, vb8.a);
                        break;
                }
            }
        });
        frameLayout2.addView(appCompatImageView2);
        View appCompatImageView3 = new AppCompatImageView(frameLayout2.getContext(), null);
        appCompatImageView3.setId(jca.i);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(iG, iG);
        layoutParams5.gravity = 8388629;
        layoutParams5.rightMargin = tu0.G(f * fk4.d().getDisplayMetrics().density);
        appCompatImageView3.setLayoutParams(layoutParams5);
        appCompatImageView3.setPadding(4, 4, 4, 4);
        v3c.y(new a02(i, continuation, i), appCompatImageView3);
        appCompatImageView3.setOnClickListener(new View.OnClickListener(this) { // from class: ic8
            public final /* synthetic */ MediaKeyboardWidget b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MediaKeyboardWidget mediaKeyboardWidget = this.b;
                switch (i3) {
                    case 0:
                        bc7[] bc7VarArr = MediaKeyboardWidget.C0;
                        sc7 sc7Var = sc7.c;
                        mediaKeyboardWidget.getClass();
                        bc7 bc7Var = MediaKeyboardWidget.C0[0];
                        long jLongValue = ((Number) mediaKeyboardWidget.a.a(mediaKeyboardWidget)).longValue();
                        sc7Var.P1().b(":stickers/showcase?chat_id=" + jLongValue, null);
                        break;
                    default:
                        bc7[] bc7VarArr2 = MediaKeyboardWidget.C0;
                        View view3 = mediaKeyboardWidget.getView();
                        if (view3 != null) {
                            pag.F(view3, mi6.KEYBOARD_TAP);
                        }
                        pnf.o(((cc8) mediaKeyboardWidget.c.getValue()).X, vb8.a);
                        break;
                }
            }
        });
        frameLayout2.addView(appCompatImageView3);
        ed7 ed7Var = new ed7(frameLayout2.getContext(), null);
        ed7Var.setId(jca.p);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams6.gravity = 17;
        int iG2 = tu0.G(8 * fk4.d().getDisplayMetrics().density);
        ed7Var.setPadding(ed7Var.getPaddingLeft(), iG2, ed7Var.getPaddingRight(), iG2);
        ed7Var.setLayoutParams(layoutParams6);
        ed7Var.setTabMode(0);
        frameLayout2.addView(ed7Var);
        frameLayout.addView(frameLayout2);
        return frameLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        cc8 cc8Var = (cc8) this.c.getValue();
        int currentItem = o0().getCurrentItem();
        List list = (List) this.w0.a;
        cc8Var.getClass();
        if (currentItem >= 0 && currentItem < list.size()) {
            bd7 bd7Var = (bd7) list.get(currentItem);
            ((kxc) ((hp) cc8Var.c.getValue())).l("app.last.media_keyboard.page.id", Long.valueOf(zr6.c(bd7Var.b)));
        }
        ObjectAnimator objectAnimator = this.A0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.A0 = null;
        AnimatorSet animatorSet = this.B0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.B0 = null;
        xu3 xu3Var = this.v0;
        if (xu3Var != null) {
            xu3Var.c();
        }
        this.v0 = null;
        lh0 lh0Var = this.y0;
        if (lh0Var != null) {
            o0().g(lh0Var);
        }
        this.y0 = null;
        this.z0.clear();
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        ((ed7) this.Y.T0(this, C0[3])).onThemeChanged(fkaVar);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        List listSingletonList;
        int i = 1;
        gw7 gw7Var = this.o;
        bc7[] bc7VarArr = C0;
        bc7 bc7Var = bc7VarArr[0];
        long jLongValue = ((Number) this.a.a(this)).longValue();
        Object objV = ay7.v(getArgs(), Widget.ARG_SCOPE_ID, suc.class);
        if (objV == null) {
            throw new IllegalArgumentException(zr6.i("No value passed for key arg_key_scope_id of type ", suc.class.getSimpleName(), " in bundle").toString());
        }
        this.x0 = new qg2(this, gw7Var, jLongValue, ((suc) ((Parcelable) objV)).a);
        o0().setAdapter(this.x0);
        ViewPager2 viewPager2O0 = o0();
        lh0 lh0Var = new lh0(i, this);
        this.y0 = lh0Var;
        viewPager2O0.b(lh0Var);
        ed7 ed7Var = (ed7) this.Y.T0(this, bc7VarArr[3]);
        ViewPager2 viewPager2O02 = o0();
        fd7 fd7Var = this.w0;
        fd7Var.getClass();
        xu3 xu3Var = new xu3(ed7Var, viewPager2O02, new u00(ed7Var, fd7Var, viewPager2O02, 12));
        xu3Var.a();
        this.v0 = xu3Var;
        i3a onBackPressedDispatcher = getOnBackPressedDispatcher();
        if (onBackPressedDispatcher != null) {
            eh7 eh7Var = this.lifecycleOwner;
            ru3 ru3Var = new ru3(!p0(), new wz7(i, this));
            if (eh7Var != null) {
                onBackPressedDispatcher.a(eh7Var, ru3Var);
            } else {
                onBackPressedDispatcher.b(ru3Var);
            }
        }
        if (p0()) {
            listSingletonList = Collections.singletonList(bd7.Z);
        } else {
            bd7.o.getClass();
            listSingletonList = bd7.X;
        }
        fd7Var.a = listSingletonList;
        qg2 qg2Var = this.x0;
        if (qg2Var != null) {
            if (qg2Var.y0.isEmpty() && (!listSingletonList.isEmpty())) {
                qg2Var.y0 = listSingletonList;
                qg2Var.p(0, listSingletonList.size());
            } else {
                wj4 wj4VarE = lz7.e(new b81(2, qg2Var.y0, listSingletonList));
                qg2Var.y0 = listSingletonList;
                wj4VarE.a(new y8(qg2Var));
            }
        }
        ViewPager2 viewPager2O03 = o0();
        View childAt = viewPager2O03.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setItemAnimator(null);
            recyclerView.setHasFixedSize(true);
        }
        qg2 qg2Var2 = this.x0;
        if ((qg2Var2 != null ? qg2Var2.y0.size() : 0) > 0) {
            ((View) this.t0.T0(this, bc7VarArr[6])).setVisibility(p0() ? 0 : 8);
            ((View) this.s0.T0(this, bc7VarArr[5])).setVisibility(p0() ^ true ? 0 : 8);
            ((View) this.u0.T0(this, bc7VarArr[7])).setVisibility(p0() ^ true ? 0 : 8);
            cc8 cc8Var = (cc8) this.c.getValue();
            cc8Var.getClass();
            Iterator it = listSingletonList.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else if (zr6.c(((bd7) it.next()).b) == ((kxc) ((hp) cc8Var.c.getValue())).g.getLong("app.last.media_keyboard.page.id", 0L)) {
                    break;
                } else {
                    i2++;
                }
            }
            viewPager2O03.e(i2 >= 0 ? i2 : 0, true);
            int i3 = vc7.a;
            viewPager2O03.measure(View.MeasureSpec.makeMeasureSpec(viewPager2O03.getContext().getResources().getDisplayMetrics().widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(vc7.a(viewPager2O03.getContext()), 1073741824));
            m0();
        }
    }

    public final boolean p0() {
        bc7 bc7Var = C0[1];
        return ((Boolean) this.b.a(this)).booleanValue();
    }

    public final void q0(bd7 bd7Var, RecyclerView recyclerView) {
        EnumMap enumMap = this.z0;
        if (enumMap.containsKey(bd7Var) || recyclerView == null) {
            return;
        }
        kc8 kc8Var = new kc8(getContext(), new e11(0, this, MediaKeyboardWidget.class, "showBottomPanel", "showBottomPanel()V", 0, 27), new e11(0, this, MediaKeyboardWidget.class, "hideBottomPanel", "hideBottomPanel()V", 0, 28));
        recyclerView.m(kc8Var);
        enumMap.put((EnumMap) bd7Var, (bd7) kc8Var);
    }

    public MediaKeyboardWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new fs(Long.class, 0L, "arg_key_chat_id");
        this.b = new fs(Boolean.class, Boolean.FALSE, "arg_key_only_emoji");
        Object objV = ay7.v(bundle, Widget.ARG_SCOPE_ID, suc.class);
        if (objV != null) {
            this.c = m41getSharedViewModelcp94BC8(((suc) ((Parcelable) objV)).a, cc8.class, null);
            this.X = viewBinding(jca.a);
            this.Y = viewBinding(jca.p);
            this.Z = viewBinding(jca.f);
            this.s0 = viewBinding(jca.j);
            this.t0 = viewBinding(jca.i);
            this.u0 = viewBinding(jca.k);
            fd7 fd7Var = new fd7();
            fd7Var.a = nz4.a;
            this.w0 = fd7Var;
            this.z0 = new EnumMap(bd7.class);
            return;
        }
        throw new IllegalArgumentException(zr6.i("No value passed for key arg_key_scope_id of type ", suc.class.getSimpleName(), " in bundle").toString());
    }

    public /* synthetic */ MediaKeyboardWidget(String str, long j, boolean z, int i, z84 z84Var) {
        this(str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? false : z, null);
    }
}
