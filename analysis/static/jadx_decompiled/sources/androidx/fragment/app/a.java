package androidx.fragment.app;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetUserVisibleHintViolation;
import defpackage.au1;
import defpackage.br7;
import defpackage.ci9;
import defpackage.dd4;
import defpackage.eh7;
import defpackage.eyb;
import defpackage.fg7;
import defpackage.gh7;
import defpackage.i16;
import defpackage.isc;
import defpackage.jsc;
import defpackage.mm;
import defpackage.n16;
import defpackage.pi6;
import defpackage.re;
import defpackage.rh4;
import defpackage.s5c;
import defpackage.t16;
import defpackage.td;
import defpackage.u06;
import defpackage.u16;
import defpackage.unf;
import defpackage.v06;
import defpackage.vnf;
import defpackage.w06;
import defpackage.wh9;
import defpackage.wmd;
import defpackage.x16;
import defpackage.xnf;
import defpackage.ynf;
import defpackage.z06;
import defpackage.z7;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class a implements ComponentCallbacks, View.OnCreateContextMenuListener, eh7, ynf, pi6, isc {
    public static final Object k1 = new Object();
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public int E0;
    public c F0;
    public z06 G0;
    public a I0;
    public int J0;
    public int K0;
    public String L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public boolean S0;
    public ViewGroup T0;
    public View U0;
    public boolean V0;
    public Boolean X;
    public w06 X0;
    public boolean Y0;
    public Bundle Z;
    public LayoutInflater Z0;
    public boolean a1;
    public Bundle b;
    public String b1;
    public SparseArray c;
    public fg7 c1;
    public gh7 d1;
    public x16 e1;
    public final ci9 f1;
    public jsc g1;
    public td h1;
    public final ArrayList i1;
    public final u06 j1;
    public Bundle o;
    public a s0;
    public int u0;
    public boolean w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;
    public int a = -1;
    public String Y = UUID.randomUUID().toString();
    public String t0 = null;
    public Boolean v0 = null;
    public n16 H0 = new n16();
    public boolean R0 = true;
    public boolean W0 = true;

    public a() {
        new re(23, this);
        this.c1 = fg7.X;
        this.f1 = new ci9();
        new AtomicInteger();
        this.i1 = new ArrayList();
        this.j1 = new u06(this);
        m0();
    }

    public void A0() {
        this.S0 = true;
    }

    public LayoutInflater C0(Bundle bundle) {
        z06 z06Var = this.G0;
        if (z06Var == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        b bVar = z06Var.x0;
        LayoutInflater layoutInflaterCloneInContext = bVar.getLayoutInflater().cloneInContext(bVar);
        layoutInflaterCloneInContext.setFactory2(this.H0.f);
        return layoutInflaterCloneInContext;
    }

    public void D0(boolean z) {
    }

    public void E0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.S0 = true;
    }

    public final void F0(AttributeSet attributeSet, Bundle bundle) {
        this.S0 = true;
        z06 z06Var = this.G0;
        Activity activity = z06Var == null ? null : z06Var.t0;
        if (activity != null) {
            this.S0 = false;
            E0(activity, attributeSet, bundle);
        }
    }

    public boolean G0(MenuItem menuItem) {
        return false;
    }

    public void H0() {
        this.S0 = true;
    }

    public void I0(Menu menu) {
    }

    public void J0(int i, String[] strArr, int[] iArr) {
    }

    public void K0() {
        this.S0 = true;
    }

    public void L0(Bundle bundle) {
    }

    public void M0() {
        this.S0 = true;
    }

    public void N0() {
        this.S0 = true;
    }

    public void O0(View view, Bundle bundle) {
    }

    public void P0(Bundle bundle) {
        this.S0 = true;
    }

    @Override // defpackage.eh7
    public final gh7 Q() {
        return this.d1;
    }

    public void Q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.H0.S();
        this.D0 = true;
        this.e1 = new x16(this, w(), new dd4(26, this));
        View viewX0 = x0(layoutInflater, viewGroup, bundle);
        this.U0 = viewX0;
        if (viewX0 == null) {
            if (this.e1.X != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.e1 = null;
            return;
        }
        this.e1.b();
        if (Log.isLoggable("FragmentManager", 3)) {
            Objects.toString(this.U0);
            toString();
        }
        s5c.Z(this.U0, this.e1);
        this.U0.setTag(eyb.view_tree_view_model_store_owner, this.e1);
        wmd.G(this.U0, this.e1);
        this.f1.k(this.e1);
    }

    public final LayoutInflater R0() {
        LayoutInflater layoutInflaterC0 = C0(null);
        this.Z0 = layoutInflaterC0;
        return layoutInflaterC0;
    }

    public final b S0() {
        b bVarB0 = b0();
        if (bVarB0 != null) {
            return bVarB0;
        }
        throw new IllegalStateException(rh4.i("Fragment ", this, " not attached to an activity."));
    }

    public final Bundle T0() {
        Bundle bundle = this.Z;
        if (bundle != null) {
            return bundle;
        }
        throw new IllegalStateException(rh4.i("Fragment ", this, " does not have any arguments."));
    }

    public final Context U0() {
        Context contextD0 = d0();
        if (contextD0 != null) {
            return contextD0;
        }
        throw new IllegalStateException(rh4.i("Fragment ", this, " not attached to a context."));
    }

    public br7 V() {
        return new v06(this);
    }

    public final View V0() {
        View viewK0 = k0();
        if (viewK0 != null) {
            return viewK0;
        }
        throw new IllegalStateException(rh4.i("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public final void W0(int i, int i2, int i3, int i4) {
        if (this.X0 == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        a0().b = i;
        a0().c = i2;
        a0().d = i3;
        a0().e = i4;
    }

    public void X0(Bundle bundle) {
        c cVar = this.F0;
        if (cVar != null) {
            if (cVar == null ? false : cVar.Q()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.Z = bundle;
    }

    public final void Y0(boolean z) {
        if (!this.Q0) {
            this.Q0 = true;
            if (!o0() || p0()) {
                return;
            }
            this.G0.x0.invalidateOptionsMenu();
        }
    }

    public void Z(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.J0));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.K0));
        printWriter.print(" mTag=");
        printWriter.println(this.L0);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.a);
        printWriter.print(" mWho=");
        printWriter.print(this.Y);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.E0);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.w0);
        printWriter.print(" mRemoving=");
        printWriter.print(this.x0);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.z0);
        printWriter.print(" mInLayout=");
        printWriter.println(this.A0);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.M0);
        printWriter.print(" mDetached=");
        printWriter.print(this.N0);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.R0);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.Q0);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.O0);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.W0);
        if (this.F0 != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.F0);
        }
        if (this.G0 != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.G0);
        }
        if (this.I0 != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.I0);
        }
        if (this.Z != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.Z);
        }
        if (this.b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.b);
        }
        if (this.c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.c);
        }
        if (this.o != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.o);
        }
        a aVarI0 = i0(false);
        if (aVarI0 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(aVarI0);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.u0);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        w06 w06Var = this.X0;
        printWriter.println(w06Var == null ? false : w06Var.a);
        w06 w06Var2 = this.X0;
        if ((w06Var2 == null ? 0 : w06Var2.b) != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            w06 w06Var3 = this.X0;
            printWriter.println(w06Var3 == null ? 0 : w06Var3.b);
        }
        w06 w06Var4 = this.X0;
        if ((w06Var4 == null ? 0 : w06Var4.c) != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            w06 w06Var5 = this.X0;
            printWriter.println(w06Var5 == null ? 0 : w06Var5.c);
        }
        w06 w06Var6 = this.X0;
        if ((w06Var6 == null ? 0 : w06Var6.d) != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            w06 w06Var7 = this.X0;
            printWriter.println(w06Var7 == null ? 0 : w06Var7.d);
        }
        w06 w06Var8 = this.X0;
        if ((w06Var8 == null ? 0 : w06Var8.e) != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            w06 w06Var9 = this.X0;
            printWriter.println(w06Var9 != null ? w06Var9.e : 0);
        }
        if (this.T0 != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.T0);
        }
        if (this.U0 != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.U0);
        }
        if (d0() != null) {
            new androidx.loader.app.b(this, w()).a(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.H0 + ":");
        this.H0.w(au1.g(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final void Z0(boolean z) {
        if (this.R0 != z) {
            this.R0 = z;
            if (this.Q0 && o0() && !p0()) {
                this.G0.x0.invalidateOptionsMenu();
            }
        }
    }

    public final w06 a0() {
        if (this.X0 == null) {
            w06 w06Var = new w06();
            Object obj = k1;
            w06Var.g = obj;
            w06Var.h = obj;
            w06Var.i = obj;
            w06Var.j = 1.0f;
            w06Var.k = null;
            this.X0 = w06Var;
        }
        return this.X0;
    }

    public final void a1() {
        t16 t16Var = u16.a;
        u16.b(new SetRetainInstanceUsageViolation(this, "Attempting to set retain instance for fragment " + this));
        u16.a(this).getClass();
        this.O0 = true;
        c cVar = this.F0;
        if (cVar != null) {
            cVar.O.e(this);
        } else {
            this.P0 = true;
        }
    }

    public final b b0() {
        z06 z06Var = this.G0;
        if (z06Var == null) {
            return null;
        }
        return (b) z06Var.t0;
    }

    public final void b1(int i, a aVar) {
        if (aVar != null) {
            t16 t16Var = u16.a;
            u16.b(new SetTargetFragmentUsageViolation(this, "Attempting to set target fragment " + aVar + " with request code " + i + " for fragment " + this));
            u16.a(this).getClass();
        }
        c cVar = this.F0;
        c cVar2 = aVar != null ? aVar.F0 : null;
        if (cVar != null && cVar2 != null && cVar != cVar2) {
            throw new IllegalArgumentException(rh4.i("Fragment ", aVar, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (a aVarI0 = aVar; aVarI0 != null; aVarI0 = aVarI0.i0(false)) {
            if (super.equals(this)) {
                throw new IllegalArgumentException("Setting " + aVar + " as the target of " + this + " would create a target cycle");
            }
        }
        if (aVar == null) {
            this.t0 = null;
            this.s0 = null;
        } else if (this.F0 == null || aVar.F0 == null) {
            this.t0 = null;
            this.s0 = aVar;
        } else {
            this.t0 = aVar.Y;
            this.s0 = null;
        }
        this.u0 = i;
    }

    public final c c0() {
        if (this.G0 != null) {
            return this.H0;
        }
        throw new IllegalStateException(rh4.i("Fragment ", this, " has not been attached yet."));
    }

    public void c1(boolean z) {
        t16 t16Var = u16.a;
        u16.b(new SetUserVisibleHintViolation(this, "Attempting to set user visible hint to " + z + " for fragment " + this));
        u16.a(this).getClass();
        boolean z2 = false;
        if (!this.W0 && z && this.a < 5 && this.F0 != null && o0() && this.a1) {
            c cVar = this.F0;
            e eVarG = cVar.g(this);
            a aVar = eVarG.c;
            if (aVar.V0) {
                if (cVar.b) {
                    cVar.K = true;
                } else {
                    aVar.V0 = false;
                    eVarG.k();
                }
            }
        }
        this.W0 = z;
        if (this.a < 5 && !z) {
            z2 = true;
        }
        this.V0 = z2;
        if (this.b != null) {
            this.X = Boolean.valueOf(z);
        }
    }

    public final Context d0() {
        z06 z06Var = this.G0;
        if (z06Var == null) {
            return null;
        }
        return z06Var.u0;
    }

    public final void d1(Intent intent, int i, Bundle bundle) {
        if (this.G0 == null) {
            throw new IllegalStateException(rh4.i("Fragment ", this, " not attached to Activity"));
        }
        c cVarF0 = f0();
        if (cVarF0.C != null) {
            cVarF0.F.addLast(new i16(this.Y, i));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            cVarF0.C.C(intent);
            return;
        }
        z06 z06Var = cVarF0.w;
        if (i == -1) {
            z06Var.u0.startActivity(intent, bundle);
        } else {
            z06Var.getClass();
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host".toString());
        }
    }

    public final int e0() {
        fg7 fg7Var = this.c1;
        return (fg7Var == fg7.b || this.I0 == null) ? fg7Var.ordinal() : Math.min(fg7Var.ordinal(), this.I0.e0());
    }

    public final c f0() {
        c cVar = this.F0;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException(rh4.i("Fragment ", this, " not associated with a fragment manager."));
    }

    public final Resources g0() {
        return U0().getResources();
    }

    public final String h0(int i) {
        return g0().getString(i);
    }

    public final a i0(boolean z) {
        String str;
        if (z) {
            t16 t16Var = u16.a;
            u16.b(new GetTargetFragmentUsageViolation(this, "Attempting to get target fragment from fragment " + this));
            u16.a(this).getClass();
        }
        a aVar = this.s0;
        if (aVar != null) {
            return aVar;
        }
        c cVar = this.F0;
        if (cVar == null || (str = this.t0) == null) {
            return null;
        }
        return cVar.c.b(str);
    }

    public final int j0() {
        t16 t16Var = u16.a;
        u16.b(new GetTargetFragmentRequestCodeUsageViolation(this, "Attempting to get target request code from fragment " + this));
        u16.a(this).getClass();
        return this.u0;
    }

    public View k0() {
        return this.U0;
    }

    public final eh7 l0() {
        x16 x16Var = this.e1;
        if (x16Var != null) {
            return x16Var;
        }
        throw new IllegalStateException(rh4.i("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public final void m0() {
        this.d1 = new gh7(this);
        this.h1 = new td(this);
        this.g1 = null;
        ArrayList arrayList = this.i1;
        u06 u06Var = this.j1;
        if (arrayList.contains(u06Var)) {
            return;
        }
        if (this.a < 0) {
            arrayList.add(u06Var);
            return;
        }
        a aVar = u06Var.a;
        aVar.h1.s();
        z7.k(aVar);
        Bundle bundle = aVar.b;
        aVar.h1.t(bundle != null ? bundle.getBundle("registryState") : null);
    }

    public final void n0() {
        m0();
        this.b1 = this.Y;
        this.Y = UUID.randomUUID().toString();
        this.w0 = false;
        this.x0 = false;
        this.z0 = false;
        this.A0 = false;
        this.C0 = false;
        this.E0 = 0;
        this.F0 = null;
        this.H0 = new n16();
        this.G0 = null;
        this.J0 = 0;
        this.K0 = 0;
        this.L0 = null;
        this.M0 = false;
        this.N0 = false;
    }

    @Override // defpackage.pi6
    public final vnf o() {
        Application application;
        if (this.F0 == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.g1 == null) {
            Context applicationContext = U0().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(U0().getApplicationContext());
            }
            this.g1 = new jsc(application, this, this.Z);
        }
        return this.g1;
    }

    public final boolean o0() {
        return this.G0 != null && this.w0;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.S0 = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        S0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.S0 = true;
    }

    @Override // defpackage.pi6
    public final wh9 p() {
        Application application;
        Context applicationContext = U0().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && Log.isLoggable("FragmentManager", 3)) {
            Objects.toString(U0().getApplicationContext());
        }
        wh9 wh9Var = new wh9(0);
        if (application != null) {
            wh9Var.a(unf.d, application);
        }
        wh9Var.a(z7.e, this);
        wh9Var.a(z7.f, this);
        Bundle bundle = this.Z;
        if (bundle != null) {
            wh9Var.a(z7.g, bundle);
        }
        return wh9Var;
    }

    public final boolean p0() {
        if (!this.M0) {
            c cVar = this.F0;
            if (cVar == null) {
                return false;
            }
            a aVar = this.I0;
            cVar.getClass();
            if (!(aVar == null ? false : aVar.p0())) {
                return false;
            }
        }
        return true;
    }

    public final boolean q0() {
        return this.E0 > 0;
    }

    public void r0(Bundle bundle) {
        this.S0 = true;
    }

    public final void requestPermissions(String[] strArr, int i) {
        if (this.G0 == null) {
            throw new IllegalStateException(rh4.i("Fragment ", this, " not attached to Activity"));
        }
        c cVarF0 = f0();
        if (cVarF0.E == null) {
            cVarF0.w.getClass();
            return;
        }
        cVarF0.F.addLast(new i16(this.Y, i));
        cVarF0.E.C(strArr);
    }

    public void s0(int i, int i2, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
            Objects.toString(intent);
        }
    }

    public final void startActivity(Intent intent) {
        z06 z06Var = this.G0;
        if (z06Var == null) {
            throw new IllegalStateException(rh4.i("Fragment ", this, " not attached to Activity"));
        }
        z06Var.u0.startActivity(intent, null);
    }

    public void t0(Activity activity) {
        this.S0 = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.Y);
        if (this.J0 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.J0));
        }
        if (this.L0 != null) {
            sb.append(" tag=");
            sb.append(this.L0);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u0(Context context) {
        this.S0 = true;
        z06 z06Var = this.G0;
        Activity activity = z06Var == null ? null : z06Var.t0;
        if (activity != null) {
            this.S0 = false;
            t0(activity);
        }
    }

    public void v0(Bundle bundle) {
        Bundle bundle2;
        this.S0 = true;
        Bundle bundle3 = this.b;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.H0.Z(bundle2);
            n16 n16Var = this.H0;
            n16Var.H = false;
            n16Var.I = false;
            n16Var.O.g = false;
            n16Var.u(1);
        }
        n16 n16Var2 = this.H0;
        if (n16Var2.v >= 1) {
            return;
        }
        n16Var2.H = false;
        n16Var2.I = false;
        n16Var2.O.g = false;
        n16Var2.u(1);
    }

    @Override // defpackage.ynf
    public final xnf w() {
        if (this.F0 == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (e0() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.F0.O.d;
        xnf xnfVar = (xnf) map.get(this.Y);
        if (xnfVar != null) {
            return xnfVar;
        }
        xnf xnfVar2 = new xnf();
        map.put(this.Y, xnfVar2);
        return xnfVar2;
    }

    public void w0(Menu menu, MenuInflater menuInflater) {
    }

    public View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    @Override // defpackage.isc
    public final mm y() {
        return (mm) this.h1.o;
    }

    public void y0() {
        this.S0 = true;
    }

    public void z0() {
        this.S0 = true;
    }
}
