package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.datepicker.MaterialCalendar;

/* loaded from: classes.dex */
public final class zj0 implements Runnable {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public /* synthetic */ zj0(int i, int i2, Object obj) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((ck0) this.c).v0.x(this.b, 4);
                break;
            case 1:
                tu0 tu0Var = (tu0) ((mfe) this.c).a;
                if (tu0Var != null) {
                    tu0Var.w(this.b);
                    break;
                }
                break;
            case 2:
                ((MaterialCalendar) this.c).s1.B0(this.b);
                break;
            case 3:
                ((SystemForegroundService) this.c).X.cancel(this.b);
                break;
            case 4:
                ((RecyclerView) this.c).B0(this.b);
                break;
            default:
                ((kdg) this.c).f(this.b);
                break;
        }
    }

    public zj0(RecyclerView recyclerView, int i) {
        this.a = 4;
        this.b = i;
        this.c = recyclerView;
    }

    public zj0(ck0 ck0Var) {
        this.a = 0;
        this.c = ck0Var;
        this.b = -1;
    }
}
