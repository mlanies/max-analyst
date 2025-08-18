package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final /* synthetic */ class nd0 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ nd0(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                qp4.u0.b(this.b).i().getIcon();
                return -1;
            case 1:
                qp4.u0.b(this.b).i().b();
                return -1728053248;
            default:
                CharSequence charSequenceB = ((jqe) obj).b(this.b);
                return charSequenceB == null ? "" : charSequenceB;
        }
    }
}
