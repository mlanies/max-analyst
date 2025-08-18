package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final /* synthetic */ class hd0 implements qj3, wu, km7, jm7, fa8, id6, u4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hd0(int i, int i2, Object obj) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // defpackage.id6
    public void a(jd6 jd6Var, hd6 hd6Var, long j) {
        m1f m1fVar = (m1f) this.c;
        int i = this.b;
        m1fVar.getClass();
        d54.a();
        kf4 kf4Var = m1fVar.A0;
        kf4Var.getClass();
        i63 i63Var = m1fVar.b;
        synchronized (kf4Var) {
            try {
                fm9.k(oaf.l(kf4Var.g, i));
                jf4 jf4Var = (jf4) kf4Var.g.get(i);
                fm9.k(!jf4Var.b);
                i63 i63Var2 = i63.h;
                if (kf4Var.l == null) {
                    kf4Var.l = i63Var;
                }
                fm9.j("Mixing different ColorInfos is not supported.", kf4Var.l.equals(i63Var));
                kf4Var.d.getClass();
                Float fValueOf = Float.valueOf(1.0f);
                Float fValueOf2 = Float.valueOf(0.0f);
                jf4Var.a.add(new if4(jd6Var, hd6Var, j, new k8g(Pair.create(fValueOf2, fValueOf2), Pair.create(fValueOf2, fValueOf2), Pair.create(fValueOf, fValueOf))));
                if (i == kf4Var.o) {
                    kf4Var.d();
                } else {
                    kf4Var.e(jf4Var);
                }
                kf4Var.f.v(new ff4(kf4Var, 2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                Drawable drawable = (Drawable) obj;
                int i = this.b;
                drawable.setBounds(0, 0, i, i);
                drawable.draw((Canvas) this.c);
                break;
            case 1:
                xy7 xy7Var = (xy7) obj;
                qy7 qy7Var = (qy7) this.c;
                qy7Var.c.put(Integer.valueOf(this.b), xy7Var);
                y7g y7gVar = (y7g) qy7Var.d.b;
                if (xy7Var != null) {
                    y7gVar.G(xy7Var.a);
                    break;
                } else {
                    y7gVar.G(null);
                    break;
                }
            default:
                u82 u82Var = (u82) obj;
                ((p82) this.c).getClass();
                int i2 = this.b;
                u82Var.m = i2;
                if (i2 == 0) {
                    u82Var.N = false;
                    u82Var.O = false;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.wu
    public bm7 apply(Object obj) {
        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
        su1 su1Var = (su1) this.c;
        su1Var.getClass();
        if (u40.g(this.b, totalCaptureResult)) {
            su1Var.g = su1.k;
        }
        return su1Var.i.a(totalCaptureResult);
    }

    @Override // defpackage.u4
    public boolean b(View view) {
        int i = SideSheetBehavior.x;
        ((SideSheetBehavior) this.c).x(this.b);
        return true;
    }

    @Override // defpackage.fa8
    public void c(w98 w98Var) {
        if (w98Var.isConnected()) {
            ffc ffcVar = w98Var.p;
            List list = (List) this.c;
            w98Var.o = zw6.j(list);
            ffc ffcVarA = c73.a(list, w98Var.q, w98Var.t);
            w98Var.p = ffcVarA;
            boolean z = !Objects.equals(ffcVarA, ffcVar);
            a98 a98Var = w98Var.a;
            a98Var.getClass();
            fm9.k(Looper.myLooper() == a98Var.X.getLooper());
            y88 y88Var = a98Var.o;
            y88Var.getClass();
            ew6 ew6VarR = y88.r();
            if (z) {
                y88Var.g();
            }
            w98Var.c1(this.b, ew6VarR);
        }
    }

    @Override // defpackage.km7
    public void invoke(Object obj) {
        switch (this.a) {
            case 4:
                ((n3b) obj).f0(((a3b) this.c).a, this.b);
                break;
            case 5:
                ((m3b) obj).A((rb8) this.c, this.b);
                break;
            default:
                ((n3b) obj).G(this.b, (tb8) this.c);
                break;
        }
    }

    public /* synthetic */ hd0(int i, ffc ffcVar) {
        this.a = 7;
        this.b = i;
        this.c = ffcVar;
    }
}
