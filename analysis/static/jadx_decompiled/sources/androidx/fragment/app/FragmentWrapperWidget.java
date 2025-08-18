package androidx.fragment.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.av3;
import defpackage.bc7;
import defpackage.coc;
import defpackage.f16;
import defpackage.fs;
import defpackage.he0;
import defpackage.im;
import defpackage.n16;
import defpackage.nec;
import defpackage.oi9;
import defpackage.rh4;
import defpackage.x27;
import defpackage.y16;
import defpackage.z84;
import defpackage.zu3;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.ok.messages.location.FrgLocationMap;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B9\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/fragment/app/FragmentWrapperWidget;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "", "fragmentId", "Ljava/lang/Class;", "Landroidx/fragment/app/a;", "fragmentClass", "", "fragmentTag", "Landroid/os/Bundle;", "args", "(ILjava/lang/Class;Ljava/lang/String;Landroid/os/Bundle;)V", "arch_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class FragmentWrapperWidget extends Widget {
    public static final /* synthetic */ bc7[] X = {new oi9(FragmentWrapperWidget.class, "fragmentId", "getFragmentId()I"), rh4.g(nec.a, FragmentWrapperWidget.class, "fragmentClass", "getFragmentClass()Ljava/lang/String;"), new oi9(FragmentWrapperWidget.class, "fragmentTag", "getFragmentTag()Ljava/lang/String;"), new oi9(FragmentWrapperWidget.class, "fragmentArgs", "getFragmentArgs()Landroid/os/Bundle;")};
    public final fs a;
    public final fs b;
    public final fs c;
    public final fs o;

    public FragmentWrapperWidget() {
        super(null, 0, 3, null);
        this.a = new fs(Integer.class, "widget:fragment:id");
        this.b = new fs(String.class, ":widget:fragment:class");
        this.c = new fs(String.class, "widget:fragment:tag");
        this.o = new fs(Bundle.class, "widget:fragment:args");
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig */
    public final x27 getC() {
        x27 x27Var = x27.c;
        return x27.d;
    }

    public final n16 m0() {
        Activity activity = getActivity();
        im imVar = activity instanceof im ? (im) activity : null;
        if (imVar != null) {
            return imVar.S();
        }
        return null;
    }

    public final a n0() {
        n16 n16VarM0 = m0();
        if (n16VarM0 == null) {
            return null;
        }
        bc7 bc7Var = X[0];
        return n16VarM0.D(((Number) this.a.a(this)).intValue());
    }

    @Override // defpackage.uu3
    public final void onAttach(View view) {
        a aVarN0 = n0();
        if (aVarN0 != null) {
            aVarN0.u0(getContext());
        }
    }

    @Override // defpackage.uu3
    public final void onChangeEnded(zu3 zu3Var, av3 av3Var) {
        n16 n16VarM0;
        a aVarN0;
        if (av3Var.b || (n16VarM0 = m0()) == null || (aVarN0 = n0()) == null) {
            return;
        }
        he0 he0Var = new he0(n16VarM0);
        he0Var.h(aVarN0);
        he0Var.d(true);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object objPrevious;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        bc7[] bc7VarArr = X;
        bc7 bc7Var = bc7VarArr[0];
        frameLayout.setId(((Number) this.a.a(this)).intValue());
        n16 n16VarM0 = m0();
        if (n16VarM0 == null) {
            return frameLayout;
        }
        a aVarD = n16VarM0.D(frameLayout.getId());
        bc7 bc7Var2 = bc7VarArr[1];
        String str = (String) this.b.a(this);
        if (aVarD == null) {
            f16 f16VarJ = n16VarM0.J();
            frameLayout.getContext().getClassLoader();
            aVarD = f16VarJ.a(str);
            int i = aVarD.J0;
            aVarD.J0 = i;
            aVarD.K0 = i;
            aVarD.L0 = aVarD.L0;
            aVarD.F0 = n16VarM0;
            aVarD.G0 = n16VarM0.w;
            bc7 bc7Var3 = bc7VarArr[3];
            aVarD.X0((Bundle) this.o.a(this));
            frameLayout.getContext();
            aVarD.F0(null, bundle);
            he0 he0Var = new he0(n16VarM0);
            he0Var.o = true;
            bc7 bc7Var4 = bc7VarArr[2];
            String str2 = (String) this.c.a(this);
            aVarD.T0 = frameLayout;
            aVarD.B0 = true;
            he0Var.f(frameLayout.getId(), aVarD, str2, 1);
            if (he0Var.g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            he0Var.q.B(he0Var, true);
        }
        FrgLocationMap frgLocationMap = aVarD instanceof FrgLocationMap ? (FrgLocationMap) aVarD : null;
        if (frgLocationMap != null) {
            ArrayList arrayListE = getRouter().e();
            ListIterator listIterator = arrayListE.listIterator(arrayListE.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                if (((coc) objPrevious).a instanceof y16) {
                    break;
                }
            }
            coc cocVar = (coc) objPrevious;
            Object obj = cocVar != null ? cocVar.a : null;
            frgLocationMap.B1 = obj instanceof y16 ? (y16) obj : null;
        }
        View view = aVarD.U0;
        if (view != null && view.getParent() == null) {
            aVarD.T0 = frameLayout;
            e eVarG = n16VarM0.g(aVarD);
            eVarG.b();
            eVarG.k();
        }
        return frameLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroy() {
        a aVarN0 = n0();
        if (aVarN0 != null) {
            aVarN0.y0();
        }
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        a aVarN0 = n0();
        if (aVarN0 != null) {
            aVarN0.z0();
        }
    }

    @Override // defpackage.uu3
    public final void onDetach(View view) {
        a aVarN0 = n0();
        if (aVarN0 != null) {
            aVarN0.A0();
        }
    }

    public /* synthetic */ FragmentWrapperWidget(int i, Class cls, String str, Bundle bundle, int i2, z84 z84Var) {
        this(i, cls, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : bundle);
    }

    public FragmentWrapperWidget(int i, Class<? extends a> cls, String str, Bundle bundle) {
        this();
        bc7[] bc7VarArr = X;
        bc7 bc7Var = bc7VarArr[0];
        this.a.b(this, Integer.valueOf(i));
        String name = cls.getName();
        bc7 bc7Var2 = bc7VarArr[1];
        this.b.b(this, name);
        bc7 bc7Var3 = bc7VarArr[2];
        this.c.b(this, str);
        bc7 bc7Var4 = bc7VarArr[3];
        this.o.b(this, bundle);
    }
}
