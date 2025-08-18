package defpackage;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandlesVM;
import java.util.Map;

/* loaded from: classes.dex */
public final class fsc implements hsc {
    public final mm a;
    public boolean b;
    public Bundle c;
    public final khe d;

    public fsc(mm mmVar, ynf ynfVar) {
        this.a = mmVar;
        this.d = new khe(new ie(4, ynfVar));
    }

    @Override // defpackage.hsc
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((SavedStateHandlesVM) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((csc) entry.getValue()).e.a();
            if (!tpa.f(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleA);
            }
        }
        this.b = false;
        return bundle;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle bundleC = this.a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleC != null) {
            bundle.putAll(bundleC);
        }
        this.c = bundle;
        this.b = true;
    }
}
