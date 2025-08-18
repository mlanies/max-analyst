package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final /* synthetic */ class l8 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fka b;

    public /* synthetic */ l8(int i, fka fkaVar) {
        this.a = i;
        this.b = fkaVar;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                if (view instanceof kre) {
                    m6d.d(view, this.b);
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                m6d.d((View) obj, this.b);
                return e5f.a;
            case 2:
                return Integer.valueOf(this.b.getIcon().h);
            default:
                return Integer.valueOf(this.b.b().l);
        }
    }
}
