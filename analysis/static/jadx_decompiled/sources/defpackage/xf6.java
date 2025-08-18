package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class xf6 extends ote {
    public final /* synthetic */ ote X;
    public final /* synthetic */ ote o;

    public xf6(ote oteVar, ote oteVar2) {
        super(10);
        this.o = oteVar;
        this.X = oteVar2;
    }

    @Override // defpackage.ote
    public final int l(View view, int i, int i2) {
        WeakHashMap weakHashMap = zmf.a;
        return (view.getLayoutDirection() == 1 ? this.X : this.o).l(view, i, i2);
    }

    @Override // defpackage.ote
    public final String p() {
        return "SWITCHING[L:" + this.o.p() + ", R:" + this.X.p() + "]";
    }

    @Override // defpackage.ote
    public final int r(View view, int i) {
        WeakHashMap weakHashMap = zmf.a;
        return (view.getLayoutDirection() == 1 ? this.X : this.o).r(view, i);
    }
}
