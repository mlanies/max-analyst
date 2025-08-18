package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class kfc extends cx6 {
    public static final kfc s0 = new kfc(null, new Object[0], 0);
    public final transient Object X;
    public final transient Object[] Y;
    public final transient int Z;

    public kfc(Object obj, Object[] objArr, int i) {
        this.X = obj;
        this.Y = objArr;
        this.Z = i;
    }

    public static Object j(Object[] objArr, int i, int i2, int i3) {
        bx6 bx6Var = null;
        if (i == 1) {
            Objects.requireNonNull(objArr[i3]);
            Objects.requireNonNull(objArr[i3 ^ 1]);
            return null;
        }
        int i4 = i2 - 1;
        int i5 = -1;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            int i6 = 0;
            for (int i7 = 0; i7 < i; i7++) {
                int i8 = (i7 * 2) + i3;
                int i9 = (i6 * 2) + i3;
                Object obj = objArr[i8];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i8 ^ 1];
                Objects.requireNonNull(obj2);
                int iZ = xfg.z(obj.hashCode());
                while (true) {
                    int i10 = iZ & i4;
                    int i11 = bArr[i10] & 255;
                    if (i11 == 255) {
                        bArr[i10] = (byte) i9;
                        if (i6 < i7) {
                            objArr[i9] = obj;
                            objArr[i9 ^ 1] = obj2;
                        }
                        i6++;
                    } else {
                        if (obj.equals(objArr[i11])) {
                            int i12 = i11 ^ 1;
                            Object obj3 = objArr[i12];
                            Objects.requireNonNull(obj3);
                            bx6Var = new bx6(obj, obj2, obj3);
                            objArr[i12] = obj2;
                            break;
                        }
                        iZ = i10 + 1;
                    }
                }
            }
            return i6 == i ? bArr : new Object[]{bArr, Integer.valueOf(i6), bx6Var};
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i13 = 0;
            for (int i14 = 0; i14 < i; i14++) {
                int i15 = (i14 * 2) + i3;
                int i16 = (i13 * 2) + i3;
                Object obj4 = objArr[i15];
                Objects.requireNonNull(obj4);
                Object obj5 = objArr[i15 ^ 1];
                Objects.requireNonNull(obj5);
                int iZ2 = xfg.z(obj4.hashCode());
                while (true) {
                    int i17 = iZ2 & i4;
                    int i18 = sArr[i17] & 65535;
                    if (i18 == 65535) {
                        sArr[i17] = (short) i16;
                        if (i13 < i14) {
                            objArr[i16] = obj4;
                            objArr[i16 ^ 1] = obj5;
                        }
                        i13++;
                    } else {
                        if (obj4.equals(objArr[i18])) {
                            int i19 = i18 ^ 1;
                            Object obj6 = objArr[i19];
                            Objects.requireNonNull(obj6);
                            bx6Var = new bx6(obj4, obj5, obj6);
                            objArr[i19] = obj5;
                            break;
                        }
                        iZ2 = i17 + 1;
                    }
                }
            }
            return i13 == i ? sArr : new Object[]{sArr, Integer.valueOf(i13), bx6Var};
        }
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        int i20 = 0;
        int i21 = 0;
        while (i20 < i) {
            int i22 = (i20 * 2) + i3;
            int i23 = (i21 * 2) + i3;
            Object obj7 = objArr[i22];
            Objects.requireNonNull(obj7);
            Object obj8 = objArr[i22 ^ 1];
            Objects.requireNonNull(obj8);
            int iZ3 = xfg.z(obj7.hashCode());
            while (true) {
                int i24 = iZ3 & i4;
                int i25 = iArr[i24];
                if (i25 == i5) {
                    iArr[i24] = i23;
                    if (i21 < i20) {
                        objArr[i23] = obj7;
                        objArr[i23 ^ 1] = obj8;
                    }
                    i21++;
                } else {
                    if (obj7.equals(objArr[i25])) {
                        int i26 = i25 ^ 1;
                        Object obj9 = objArr[i26];
                        Objects.requireNonNull(obj9);
                        bx6Var = new bx6(obj7, obj8, obj9);
                        objArr[i26] = obj8;
                        break;
                    }
                    iZ3 = i24 + 1;
                    i5 = -1;
                }
            }
            i20++;
            i5 = -1;
        }
        return i21 == i ? iArr : new Object[]{iArr, Integer.valueOf(i21), bx6Var};
    }

    public static Object k(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iZ = xfg.z(obj2.hashCode());
            while (true) {
                int i3 = iZ & length;
                int i4 = bArr[i3] & 255;
                if (i4 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i4])) {
                    return objArr[i4 ^ 1];
                }
                iZ = i3 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iZ2 = xfg.z(obj2.hashCode());
            while (true) {
                int i5 = iZ2 & length2;
                int i6 = sArr[i5] & 65535;
                if (i6 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i6])) {
                    return objArr[i6 ^ 1];
                }
                iZ2 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iZ3 = xfg.z(obj2.hashCode());
            while (true) {
                int i7 = iZ3 & length3;
                int i8 = iArr[i7];
                if (i8 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i8])) {
                    return objArr[i8 ^ 1];
                }
                iZ3 = i7 + 1;
            }
        }
    }

    @Override // defpackage.cx6
    public final jx6 c() {
        return new hfc(this, this.Y, 0, this.Z);
    }

    @Override // defpackage.cx6
    public final jx6 d() {
        return new ifc(this, new jfc(0, this.Z, this.Y));
    }

    @Override // defpackage.cx6
    public final qw6 e() {
        return new jfc(1, this.Z, this.Y);
    }

    @Override // defpackage.cx6
    public final boolean g() {
        return false;
    }

    @Override // defpackage.cx6, java.util.Map
    public final Object get(Object obj) {
        Object objK = k(this.X, this.Y, this.Z, 0, obj);
        if (objK == null) {
            return null;
        }
        return objK;
    }

    @Override // java.util.Map
    public final int size() {
        return this.Z;
    }
}
