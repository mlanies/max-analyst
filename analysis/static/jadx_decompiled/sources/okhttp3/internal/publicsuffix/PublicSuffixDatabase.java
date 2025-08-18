package okhttp3.internal.publicsuffix;

import defpackage.at;
import defpackage.c54;
import defpackage.c6d;
import defpackage.hh6;
import defpackage.l6d;
import defpackage.mq9;
import defpackage.nz4;
import defpackage.oue;
import defpackage.q2b;
import defpackage.tpa;
import defpackage.v3c;
import defpackage.vx;
import defpackage.w9e;
import defpackage.x2a;
import defpackage.x53;
import defpackage.y7c;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "mq9", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class PublicSuffixDatabase {
    public static final byte[] e = {(byte) 42};
    public static final List f = Collections.singletonList("*");
    public static final PublicSuffixDatabase g = new PublicSuffixDatabase();
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final CountDownLatch b = new CountDownLatch(1);
    public byte[] c;
    public byte[] d;

    public static List c(String str) {
        List listP0 = w9e.P0(str, new char[]{'.'});
        return tpa.f((String) x53.p0(listP0), "") ? x53.d0(1, listP0) : listP0;
    }

    public final String a(String str) throws InterruptedException {
        String strA;
        String strA2;
        String strA3;
        List listP0;
        int size;
        int size2;
        int i = 0;
        List listC = c(IDN.toUnicode(str));
        if (this.a.get() || !this.a.compareAndSet(false, true)) {
            try {
                this.b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e2) {
                        q2b q2bVar = q2b.a;
                        q2b.a.getClass();
                        q2b.i(5, "Failed to read public suffix list", e2);
                        if (z) {
                        }
                    }
                } finally {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (this.c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size3 = listC.size();
        byte[][] bArr = new byte[size3][];
        for (int i2 = 0; i2 < size3; i2++) {
            String str2 = (String) listC.get(i2);
            Charset charset = StandardCharsets.UTF_8;
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            bArr[i2] = str2.getBytes(charset);
        }
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                strA = null;
                break;
            }
            strA = mq9.a(this.c, bArr, i3);
            if (strA != null) {
                break;
            }
            i3++;
        }
        if (size3 > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            int length = bArr2.length - 1;
            for (int i4 = 0; i4 < length; i4++) {
                bArr2[i4] = e;
                strA2 = mq9.a(this.c, bArr2, i4);
                if (strA2 != null) {
                    break;
                }
            }
            strA2 = null;
        } else {
            strA2 = null;
        }
        if (strA2 != null) {
            int i5 = size3 - 1;
            for (int i6 = 0; i6 < i5; i6++) {
                strA3 = mq9.a(this.d, bArr, i6);
                if (strA3 != null) {
                    break;
                }
            }
            strA3 = null;
        } else {
            strA3 = null;
        }
        if (strA3 != null) {
            listP0 = w9e.P0("!".concat(strA3), new char[]{'.'});
        } else if (strA == null && strA2 == null) {
            listP0 = f;
        } else {
            List listP02 = nz4.a;
            List listP03 = strA != null ? w9e.P0(strA, new char[]{'.'}) : listP02;
            if (strA2 != null) {
                listP02 = w9e.P0(strA2, new char[]{'.'});
            }
            listP0 = listP03.size() > listP02.size() ? listP03 : listP02;
        }
        if (listC.size() == listP0.size() && ((String) listP0.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listP0.get(0)).charAt(0) == '!') {
            size = listC.size();
            size2 = listP0.size();
        } else {
            size = listC.size();
            size2 = listP0.size() + 1;
        }
        c6d c6dVarY = l6d.Y(new at(2, c(str)), size - size2);
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        for (Object obj : c6dVarY) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) ".");
            }
            c54.b(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public final void b() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        Logger logger = x2a.a;
        y7c y7cVar = new y7c(new hh6(new vx(resourceAsStream, 1, new oue())));
        try {
            long j = y7cVar.readInt();
            y7cVar.h0(j);
            byte[] bArrN0 = y7cVar.a.n0(j);
            long j2 = y7cVar.readInt();
            y7cVar.h0(j2);
            byte[] bArrN02 = y7cVar.a.n0(j2);
            v3c.i(y7cVar, null);
            synchronized (this) {
                this.c = bArrN0;
                this.d = bArrN02;
            }
            this.b.countDown();
        } finally {
        }
    }
}
