package defpackage;

import android.content.Context;
import android.location.Geocoder;
import android.util.Size;
import java.util.Locale;

/* loaded from: classes2.dex */
public final /* synthetic */ class md implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ je7 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ md(je7 je7Var, Context context, int i) {
        this.a = i;
        this.b = je7Var;
        this.c = context;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new Geocoder(this.c, (Locale) this.b.getValue());
            case 1:
                ((ti4) this.b.getValue()).getClass();
                Size sizeI = ti4.i(this.c);
                return Integer.valueOf(Math.max(sizeI.getWidth(), sizeI.getHeight()));
            case 2:
                ((ti4) this.b.getValue()).getClass();
                Size sizeI2 = ti4.i(this.c);
                int iMin = (int) ((Math.min(sizeI2.getWidth(), sizeI2.getHeight()) / 3.0f) * 2.0f);
                if (iMin < 400) {
                    iMin = 400;
                }
                return Integer.valueOf(iMin);
            default:
                ((ti4) this.b.getValue()).getClass();
                Size sizeI3 = ti4.i(this.c);
                return Integer.valueOf(Math.max(sizeI3.getWidth(), sizeI3.getHeight()));
        }
    }

    public /* synthetic */ md(Context context, khe kheVar) {
        this.a = 0;
        this.c = context;
        this.b = kheVar;
    }
}
