package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class x3g extends FrameLayout implements rbe {
    public final dz1 a;
    public final v3g b;
    public List c;
    public gz1 o;
    public float s0;
    public int t0;
    public float u0;

    public x3g(Context context) {
        super(context, null);
        this.c = Collections.emptyList();
        this.o = gz1.g;
        this.s0 = 0.0533f;
        this.t0 = 0;
        this.u0 = 0.08f;
        dz1 dz1Var = new dz1(context);
        this.a = dz1Var;
        v3g v3gVar = new v3g(context, null);
        this.b = v3gVar;
        v3gVar.setBackgroundColor(0);
        addView(dz1Var);
        addView(v3gVar);
    }

    @Override // defpackage.rbe
    public final void a(List list, gz1 gz1Var, float f, int i, float f2) {
        this.o = gz1Var;
        this.s0 = f;
        this.t0 = i;
        this.u0 = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            xz3 xz3Var = (xz3) list.get(i2);
            if (xz3Var.o != null) {
                arrayList.add(xz3Var);
            } else {
                arrayList2.add(xz3Var);
            }
        }
        if (!this.c.isEmpty() || !arrayList2.isEmpty()) {
            this.c = arrayList2;
            c();
        }
        this.a.a(arrayList, gz1Var, f, i, f2);
        invalidate();
    }

    public final String b(int i, float f) {
        float fB = s36.B(f, i, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (fB == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(fB / getContext().getResources().getDisplayMetrics().density)};
        int i2 = maf.a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:205:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0547 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 1820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x3g.c():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.c.isEmpty()) {
            return;
        }
        c();
    }
}
