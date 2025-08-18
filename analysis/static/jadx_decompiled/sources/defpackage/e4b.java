package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class e4b implements Handler.Callback {
    public boolean X;
    public boolean Y;
    public final Object Z;
    public final /* synthetic */ int a;
    public final Handler b;
    public final TreeMap c;
    public boolean o;
    public final Object s0;
    public final Object t0;
    public Object u0;

    public e4b(h14 h14Var, wmc wmcVar, n64 n64Var) {
        this.a = 0;
        this.u0 = h14Var;
        this.s0 = wmcVar;
        this.Z = n64Var;
        this.c = new TreeMap();
        this.b = maf.m(this);
        this.t0 = new wo(1);
    }

    public d4b a() {
        return new d4b(this, (n64) this.Z);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                if (!this.Y) {
                    if (message.what == 1) {
                        a4b a4bVar = (a4b) message.obj;
                        long j = a4bVar.a;
                        TreeMap treeMap = this.c;
                        long j2 = a4bVar.b;
                        Long l = (Long) treeMap.get(Long.valueOf(j2));
                        if (l != null) {
                            if (l.longValue() > j) {
                                treeMap.put(Long.valueOf(j2), Long.valueOf(j));
                                break;
                            }
                        } else {
                            treeMap.put(Long.valueOf(j2), Long.valueOf(j));
                            break;
                        }
                    }
                }
                break;
            default:
                if (!this.Y) {
                    if (message.what == 1) {
                        b4b b4bVar = (b4b) message.obj;
                        long j3 = b4bVar.a;
                        TreeMap treeMap2 = this.c;
                        long j4 = b4bVar.b;
                        Long l2 = (Long) treeMap2.get(Long.valueOf(j4));
                        if (l2 != null) {
                            if (l2.longValue() > j3) {
                                treeMap2.put(Long.valueOf(j4), Long.valueOf(j3));
                                break;
                            }
                        } else {
                            treeMap2.put(Long.valueOf(j4), Long.valueOf(j3));
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }

    public e4b(i14 i14Var, ey1 ey1Var, n64 n64Var) {
        this.a = 1;
        this.u0 = i14Var;
        this.s0 = ey1Var;
        this.Z = n64Var;
        this.c = new TreeMap();
        this.b = oaf.o(this);
        this.t0 = new xo(1);
    }
}
