package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class z64 implements jm7, km7, b7b, b66, fa8, pj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ z64(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.pj3
    public void accept(Object obj) {
        x4b x4bVar = (x4b) obj;
        switch (this.a) {
            case 7:
                x4bVar.g0(this.b);
                break;
            case 8:
                x4bVar.N(this.b);
                break;
            case 9:
                x4bVar.setRepeatMode(this.b);
                break;
            default:
                x4bVar.I0(this.b);
                break;
        }
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        Bitmap bitmap = (Bitmap) ((List) obj).get(this.b);
        return bitmap == null ? m28.a : f28.e(bitmap);
    }

    @Override // defpackage.fa8
    public void c(w98 w98Var) {
        if (w98Var.isConnected()) {
            a98 a98Var = w98Var.a;
            a98Var.getClass();
            fm9.k(Looper.myLooper() == a98Var.X.getLooper());
            a98Var.o.getClass();
            ew6 ew6VarB = y88.b();
            ew6VarB.d(new si1(w98Var, ew6VarB, this.b, 13), nk4.a);
        }
    }

    @Override // defpackage.jm7, defpackage.km7
    public void invoke(Object obj) {
        int i = this.b;
        switch (this.a) {
            case 0:
                ((u65) obj).getClass();
                hm9.n("u65", "onDroppedVideoFrames: " + i);
                break;
            case 1:
                ((m3b) obj).onRepeatModeChanged(i);
                break;
            case 2:
                ((n3b) obj).onRepeatModeChanged(i);
                break;
            default:
                ((n3b) obj).onRepeatModeChanged(i);
                break;
        }
    }

    @Override // defpackage.b7b
    public boolean test(Object obj) {
        return this.b < ((List) obj).size();
    }

    public /* synthetic */ z64(int i, y9d y9dVar, Bundle bundle) {
        this.a = 6;
        this.b = i;
    }

    public /* synthetic */ z64(ed edVar, int i, long j) {
        this.a = 0;
        this.b = i;
    }
}
