package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class fc5 implements b66, vu {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;

    public /* synthetic */ fc5(int i, int i2, long j) {
        this.a = i2;
        this.b = j;
        this.c = i;
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        switch (this.a) {
            case 0:
                final od5 od5Var = (od5) obj;
                final long j = this.b;
                final int i = this.c;
                final int i2 = 0;
                return new sa3(1, new f6() { // from class: gc5
                    @Override // defpackage.f6
                    public final void run() {
                        int i3;
                        int i4;
                        switch (i2) {
                            case 0:
                                long j2 = j;
                                od5 od5Var2 = (od5) od5Var;
                                ilc ilcVar = od5Var2.a;
                                ilcVar.c();
                                try {
                                    ArrayList arrayListC = od5Var2.c();
                                    int iIndexOf = arrayListC.indexOf(Long.valueOf(j2));
                                    if (iIndexOf >= 0 && (i3 = i) >= 0 && i3 < arrayListC.size()) {
                                        Object obj2 = arrayListC.get(iIndexOf);
                                        arrayListC.remove(iIndexOf);
                                        arrayListC.add(i3, obj2);
                                        od5Var2.a(arrayListC);
                                    }
                                    ilcVar.r();
                                    return;
                                } finally {
                                    ilcVar.l();
                                }
                            default:
                                long j3 = j;
                                fd5 fd5Var = (fd5) od5Var;
                                ilc ilcVar2 = fd5Var.a;
                                ilcVar2.c();
                                try {
                                    ArrayList arrayListC2 = fd5Var.c();
                                    int iIndexOf2 = arrayListC2.indexOf(Long.valueOf(j3));
                                    if (iIndexOf2 >= 0 && (i4 = i) >= 0 && i4 < arrayListC2.size()) {
                                        Object obj3 = arrayListC2.get(iIndexOf2);
                                        arrayListC2.remove(iIndexOf2);
                                        arrayListC2.add(i4, obj3);
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
                return new qa3(((wc5) obj).a(), 2, new fc5(this.c, 2, this.b));
            default:
                final fd5 fd5Var = (fd5) obj;
                final long j2 = this.b;
                final int i3 = this.c;
                final int i4 = 1;
                return new sa3(1, new f6() { // from class: gc5
                    @Override // defpackage.f6
                    public final void run() {
                        int i32;
                        int i42;
                        switch (i4) {
                            case 0:
                                long j22 = j2;
                                od5 od5Var2 = (od5) fd5Var;
                                ilc ilcVar = od5Var2.a;
                                ilcVar.c();
                                try {
                                    ArrayList arrayListC = od5Var2.c();
                                    int iIndexOf = arrayListC.indexOf(Long.valueOf(j22));
                                    if (iIndexOf >= 0 && (i32 = i3) >= 0 && i32 < arrayListC.size()) {
                                        Object obj2 = arrayListC.get(iIndexOf);
                                        arrayListC.remove(iIndexOf);
                                        arrayListC.add(i32, obj2);
                                        od5Var2.a(arrayListC);
                                    }
                                    ilcVar.r();
                                    return;
                                } finally {
                                    ilcVar.l();
                                }
                            default:
                                long j3 = j2;
                                fd5 fd5Var2 = (fd5) fd5Var;
                                ilc ilcVar2 = fd5Var2.a;
                                ilcVar2.c();
                                try {
                                    ArrayList arrayListC2 = fd5Var2.c();
                                    int iIndexOf2 = arrayListC2.indexOf(Long.valueOf(j3));
                                    if (iIndexOf2 >= 0 && (i42 = i3) >= 0 && i42 < arrayListC2.size()) {
                                        Object obj3 = arrayListC2.get(iIndexOf2);
                                        arrayListC2.remove(iIndexOf2);
                                        arrayListC2.add(i42, obj3);
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

    public /* synthetic */ fc5(int i, long j) {
        this.a = 3;
        this.c = i;
        this.b = j;
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public bm7 mo131apply(Object obj) {
        return fm9.F(new ph8(this.c, this.b, (List) obj));
    }
}
