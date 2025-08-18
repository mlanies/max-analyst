package one.me.chats.picker;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.a3;
import defpackage.b3;
import defpackage.bc7;
import defpackage.c3;
import defpackage.cla;
import defpackage.coc;
import defpackage.e28;
import defpackage.fg7;
import defpackage.fk4;
import defpackage.g9a;
import defpackage.hob;
import defpackage.j0e;
import defpackage.j31;
import defpackage.je7;
import defpackage.k56;
import defpackage.nec;
import defpackage.od2;
import defpackage.oec;
import defpackage.oz4;
import defpackage.p8a;
import defpackage.q7c;
import defpackage.qm0;
import defpackage.qza;
import defpackage.s;
import defpackage.sya;
import defpackage.tu0;
import defpackage.tu3;
import defpackage.txa;
import defpackage.v3c;
import defpackage.w12;
import defpackage.x2;
import defpackage.x27;
import defpackage.zn5;
import defpackage.znc;
import defpackage.zr6;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lone/me/chats/picker/AbstractPickerScreen;", "Lqza;", "T", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public abstract class AbstractPickerScreen<T extends qza> extends Widget {
    public static final /* synthetic */ bc7[] s0;
    public final qm0 X;
    public final q7c Y;
    public final q7c Z;
    public final x27 a;
    public final String b;
    public final je7 c;
    public final qm0 o;

    static {
        hob hobVar = new hob(AbstractPickerScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0);
        oec oecVar = nec.a;
        s0 = new bc7[]{hobVar, zr6.e(oecVar, AbstractPickerScreen.class, "chips", "getChips()Lone/me/sdk/uikit/common/views/OneMeContactsChipGroup;", 0), zr6.f(AbstractPickerScreen.class, "mainContainer", "getMainContainer()Landroid/view/ViewGroup;", 0, oecVar), zr6.f(AbstractPickerScreen.class, "pickerWidgetContainer", "getPickerWidgetContainer()Landroid/view/ViewGroup;", 0, oecVar)};
    }

    public AbstractPickerScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = x27.d;
        this.b = "PickerScreen";
        this.c = createViewModelLazy(txa.class, new s(1, new x2(this, 0, bundle)));
        final int i = 0;
        this.o = binding(new k56(this) { // from class: y2
            public final /* synthetic */ AbstractPickerScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                jqe jqeVar;
                AbstractPickerScreen abstractPickerScreen = this.b;
                switch (i) {
                    case 0:
                        bc7[] bc7VarArr = AbstractPickerScreen.s0;
                        return abstractPickerScreen.p0(abstractPickerScreen.getContext());
                    default:
                        bc7[] bc7VarArr2 = AbstractPickerScreen.s0;
                        CharSequence charSequenceB = null;
                        g9a g9aVar = new g9a(abstractPickerScreen.getContext(), null);
                        EditText editText = g9aVar.getEditText();
                        j0e j0eVarS0 = abstractPickerScreen.s0();
                        if (j0eVarS0 != null && (jqeVar = (jqe) ((q0e) j0eVarS0).getValue()) != null) {
                            charSequenceB = jqeVar.b(g9aVar.getContext());
                        }
                        editText.setHint(charSequenceB);
                        g9aVar.setCallback(new ph4(abstractPickerScreen, g9aVar));
                        g9aVar.getEditText().addTextChangedListener(new z2(0, abstractPickerScreen));
                        return g9aVar;
                }
            }
        });
        final int i2 = 1;
        this.X = binding(new k56(this) { // from class: y2
            public final /* synthetic */ AbstractPickerScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                jqe jqeVar;
                AbstractPickerScreen abstractPickerScreen = this.b;
                switch (i2) {
                    case 0:
                        bc7[] bc7VarArr = AbstractPickerScreen.s0;
                        return abstractPickerScreen.p0(abstractPickerScreen.getContext());
                    default:
                        bc7[] bc7VarArr2 = AbstractPickerScreen.s0;
                        CharSequence charSequenceB = null;
                        g9a g9aVar = new g9a(abstractPickerScreen.getContext(), null);
                        EditText editText = g9aVar.getEditText();
                        j0e j0eVarS0 = abstractPickerScreen.s0();
                        if (j0eVarS0 != null && (jqeVar = (jqe) ((q0e) j0eVarS0).getValue()) != null) {
                            charSequenceB = jqeVar.b(g9aVar.getContext());
                        }
                        editText.setHint(charSequenceB);
                        g9aVar.setCallback(new ph4(abstractPickerScreen, g9aVar));
                        g9aVar.getEditText().addTextChangedListener(new z2(0, abstractPickerScreen));
                        return g9aVar;
                }
            }
        });
        this.Y = viewBinding(p8a.c0);
        this.Z = viewBinding(p8a.b0);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public x27 getU0() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScopeId-IluPPks, reason: from getter */
    public final String getO() {
        return this.b;
    }

    public abstract Iterable m0();

    public abstract sya n0();

    public abstract Widget o0(String str);

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setId(p8a.c0);
        linearLayout.addView(u0(), new FrameLayout.LayoutParams(-1, -2));
        if (r0() != null) {
            e28 e28Var = new e28(linearLayout.getContext(), null);
            e28Var.a = -1;
            e28Var.setMaxHeight(tu0.G(100 * fk4.d().getDisplayMetrics().density));
            e28Var.addView(r0(), new LinearLayout.LayoutParams(-1, -2));
            linearLayout.addView(e28Var, new LinearLayout.LayoutParams(-1, -2));
            View view = new View(linearLayout.getContext());
            v3c.y(new a3(3, null, 0), view);
            linearLayout.addView(view, new LinearLayout.LayoutParams(-1, tu0.F(fk4.d().getDisplayMetrics().density * 0.5d)));
        }
        w12 w12Var = new w12(linearLayout.getContext());
        w12Var.setId(p8a.b0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 112;
        linearLayout.addView(w12Var, layoutParams);
        znc childRouter = getChildRouter(w12Var);
        Widget widgetO0 = o0(this.b);
        widgetO0.setRetainViewMode(tu3.b);
        if (!childRouter.n()) {
            childRouter.R(new coc(widgetO0, null, null, null, false, -1));
        }
        Iterator it = m0().iterator();
        while (it.hasNext()) {
            linearLayout.addView((View) it.next());
        }
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.addView(linearLayout);
        return frameLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new j31(oz4.a, v0().X, new c3(this, null, 0)), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(v0().s0, getViewLifecycleOwner().Q(), fg7.o), new b3(null, this), 5), getViewLifecycleScope());
    }

    public abstract cla p0(Context context);

    public abstract qza q0();

    public g9a r0() {
        bc7 bc7Var = s0[1];
        return (g9a) this.X.getValue();
    }

    public abstract j0e s0();

    public final ViewGroup t0() {
        return (ViewGroup) this.Y.T0(this, s0[2]);
    }

    public final cla u0() {
        bc7 bc7Var = s0[0];
        return (cla) this.o.getValue();
    }

    public final txa v0() {
        return (txa) this.c.getValue();
    }

    public abstract Set w0(Bundle bundle);
}
