package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.b;
import defpackage.eg7;
import defpackage.fg7;
import defpackage.gaa;
import defpackage.gh7;
import defpackage.mm;
import defpackage.n16;
import defpackage.qb3;
import defpackage.rb3;
import defpackage.tj3;
import defpackage.x16;
import defpackage.y7;
import defpackage.yb3;
import defpackage.z06;

/* loaded from: classes.dex */
public abstract class b extends yb3 implements y7 {
    public boolean G0;
    public boolean H0;
    public final gaa E0 = new gaa(new z06(this));
    public final gh7 F0 = new gh7(this);
    public boolean I0 = true;

    public b() {
        ((mm) this.o.o).f("android:support:lifecycle", new qb3(1, this));
        final int i = 0;
        t(new tj3(this) { // from class: y06
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.tj3
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        this.b.E0.D();
                        break;
                    default:
                        this.b.E0.D();
                        break;
                }
            }
        });
        final int i2 = 1;
        this.v0.add(new tj3(this) { // from class: y06
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.tj3
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        this.b.E0.D();
                        break;
                    default:
                        this.b.E0.D();
                        break;
                }
            }
        });
        z(new rb3(this, 1));
    }

    public static boolean T(c cVar) {
        boolean zT = false;
        for (a aVar : cVar.c.f()) {
            if (aVar != null) {
                z06 z06Var = aVar.G0;
                if ((z06Var == null ? null : z06Var.x0) != null) {
                    zT |= T(aVar.c0());
                }
                x16 x16Var = aVar.e1;
                fg7 fg7Var = fg7.o;
                fg7 fg7Var2 = fg7.c;
                if (x16Var != null) {
                    x16Var.b();
                    if (x16Var.X.d.a(fg7Var)) {
                        gh7 gh7Var = aVar.e1.X;
                        gh7Var.c("setCurrentState");
                        gh7Var.e(fg7Var2);
                        zT = true;
                    }
                }
                if (aVar.d1.d.a(fg7Var)) {
                    gh7 gh7Var2 = aVar.d1;
                    gh7Var2.c("setCurrentState");
                    gh7Var2.e(fg7Var2);
                    zT = true;
                }
            }
        }
        return zT;
    }

    public final n16 S() {
        return ((z06) this.E0.a).w0;
    }

    public void U() {
        this.F0.d(eg7.ON_RESUME);
        n16 n16Var = ((z06) this.E0.a).w0;
        n16Var.H = false;
        n16Var.I = false;
        n16Var.O.g = false;
        n16Var.u(7);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dump(java.lang.String r5, java.io.FileDescriptor r6, java.io.PrintWriter r7, java.lang.String[] r8) {
        /*
            r4 = this;
            super.dump(r5, r6, r7, r8)
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L52
            int r2 = r8.length
            if (r2 != 0) goto Lb
            goto L52
        Lb:
            r2 = r8[r1]
            int r3 = r2.hashCode()
            switch(r3) {
                case -645125871: goto L42;
                case 100470631: goto L32;
                case 472614934: goto L29;
                case 1159329357: goto L20;
                case 1455016274: goto L15;
                default: goto L14;
            }
        L14:
            goto L52
        L15:
            java.lang.String r3 = "--autofill"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1e
            goto L52
        L1e:
            r1 = r0
            goto L52
        L20:
            java.lang.String r3 = "--contentcapture"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1e
            goto L52
        L29:
            java.lang.String r3 = "--list-dumpables"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3b
            goto L52
        L32:
            java.lang.String r3 = "--dump-dumpable"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3b
            goto L52
        L3b:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 33
            if (r2 < r3) goto L52
            goto L1e
        L42:
            java.lang.String r3 = "--translation"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4b
            goto L52
        L4b:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r2 < r3) goto L52
            goto L1e
        L52:
            r0 = r0 ^ r1
            if (r0 != 0) goto L56
            return
        L56:
            r7.print(r5)
            java.lang.String r0 = "Local FragmentActivity "
            r7.print(r0)
            int r0 = java.lang.System.identityHashCode(r4)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " State:"
            r7.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = "  "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.print(r0)
            java.lang.String r1 = "mCreated="
            r7.print(r1)
            boolean r1 = r4.G0
            r7.print(r1)
            java.lang.String r1 = " mResumed="
            r7.print(r1)
            boolean r1 = r4.H0
            r7.print(r1)
            java.lang.String r1 = " mStopped="
            r7.print(r1)
            boolean r1 = r4.I0
            r7.print(r1)
            android.app.Application r1 = r4.getApplication()
            if (r1 == 0) goto Lb2
            androidx.loader.app.b r1 = new androidx.loader.app.b
            xnf r2 = r4.w()
            r1.<init>(r4, r2)
            r1.a(r0, r7)
        Lb2:
            gaa r4 = r4.E0
            java.lang.Object r4 = r4.a
            z06 r4 = (defpackage.z06) r4
            n16 r4 = r4.w0
            r4.w(r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.b.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // defpackage.yb3, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.E0.D();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.yb3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.F0.d(eg7.ON_CREATE);
        n16 n16Var = ((z06) this.E0.a).w0;
        n16Var.H = false;
        n16Var.I = false;
        n16Var.O.g = false;
        n16Var.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((z06) this.E0.a).w0.f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((z06) this.E0.a).w0.l();
        this.F0.d(eg7.ON_DESTROY);
    }

    @Override // defpackage.yb3, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((z06) this.E0.a).w0.j();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.H0 = false;
        ((z06) this.E0.a).w0.u(5);
        this.F0.d(eg7.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        U();
    }

    @Override // defpackage.yb3, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.E0.D();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        gaa gaaVar = this.E0;
        gaaVar.D();
        super.onResume();
        this.H0 = true;
        ((z06) gaaVar.a).w0.A(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        gaa gaaVar = this.E0;
        gaaVar.D();
        super.onStart();
        this.I0 = false;
        boolean z = this.G0;
        z06 z06Var = (z06) gaaVar.a;
        if (!z) {
            this.G0 = true;
            n16 n16Var = z06Var.w0;
            n16Var.H = false;
            n16Var.I = false;
            n16Var.O.g = false;
            n16Var.u(4);
        }
        z06Var.w0.A(true);
        this.F0.d(eg7.ON_START);
        n16 n16Var2 = z06Var.w0;
        n16Var2.H = false;
        n16Var2.I = false;
        n16Var2.O.g = false;
        n16Var2.u(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.E0.D();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.I0 = true;
        while (T(S())) {
        }
        n16 n16Var = ((z06) this.E0.a).w0;
        n16Var.I = true;
        n16Var.O.g = true;
        n16Var.u(4);
        this.F0.d(eg7.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((z06) this.E0.a).w0.f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }
}
