package defpackage;

import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes2.dex */
public final /* synthetic */ class bc5 implements b66, qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ bc5(int i, long j, boolean z) {
        this.a = i;
        this.b = j;
        this.c = z;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        boolean z = this.c;
        long j = this.b;
        Throwable th = (Throwable) obj;
        switch (this.a) {
            case 2:
                Locale locale = Locale.ENGLISH;
                hm9.p("sc5", "markAsFavorite: failed for setId=" + j + " favorite=" + z, th);
                break;
            default:
                Locale locale2 = Locale.ENGLISH;
                hm9.p("md5", "markAsFavorite: failed for stickerId=" + j + " favorite=" + z, th);
                break;
        }
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        switch (this.a) {
            case 0:
                final od5 od5Var = (od5) obj;
                final long j = this.b;
                final boolean z = this.c;
                final int i = 0;
                return new sa3(1, new f6() { // from class: cc5
                    @Override // defpackage.f6
                    public final void run() {
                        switch (i) {
                            case 0:
                                od5 od5Var2 = (od5) od5Var;
                                ilc ilcVar = od5Var2.a;
                                ilcVar.c();
                                try {
                                    ArrayList arrayListC = od5Var2.c();
                                    boolean z2 = z;
                                    long j2 = j;
                                    if (z2) {
                                        if (arrayListC.indexOf(Long.valueOf(j2)) == -1) {
                                            arrayListC.add(0, Long.valueOf(j2));
                                            od5Var2.a(arrayListC);
                                        }
                                    } else if (arrayListC.remove(Long.valueOf(j2))) {
                                        od5Var2.a(arrayListC);
                                    }
                                    ilcVar.r();
                                    return;
                                } finally {
                                    ilcVar.l();
                                }
                            default:
                                fd5 fd5Var = (fd5) od5Var;
                                ilc ilcVar2 = fd5Var.a;
                                ilcVar2.c();
                                try {
                                    ArrayList arrayListC2 = fd5Var.c();
                                    boolean z3 = z;
                                    long j3 = j;
                                    if (z3) {
                                        if (arrayListC2.indexOf(Long.valueOf(j3)) == -1) {
                                            arrayListC2.add(0, Long.valueOf(j3));
                                            fd5Var.a(arrayListC2);
                                        }
                                    } else if (arrayListC2.remove(Long.valueOf(j3))) {
                                        fd5Var.a(arrayListC2);
                                    }
                                    ilcVar2.r();
                                    return;
                                } finally {
                                    ilcVar2.l();
                                }
                        }
                    }
                });
            case 1:
                return new qa3(((wc5) obj).a(), 2, new bc5(3, this.b, this.c));
            default:
                final fd5 fd5Var = (fd5) obj;
                final long j2 = this.b;
                final boolean z2 = this.c;
                final int i2 = 1;
                return new sa3(1, new f6() { // from class: cc5
                    @Override // defpackage.f6
                    public final void run() {
                        switch (i2) {
                            case 0:
                                od5 od5Var2 = (od5) fd5Var;
                                ilc ilcVar = od5Var2.a;
                                ilcVar.c();
                                try {
                                    ArrayList arrayListC = od5Var2.c();
                                    boolean z22 = z2;
                                    long j22 = j2;
                                    if (z22) {
                                        if (arrayListC.indexOf(Long.valueOf(j22)) == -1) {
                                            arrayListC.add(0, Long.valueOf(j22));
                                            od5Var2.a(arrayListC);
                                        }
                                    } else if (arrayListC.remove(Long.valueOf(j22))) {
                                        od5Var2.a(arrayListC);
                                    }
                                    ilcVar.r();
                                    return;
                                } finally {
                                    ilcVar.l();
                                }
                            default:
                                fd5 fd5Var2 = (fd5) fd5Var;
                                ilc ilcVar2 = fd5Var2.a;
                                ilcVar2.c();
                                try {
                                    ArrayList arrayListC2 = fd5Var2.c();
                                    boolean z3 = z2;
                                    long j3 = j2;
                                    if (z3) {
                                        if (arrayListC2.indexOf(Long.valueOf(j3)) == -1) {
                                            arrayListC2.add(0, Long.valueOf(j3));
                                            fd5Var2.a(arrayListC2);
                                        }
                                    } else if (arrayListC2.remove(Long.valueOf(j3))) {
                                        fd5Var2.a(arrayListC2);
                                    }
                                    ilcVar2.r();
                                    return;
                                } finally {
                                    ilcVar2.l();
                                }
                        }
                    }
                });
        }
    }
}
