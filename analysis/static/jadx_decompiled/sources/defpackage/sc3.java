package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class sc3 implements j6d {
    public final ffc a;
    public long b;

    public sc3(List list, List list2) {
        ww6 ww6VarI = zw6.i();
        fm9.f(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            ww6VarI.a(new rc3((j6d) list.get(i), (List) list2.get(i)));
        }
        this.a = ww6VarI.j();
        this.b = -9223372036854775807L;
    }

    @Override // defpackage.j6d
    public final boolean a() {
        int i = 0;
        while (true) {
            ffc ffcVar = this.a;
            if (i >= ffcVar.size()) {
                return false;
            }
            if (((rc3) ffcVar.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.j6d
    public final long f() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            ffc ffcVar = this.a;
            if (i >= ffcVar.size()) {
                break;
            }
            long jF = ((rc3) ffcVar.get(i)).f();
            if (jF != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jF);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // defpackage.j6d
    public final boolean o(qo7 qo7Var) {
        boolean zO;
        boolean z = false;
        do {
            long jF = f();
            if (jF == Long.MIN_VALUE) {
                break;
            }
            int i = 0;
            zO = false;
            while (true) {
                ffc ffcVar = this.a;
                if (i >= ffcVar.size()) {
                    break;
                }
                long jF2 = ((rc3) ffcVar.get(i)).f();
                boolean z2 = jF2 != Long.MIN_VALUE && jF2 <= qo7Var.a;
                if (jF2 == jF || z2) {
                    zO |= ((rc3) ffcVar.get(i)).o(qo7Var);
                }
                i++;
            }
            z |= zO;
        } while (zO);
        return z;
    }

    @Override // defpackage.j6d
    public final long r() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            ffc ffcVar = this.a;
            if (i >= ffcVar.size()) {
                break;
            }
            rc3 rc3Var = (rc3) ffcVar.get(i);
            long jR = rc3Var.r();
            if ((rc3Var.b().contains(1) || rc3Var.b().contains(2) || rc3Var.b().contains(4)) && jR != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jR);
            }
            if (jR != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jR);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.b;
        return j != -9223372036854775807L ? j : jMin2;
    }

    @Override // defpackage.j6d
    public final void t(long j) {
        int i = 0;
        while (true) {
            ffc ffcVar = this.a;
            if (i >= ffcVar.size()) {
                return;
            }
            ((rc3) ffcVar.get(i)).t(j);
            i++;
        }
    }
}
