package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.ViewParent;
import java.util.List;

/* loaded from: classes.dex */
public final class b8 extends znc {
    public wg7 j;
    public final fm5 k = new fm5(11);

    public b8() {
        this.e = 1;
    }

    @Override // defpackage.znc
    public final void J(int i, String str) {
        this.j.B(i, str);
    }

    @Override // defpackage.znc
    public final void M(String str, String[] strArr, int i) {
        this.j.E(str, strArr, i);
    }

    @Override // defpackage.znc
    public final void N(Bundle bundle) {
        super.N(bundle);
        fm5 fm5Var = this.k;
        fm5Var.getClass();
        fm5Var.b = bundle.getInt("TransactionIndexer.currentIndex");
    }

    @Override // defpackage.znc
    public final void O(Bundle bundle) {
        super.O(bundle);
        bundle.putInt("TransactionIndexer.currentIndex", this.k.b);
    }

    @Override // defpackage.znc
    public final void T(Intent intent) {
        this.j.startActivity(intent);
    }

    @Override // defpackage.znc
    public final void U(String str, Intent intent, int i) {
        this.j.A(str, intent, i, null);
    }

    @Override // defpackage.znc
    public final void V(String str, Intent intent, int i, Bundle bundle) {
        this.j.A(str, intent, i, bundle);
    }

    @Override // defpackage.znc
    public final void W(String str, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        this.j.l(str, intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // defpackage.znc
    public final void Y(String str) {
        this.j.g(str);
    }

    public final void Z(wg7 wg7Var, w12 w12Var) {
        if (this.j == wg7Var && this.i == w12Var) {
            return;
        }
        ViewParent viewParent = this.i;
        if (viewParent != null && (viewParent instanceof yu3)) {
            K((yu3) viewParent);
        }
        a(w12Var);
        this.j = wg7Var;
        this.i = w12Var;
        w12Var.post(new q57(21, this));
    }

    @Override // defpackage.znc
    public final Activity d() {
        wg7 wg7Var = this.j;
        if (wg7Var != null) {
            return wg7Var.a();
        }
        return null;
    }

    @Override // defpackage.znc
    public final znc i() {
        return this;
    }

    @Override // defpackage.znc
    public final List j() {
        return this.j.U();
    }

    @Override // defpackage.znc
    public final fm5 k() {
        return this.k;
    }

    @Override // defpackage.znc
    public final void o() {
        if (this.j == null || d() == null) {
            return;
        }
        d().invalidateOptionsMenu();
    }

    @Override // defpackage.znc
    public final void p(Activity activity, boolean z) {
        super.p(activity, z);
        if (z) {
            return;
        }
        this.j = null;
    }
}
