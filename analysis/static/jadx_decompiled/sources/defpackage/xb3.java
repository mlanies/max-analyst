package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.b;

/* loaded from: classes.dex */
public final class xb3 extends rd7 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yb3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xb3(b bVar, int i) {
        super(0);
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                yb3 yb3Var = this.b;
                return new jsc(yb3Var.getApplication(), yb3Var, yb3Var.getIntent() != null ? yb3Var.getIntent().getExtras() : null);
            case 1:
                this.b.reportFullyDrawn();
                return e5f.a;
            case 2:
                yb3 yb3Var2 = this.b;
                return new j56(yb3Var2.Y, new xb3((b) yb3Var2, 1));
            default:
                b bVar = (b) this.b;
                i3a i3aVar = new i3a(new ob3(bVar, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (tpa.f(Looper.myLooper(), Looper.getMainLooper())) {
                        bVar.a.a(new sb3(i3aVar, 0, bVar));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new wt1(bVar, 8, i3aVar));
                    }
                }
                return i3aVar;
        }
    }
}
