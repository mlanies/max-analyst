package defpackage;

import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class k98 implements pj3, u98, mm7, km7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w98 b;

    public /* synthetic */ k98(w98 w98Var, int i) {
        this.a = i;
        this.b = w98Var;
    }

    @Override // defpackage.pj3
    public void accept(Object obj) {
        y88 y88Var = (y88) obj;
        switch (this.a) {
            case 0:
                ffc ffcVar = this.b.p;
                y88Var.g();
                break;
            case LangUtils.HASH_SEED /* 17 */:
                a98 a98Var = this.b.a;
                y88Var.e();
                break;
            default:
                ffc ffcVar2 = this.b.p;
                y88Var.g();
                break;
        }
    }

    @Override // defpackage.u98
    public void c(qr6 qr6Var, int i) {
        switch (this.a) {
            case 1:
                qr6Var.C(this.b.c, i);
                break;
            case 2:
                qr6Var.S(this.b.c, i);
                break;
            case 3:
                qr6Var.V(this.b.c, i);
                break;
            case 4:
                qr6Var.v0(this.b.c, i);
                break;
            case 5:
                qr6Var.r0(this.b.c, i);
                break;
            case 6:
            default:
                qr6Var.a0(this.b.c, i);
                break;
            case 7:
                qr6Var.G(this.b.c, i);
                break;
            case 8:
                qr6Var.O(this.b.c, i);
                break;
            case 9:
                qr6Var.e(this.b.c, i);
                break;
            case 10:
                qr6Var.z(this.b.c, i);
                break;
            case 11:
                qr6Var.p(this.b.c, i);
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                qr6Var.x0(this.b.c, i);
                break;
            case 13:
                qr6Var.Y(this.b.c, i);
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                qr6Var.w(this.b.c, i);
                break;
        }
    }

    @Override // defpackage.mm7
    public void d(Object obj, tm5 tm5Var) {
        w98 w98Var = this.b;
        w98Var.getClass();
        ((n3b) obj).Y(w98Var.a, new l3b(tm5Var));
    }

    @Override // defpackage.km7
    public void invoke(Object obj) {
        n3b n3bVar = (n3b) obj;
        switch (this.a) {
            case 16:
                n3bVar.q0(this.b.t);
                break;
            default:
                n3bVar.q0(this.b.t);
                break;
        }
    }

    public /* synthetic */ k98(w98 w98Var, z9d z9dVar) {
        this.a = 17;
        this.b = w98Var;
    }
}
