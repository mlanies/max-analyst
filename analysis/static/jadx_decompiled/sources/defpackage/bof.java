package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public abstract class bof extends ow3 {
    public cof a;
    public int b = 0;

    public bof() {
    }

    @Override // defpackage.ow3
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        y(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new cof(view);
        }
        cof cofVar = this.a;
        View view2 = cofVar.a;
        cofVar.b = view2.getTop();
        cofVar.c = view2.getLeft();
        this.a.a();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        this.a.b(i2);
        this.b = 0;
        return true;
    }

    public final int x() {
        cof cofVar = this.a;
        if (cofVar != null) {
            return cofVar.d;
        }
        return 0;
    }

    public void y(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.p(view, i);
    }

    public boolean z(int i) {
        cof cofVar = this.a;
        if (cofVar != null) {
            return cofVar.b(i);
        }
        this.b = i;
        return false;
    }

    public bof(int i) {
    }
}
