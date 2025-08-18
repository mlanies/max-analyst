package defpackage;

import android.view.KeyEvent;
import android.widget.SeekBar;
import androidx.mediarouter.app.d;
import androidx.mediarouter.app.e;
import java.util.Collections;

/* loaded from: classes.dex */
public final class mf8 extends lz7 {
    public final /* synthetic */ int h;
    public final /* synthetic */ KeyEvent.Callback i;

    public /* synthetic */ mf8(KeyEvent.Callback callback, int i) {
        this.h = i;
        this.i = callback;
    }

    @Override // defpackage.lz7
    public void A(dh8 dh8Var) {
        e eVar;
        KeyEvent.Callback callback = this.i;
        switch (this.h) {
            case 2:
                d dVar = (d) callback;
                SeekBar seekBar = (SeekBar) dVar.b1.get(dh8Var);
                int i = dh8Var.o;
                int i2 = d.z1;
                if (seekBar != null && dVar.W0 != dh8Var) {
                    seekBar.setProgress(i);
                    break;
                }
                break;
            case 4:
                int i3 = pg8.e1;
                pg8 pg8Var = (pg8) callback;
                if (pg8Var.H0 != dh8Var && (eVar = (e) pg8Var.G0.get(dh8Var.c)) != null) {
                    int i4 = eVar.F0.o;
                    eVar.B(i4 == 0);
                    eVar.H0.setProgress(i4);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.lz7
    public void B() {
        switch (this.h) {
            case 0:
                ((of8) this.i).getClass();
                break;
        }
    }

    @Override // defpackage.lz7
    public void s() {
        switch (this.h) {
            case 0:
                ((of8) this.i).b();
                break;
        }
    }

    @Override // defpackage.lz7
    public void t() {
        switch (this.h) {
            case 0:
                ((of8) this.i).b();
                break;
        }
    }

    @Override // defpackage.lz7
    public void u() {
        switch (this.h) {
            case 0:
                ((of8) this.i).b();
                break;
        }
    }

    @Override // defpackage.lz7
    public void v() {
        switch (this.h) {
            case 0:
                ((of8) this.i).b();
                break;
            case 1:
                ((qf8) this.i).g();
                break;
            case 3:
                ((gg8) this.i).g();
                break;
            case 4:
                ((pg8) this.i).n();
                break;
        }
    }

    @Override // defpackage.lz7
    public final void w(dh8 dh8Var) {
        gaa gaaVarB;
        switch (this.h) {
            case 0:
                ((of8) this.i).b();
                break;
            case 1:
                ((qf8) this.i).g();
                break;
            case 2:
                ((d) this.i).q(true);
                break;
            case 3:
                ((gg8) this.i).g();
                break;
            default:
                pg8 pg8Var = (pg8) this.i;
                if (dh8Var == pg8Var.t0 && dh8.a() != null) {
                    ch8 ch8Var = dh8Var.a;
                    ch8Var.getClass();
                    eh8.b();
                    for (dh8 dh8Var2 : Collections.unmodifiableList(ch8Var.b)) {
                        if (!Collections.unmodifiableList(pg8Var.t0.u).contains(dh8Var2) && (gaaVarB = pg8Var.t0.b(dh8Var2)) != null && gaaVarB.B() && !pg8Var.v0.contains(dh8Var2)) {
                            pg8Var.o();
                            pg8Var.m();
                            break;
                        }
                    }
                }
                pg8Var.n();
                break;
        }
    }

    @Override // defpackage.lz7
    public void x() {
        switch (this.h) {
            case 0:
                ((of8) this.i).b();
                break;
            case 1:
                ((qf8) this.i).g();
                break;
            case 3:
                ((gg8) this.i).g();
                break;
            case 4:
                ((pg8) this.i).n();
                break;
        }
    }

    @Override // defpackage.lz7
    public void y(dh8 dh8Var) {
        switch (this.h) {
            case 0:
                ((of8) this.i).b();
                break;
            case 1:
                ((qf8) this.i).dismiss();
                break;
            case 3:
                ((gg8) this.i).dismiss();
                break;
            case 4:
                pg8 pg8Var = (pg8) this.i;
                pg8Var.t0 = dh8Var;
                pg8Var.o();
                pg8Var.m();
                break;
        }
    }

    @Override // defpackage.lz7
    public void z() {
        switch (this.h) {
            case 0:
                ((of8) this.i).b();
                break;
            case 2:
                ((d) this.i).q(false);
                break;
            case 4:
                ((pg8) this.i).n();
                break;
        }
    }
}
