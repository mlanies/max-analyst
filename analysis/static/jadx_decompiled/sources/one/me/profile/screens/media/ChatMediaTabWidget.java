package one.me.profile.screens.media;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import defpackage.an9;
import defpackage.bc7;
import defpackage.bvc;
import defpackage.cla;
import defpackage.dh2;
import defpackage.dy7;
import defpackage.e11;
import defpackage.eh2;
import defpackage.f9;
import defpackage.fg7;
import defpackage.gh2;
import defpackage.glc;
import defpackage.hh2;
import defpackage.hob;
import defpackage.i24;
import defpackage.ih2;
import defpackage.je7;
import defpackage.k56;
import defpackage.kpa;
import defpackage.nec;
import defpackage.od2;
import defpackage.oec;
import defpackage.q7c;
import defpackage.qg2;
import defpackage.qm0;
import defpackage.s;
import defpackage.s36;
import defpackage.t03;
import defpackage.tu0;
import defpackage.w12;
import defpackage.wea;
import defpackage.wja;
import defpackage.wuc;
import defpackage.x27;
import defpackage.xcb;
import defpackage.xu3;
import defpackage.zn5;
import defpackage.znc;
import defpackage.zr6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import one.me.pinbars.PinBarsWidget;
import one.me.profile.screens.media.ChatMediaTabWidget;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/profile/screens/media/ChatMediaTabWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "(J)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ChatMediaTabWidget extends Widget {
    public static final /* synthetic */ bc7[] w0;
    public final qm0 X;
    public final qm0 Y;
    public final q7c Z;
    public final glc a;
    public final x27 b;
    public final je7 c;
    public final je7 o;
    public final qm0 s0;
    public xu3 t0;
    public final hh2 u0;
    public final qg2 v0;

    static {
        hob hobVar = new hob(ChatMediaTabWidget.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0);
        oec oecVar = nec.a;
        w0 = new bc7[]{hobVar, zr6.e(oecVar, ChatMediaTabWidget.class, "mediaTabs", "getMediaTabs()Lone/me/common/tablayout/OneMeTabLayout;", 0), zr6.f(ChatMediaTabWidget.class, "pinbarsContainer", "getPinbarsContainer()Landroid/view/ViewGroup;", 0, oecVar), zr6.f(ChatMediaTabWidget.class, "mediaViewPager", "getMediaViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0, oecVar)};
    }

    public ChatMediaTabWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new glc(new e11(0, this, ChatMediaTabWidget.class, "getCurrentScreen", "getCurrentScreen()Lone/me/sdk/statistics/screen/Screen;", 0, 4), null, 6);
        this.b = x27.d;
        this.c = xcb.a.getAccessor().d(an9.class);
        this.o = createViewModelLazy(dh2.class, new s(29, new eh2(bundle, 0)));
        final int i = 0;
        this.X = binding(new k56(this) { // from class: fh2
            public final /* synthetic */ ChatMediaTabWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                int i2 = 2;
                ChatMediaTabWidget chatMediaTabWidget = this.b;
                switch (i) {
                    case 0:
                        bc7[] bc7VarArr = ChatMediaTabWidget.w0;
                        cla claVar = new cla(chatMediaTabWidget.getContext(), 6);
                        claVar.setId(wea.p0);
                        claVar.setForm(uka.a);
                        claVar.setLeftActions(new kka(new we1(17)));
                        return claVar;
                    case 1:
                        bc7[] bc7VarArr2 = ChatMediaTabWidget.w0;
                        wja wjaVar = new wja(chatMediaTabWidget.getContext(), null);
                        wjaVar.setId(wea.l0);
                        wjaVar.setTabMode(0);
                        wjaVar.setTabGravity(2);
                        return wjaVar;
                    default:
                        bc7[] bc7VarArr3 = ChatMediaTabWidget.w0;
                        ViewPager2 viewPager2 = new ViewPager2(chatMediaTabWidget.getContext());
                        viewPager2.setId(wea.n0);
                        viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        viewPager2.setOffscreenPageLimit(3);
                        viewPager2.b(new lh0(i2, chatMediaTabWidget));
                        fm9.z(viewPager2);
                        return viewPager2;
                }
            }
        });
        final int i2 = 1;
        this.Y = binding(new k56(this) { // from class: fh2
            public final /* synthetic */ ChatMediaTabWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                int i22 = 2;
                ChatMediaTabWidget chatMediaTabWidget = this.b;
                switch (i2) {
                    case 0:
                        bc7[] bc7VarArr = ChatMediaTabWidget.w0;
                        cla claVar = new cla(chatMediaTabWidget.getContext(), 6);
                        claVar.setId(wea.p0);
                        claVar.setForm(uka.a);
                        claVar.setLeftActions(new kka(new we1(17)));
                        return claVar;
                    case 1:
                        bc7[] bc7VarArr2 = ChatMediaTabWidget.w0;
                        wja wjaVar = new wja(chatMediaTabWidget.getContext(), null);
                        wjaVar.setId(wea.l0);
                        wjaVar.setTabMode(0);
                        wjaVar.setTabGravity(2);
                        return wjaVar;
                    default:
                        bc7[] bc7VarArr3 = ChatMediaTabWidget.w0;
                        ViewPager2 viewPager2 = new ViewPager2(chatMediaTabWidget.getContext());
                        viewPager2.setId(wea.n0);
                        viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        viewPager2.setOffscreenPageLimit(3);
                        viewPager2.b(new lh0(i22, chatMediaTabWidget));
                        fm9.z(viewPager2);
                        return viewPager2;
                }
            }
        });
        this.Z = viewBinding(wea.o0);
        final int i3 = 2;
        this.s0 = binding(new k56(this) { // from class: fh2
            public final /* synthetic */ ChatMediaTabWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                int i22 = 2;
                ChatMediaTabWidget chatMediaTabWidget = this.b;
                switch (i3) {
                    case 0:
                        bc7[] bc7VarArr = ChatMediaTabWidget.w0;
                        cla claVar = new cla(chatMediaTabWidget.getContext(), 6);
                        claVar.setId(wea.p0);
                        claVar.setForm(uka.a);
                        claVar.setLeftActions(new kka(new we1(17)));
                        return claVar;
                    case 1:
                        bc7[] bc7VarArr2 = ChatMediaTabWidget.w0;
                        wja wjaVar = new wja(chatMediaTabWidget.getContext(), null);
                        wjaVar.setId(wea.l0);
                        wjaVar.setTabMode(0);
                        wjaVar.setTabGravity(2);
                        return wjaVar;
                    default:
                        bc7[] bc7VarArr3 = ChatMediaTabWidget.w0;
                        ViewPager2 viewPager2 = new ViewPager2(chatMediaTabWidget.getContext());
                        viewPager2.setId(wea.n0);
                        viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        viewPager2.setOffscreenPageLimit(3);
                        viewPager2.b(new lh0(i22, chatMediaTabWidget));
                        fm9.z(viewPager2);
                        return viewPager2;
                }
            }
        });
        this.u0 = new hh2();
        this.v0 = new qg2(this, bundle.getLong("chat_id"));
    }

    public static final wuc m0(ChatMediaTabWidget chatMediaTabWidget) {
        chatMediaTabWidget.getClass();
        int iOrdinal = ((ih2) ih2.o.get(chatMediaTabWidget.n0().getCurrentItem())).ordinal();
        wuc wucVar = wuc.CHAT_ATTACHMENTS_MEDIA;
        if (iOrdinal == 0) {
            return wucVar;
        }
        if (iOrdinal == 1) {
            return wuc.CHAT_ATTACHMENTS_FILES;
        }
        if (iOrdinal == 2) {
            return wuc.CHAT_ATTACHMENTS_LINKS;
        }
        if (iOrdinal == 3) {
            return wucVar;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getO() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    public final bvc getScreenDelegate() {
        return this.a;
    }

    public final ViewPager2 n0() {
        bc7 bc7Var = w0[3];
        return (ViewPager2) this.s0.getValue();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setId(wea.m0);
        linearLayout.setOrientation(1);
        bc7[] bc7VarArr = w0;
        bc7 bc7Var = bc7VarArr[0];
        linearLayout.addView((cla) this.X.getValue());
        bc7 bc7Var2 = bc7VarArr[1];
        linearLayout.addView((wja) this.Y.getValue());
        w12 w12VarB = s36.b(linearLayout.getContext());
        w12VarB.setId(wea.o0);
        linearLayout.addView(w12VarB);
        linearLayout.addView(n0());
        return linearLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        xu3 xu3Var = this.t0;
        if (xu3Var != null) {
            xu3Var.c();
        }
        this.t0 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        ViewPager2 viewPager2N0 = n0();
        qg2 qg2Var = this.v0;
        viewPager2N0.setAdapter(qg2Var);
        bc7[] bc7VarArr = w0;
        int i = 1;
        bc7 bc7Var = bc7VarArr[1];
        wja wjaVar = (wja) this.Y.getValue();
        ViewPager2 viewPager2N02 = n0();
        hh2 hh2Var = this.u0;
        hh2Var.getClass();
        xu3 xu3Var = new xu3(wjaVar, viewPager2N02, new f9(wjaVar, hh2Var));
        xu3Var.a();
        this.t0 = xu3Var;
        Bundle bundle = null;
        Object[] objArr = 0;
        od2.L(new zn5(tu0.g(new t03(((dh2) this.o.getValue()).c, 11), getViewLifecycleOwner().Q(), fg7.o), new gh2(null, this), 5), getViewLifecycleScope());
        ViewPager2 viewPager2N03 = n0();
        View childAt = viewPager2N03.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setItemAnimator(null);
            recyclerView.setHasFixedSize(true);
        }
        viewPager2N03.e(0, false);
        if (qg2Var.y0.size() > 0) {
            viewPager2N03.measure(View.MeasureSpec.makeMeasureSpec(viewPager2N03.getContext().getResources().getDisplayMetrics().widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(viewPager2N03.getContext().getResources().getDisplayMetrics().heightPixels, 1073741824));
        }
        znc childRouter = getChildRouter((ViewGroup) this.Z.T0(this, bc7VarArr[2]));
        childRouter.e = 1;
        childRouter.Q(false);
        if (childRouter.n()) {
            return;
        }
        PinBarsWidget pinBarsWidget = new PinBarsWidget(bundle, i, objArr == true ? 1 : 0);
        pinBarsWidget.setRetainViewMode(getRetainViewMode());
        childRouter.R(i24.e(pinBarsWidget, null, null));
    }

    public ChatMediaTabWidget(long j) {
        this(dy7.g(new kpa("chat_id", Long.valueOf(j))));
    }
}
