package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class kw7 implements t2e {
    public final /* synthetic */ int a;
    public final f4e b;
    public final FrameLayout c;

    public kw7(Context context, int i) {
        this.a = i;
        switch (i) {
            case 1:
                i2e i2eVar = new i2e(context);
                this.c = i2eVar;
                this.b = new f4e(i2eVar);
                break;
            case 2:
                a4g a4gVar = new a4g(context);
                this.c = a4gVar;
                this.b = new f4e(a4gVar);
                break;
            default:
                iw7 iw7Var = new iw7(context);
                this.c = iw7Var;
                this.b = new f4e(iw7Var);
                break;
        }
    }

    private final void c(gw7 gw7Var) {
    }

    @Override // defpackage.t2e
    public final void a(z2e z2eVar) throws InterruptedException, IOException {
        switch (this.a) {
            case 0:
                f4e f4eVar = this.b;
                f4eVar.b(z2eVar);
                f4eVar.c();
                ((iw7) this.c).a(z2eVar, Math.max(350, f4eVar.b ? f4eVar.d : f4eVar.c));
                break;
            case 1:
                f4e f4eVar2 = this.b;
                f4eVar2.b(z2eVar);
                f4eVar2.c();
                ((i2e) this.c).a(z2eVar);
                break;
            default:
                f4e f4eVar3 = this.b;
                f4eVar3.b(z2eVar);
                f4eVar3.c();
                ((a4g) this.c).a(z2eVar, Math.max(350, f4eVar3.b ? f4eVar3.d : f4eVar3.c));
                break;
        }
    }

    @Override // defpackage.t2e
    public final void b(gw7 gw7Var) {
        switch (this.a) {
            case 0:
                ((iw7) this.c).b(gw7Var);
                break;
            case 1:
                break;
            default:
                ((a4g) this.c).b(gw7Var);
                break;
        }
    }

    @Override // defpackage.t2e
    public final void setParent(ViewGroup viewGroup) {
        switch (this.a) {
            case 0:
                f4e f4eVar = this.b;
                iw7 iw7Var = (iw7) this.c;
                iw7Var.setSizeConfigurator(f4eVar);
                viewGroup.addView(iw7Var, new ViewGroup.LayoutParams(-1, -1));
                break;
            case 1:
                f4e f4eVar2 = this.b;
                i2e i2eVar = (i2e) this.c;
                i2eVar.setSizeConfigurator(f4eVar2);
                viewGroup.addView(i2eVar, new ViewGroup.LayoutParams(-1, -1));
                break;
            default:
                f4e f4eVar3 = this.b;
                a4g a4gVar = (a4g) this.c;
                a4gVar.setSizeConfigurator(f4eVar3);
                viewGroup.addView(a4gVar, new ViewGroup.LayoutParams(-1, -1));
                break;
        }
    }
}
