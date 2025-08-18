package defpackage;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class fm5 implements xn0, sne {
    public static final fm5 c = new fm5(0, 1);
    public static final fm5 d = new fm5(0, 2);
    public static final fm5 e;
    public static final fm5 f;
    public static final fm5 g;
    public final /* synthetic */ int a;
    public int b;

    static {
        int i = 3;
        e = new fm5(0, i);
        f = new fm5(1, i);
        g = new fm5(2, i);
    }

    public /* synthetic */ fm5(int i) {
        this.a = i;
    }

    public int a(int i) {
        int i2 = this.b;
        int i3 = i % i2;
        Integer numValueOf = Integer.valueOf(i3);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i2 + i3;
    }

    public boolean b(int i) {
        int i2 = this.b;
        return i2 != 0 && (i2 & i) == i;
    }

    @Override // defpackage.xn0
    public void h() {
    }

    @Override // defpackage.xn0
    public void i(l84 l84Var, wn0 wn0Var, vf vfVar, int i, k56 k56Var) {
        int i2 = this.b;
        int i3 = 1;
        if (1 <= i2) {
            while (true) {
                int iX = (i + i3) % vfVar.x();
                if (ta5.a.i(2)) {
                    ta5.e(fm5.class, "Preparing frame %d, last drawn: %d", Integer.valueOf(iX), Integer.valueOf(i));
                }
                int iHashCode = (vfVar.hashCode() * 31) + iX;
                synchronized (((SparseArray) l84Var.e)) {
                    if (((SparseArray) l84Var.e).get(iHashCode) != null) {
                        ta5.d(l84.class, Integer.valueOf(iX), "Already scheduled decode job for frame %d");
                    } else if (wn0Var.a(iX)) {
                        ta5.d(l84.class, Integer.valueOf(iX), "Frame %d is cached already.");
                    } else {
                        k84 k84Var = new k84(l84Var, vfVar, wn0Var, iX, iHashCode);
                        ((SparseArray) l84Var.e).put(iHashCode, k84Var);
                        ((ExecutorService) l84Var.d).execute(k84Var);
                    }
                }
                if (i3 == i2) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        if (k56Var != null) {
            k56Var.invoke();
        }
    }

    @Override // defpackage.xn0
    public o43 j(int i, int i2, int i3) {
        return null;
    }

    @Override // defpackage.xn0
    public void k() {
    }

    @Override // defpackage.xn0
    public void l(int i, int i2) {
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "Restrictions{restrictions=" + this.b + ", cannotInvite=" + b(1) + ", cannotModifyIcon=" + b(2) + ", cannotModifyTitle=" + b(4) + ", cannotLeave=" + b(8) + ", cannotPin=" + b(16) + ", cannotLiveLocation=" + b(32) + ", cannotInput=" + b(64) + ", cannotStopBot=" + b(128) + ", cannotComplain=" + b(256) + '}';
            case 3:
                return zr6.j(new StringBuilder("{value="), this.b, "}");
            case 7:
                return String.format(null, "Status: %d", Arrays.copyOf(new Object[]{Integer.valueOf(this.b)}, 1));
            default:
                return super.toString();
        }
    }

    public /* synthetic */ fm5(int i, int i2) {
        this.a = i2;
        this.b = i;
    }
}
