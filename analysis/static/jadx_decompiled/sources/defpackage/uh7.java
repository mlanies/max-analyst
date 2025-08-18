package defpackage;

import android.view.View;
import java.util.List;

/* loaded from: classes.dex */
public final class uh7 {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view) {
        int i;
        int size = this.k.size();
        View view2 = null;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < size; i3++) {
            View view3 = ((dec) this.k.get(i3)).a;
            pdc pdcVar = (pdc) view3.getLayoutParams();
            if (view3 != view && !pdcVar.a.p() && (i = (pdcVar.a.i() - this.d) * this.e) >= 0 && i < i2) {
                view2 = view3;
                if (i == 0) {
                    break;
                } else {
                    i2 = i;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((pdc) view2.getLayoutParams()).a.i();
        }
    }

    public final View b(vdc vdcVar) {
        List list = this.k;
        if (list == null) {
            View view = vdcVar.j(this.d, Long.MAX_VALUE).a;
            this.d += this.e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((dec) this.k.get(i)).a;
            pdc pdcVar = (pdc) view2.getLayoutParams();
            if (!pdcVar.a.p() && this.d == pdcVar.a.i()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
