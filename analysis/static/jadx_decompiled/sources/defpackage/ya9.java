package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class ya9 extends t68 {
    public final int e;
    public final je7 f;
    public final khe g;

    public ya9(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4) {
        super(je7Var2, je7Var3);
        this.e = 12;
        this.f = je7Var4;
        this.g = new khe(new z30(19, je7Var));
    }

    @Override // defpackage.t68
    public final qw8 a() {
        List listY0 = x53.y0((Iterable) ((AtomicReference) this.c).get(), this.e);
        p07 p07Var = new p07();
        int size = listY0.size();
        o07[] o07VarArr = new o07[size];
        for (int i = 0; i < size; i++) {
            xa9 xa9Var = (xa9) listY0.get(i);
            ArrayList arrayListB = ((nob) this.f.getValue()).b(xa9Var.b);
            q07[] q07VarArr = arrayListB != null ? (q07[]) arrayListB.toArray(new q07[0]) : null;
            o07 o07Var = new o07();
            o07Var.a = xa9Var.a;
            o07Var.b = xa9Var.b.toString();
            o07Var.c = xa9Var.c.a;
            o07Var.d = xfg.j(xa9Var.d);
            if (q07VarArr != null && q07VarArr.length != 0) {
                o07Var.e = q07VarArr;
            }
            o07VarArr[i] = o07Var;
        }
        p07Var.a = o07VarArr;
        return p07Var;
    }

    @Override // defpackage.t68
    public final zy b() {
        return (zy) this.g.getValue();
    }

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.t68
    public final Boolean e(byte[] bArr) {
        long jNanoTime = System.nanoTime();
        String strC = c();
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.Y, strC, "loadData start", null);
        }
        try {
            try {
                try {
                    p07 p07Var = (p07) qw8.mergeFrom(new p07(), bArr);
                    ArrayList arrayList = new ArrayList(p07Var.a.length);
                    o07[] o07VarArr = p07Var.a;
                    int i = 0;
                    while (i < o07VarArr.length) {
                        int i2 = i + 1;
                        try {
                            o07 o07Var = o07VarArr[i];
                            String str = o07Var.a;
                            CharSequence charSequenceA = ((nob) this.f.getValue()).a(o07Var.b, o07Var.e);
                            int i3 = o07Var.c;
                            arrayList.add(new xa9(str, charSequenceA, i3 == 0 ? hy3.b : new hy3(i3), xfg.m(o07Var.d)));
                            i = i2;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            throw new NoSuchElementException(e.getMessage());
                        }
                    }
                    ((AtomicReference) this.c).set(arrayList);
                    String strC2 = c();
                    ir6 ir6Var2 = hm9.m;
                    if (ir6Var2 != null && ir6Var2.c()) {
                        us7 us7Var = us7.Y;
                        int i4 = ft4.o;
                        ir6Var2.d(us7Var, strC2, "loadData finish ".concat(ft4.j(z7.S(System.nanoTime() - jNanoTime, kt4.NANOSECONDS))), null);
                    }
                    return Boolean.TRUE;
                } catch (Throwable unused) {
                    Boolean bool = Boolean.FALSE;
                    String strC3 = c();
                    ir6 ir6Var3 = hm9.m;
                    if (ir6Var3 != null && ir6Var3.c()) {
                        us7 us7Var2 = us7.Y;
                        int i5 = ft4.o;
                        ir6Var3.d(us7Var2, strC3, "loadData finish ".concat(ft4.j(z7.S(System.nanoTime() - jNanoTime, kt4.NANOSECONDS))), null);
                    }
                    return bool;
                }
            } catch (InterruptedException e2) {
                throw e2;
            }
        } catch (Throwable th) {
            String strC4 = c();
            ir6 ir6Var4 = hm9.m;
            if (ir6Var4 != null && ir6Var4.c()) {
                us7 us7Var3 = us7.Y;
                int i6 = ft4.o;
                ir6Var4.d(us7Var3, strC4, "loadData finish ".concat(ft4.j(z7.S(System.nanoTime() - jNanoTime, kt4.NANOSECONDS))), null);
            }
            throw th;
        }
    }
}
