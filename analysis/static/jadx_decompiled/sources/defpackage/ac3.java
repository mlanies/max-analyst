package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public class ac3 extends Dialog implements eh7, j3a, isc {
    public gh7 a;
    public final td b;
    public final i3a c;

    public ac3(Context context, int i) {
        super(context, i);
        this.b = new td(this);
        this.c = new i3a(new cu1(16, this));
    }

    public static void a(ac3 ac3Var) {
        super.onBackPressed();
    }

    @Override // defpackage.eh7
    public final gh7 Q() {
        return b();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addContentView(view, layoutParams);
    }

    public final gh7 b() {
        gh7 gh7Var = this.a;
        if (gh7Var != null) {
            return gh7Var;
        }
        gh7 gh7Var2 = new gh7(this);
        this.a = gh7Var2;
        return gh7Var2;
    }

    public final void c() {
        s5c.Z(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(gyb.view_tree_on_back_pressed_dispatcher_owner, this);
        wmd.G(getWindow().getDecorView(), this);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.c.d();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            i3a i3aVar = this.c;
            i3aVar.e = onBackInvokedDispatcher;
            i3aVar.e(i3aVar.g);
        }
        this.b.t(bundle);
        b().d(eg7.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        this.b.u(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        b().d(eg7.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        b().d(eg7.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        c();
        super.setContentView(i);
    }

    @Override // defpackage.isc
    public final mm y() {
        return (mm) this.b.o;
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.setContentView(view, layoutParams);
    }
}
