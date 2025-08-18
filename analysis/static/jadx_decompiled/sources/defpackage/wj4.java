package defpackage;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class wj4 {
    public final int a;
    public boolean b;
    public int c;
    public final Object d;
    public final Serializable e;
    public Object f;
    public final Object g;

    /* JADX WARN: Multi-variable type inference failed */
    public wj4(hm9 hm9Var, ArrayList arrayList, int[] iArr, int[] iArr2) {
        int[] iArr3;
        int[] iArr4;
        hm9 hm9Var2;
        int i;
        vj4 vj4Var;
        int i2;
        this.d = arrayList;
        this.e = iArr;
        this.f = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.g = hm9Var;
        int iF = hm9Var.F();
        this.a = iF;
        int iD = hm9Var.D();
        this.c = iD;
        this.b = true;
        vj4 vj4Var2 = arrayList.isEmpty() ? null : (vj4) arrayList.get(0);
        if (vj4Var2 == null || vj4Var2.a != 0 || vj4Var2.b != 0) {
            arrayList.add(0, new vj4(0, 0, 0));
        }
        arrayList.add(new vj4(iF, iD, 0));
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            iArr3 = (int[]) this.f;
            iArr4 = (int[]) this.e;
            hm9Var2 = (hm9) this.g;
            if (!zHasNext) {
                break;
            }
            vj4 vj4Var3 = (vj4) it.next();
            for (int i3 = 0; i3 < vj4Var3.c; i3++) {
                int i4 = vj4Var3.a + i3;
                int i5 = vj4Var3.b + i3;
                int i6 = hm9Var2.c(i4, i5) ? 1 : 2;
                iArr4[i4] = (i5 << 4) | i6;
                iArr3[i5] = (i4 << 4) | i6;
            }
        }
        if (this.b) {
            Iterator it2 = arrayList.iterator();
            int i7 = 0;
            while (it2.hasNext()) {
                vj4 vj4Var4 = (vj4) it2.next();
                while (true) {
                    i = vj4Var4.a;
                    if (i7 < i) {
                        if (iArr4[i7] == 0) {
                            int size = arrayList.size();
                            int i8 = 0;
                            int i9 = 0;
                            while (true) {
                                if (i8 < size) {
                                    vj4Var = (vj4) arrayList.get(i8);
                                    while (true) {
                                        i2 = vj4Var.b;
                                        if (i9 < i2) {
                                            if (iArr3[i9] == 0 && hm9Var2.d(i7, i9)) {
                                                int i10 = hm9Var2.c(i7, i9) ? 8 : 4;
                                                iArr4[i7] = (i9 << 4) | i10;
                                                iArr3[i9] = i10 | (i7 << 4);
                                            } else {
                                                i9++;
                                            }
                                        }
                                    }
                                }
                                i9 = vj4Var.c + i2;
                                i8++;
                            }
                        }
                        i7++;
                    }
                }
                i7 = vj4Var4.c + i;
            }
        }
    }

    public static xj4 b(ArrayDeque arrayDeque, int i, boolean z) {
        xj4 xj4Var;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                xj4Var = null;
                break;
            }
            xj4Var = (xj4) it.next();
            if (xj4Var.a == i && xj4Var.c == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            xj4 xj4Var2 = (xj4) it.next();
            if (z) {
                xj4Var2.b--;
            } else {
                xj4Var2.b++;
            }
        }
        return xj4Var;
    }

    public void a(xl7 xl7Var) {
        int[] iArr;
        hm9 hm9Var;
        int i;
        int i2;
        List list;
        int i3;
        wj4 wj4Var = this;
        gl0 gl0Var = xl7Var instanceof gl0 ? (gl0) xl7Var : new gl0(xl7Var);
        ArrayDeque arrayDeque = new ArrayDeque();
        List list2 = (List) wj4Var.d;
        int size = list2.size() - 1;
        int i4 = wj4Var.a;
        int i5 = wj4Var.c;
        int i6 = i4;
        while (size >= 0) {
            vj4 vj4Var = (vj4) list2.get(size);
            int i7 = vj4Var.a;
            int i8 = vj4Var.c;
            int i9 = i7 + i8;
            int i10 = vj4Var.b;
            int i11 = i10 + i8;
            while (true) {
                iArr = (int[]) wj4Var.e;
                hm9Var = (hm9) wj4Var.g;
                i = 0;
                if (i6 <= i9) {
                    break;
                }
                i6--;
                int i12 = iArr[i6];
                if ((i12 & 12) != 0) {
                    list = list2;
                    int i13 = i12 >> 4;
                    xj4 xj4VarB = b(arrayDeque, i13, false);
                    if (xj4VarB != null) {
                        i3 = i5;
                        int i14 = (i4 - xj4VarB.b) - 1;
                        gl0Var.a(i6, i14);
                        if ((i12 & 4) != 0) {
                            gl0Var.o(i14, 1, hm9Var.A(i6, i13));
                        }
                    } else {
                        i3 = i5;
                        arrayDeque.add(new xj4(i6, (i4 - i6) - 1, true));
                    }
                } else {
                    list = list2;
                    i3 = i5;
                    gl0Var.m(i6, 1);
                    i4--;
                }
                list2 = list;
                i5 = i3;
            }
            List list3 = list2;
            while (i5 > i11) {
                i5--;
                int i15 = ((int[]) wj4Var.f)[i5];
                if ((i15 & 12) != 0) {
                    int i16 = i15 >> 4;
                    xj4 xj4VarB2 = b(arrayDeque, i16, true);
                    if (xj4VarB2 == null) {
                        arrayDeque.add(new xj4(i5, i4 - i6, false));
                        i2 = 0;
                    } else {
                        i2 = 0;
                        gl0Var.a((i4 - xj4VarB2.b) - 1, i6);
                        if ((i15 & 4) != 0) {
                            gl0Var.o(i6, 1, hm9Var.A(i16, i5));
                        }
                    }
                } else {
                    i2 = i;
                    gl0Var.e(i6, 1);
                    i4++;
                }
                wj4Var = this;
                i = i2;
            }
            i6 = vj4Var.a;
            int i17 = i6;
            int i18 = i10;
            while (i < i8) {
                if ((iArr[i17] & 15) == 2) {
                    gl0Var.o(i17, 1, hm9Var.A(i17, i18));
                }
                i17++;
                i18++;
                i++;
            }
            size--;
            wj4Var = this;
            i5 = i10;
            list2 = list3;
        }
        gl0Var.b();
    }

    public wj4(adc adcVar, see seeVar, bue bueVar, int i) {
        this.g = adcVar;
        this.b = false;
        this.c = 0;
        this.f = null;
        this.d = seeVar;
        this.e = bueVar;
        this.a = i;
    }
}
