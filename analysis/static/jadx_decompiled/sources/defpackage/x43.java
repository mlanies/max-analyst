package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.Serializable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class x43 {
    public final byte[] a;
    public final int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g = Integer.MAX_VALUE;
    public int h;

    public x43(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i2 + i;
        this.e = i;
    }

    public final void a(int i) throws InvalidProtocolBufferNanoException {
        if (this.f != i) {
            throw new InvalidProtocolBufferNanoException("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int b() {
        int i = this.g;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.e;
    }

    public final int c() {
        return this.e - this.b;
    }

    public final void d(int i) {
        this.g = i;
        int i2 = this.c + this.d;
        this.c = i2;
        if (i2 <= i) {
            this.d = 0;
            return;
        }
        int i3 = i2 - i;
        this.d = i3;
        this.c = i2 - i3;
    }

    public final int e(int i) throws InvalidProtocolBufferNanoException {
        if (i < 0) {
            throw new InvalidProtocolBufferNanoException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = i + this.e;
        int i3 = this.g;
        if (i2 > i3) {
            throw InvalidProtocolBufferNanoException.a();
        }
        this.g = i2;
        int i4 = this.c + this.d;
        this.c = i4;
        if (i4 > i2) {
            int i5 = i4 - i2;
            this.d = i5;
            this.c = i4 - i5;
        } else {
            this.d = 0;
        }
        return i3;
    }

    public final boolean f() {
        return p() != 0;
    }

    public final byte[] g() throws InvalidProtocolBufferNanoException {
        int iP = p();
        int i = this.c;
        int i2 = this.e;
        if (iP > i - i2 || iP <= 0) {
            return iP == 0 ? nd7.g : m(iP);
        }
        byte[] bArr = new byte[iP];
        System.arraycopy(this.a, i2, bArr, 0, iP);
        this.e += iP;
        return bArr;
    }

    public final double h() {
        return Double.longBitsToDouble(o());
    }

    public final float i() {
        return Float.intBitsToFloat(n());
    }

    public final void j(qw8 qw8Var) throws InvalidProtocolBufferNanoException {
        int iP = p();
        if (this.h >= 64) {
            throw new InvalidProtocolBufferNanoException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iE = e(iP);
        this.h++;
        qw8Var.mergeFrom(this);
        a(0);
        this.h--;
        d(iE);
    }

    /* JADX WARN: Type inference failed for: r4v18, types: [byte[], java.io.Serializable] */
    public final Serializable k(int i) throws InvalidProtocolBufferNanoException {
        switch (i) {
            case 1:
                return Double.valueOf(h());
            case 2:
                return Float.valueOf(i());
            case 3:
                return Long.valueOf(q());
            case 4:
                return Long.valueOf(q());
            case 5:
                return Integer.valueOf(p());
            case 6:
                return Long.valueOf(o());
            case 7:
                return Integer.valueOf(n());
            case 8:
                return Boolean.valueOf(f());
            case 9:
                return r();
            case 10:
            case 11:
            default:
                throw new IllegalArgumentException(zr6.h(i, "Unknown type "));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return g();
            case 13:
                return Integer.valueOf(p());
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return Integer.valueOf(p());
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return Integer.valueOf(n());
            case 16:
                return Long.valueOf(o());
            case LangUtils.HASH_SEED /* 17 */:
                int iP = p();
                return Integer.valueOf((-(iP & 1)) ^ (iP >>> 1));
            case 18:
                long jQ = q();
                return Long.valueOf((-(jQ & 1)) ^ (jQ >>> 1));
        }
    }

    public final byte l() throws InvalidProtocolBufferNanoException {
        int i = this.e;
        if (i == this.c) {
            throw InvalidProtocolBufferNanoException.a();
        }
        this.e = i + 1;
        return this.a[i];
    }

    public final byte[] m(int i) throws InvalidProtocolBufferNanoException {
        if (i < 0) {
            throw new InvalidProtocolBufferNanoException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.e;
        int i3 = i2 + i;
        int i4 = this.g;
        if (i3 > i4) {
            v(i4 - i2);
            throw InvalidProtocolBufferNanoException.a();
        }
        if (i > this.c - i2) {
            throw InvalidProtocolBufferNanoException.a();
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.a, i2, bArr, 0, i);
        this.e += i;
        return bArr;
    }

    public final int n() throws InvalidProtocolBufferNanoException {
        byte bL = l();
        byte bL2 = l();
        byte bL3 = l();
        return ((l() & 255) << 24) | (bL & 255) | ((bL2 & 255) << 8) | ((bL3 & 255) << 16);
    }

    public final long o() throws InvalidProtocolBufferNanoException {
        return ((l() & 255) << 8) | (l() & 255) | ((l() & 255) << 16) | ((l() & 255) << 24) | ((l() & 255) << 32) | ((l() & 255) << 40) | ((l() & 255) << 48) | ((l() & 255) << 56);
    }

    public final int p() throws InvalidProtocolBufferNanoException {
        int i;
        byte bL = l();
        if (bL >= 0) {
            return bL;
        }
        int i2 = bL & Byte.MAX_VALUE;
        byte bL2 = l();
        if (bL2 >= 0) {
            i = bL2 << 7;
        } else {
            i2 |= (bL2 & Byte.MAX_VALUE) << 7;
            byte bL3 = l();
            if (bL3 >= 0) {
                i = bL3 << 14;
            } else {
                i2 |= (bL3 & Byte.MAX_VALUE) << 14;
                byte bL4 = l();
                if (bL4 < 0) {
                    int i3 = i2 | ((bL4 & Byte.MAX_VALUE) << 21);
                    byte bL5 = l();
                    int i4 = i3 | (bL5 << 28);
                    if (bL5 >= 0) {
                        return i4;
                    }
                    for (int i5 = 0; i5 < 5; i5++) {
                        if (l() >= 0) {
                            return i4;
                        }
                    }
                    throw new InvalidProtocolBufferNanoException("CodedInputStream encountered a malformed varint.");
                }
                i = bL4 << 21;
            }
        }
        return i | i2;
    }

    public final long q() throws InvalidProtocolBufferNanoException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((l() & 128) == 0) {
                return j;
            }
        }
        throw new InvalidProtocolBufferNanoException("CodedInputStream encountered a malformed varint.");
    }

    public final String r() throws InvalidProtocolBufferNanoException {
        int iP = p();
        int i = this.c;
        int i2 = this.e;
        if (iP > i - i2 || iP <= 0) {
            return new String(m(iP), y37.a);
        }
        String str = new String(this.a, i2, iP, y37.a);
        this.e += iP;
        return str;
    }

    public final int s() throws InvalidProtocolBufferNanoException {
        if (this.e == this.c) {
            this.f = 0;
            return 0;
        }
        int iP = p();
        this.f = iP;
        if (iP != 0) {
            return iP;
        }
        throw new InvalidProtocolBufferNanoException("Protocol message contained an invalid tag (zero).");
    }

    public final void t(int i) {
        int i2 = this.e;
        int i3 = this.b;
        if (i > i2 - i3) {
            StringBuilder sbN = rh4.n(i, "Position ", " is beyond current ");
            sbN.append(this.e - i3);
            throw new IllegalArgumentException(sbN.toString());
        }
        if (i < 0) {
            throw new IllegalArgumentException(zr6.h(i, "Bad position "));
        }
        this.e = i3 + i;
    }

    public final boolean u(int i) {
        int iS;
        int i2 = i & 7;
        if (i2 == 0) {
            p();
            return true;
        }
        if (i2 == 1) {
            o();
            return true;
        }
        if (i2 == 2) {
            v(p());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw new InvalidProtocolBufferNanoException("Protocol message tag had invalid wire type.");
            }
            n();
            return true;
        }
        do {
            iS = s();
            if (iS == 0) {
                break;
            }
        } while (u(iS));
        a(((i >>> 3) << 3) | 4);
        return true;
    }

    public final void v(int i) throws InvalidProtocolBufferNanoException {
        if (i < 0) {
            throw new InvalidProtocolBufferNanoException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.e;
        int i3 = i2 + i;
        int i4 = this.g;
        if (i3 > i4) {
            v(i4 - i2);
            throw InvalidProtocolBufferNanoException.a();
        }
        if (i > this.c - i2) {
            throw InvalidProtocolBufferNanoException.a();
        }
        this.e = i3;
    }
}
