package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class xlc implements zde, yde {
    public static final TreeMap t0 = new TreeMap();
    public final String[] X;
    public final byte[][] Y;
    public final int[] Z;
    public final int a;
    public volatile String b;
    public final long[] c;
    public final double[] o;
    public int s0;

    public xlc(int i) {
        this.a = i;
        int i2 = i + 1;
        this.Z = new int[i2];
        this.c = new long[i2];
        this.o = new double[i2];
        this.X = new String[i2];
        this.Y = new byte[i2][];
    }

    public static final xlc a(int i, String str) {
        TreeMap treeMap = t0;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (entryCeilingEntry == null) {
                xlc xlcVar = new xlc(i);
                xlcVar.b = str;
                xlcVar.s0 = i;
                return xlcVar;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            xlc xlcVar2 = (xlc) entryCeilingEntry.getValue();
            xlcVar2.b = str;
            xlcVar2.s0 = i;
            return xlcVar2;
        }
    }

    @Override // defpackage.zde
    public final void S(yde ydeVar) {
        int i = this.s0;
        if (1 > i) {
            return;
        }
        int i2 = 1;
        while (true) {
            int i3 = this.Z[i2];
            if (i3 == 1) {
                ydeVar.W(i2);
            } else if (i3 == 2) {
                ydeVar.j(i2, this.c[i2]);
            } else if (i3 == 3) {
                ydeVar.h(i2, this.o[i2]);
            } else if (i3 == 4) {
                String str = this.X[i2];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                ydeVar.f(i2, str);
            } else if (i3 == 5) {
                byte[] bArr = this.Y[i2];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                ydeVar.k(i2, bArr);
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // defpackage.yde
    public final void W(int i) {
        this.Z[i] = 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.yde
    public final void f(int i, String str) {
        this.Z[i] = 4;
        this.X[i] = str;
    }

    @Override // defpackage.yde
    public final void h(int i, double d) {
        this.Z[i] = 3;
        this.o[i] = d;
    }

    @Override // defpackage.yde
    public final void j(int i, long j) {
        this.Z[i] = 2;
        this.c[i] = j;
    }

    @Override // defpackage.yde
    public final void k(int i, byte[] bArr) {
        this.Z[i] = 5;
        this.Y[i] = bArr;
    }

    @Override // defpackage.zde
    public final String m() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final void n() {
        TreeMap treeMap = t0;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.a), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }
}
