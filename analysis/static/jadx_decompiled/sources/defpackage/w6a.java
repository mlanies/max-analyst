package defpackage;

import android.content.Context;
import android.util.TypedValue;

/* loaded from: classes2.dex */
public final class w6a implements os0 {
    public final Context a;
    public final je7 b;
    public final khe c;
    public final fic d;

    public w6a(oe3 oe3Var, Context context, je7 je7Var) {
        this.a = context;
        this.b = je7Var;
        final int i = 0;
        this.c = new khe(new k56(this) { // from class: v6a
            public final /* synthetic */ w6a b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return c54.a(this.b.a);
                    default:
                        Context context2 = this.b.a;
                        float f = r0.widthPixels / context2.getResources().getDisplayMetrics().density;
                        return Integer.valueOf(f > 800.0f ? rh4.q(100, fk4.d().getDisplayMetrics().density, s5c.G(context2).getWidth()) : f > 360.0f ? tu0.G(291 * fk4.d().getDisplayMetrics().density) : tu0.G(248 * fk4.d().getDisplayMetrics().density));
                }
            }
        });
        final int i2 = 1;
        this.d = new fic(new k56(this) { // from class: v6a
            public final /* synthetic */ w6a b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return c54.a(this.b.a);
                    default:
                        Context context2 = this.b.a;
                        float f = r0.widthPixels / context2.getResources().getDisplayMetrics().density;
                        return Integer.valueOf(f > 800.0f ? rh4.q(100, fk4.d().getDisplayMetrics().density, s5c.G(context2).getWidth()) : f > 360.0f ? tu0.G(291 * fk4.d().getDisplayMetrics().density) : tu0.G(248 * fk4.d().getDisplayMetrics().density));
                }
            }
        });
        oe3Var.a(oe3.c | oe3.d, new c29(1, this));
    }

    public final int a() {
        return this.a.getResources().getConfiguration().orientation == 1 ? b() : b();
    }

    public final int b() {
        return wg0.m(10, fk4.d().getDisplayMetrics().density, 2, ((Number) this.d.getValue()).intValue());
    }

    public final float c() {
        return TypedValue.applyDimension(2, ((Number) ((t4f) this.c.getValue()).a.getValue()).floatValue(), fk4.d().getDisplayMetrics()) + ck4.c(os2.e.g((du4) ((zaa) this.b.getValue()).a.getValue()), this.a);
    }
}
