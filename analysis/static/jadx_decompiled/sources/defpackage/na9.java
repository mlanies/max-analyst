package defpackage;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class na9 extends t68 {
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final je7 h;
    public final khe i;

    public na9(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6) {
        super(je7Var6, je7Var3);
        this.e = je7Var;
        this.f = je7Var2;
        this.g = je7Var4;
        this.h = je7Var5;
        this.i = new khe(new z30(18, je7Var));
    }

    @Override // defpackage.t68
    public final qw8 a() {
        List list = (List) ((AtomicReference) this.c).get();
        n07 n07Var = new n07();
        int size = list.size();
        m07[] m07VarArr = new m07[size];
        for (int i = 0; i < size; i++) {
            ma9 ma9Var = (ma9) list.get(i);
            m07 m07Var = new m07();
            try {
                m07Var.a = ma9Var.a;
                m07Var.b = ma9Var.b.toString();
                CharSequence charSequence = ma9Var.c;
                String string = charSequence != null ? charSequence.toString() : null;
                String str = "";
                if (string == null) {
                    string = "";
                }
                m07Var.c = string;
                m07Var.d = ma9Var.d;
                Object[] objArr = ma9Var.e;
                if (objArr != null) {
                    m07Var.q = (q07[]) objArr;
                }
                String str2 = ma9Var.g;
                if (str2 == null) {
                    str2 = "";
                }
                m07Var.e = str2;
                m07Var.f = ma9Var.h;
                m07Var.g = ma9Var.i;
                m07Var.h = ma9Var.j;
                m07Var.i = ma9Var.k;
                m07Var.j = ma9Var.l;
                m07Var.k = ma9Var.m;
                m07Var.l = ma9Var.n;
                Long l = ma9Var.o;
                m07Var.m = l != null ? l.longValue() : -1L;
                String str3 = ma9Var.r;
                if (str3 == null) {
                    str3 = "";
                }
                m07Var.n = str3;
                byte[] bArr = ma9Var.s;
                if (bArr == null) {
                    bArr = nd7.g;
                }
                m07Var.o = bArr;
                CharSequence charSequence2 = ma9Var.f;
                String string2 = charSequence2 != null ? charSequence2.toString() : null;
                if (string2 != null) {
                    str = string2;
                }
                m07Var.p = str;
                m07Var.r = ma9Var.p;
                m07Var.s = ma9Var.q.toString();
                m07Var.t = ma9Var.u;
            } catch (Throwable th) {
                hm9.p(ma9.class.getName(), "toProto error", th);
            }
            m07VarArr[i] = m07Var;
        }
        n07Var.a = m07VarArr;
        return n07Var;
    }

    @Override // defpackage.t68
    public final zy b() {
        return (zy) this.i.getValue();
    }

    @Override // defpackage.t68
    public final Boolean e(byte[] bArr) {
        Object njcVar;
        o43 o43VarH;
        File file = new File(((kk5) ((zi5) this.e.getValue())).c(), "chats_v1");
        try {
            njcVar = Boolean.valueOf(file.exists() ? file.delete() : false);
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        Object obj = Boolean.FALSE;
        if (njcVar instanceof njc) {
            njcVar = obj;
        }
        if (((Boolean) njcVar).booleanValue()) {
            String strC = c();
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.Y, strC, "prev file " + file + " deleted!", null);
            }
        }
        long jNanoTime = System.nanoTime();
        String strC2 = c();
        ir6 ir6Var2 = hm9.m;
        if (ir6Var2 != null && ir6Var2.c()) {
            ir6Var2.d(us7.Y, strC2, "loadData start", null);
        }
        lq8 lq8Var = ((iv6) this.f.getValue()).f;
        try {
            try {
                n07 n07Var = (n07) qw8.mergeFrom(new n07(), bArr);
                int length = n07Var.a.length;
                ArrayList arrayList = new ArrayList(length);
                Object[] objArrCopyOf = length == 0 ? ema.b : new Object[length];
                m07[] m07VarArr = n07Var.a;
                int i = 0;
                int i2 = 0;
                while (i2 < m07VarArr.length) {
                    int i3 = i2 + 1;
                    try {
                        ma9 ma9VarA = np8.a(m07VarArr[i2], new wz7(10, this));
                        arrayList.add(ma9VarA);
                        String str = ma9VarA.r;
                        if (str == null) {
                            i2 = i3;
                        } else {
                            vc0 vc0Var = h5a.a;
                            wv6 wv6VarB = h5a.b(str, j5a.a, 4);
                            int i4 = i + 1;
                            if (objArrCopyOf.length < i4) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, Math.max(i4, (objArrCopyOf.length * 3) / 2));
                            }
                            objArrCopyOf[i] = wv6VarB;
                            do0 do0VarD = ((iv6) this.f.getValue()).d(wv6VarB, this);
                            byte[] bArr2 = ma9VarA.s;
                            if (bArr2 != null) {
                                ((io0) this.h.getValue()).getClass();
                                Bitmap bitmapA = io0.a(bArr2);
                                if (bitmapA != null && qo0.d(bitmapA) != 0 && (o43VarH = lq8Var.h(do0VarD, o43.o0(CloseableStaticBitmap.of(bitmapA, ((m5b) ((je7) this.b).getValue()).a(), hx6.d, 0)))) != null) {
                                    o43VarH.close();
                                }
                            }
                            i2 = i3;
                            i = i4;
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        throw new NoSuchElementException(e.getMessage());
                    }
                }
                ((AtomicReference) this.c).set(arrayList);
                for (int i5 = 0; i5 < i; i5++) {
                    ((iv6) this.f.getValue()).f((wv6) objArrCopyOf[i5], this);
                }
                String strC3 = c();
                ir6 ir6Var3 = hm9.m;
                if (ir6Var3 != null && ir6Var3.c()) {
                    us7 us7Var = us7.Y;
                    int i6 = ft4.o;
                    ir6Var3.d(us7Var, strC3, "loadData finish ".concat(ft4.j(z7.S(System.nanoTime() - jNanoTime, kt4.NANOSECONDS))), null);
                }
                return Boolean.TRUE;
            } catch (Throwable th2) {
                String strC4 = c();
                ir6 ir6Var4 = hm9.m;
                if (ir6Var4 != null && ir6Var4.c()) {
                    us7 us7Var2 = us7.Y;
                    int i7 = ft4.o;
                    ir6Var4.d(us7Var2, strC4, "loadData finish ".concat(ft4.j(z7.S(System.nanoTime() - jNanoTime, kt4.NANOSECONDS))), null);
                }
                throw th2;
            }
        } catch (InterruptedException e2) {
            throw e2;
        } catch (Throwable th3) {
            hm9.p(c(), "fail to parse", th3);
            Boolean bool = Boolean.FALSE;
            String strC5 = c();
            ir6 ir6Var5 = hm9.m;
            if (ir6Var5 != null && ir6Var5.c()) {
                us7 us7Var3 = us7.Y;
                int i8 = ft4.o;
                ir6Var5.d(us7Var3, strC5, "loadData finish ".concat(ft4.j(z7.S(System.nanoTime() - jNanoTime, kt4.NANOSECONDS))), null);
            }
            return bool;
        }
    }
}
