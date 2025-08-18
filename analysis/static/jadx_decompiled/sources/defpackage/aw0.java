package defpackage;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes.dex */
public class aw0 implements Serializable, Comparable {
    public static final aw0 o = new aw0(new byte[0]);
    public transient int a;
    public transient String b;
    public final byte[] c;

    public aw0(byte[] bArr) {
        this.c = bArr;
    }

    public String a() {
        byte[] bArr = a.a;
        byte[] bArr2 = this.c;
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr2[i];
            int i3 = i + 2;
            byte b2 = bArr2[i + 1];
            i += 3;
            byte b3 = bArr2[i3];
            bArr3[i2] = bArr[(b & 255) >> 2];
            bArr3[i2 + 1] = bArr[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr3[i2 + 2] = bArr[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 += 4;
            bArr3[i4] = bArr[b3 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b4 = bArr2[i];
            bArr3[i2] = bArr[(b4 & 255) >> 2];
            bArr3[i2 + 1] = bArr[(b4 & 3) << 4];
            byte b5 = (byte) 61;
            bArr3[i2 + 2] = b5;
            bArr3[i2 + 3] = b5;
        } else if (length2 == 2) {
            int i5 = i + 1;
            byte b6 = bArr2[i];
            byte b7 = bArr2[i5];
            bArr3[i2] = bArr[(b6 & 255) >> 2];
            bArr3[i2 + 1] = bArr[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr3[i2 + 2] = bArr[(b7 & 15) << 2];
            bArr3[i2 + 3] = (byte) 61;
        }
        return new String(bArr3, a52.a);
    }

    public aw0 b(String str) {
        return new aw0(MessageDigest.getInstance(str).digest(this.c));
    }

    public int c() {
        return this.c.length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compareTo(java.lang.Object r10) {
        /*
            r9 = this;
            aw0 r10 = (defpackage.aw0) r10
            int r0 = r9.c()
            int r1 = r10.c()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L10:
            r5 = 1
            r6 = -1
            if (r4 >= r2) goto L2b
            byte r7 = r9.f(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.f(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L25
            int r4 = r4 + 1
            goto L10
        L25:
            if (r7 >= r8) goto L29
        L27:
            r3 = r6
            goto L31
        L29:
            r3 = r5
            goto L31
        L2b:
            if (r0 != r1) goto L2e
            goto L31
        L2e:
            if (r0 >= r1) goto L29
            goto L27
        L31:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aw0.compareTo(java.lang.Object):int");
    }

    public String d() {
        byte[] bArr = this.c;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = z04.a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public byte[] e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aw0) {
            aw0 aw0Var = (aw0) obj;
            int iC = aw0Var.c();
            byte[] bArr = this.c;
            if (iC == bArr.length && aw0Var.g(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public byte f(int i) {
        return this.c[i];
    }

    public boolean g(int i, int i2, int i3, byte[] bArr) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.c;
        if (i > bArr2.length - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr2[i4 + i] != bArr[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public boolean h(int i, aw0 aw0Var) {
        return aw0Var.g(0, 0, i, this.c);
    }

    public int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.c);
        this.a = iHashCode;
        return iHashCode;
    }

    public aw0 i() {
        byte b;
        int i = 0;
        while (true) {
            byte[] bArr = this.c;
            if (i >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i];
            byte b3 = (byte) 65;
            if (b2 >= b3 && b2 <= (b = (byte) 90)) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                bArrCopyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b4 = bArrCopyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        bArrCopyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new aw0(bArrCopyOf);
            }
            i++;
        }
    }

    public final String j() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        String str2 = new String(e(), a52.a);
        this.b = str2;
        return str2;
    }

    public void k(bt0 bt0Var, int i) {
        bt0Var.write(this.c, 0, i);
    }

    public String toString() {
        byte b;
        int i;
        aw0 aw0Var = this;
        byte[] bArr = aw0Var.c;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            if (i2 >= length) {
                break;
            }
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                int i5 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && 31 >= b2) || (Byte.MAX_VALUE <= b2 && 159 >= b2))) || b2 == 65533) {
                    break;
                }
                i3 += b2 < 65536 ? 1 : 2;
                i2++;
                while (true) {
                    i4 = i5;
                    if (i2 < length && (b = bArr[i2]) >= 0) {
                        i2++;
                        i5 = i4 + 1;
                        if (i4 == 64) {
                            break loop0;
                        }
                        if ((b != 10 && b != 13 && ((b >= 0 && 31 >= b) || (Byte.MAX_VALUE <= b && 159 >= b))) || b == 65533) {
                            break loop0;
                        }
                        i3 += b < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
            } else if ((b2 >> 5) == -2) {
                int i6 = i2 + 1;
                if (length > i6) {
                    byte b3 = bArr[i6];
                    if ((b3 & 192) == 128) {
                        int i7 = (b3 ^ 3968) ^ (b2 << 6);
                        if (i7 >= 128) {
                            i = i4 + 1;
                            if (i4 == 64) {
                                break;
                            }
                            if ((i7 != 10 && i7 != 13 && ((i7 >= 0 && 31 >= i7) || (127 <= i7 && 159 >= i7))) || i7 == 65533) {
                                break;
                            }
                            i3 += i7 < 65536 ? 1 : 2;
                            i2 += 2;
                            i4 = i;
                        } else if (i4 != 64) {
                            break;
                        }
                    } else if (i4 != 64) {
                        break;
                    }
                } else if (i4 != 64) {
                    break;
                }
            } else if ((b2 >> 4) == -2) {
                int i8 = i2 + 2;
                if (length > i8) {
                    byte b4 = bArr[i2 + 1];
                    if ((b4 & 192) == 128) {
                        byte b5 = bArr[i8];
                        if ((b5 & 192) == 128) {
                            int i9 = ((b5 ^ (-123008)) ^ (b4 << 6)) ^ (b2 << 12);
                            if (i9 >= 2048) {
                                if (55296 > i9 || 57343 < i9) {
                                    i = i4 + 1;
                                    if (i4 == 64) {
                                        break;
                                    }
                                    if ((i9 != 10 && i9 != 13 && ((i9 >= 0 && 31 >= i9) || (127 <= i9 && 159 >= i9))) || i9 == 65533) {
                                        break;
                                    }
                                    i3 += i9 < 65536 ? 1 : 2;
                                    i2 += 3;
                                    i4 = i;
                                } else if (i4 != 64) {
                                    break;
                                }
                            } else if (i4 != 64) {
                                break;
                            }
                        } else if (i4 != 64) {
                            break;
                        }
                    } else if (i4 != 64) {
                        break;
                    }
                } else if (i4 != 64) {
                    break;
                }
            } else if ((b2 >> 3) == -2) {
                int i10 = i2 + 3;
                if (length > i10) {
                    byte b6 = bArr[i2 + 1];
                    if ((b6 & 192) == 128) {
                        byte b7 = bArr[i2 + 2];
                        if ((b7 & 192) == 128) {
                            byte b8 = bArr[i10];
                            if ((b8 & 192) == 128) {
                                int i11 = (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12)) ^ (b2 << 18);
                                if (i11 <= 1114111) {
                                    if (55296 > i11 || 57343 < i11) {
                                        if (i11 >= 65536) {
                                            i = i4 + 1;
                                            if (i4 == 64) {
                                                break;
                                            }
                                            if ((i11 != 10 && i11 != 13 && ((i11 >= 0 && 31 >= i11) || (127 <= i11 && 159 >= i11))) || i11 == 65533) {
                                                break;
                                            }
                                            i3 += i11 < 65536 ? 1 : 2;
                                            i2 += 4;
                                            i4 = i;
                                        } else if (i4 != 64) {
                                            break;
                                        }
                                    } else if (i4 != 64) {
                                        break;
                                    }
                                } else if (i4 != 64) {
                                    break;
                                }
                            } else if (i4 != 64) {
                                break;
                            }
                        } else if (i4 != 64) {
                            break;
                        }
                    } else if (i4 != 64) {
                        break;
                    }
                } else if (i4 != 64) {
                    break;
                }
            } else if (i4 != 64) {
                break;
            }
        }
        i3 = -1;
        if (i3 != -1) {
            String strJ = j();
            String strN0 = eae.n0(eae.n0(eae.n0(strJ.substring(0, i3), "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i3 >= strJ.length()) {
                return "[text=" + strN0 + ']';
            }
            return "[size=" + bArr.length + " text=" + strN0 + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + d() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(au1.h(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (64 != bArr.length) {
            aw0Var = new aw0(ys.Z(0, bArr, 64));
        }
        sb.append(aw0Var.d());
        sb.append("…]");
        return sb.toString();
    }
}
