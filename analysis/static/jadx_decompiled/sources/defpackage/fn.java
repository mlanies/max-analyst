package defpackage;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class fn extends ac3 implements km {
    public final en X;
    public dn o;

    public fn(Context context, int i) {
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(vsb.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        super(context, i2);
        this.X = new en(this);
        rm rmVarD = d();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(vsb.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((dn) rmVarD).e1 = i;
        rmVarD.c();
    }

    @Override // defpackage.ac3, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        dn dnVar = (dn) d();
        dnVar.t();
        ((ViewGroup) dnVar.L0.findViewById(R.id.content)).addView(view, layoutParams);
        dnVar.x0.a(dnVar.w0.getCallback());
    }

    public final rm d() {
        if (this.o == null) {
            qm qmVar = rm.a;
            this.o = new dn(getContext(), getWindow(), this, this);
        }
        return this.o;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        d().d();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        en enVar = this.X;
        if (enVar == null) {
            return false;
        }
        return enVar.a.f(keyEvent);
    }

    public final void e() {
        s5c.Z(getWindow().getDecorView(), this);
        wmd.G(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(gyb.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    public final boolean f(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        dn dnVar = (dn) d();
        dnVar.t();
        return dnVar.w0.findViewById(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        d().a();
    }

    @Override // defpackage.ac3, android.app.Dialog
    public void onCreate(Bundle bundle) {
        dn dnVar = (dn) d();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(dnVar.v0);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(dnVar);
        } else {
            boolean z = layoutInflaterFrom.getFactory2() instanceof dn;
        }
        super.onCreate(bundle);
        d().c();
    }

    @Override // defpackage.ac3, android.app.Dialog
    public final void onStop() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onStop();
        dn dnVar = (dn) d();
        dnVar.x();
        ote oteVar = dnVar.z0;
        if (oteVar != null) {
            oteVar.Q(false);
        }
    }

    @Override // defpackage.ac3, android.app.Dialog
    public void setContentView(int i) {
        e();
        d().g(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().j(charSequence);
    }

    @Override // defpackage.ac3, android.app.Dialog
    public void setContentView(View view) {
        e();
        d().h(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        d().j(getContext().getString(i));
    }

    @Override // defpackage.ac3, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        d().i(view, layoutParams);
    }
}
