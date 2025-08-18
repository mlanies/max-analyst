package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class y55 {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public y55(int i, byte[] bArr, int i2) {
        this(-1L, bArr, i, i2);
    }

    public static y55 a(String str) {
        byte[] bytes = str.concat("\u0000").getBytes(c65.Z);
        return new y55(2, bytes, bytes.length);
    }

    public static y55 b(long j, ByteOrder byteOrder) {
        return c(new long[]{j}, byteOrder);
    }

    public static y55 c(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[c65.Q[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j : jArr) {
            byteBufferWrap.putInt((int) j);
        }
        return new y55(4, byteBufferWrap.array(), jArr.length);
    }

    public static y55 d(a65[] a65VarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[c65.Q[5] * a65VarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (a65 a65Var : a65VarArr) {
            byteBufferWrap.putInt((int) a65Var.a);
            byteBufferWrap.putInt((int) a65Var.b);
        }
        return new y55(5, byteBufferWrap.array(), a65VarArr.length);
    }

    public static y55 e(int i, ByteOrder byteOrder) {
        return f(new int[]{i}, byteOrder);
    }

    public static y55 f(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[c65.Q[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i : iArr) {
            byteBufferWrap.putShort((short) i);
        }
        return new y55(3, byteBufferWrap.array(), iArr.length);
    }

    public final double g(ByteOrder byteOrder) {
        Object objJ = j(byteOrder);
        if (objJ == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objJ instanceof String) {
            return Double.parseDouble((String) objJ);
        }
        if (objJ instanceof long[]) {
            if (((long[]) objJ).length == 1) {
                return r3[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objJ instanceof int[]) {
            if (((int[]) objJ).length == 1) {
                return r3[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objJ instanceof double[]) {
            double[] dArr = (double[]) objJ;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objJ instanceof a65[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        a65[] a65VarArr = (a65[]) objJ;
        if (a65VarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        a65 a65Var = a65VarArr[0];
        return a65Var.a / a65Var.b;
    }

    public final int h(ByteOrder byteOrder) {
        Object objJ = j(byteOrder);
        if (objJ == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objJ instanceof String) {
            return Integer.parseInt((String) objJ);
        }
        if (objJ instanceof long[]) {
            long[] jArr = (long[]) objJ;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objJ instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objJ;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String i(ByteOrder byteOrder) {
        Object objJ = j(byteOrder);
        if (objJ == null) {
            return null;
        }
        if (objJ instanceof String) {
            return (String) objJ;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objJ instanceof long[]) {
            long[] jArr = (long[]) objJ;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objJ instanceof int[]) {
            int[] iArr = (int[]) objJ;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objJ instanceof double[]) {
            double[] dArr = (double[]) objJ;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objJ instanceof a65[])) {
            return null;
        }
        a65[] a65VarArr = (a65[]) objJ;
        while (i < a65VarArr.length) {
            sb.append(a65VarArr[i].a);
            sb.append('/');
            sb.append(a65VarArr[i].b);
            i++;
            if (i != a65VarArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:59|(2:61|(2:62|(2:64|(2:148|66)(1:67))(2:149|68)))|69|(2:71|(6:151|73|79|123|80|81)(3:74|(2:76|153)(2:77|152)|78))|150|79|123|80|81) */
    /* JADX WARN: Type inference failed for: r12v10, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r12v12, types: [a65[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v13, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v14, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v15, types: [a65[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v16, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v17, types: [double[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable j(java.nio.ByteOrder r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y55.j(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(c65.P[this.a]);
        sb.append(", data length:");
        return zr6.j(sb, this.d.length, ")");
    }

    public y55(long j, byte[] bArr, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bArr;
    }
}
