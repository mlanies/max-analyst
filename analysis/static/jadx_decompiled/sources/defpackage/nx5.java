package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class nx5 implements Callable {
    public final /* synthetic */ int X;
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ bg4 o;

    public /* synthetic */ nx5(String str, Context context, bg4 bg4Var, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = context;
        this.o = bg4Var;
        this.X = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return px5.a(this.b, this.c, this.o, this.X);
            default:
                try {
                    return px5.a(this.b, this.c, this.o, this.X);
                } catch (Throwable unused) {
                    return new ox5(-3);
                }
        }
    }
}
