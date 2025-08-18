package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import ru.ok.android.api.json.JsonSyntaxException;

/* loaded from: classes2.dex */
public final class va7 implements Closeable {
    public final Reader a;
    public int b = Integer.MIN_VALUE;
    public final char[] c = new char[32];
    public int o;

    public va7(InputStreamReader inputStreamReader) {
        this.a = inputStreamReader;
    }

    public final int S() throws IOException {
        int iO = o();
        if (iO == -1) {
            return 0;
        }
        int i = 34;
        if (iO != 34) {
            i = 91;
            if (iO != 91) {
                i = 93;
                if (iO != 93) {
                    if (iO == 102) {
                        return 98;
                    }
                    int i2 = 110;
                    if (iO != 110) {
                        if (iO == 116) {
                            return 98;
                        }
                        i2 = 123;
                        if (iO != 123) {
                            i2 = 125;
                            if (iO != 125) {
                                i2 = 44;
                                if (iO != 44) {
                                    if (iO == 45) {
                                        return 49;
                                    }
                                    switch (iO) {
                                        case 48:
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                            return 49;
                                        case 58:
                                            return 58;
                                        default:
                                            throw JsonSyntaxException.a(this.o, m(), this.b);
                                    }
                                }
                            }
                        }
                    }
                    return i2;
                }
            }
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x01e8, code lost:
    
        throw ru.ok.android.api.json.JsonSyntaxException.a(r16.o, m(), r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Appendable r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.va7.a(java.lang.Appendable):void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b = Integer.MIN_VALUE;
        this.a.close();
    }

    public final void d(int i) throws IOException {
        int iS = S();
        if (iS != i) {
            throw JsonSyntaxException.b(this.o, m(), iS);
        }
    }

    public final void g(int i) throws IOException {
        int iN = n();
        if (iN != i) {
            throw JsonSyntaxException.a(this.o, m(), iN);
        }
    }

    public final String m() {
        StringBuilder sb = new StringBuilder(32);
        int i = this.o;
        char[] cArr = this.c;
        if (i < 32) {
            sb.append(cArr, 0, i);
        } else {
            int i2 = i % 32;
            sb.append(cArr, i2, 32 - i2);
            sb.append(cArr, 0, i2);
        }
        return sb.toString();
    }

    public final int n() throws IOException {
        try {
            int i = this.a.read();
            if (i != -1) {
                char[] cArr = this.c;
                int i2 = this.o;
                cArr[i2 % 32] = (char) i;
                this.o = i2 + 1;
            }
            return i;
        } catch (IOException e) {
            this.b = Integer.MIN_VALUE;
            throw e;
        }
    }

    public final int o() throws IOException {
        int iN;
        int i = this.b;
        if (i >= -1) {
            return i;
        }
        while (true) {
            iN = n();
            if (iN != 9 && iN != 10 && iN != 13 && iN != 32 && (iN != 65279 || this.o != 1)) {
                break;
            }
        }
        this.b = iN;
        return iN;
    }
}
