package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class xq8 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, nr8 {
    public wq8 a;
    public tc b;
    public ql7 c;

    @Override // defpackage.nr8
    public final void c(wq8 wq8Var, boolean z) {
        tc tcVar;
        if ((z || wq8Var == this.a) && (tcVar = this.b) != null) {
            tcVar.dismiss();
        }
    }

    @Override // defpackage.nr8
    public final boolean o(wq8 wq8Var) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ql7 ql7Var = this.c;
        if (ql7Var.Z == null) {
            ql7Var.Z = new pl7(ql7Var);
        }
        this.a.q(ql7Var.Z.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.c.c(this.a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        wq8 wq8Var = this.a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                wq8Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return wq8Var.performShortcut(i, keyEvent, 0);
    }
}
