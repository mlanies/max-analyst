package defpackage;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class sv0 {
    public final /* synthetic */ int a = 2;
    public int b;
    public int c;
    public int d;
    public Serializable e;

    /* JADX WARN: Multi-variable type inference failed */
    public sv0(ByteBuffer[] byteBufferArr) {
        int length = byteBufferArr.length;
        this.e = byteBufferArr;
        this.b = 0;
        this.c = length;
        this.d = length;
        if (byteBufferArr.length < length) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.Serializable, java.lang.Object[]] */
    public void a(Object obj) {
        Object obj2;
        Object obj3;
        Object[] objArr = (Object[]) this.e;
        int i = this.b;
        int iHashCode = obj.hashCode() * (-1640531527);
        int i2 = (iHashCode ^ (iHashCode >>> 16)) & i;
        Object obj4 = objArr[i2];
        if (obj4 != null) {
            if (obj4.equals(obj)) {
                return;
            }
            do {
                i2 = (i2 + 1) & i;
                obj3 = objArr[i2];
                if (obj3 == null) {
                }
            } while (!obj3.equals(obj));
            return;
        }
        objArr[i2] = obj;
        int i3 = this.c + 1;
        this.c = i3;
        if (i3 < this.d) {
            return;
        }
        Object[] objArr2 = (Object[]) this.e;
        int length = objArr2.length;
        int i4 = length << 1;
        int i5 = i4 - 1;
        ?? r5 = new Object[i4];
        while (true) {
            int i6 = i3 - 1;
            if (i3 == 0) {
                this.b = i5;
                this.d = (int) (i4 * 0.75f);
                this.e = r5;
                return;
            }
            do {
                length--;
                obj2 = objArr2[length];
            } while (obj2 == null);
            int iHashCode2 = obj2.hashCode() * (-1640531527);
            int i7 = (iHashCode2 ^ (iHashCode2 >>> 16)) & i5;
            if (r5[i7] != 0) {
                do {
                    i7 = (i7 + 1) & i5;
                } while (r5[i7] != 0);
            }
            r5[i7] = objArr2[length];
            i3 = i6;
        }
    }

    public ui4 b() {
        fm9.f(this.c <= this.d);
        return new ui4(this);
    }

    public long c() {
        long jRemaining = 0;
        for (int i = this.b; i < this.d; i++) {
            jRemaining += ((ByteBuffer[]) this.e)[i].remaining();
        }
        return jRemaining;
    }

    public void d(int i, int i2, Object[] objArr) {
        int i3;
        Object obj;
        this.c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                obj = objArr[i3];
                if (obj == null) {
                    objArr[i] = null;
                    return;
                }
                int iHashCode = obj.hashCode() * (-1640531527);
                int i5 = (iHashCode ^ (iHashCode >>> 16)) & i2;
                if (i <= i3) {
                    if (i >= i5 || i5 > i3) {
                        break;
                    } else {
                        i4 = i3 + 1;
                    }
                } else if (i < i5 || i5 <= i3) {
                    i4 = i3 + 1;
                }
            }
            objArr[i] = obj;
            i = i3;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sbM = au1.m("ByteBufferSet[", Arrays.toString((ByteBuffer[]) this.e), ":");
                sbM.append(this.b);
                sbM.append(":");
                return zr6.j(sbM, this.c, "]");
            default:
                return super.toString();
        }
    }

    public sv0(ByteBuffer byteBuffer) {
        this(new ByteBuffer[]{byteBuffer});
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Object[]] */
    public sv0() {
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
        this.b = iNumberOfLeadingZeros - 1;
        this.d = (int) (0.75f * iNumberOfLeadingZeros);
        this.e = new Object[iNumberOfLeadingZeros];
    }

    public sv0(int i) {
        this.b = i;
    }
}
